package PrezentacjaZadania;

import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę okręgu");
        final float diamiter = scanner.nextFloat();
        Circle circle = new Circle(diamiter);
        final float circumference = circle.getCircumference();
        final double circumferenceDouble = circle.getCircumferenceDouble();
//        System.out.println(circumference);
        float area = circle.getArea();
        double areaDouble = circle.getAreaDouble();
        System.out.printf("Obwód: %f, pole: %f", circumference, area);

        System.out.println();
        //Wypisanie double
        System.out.printf("Obwód double: %s, pole double: %s, mój string: %s "
                , circumferenceDouble, areaDouble, "Jestem Bogiem!");

        System.out.println();
        System.out.println("Obwód: " + circumference + "Pole: " + area);
        System.out.println("Obwód double: " + circumferenceDouble + "Pole double: " + areaDouble);

//        new ArrayList<>();
        circle.testVarags("CZEŚĆ MISTRZU", 1);
        circle.testVarags("CZEŚĆ MASA", 1, 2, 3);
        circle.testVarags("Hola", new int[]{1, 2, 3});


    }
}
