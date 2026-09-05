package Eficiencia;

public class Ejercicio01_OConstante {

    public static void main(String[] args) {

        int n = 1000;
        int contador = 0;

        System.out.println("Inicio del algoritmo");

        contador++;
        int x = 5;

        contador++;
        int y = 10;

        contador++;
        int suma = x + y;

        contador++;
        System.out.println("La suma es: " + suma);

        System.out.println("Valor de n: " + n);
        System.out.println("Operaciones contadas: " + contador);
        System.out.println("Complejidad: O(1)");
    }
}
