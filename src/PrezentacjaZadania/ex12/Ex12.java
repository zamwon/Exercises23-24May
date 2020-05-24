package PrezentacjaZadania.ex12;

import java.util.Scanner;

public class Ex12 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String inputFromUser = scanner.nextLine();

        int inputLength = inputFromUser.length(); // liczba wszystkich znaków mianownik

        char spacja = ' ';
        int iloscSpacji = 0;
        for (int i = 0; i < inputLength; i++) {
            if (inputFromUser.charAt(i) == spacja){
                iloscSpacji++; // liczba spacji - licznik
            }

        }
        System.out.println(iloscSpacji);


        double wynik = ((double)iloscSpacji / inputLength ) * 100;

        System.out.println(wynik);


    }
}
