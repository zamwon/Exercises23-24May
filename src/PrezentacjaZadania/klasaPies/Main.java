package PrezentacjaZadania.klasaPies;

public class Main {
    public static void main(String[] args) {

        new Pies();
        new Pies("Pimpek");
        new Pies(5);
        final Pies arnold = new Pies("Arnold", 10);
        final String name = arnold.getName();
        arnold.setName("Nowe Imie psa");

        arnold.toString();

    }
}
