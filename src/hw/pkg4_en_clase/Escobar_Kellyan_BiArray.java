package hw.pkg4_en_clase;
import java.util.Scanner;
import java.util.Random;

public class Escobar_Kellyan_BiArray {
    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        Random random = new Random();
        
        System.out.println("Ingrese los numeros de n x n: ");
        int numero = lea.nextInt();
        int matriz[][] = new int[numero][numero];

        for (int n1 = 0; n1 < numero; n1++) {
            for (int n2 = 0; n2 < numero; n2++) {
                matriz[n1][n2] = random.nextInt(90) + 10;
            }
        }

        for (int n1 = 0; n1 < numero; n1++) {
            for (int n2 = 0; n2 < numero; n2++) {
                System.out.print(matriz[n1][n2] + "\t");
            }
            System.out.println();
        }

        int suma1 = 0;
        for (int n1 = 0; n1 < numero; n1++) {
            suma1 += matriz[n1][n1];
        }
        System.out.println("\nSuma diagonal principal: " + suma1);

        int suma2 = 0;
        for (int n1 = 0; n1 < numero; n1++) {
            suma2 += matriz[n1][numero - 1 - n1];
        }
        System.out.println("Suma diagonal secundaria: " + suma2);
    }
}