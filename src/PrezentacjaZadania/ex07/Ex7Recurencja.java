package PrezentacjaZadania.ex07;

import java.util.Scanner;

public class Ex7Recurencja {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int liczba = scanner.nextInt();
        int przypisanie = fibonacci(liczba);
        System.out.println(fibonacci(liczba));
    }

    public static int fibonacci(int liczba) {

        if (liczba == 1 || liczba == 0) {
            return liczba;
        }
        return fibonacci(liczba - 1) + fibonacci(liczba - 2);
        // liczba 3 => f(3) =  f(2) + f(1)
        // liczba 2 => f(2) = f(1) + f(0)
        // liczba 1 => f(0)
    }
}
