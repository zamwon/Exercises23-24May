package PrezentacjaZadania.ex4;

import java.util.Scanner;

public class Ex4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Podaj dodanią liczbe");
        int liczbaUsera = scanner.nextInt();

        // Pobieram dane - jesli liczba mniejsza od 0 robię petle do while
        // dopoki podana liczba nie bedzie dodatnia

        if( liczbaUsera < 0) {
            do {
                System.out.println("Podałeś liczbe ujemną, wprowadź liczbę dodatnią");
                liczbaUsera = scanner.nextInt();
            }
            while (liczbaUsera < 0);
        }

        Printer printer = new Printer(liczbaUsera);
        printer.print();

    }
}
