package dario.java.std.calculadoraoop;

import java.util.Scanner;

public class Calculadora {
    
    private Scanner scanner;
    private Memoria memoria;
    private double buffer;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String input;
        while (true) {
            String operandoA = scanner.nextLine();        
            String tipoOperacion = scanner.nextLine();
            String operandoB = scanner.nextLine();

            Operacion operacion=null; 
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
            
            operacion.setOperandoA(Double.valueOf(operandoA));
            operacion.setOperandoB(Double.valueOf(operandoB));
        
            System.out.println(operacion.operar());

            
        }
        
        
    }
    
}
