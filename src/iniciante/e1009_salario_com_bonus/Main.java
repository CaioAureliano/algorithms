package iniciante.e1009_salario_com_bonus;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String nome = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();

        double total = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

        input.close();
    }
}
