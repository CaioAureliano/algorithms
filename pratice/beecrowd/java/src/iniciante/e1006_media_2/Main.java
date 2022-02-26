package iniciante.e1006_media_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int ap = 2;
        int bp = 3;
        int cp = 5;

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double media = ((a * ap) + (b * bp) + (c * cp)) / (ap + bp + cp);

        System.out.printf("MEDIA = %.1f\n", media);

        input.close();
    }
}
