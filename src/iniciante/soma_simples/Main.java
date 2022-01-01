package iniciante.soma_simples;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int s = a + b;

        System.out.printf("SOMA = %s\n", s);

        scanner.close();
    }
}
