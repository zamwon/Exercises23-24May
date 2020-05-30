package PrezentacjaZadania.ex15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 dowolnych liczb");
        int[] zbiorLiczb = new int[10];
//        int counter = 1;
        for (int i = 0; i < 10; i++) {
            int wprowadzonaLiczba = scanner.nextInt();
            zbiorLiczb[i] = wprowadzonaLiczba;
        }

//        for (int i = 1; i < 5; i++) {
//            if (zbiorLiczb[i] == zbiorLiczb[i - 1]) {
//                counter++;
//                if (counter >= 2) {
//                    System.out.println("Liczba: " + zbiorLiczb[i] + " wystąpiła minimum 2 razy.");
//                }
//            }
//        }
//        if(counter == 1) {
//            System.out.println("Brak podwójnych wystąpień");
//        }
//    }
        HashSet<Integer> set = new HashSet<>();
        for (Integer liczba : zbiorLiczb) {
            if (set.add(liczba) == false) {
                // your duplicate element
                System.out.print(liczba);
            }
        }
        // TODO if more then 2numbers are equal incorectly print again
    }
}
