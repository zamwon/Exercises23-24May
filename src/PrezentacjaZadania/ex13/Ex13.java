package PrezentacjaZadania.ex13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String napis = scanner.nextLine();

        String[] zdanie = napis.split(" ");

        String noweZdanie = "";
        for (int i = 0; i < zdanie.length; i++){
            noweZdanie += zdanie[i] + " " + zdanie[i] + " ";
        }
        System.out.println(noweZdanie);
    }
}
