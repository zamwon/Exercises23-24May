package PrezentacjaZadania.ex20;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int los = random.nextInt(101);
        System.out.println("Zgadnij liczbę od 0 do 100: ");

        int strzal;
        int counter = 1;
        do {
          strzal = scanner.nextInt();
            if (strzal > los) {
                System.out.println("Za dużo");
                counter++;
            } else if (strzal < los) {
                System.out.println("Za mało");
                counter++;
            } else if (strzal == los) {
                System.out.println("Bingo wygrałeś! Udało Ci się zgadnąć za: " + counter + " razem.");
            }
        }
        while (strzal != los);

    }
}

