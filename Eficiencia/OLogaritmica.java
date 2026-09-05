package Eficiencia;

import java.util.Scanner;

public class Ejercicio06_OLogaritmica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = n; i > 1; i = i / 2) {
            contador++;
            System.out.println("Valor actual de i: " + i);
        }

        System.out.println("Total de iteraciones: " + contador);
        System.out.println("Complejidad: O(log n)");

        sc.close();
    }
}
