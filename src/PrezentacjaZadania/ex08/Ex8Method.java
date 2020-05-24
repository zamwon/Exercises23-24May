package PrezentacjaZadania.ex08;

import java.util.Scanner;

public class Ex8Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = scanner.nextInt();
        System.out.println("Podaj działanie");
        String dzialanie = scanner.next();
        Kalkulator kalkulator = new Kalkulator();
        float wynik = kalkulator.wykonajDzialanie(pierwszaLiczba, drugaLiczba, dzialanie);
        System.out.println(wynik);
    }
}