package PrezentacjaZadania.ex2;

import java.util.Scanner;

public class Ex2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Program oblicza BMI. Podaj wagę w kilogramach");
        final float waga = scanner.nextFloat();

        System.out.println("Podaj wzrost w centymetrach");
        final int wzrostCm = scanner.nextInt();
        final double wzrostM = (double) wzrostCm / 100;
        final double bmi = (double) waga / Math.pow(wzrostM, 2);

        if (bmi > 24.9 || bmi < 18.5) {
            System.out.println("BMI " + bmi + " nieoptymalne");
        } else {
            System.out.println("BMI " + bmi + " optymalne");
        }
    }
}
