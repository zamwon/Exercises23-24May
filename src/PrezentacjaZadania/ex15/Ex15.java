package PrezentacjaZadania.ex15;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 dowolnych liczb");
        int[] zbiorLiczb = new int[10];

        for (int i = 0; i < zbiorLiczb.length; i++) {
            int wprowadzonaLiczba = scanner.nextInt();
            zbiorLiczb[i] = wprowadzonaLiczba;
        }

        Arrays.sort(zbiorLiczb);
        int count = 1;
        int countLast = 1;

        for (int i = 1; i < zbiorLiczb.length; i++) {
            if (zbiorLiczb[i] == zbiorLiczb[i - 1]) {
                count++;
            } else {
                countLast = count;
                count = 1;
            }
            if (countLast >= 2 && count == 1) {
                System.out.println(zbiorLiczb[i - 1]);
            }
        }
    }
}
