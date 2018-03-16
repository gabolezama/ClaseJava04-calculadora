package dario.java.std.calculadoraoop;

import java.util.Scanner;

public class Calculadora {
    
    private Scanner scanner;
    private Memoria memoria;
    private double buffer;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Operacion operacion = new Raiz();
        operacion.setOperandoA(27.0);
        operacion.setOperandoB(3.0);
        
        System.out.println(operacion.operar());
    }
    
}
