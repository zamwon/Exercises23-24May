package PrezentacjaZadania.ex05;

import java.util.Scanner;

public class Ex5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj dodatnią liczbę, większa od 1");

        final int liczbaUsera = scanner.nextInt();
        boolean czyLiczbaPierwsza = true;

        for (int i = 1; i < liczbaUsera; i++) {
            if (czyLiczbaPierwsza(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean czyLiczbaPierwsza(int inputLiczba) {
        for (int i = 2; i < inputLiczba; i++) {
            if (inputLiczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}