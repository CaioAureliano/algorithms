package iniciante.e1004_produto_simples;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int prod = x * y;

        System.out.printf("PROD = %s\n", prod);

        scanner.close();
    }
}
