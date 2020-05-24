package PrezentacjaZadania.ex11;

import java.util.Scanner;

public class Ex11 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj słowo. Program pobiera słowa dopóki nie wpiszesz \"starczy\" ");

        ProgramString programKtoryZwracaNajdluzszyString = new ProgramString();
        String wprowadzoneSlowo;
        String naszeNajdluzszeSlowo;

        do {
            wprowadzoneSlowo = scanner.nextLine();
            naszeNajdluzszeSlowo = programKtoryZwracaNajdluzszyString.koniec(wprowadzoneSlowo);

        } while (!wprowadzoneSlowo.equals("starczy"));

        System.out.println(naszeNajdluzszeSlowo);
    }
}
