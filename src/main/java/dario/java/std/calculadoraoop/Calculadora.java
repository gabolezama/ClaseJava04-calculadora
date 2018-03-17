package dario.java.std.calculadoraoop;

import java.util.Scanner;

public class Calculadora {

    private Scanner scanner;
    private Memoria memoria;
    private double buffer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        boolean calculoExtendido;
        Double calculoIntermedio;
        while (true) {

            // Inicio un calculo nuevo
            String tipoOperacion = "";
            calculoExtendido = false;
            calculoIntermedio = 0.0;

            do {

                if (!calculoExtendido) {
                    String operandoA = scanner.nextLine();
                    tipoOperacion = scanner.nextLine();
                    String operandoB = scanner.nextLine();

                    Operacion operacion = obtenerOperacion(tipoOperacion);
                    operacion.setOperandoA(Double.valueOf(operandoA));
                    operacion.setOperandoB(Double.valueOf(operandoB));

                    calculoIntermedio = operacion.operar();
                    calculoExtendido = true;
                } else {
                    tipoOperacion = scanner.nextLine();

                    if (tipoOperacion.equals("=")) {
                        System.out.println(calculoIntermedio);
                    } else {
                        String operandoB = scanner.nextLine();
                        Operacion operacion = obtenerOperacion(tipoOperacion);
                        operacion.setOperandoA(calculoIntermedio);
                        operacion.setOperandoB(Double.valueOf(operandoB));
                        calculoIntermedio = operacion.operar();
                    }
                }

            } while (tipoOperacion != "=");

        }

    }

    private static Operacion obtenerOperacion(String tipoOperacion) {
        Operacion operacion = null;
        switch (tipoOperacion) {
            case "+":
                operacion = new Suma();
                break;
            case "-":
                operacion = new Resta();
                break;
            case "/":
                operacion = new Division();
                break;
            case "*":
                operacion = new Multiplicacion();
                break;
            case "p":
                operacion = new Potencia();
                break;
            case "r":
                operacion = new Raiz();
        }
        return operacion;
    }

}
