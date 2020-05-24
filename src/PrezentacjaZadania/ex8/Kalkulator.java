package PrezentacjaZadania.ex8;

public class Kalkulator {
    public int dodaj(int pierwszaLiczba, int drugaLiczba) {
        return pierwszaLiczba + drugaLiczba;
    }

    public int odejmij(int pierwszaLiczba, int drugaLiczba) {
        return pierwszaLiczba - drugaLiczba;
    }

    public int pomnoz(int pierwszaLiczba, int drugaLiczba) {
        return pierwszaLiczba * drugaLiczba;
    }

    public float podziel(int pierwszaLiczba, int drugaLiczba) {
        if (drugaLiczba == 0) {
            System.out.println("Nie dzielimy przez 0");
            return 0;
        }
        return ((float) pierwszaLiczba) / drugaLiczba;
    }

    public float wykonajDzialanie(int pierwszaLiczba, int drugaLiczba, String dzialanie) {
        switch (dzialanie) {
            case "+":
                return dodaj(pierwszaLiczba, drugaLiczba);
            case "-":
                return odejmij(pierwszaLiczba, drugaLiczba);
            case "*":
                return pomnoz(pierwszaLiczba, drugaLiczba);
            case "/":
                return podziel(pierwszaLiczba, drugaLiczba);
            default:
                System.out.println("Wprowadzono błędny znak");
        }
        return 0;
    }
}