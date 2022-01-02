package iniciante.e1005_media_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double p1 = 3.5;
        double p2 = 7.5;

        double a = input.nextDouble();
        double b = input.nextDouble();

        double media = ((a * p1) + (b * p2)) / (p1 + p2);

        System.out.printf("MEDIA = %.5f\n", media);

        input.close();
    }
}
