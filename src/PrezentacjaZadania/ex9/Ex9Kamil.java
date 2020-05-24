package PrezentacjaZadania.ex9;

import java.util.Scanner;

public class Ex9Kamil {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int WAVE_WIDTH = 8;

    public static void main(String[] args) {
        System.out.println("set wave length :");
        int length = scanner.nextInt();
        for (int inner = 0; inner < 4; inner++) {
            for (int outer = 0; outer < length; outer++) {
                int waveCount = (outer / WAVE_WIDTH);
                int position = outer - waveCount * WAVE_WIDTH;
                if (position == inner ||
                        ((position % (7 - inner) == 0) && position > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}