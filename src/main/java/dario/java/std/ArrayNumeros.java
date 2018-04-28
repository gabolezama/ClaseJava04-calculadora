package dario.java.std;

import java.util.Scanner;

public class ArrayNumeros {

    public static void main(String[] args) {
        System.out.println("Ingrese Arreglo:");
        Scanner scanner = new Scanner(System.in);
        
        String[] arregloStr = scanner.nextLine().trim().split(" ");
        int[] num = new int[arregloStr.length];
        
        for(int i=0; i < arregloStr.length; i++) {
            num[i] = Integer.parseInt(arregloStr[i]);
        }
        
        int[] numPos = new int[num.length];
        int indicePos = 0;
        
        int[] numNeg = new int[num.length];
        int indiceNeg = 0;
        
        for (int i=0; i < num.length; i++) {
            if (num[i] >= 0) {
                numPos[indicePos++] = num[i];
            } else {
                numNeg[indiceNeg++] = num[i];
            }
        }
        
        System.out.println("Numeros positivos ("+indicePos+"):");
        for (int i=0; i < indicePos; i++) {
            System.out.print(numPos[i]+ " ");
        }
        
        
        System.out.println("\nNumeros negativos ("+indiceNeg+"):");

        for (int i=0; i < indiceNeg; i++) {
            System.out.print(numNeg[i]);
        }
    }
   
}
