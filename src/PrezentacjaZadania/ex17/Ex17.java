package PrezentacjaZadania.ex17;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex17 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // CASE 1

        System.out.println("Podaj datę przyszłych zajęć ( w formacje YYYY-MM-dd ) ");
        String podanaData = scanner.nextLine();
        final LocalDate dataZajec = LocalDate.parse(podanaData);
        final LocalDate dzisiaj = LocalDate.now();
        final Period ileDniDoZajec = Period.between(dzisiaj, dataZajec);
        System.out.println("Do zajęć pozostało: " + ileDniDoZajec.getDays() + " dni (metodą period)");

        // CASE 2

        final long roznicaDni = ChronoUnit.DAYS.between(dzisiaj, dataZajec);
        System.out.println("Do zajęć zostało: " + roznicaDni + " dni (metodą chronoUnit)");

        // CASE 3 " add fixed days

        final LocalDate zaDwaDni = LocalDate.now().plusDays(2);

        final long fixedDays = ChronoUnit.DAYS.between(zaDwaDni, dataZajec);
        System.out.println("Od (fixedDays) do zajęć zostało: " + fixedDays + " dni (metodą chronoUnit)");
    }
}
