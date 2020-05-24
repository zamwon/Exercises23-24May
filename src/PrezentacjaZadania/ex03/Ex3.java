package PrezentacjaZadania.ex03;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {


        System.out.println("Wprowadz 3 liczby całkowite");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        int liczbaA = scanner.nextInt();
        System.out.println("Podaj liczbe b");
        int liczbaB = scanner.nextInt();
        System.out.println("Podaj liczbe c");
        int liczbaC = scanner.nextInt();

        int delta = liczbaB * liczbaB - 4 * liczbaA * liczbaC;
        System.out.println("delta wynosi : " + delta);

        if (delta < 0) {

        } else {
            double x1 = -liczbaB - Math.pow(delta, 0.5) / 2 * liczbaA;
            System.out.println("Pierwiastek x1 wynosi: " + x1);

            double x2 = (-liczbaB + Math.pow(delta, 0.5)) / (2 * liczbaA);
            System.out.println("Pierwiastek x2 wynosi: " + x2);
        }

    }
}
