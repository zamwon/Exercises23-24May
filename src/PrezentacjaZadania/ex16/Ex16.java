package PrezentacjaZadania.ex16;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        System.out.println("Podaj 10 liczb całkowitych");
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int counterMax = 1;
        int[] zbiorLiczb = new int[10];
        for (int i = 0; i < 10; i++) {
            int liczba = scanner.nextInt();
            zbiorLiczb[i] = liczba;
        }
        for (int i = 1; i < 10; i++) {
            if (zbiorLiczb[i] >= zbiorLiczb[i - 1] ) {
                counter += 1;
            }else {
                counter = 1;
            }
            if ( counter > counterMax){
                counterMax = counter;
            }
//TODO find  what if none of numbers are increasing series
        }
        System.out.println(counterMax);
    }
}
