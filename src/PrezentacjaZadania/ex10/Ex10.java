package PrezentacjaZadania.ex10;

import java.util.Scanner;

public class Ex10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj liczbę dodatnią od 0 do 1000. Program sumuje cyfry podanej liczby");
        final int liczba = scanner.nextInt();
        if (liczba % 10 == 0) {
            System.out.println(liczba % 10);
        } else if (liczba > 10 && liczba < 100) {
            System.out.println(liczba / 10 + liczba % 10);
        } else if (liczba >= 100 && liczba < 1000) {
            System.out.println(liczba / 100 + (liczba / 10 % 10) + liczba % 10);
        }
    }
}
