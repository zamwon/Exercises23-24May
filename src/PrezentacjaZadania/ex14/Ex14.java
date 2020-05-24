package PrezentacjaZadania.ex14;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza małą literkę alfabetu łacińskiego: ");
        char pierwszaLitera = scanner.next().charAt(0);
        System.out.println("Podaj drugą małą literkę alfabetu łacińskiego: ");
        char drugaLitera = scanner.next().charAt(0);

        byte kod1 = (byte) pierwszaLitera;
        byte kod2 = (byte) drugaLitera;

        System.out.println(pierwszaLitera + " kod ASCII: " + kod1 + "\n" + drugaLitera + " kod ASCII: " + kod2);
        if(kod1 > kod2) {
            System.out.println("Między wskazanymi literami jest " + Math.abs(kod1 - kod2) + " znaków.");
        }else {
            System.out.println("Między wskazanymi literami jest " + Math.abs(kod2 - kod1) + " znaków.");
        }

    }
}
