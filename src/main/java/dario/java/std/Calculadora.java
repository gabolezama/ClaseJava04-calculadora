package dario.java.std;

import java.util.Scanner;


public class Calculadora {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        while (true) {
            System.out.print("Ingrese operacion:");
            String input = scanner.nextLine();

            switch (input) {
                case "h":
                    printAyuda();
                    break;
                case "e":
                    return;
                case "+":
                    int[] operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] + operandos[1]));
                    break;
                case "-":
                    operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] - operandos[1]));
                    break;
                case "/":
                    operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] / operandos[1]));
                    break;                
                case "*":
                    operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] * operandos[1]));
                    break;
                default:
                    printAyuda();
            }

        }

    }

    private static int[] obtenerOperandos() {
        System.out.print("A:");
        int a = scanner.nextInt();
        System.out.print("B:");
        int b = scanner.nextInt();
      
        return new int[] {a,b};
    }
    
    private static void printAyuda() {
        System.out.println("Ingrese las siguientes operaciones: + - / *");
        System.out.println("e: salir");
        System.out.println("h: ayuda");
    }

}
