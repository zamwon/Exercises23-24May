package PrezentacjaZadania.ZadanieString;

import java.util.Scanner;

public class ZadanieSTRING {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String napis = scanner.nextLine();
//        int iloscSlow;
//
//        String[] tablicaSlow = napis.split(" ");
//
//        iloscSlow = tablicaSlow.length;
//        System.out.println(iloscSlow);

        System.out.println("Podaj dowolny znak.");
        Scanner scanner = new Scanner(System.in);
        String wprowadzonyZnak;

        int ileCyfr = 0;
        int ileZnakow = 0;
        do {
            wprowadzonyZnak = scanner.nextLine();
            char literka = wprowadzonyZnak.charAt(0);
            if(  literka >= 48 && literka <= 57) { // WTEDY MAMY CYFRE
                ileCyfr++;
            }else if ( literka >= 65 && literka <= 90 || literka >= 97 && literka <= 122 ){
                ileZnakow++;
            }
        }
        while (!wprowadzonyZnak.equals("@"));


        System.out.println(ileCyfr + " " + ileZnakow);
     }
}
