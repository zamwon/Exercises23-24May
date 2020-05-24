package PrezentacjaZadania.ex06;

import java.util.Scanner;

public class Ex6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        int liczba = scanner.nextInt();
        if (liczba < 1) {
            do {
                System.out.println("Podałeś liczbę mniejszą od 1. Podaj inną liczbe!");
                liczba = scanner.nextInt();
            } while (liczba < 1);
        }
        double suma = 0;
        for (int i = 1; i <= liczba; i++) {
            System.out.println("liczba: " + 1 / (double) i);
            suma += 1 / (double) i;
        }
        System.out.println("Liczba harmoniczna to: " + suma);
    }
}
