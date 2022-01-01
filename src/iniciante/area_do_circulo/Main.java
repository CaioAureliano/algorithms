package iniciante.area_do_circulo;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);
        double n, r, out;

        n = 3.14159;
        r = scanner.nextDouble();
        out = (r * r) * n;

        System.out.printf("A=%.4f\n", out);

        scanner.close();

    }

}