package PrezentacjaZadania.ex6;

import java.util.Scanner;

public class Ex6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        int liczba = scanner.nextInt();
        double suma = 0;
        for (int i = 1; i <= liczba; i++){
            System.out.println(1/(double)i);
            suma += 1/(double)i;
        }
        System.out.println(suma);
    }
}
