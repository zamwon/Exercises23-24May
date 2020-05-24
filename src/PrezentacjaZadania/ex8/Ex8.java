package PrezentacjaZadania.ex8;

import java.util.Scanner;

public class Ex8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj liczbę");
        final float liczba1 = scanner.nextFloat();

        System.out.println("Jakie działanie chcesz wykonać :");
        System.out.println("+ by dodawać");
        System.out.println("- by odejmować");
        System.out.println("* by pomnożyć");
        System.out.println("/ by podzielić");
        String dzialanie = scanner.next();
        System.out.println("Podaj drugą liczbę: ");
        final float liczba2 = scanner.nextFloat();

        switch (dzialanie) {
            case "+":
                System.out.println(liczba1 + liczba2);
                break;
            case "-":
                System.out.println(liczba1 - liczba2);
                break;
            case "*":
                System.out.println((double) liczba1 * (double) liczba2);
                break;
            case "/":
                if (liczba2 == 0) {
                    System.out.println("Błąd - nie dziel przez 0");
                    break;
                } else {
                    System.out.println((double) liczba1 / (double) liczba2);
                    break;
                }
            default:
                System.out.println("Wprowadzono niepoprawne działanie - Błędny znak");
        }

    }
}
