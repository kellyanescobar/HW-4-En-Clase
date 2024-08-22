package hw.pkg4_en_clase;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Escobar_Kellyan_BiArray {
    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        Random random=new Random();
        
        int numero=0;
        boolean valido=false;
        while (!valido) {
            try {
                System.out.println("Ingrese los numeros de n x n: ");
                numero=lea.nextInt();
                valido=true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un numero.");
                lea.next(); 
            }
        }
        
        if (valido) {
            int matriz[][] =new int[numero][numero];

            for (int fila=0; fila<numero; fila++) {
                for (int columna=0; columna<numero; columna++) {
                    matriz[fila][columna]=random.nextInt(90) + 10;
                    System.out.println();
                }
            }

            for (int fila=0; fila<numero; fila++) {
                for (int columna=0; columna<numero; columna++) {
                    System.out.print(matriz[fila][columna] + "\t");
                }
                System.out.println();
            }

            int suma1=0;
            for (int fila=0; fila<numero; fila++) {
                suma1 +=matriz[fila][fila];
            }
            
            System.out.println("\n1. Suma de la Diagonal Principal:");
            for (int fila=0; fila < numero; fila++) {
                for (int columna=0; columna<numero; columna++) {
                    if (fila==columna) {
                        System.out.print(matriz[fila][columna] + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
            System.out.println("Suma principal: " + suma1);

            int suma2=0;
            for (int fila=0; fila<numero; fila++) {
                suma2 +=matriz[fila][numero - 1 - fila];
            }
            System.out.println("\n 2. Suma de la Diagonal Secundaria:");
            for (int fila=0; fila<numero; fila++) {
                for (int columna = 0; columna<numero; columna++) {
                    if (fila==numero - 1 - columna) {
                        System.out.print(matriz[fila][columna] + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
            System.out.println("Suma secundaria: " + suma2);
        }
    }
}
