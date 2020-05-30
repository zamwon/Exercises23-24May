package PrezentacjaZadania.ex18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String teks = scanner.nextLine();

        System.out.println("Napisz coś do mnie");
        Pattern pattern = Pattern.compile(".*a+\\spsik.*");
        Matcher matcher = pattern.matcher(teks);

        System.out.println(matcher.matches());

    }
}
