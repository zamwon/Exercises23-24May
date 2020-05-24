package PrezentacjaZadania.ex04;

class Printer {


    private final int inputNumber;

    public Printer(int liczbaUsera) {
        this.inputNumber = liczbaUsera;
    }

    public void print() {
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
