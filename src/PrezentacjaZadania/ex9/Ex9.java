package PrezentacjaZadania.ex9;

import java.util.Scanner;

public class Ex9 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj dodatnią liczbę parzystą");

        final int dlugosc = scanner.nextInt();
        final int wysokosc = 4;
        //Pętla na wysokość
        for (int i = 0; i <= wysokosc; i++) {
            // Pętla na długość
            for (int j = wysokosc; j <= dlugosc + i; j++) {

                System.out.print(" ");
            }
            // spacje pomiedzy wierzcholkami
            // TODO
        }
    }
}
