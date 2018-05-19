package dario.java.std;

import java.util.LinkedList;
import java.util.Scanner;

public class Palimdromos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese palabra:");
        
        String palabra = in.nextLine();
        
        System.out.println("Palabra ["+palabra+"] Es un palíndromo: " + esPalimdromo(palabra) );
                
    }
    
    private static boolean esPalimdromo(String palabra) {
        LinkedList<Character> caracteres = new LinkedList<>();
        
        int half = palabra.length()/2;
        boolean isEven = palabra.length() % 2 == 0;
        
        for (int i = 0; i < half; i++) {
            caracteres.add(palabra.charAt(i));
        }
        
        int rest=half;
        if (!isEven) rest++;
        
        for (int i = rest; i < palabra.length(); i++) {
            if (!caracteres.removeLast().toString().equalsIgnoreCase(String.valueOf(palabra.charAt(i))))
                return false;
        }
        
        return true;
    }
    
}
