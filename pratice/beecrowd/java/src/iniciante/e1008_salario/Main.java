package iniciante.e1008_salario;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int funcionarioNum = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorPorHora = input.nextDouble();

        double salario = valorPorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %s\nSALARY = U$ %.2f\n", funcionarioNum, salario);

        input.close();
    }
}
