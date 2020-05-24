package PrezentacjaZadania.ex7;

import java.util.Scanner;

public class Ex7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Program zwraca liczbę ciągu Fibonacciego" +
                " o wskazanym indeksie. Podaj indeks :");
        final int index = scanner.nextInt();

        int[] fibonnaci; // inicjalizacja bez przypisania

        if (index == 1) {
            fibonnaci = new int[]{1}; // jeśli uzytkownik poda 1 to tablicy fibonnaci przypisujemy tablice jedno elementową ktora zawiera liczbę 1 na indeksie 0, int[0] = 1
        } else if (index == 2) {
            fibonnaci = new int[]{1, 1}; // int[0] = 1, int[1] = 1
        } else {
            fibonnaci = new int[index]; //
            fibonnaci[0] = 1;
            fibonnaci[1] = 1;

            for (int i = 2; i < fibonnaci.length; i++) {
                fibonnaci[i] = fibonnaci[i - 1] + fibonnaci[i - 2];
            }
        }
        System.out.println("Liczba ciągu Fibonacciego o indeksie "
                + index + " to: " + fibonnaci[index - 1]);

    }
}
