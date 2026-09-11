package minarik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PRŮMĚR

        double aktualniCislo;
        double soucetCisel = 0;
        double prumer = 0;
        int pocetCisel = 0;
        for (int i = 0; i < 10000; i++) {
            aktualniCislo = sc.nextInt();
            if (aktualniCislo == 0) {
                break;
            } else {
                soucetCisel = soucetCisel + aktualniCislo;
                pocetCisel = pocetCisel + 1;
            }
        }
        prumer = soucetCisel / pocetCisel;

        System.out.println("Počet čísel: " + pocetCisel);
        System.out.println("Součet čísel: " + soucetCisel);
        System.out.print("Průměr: " + prumer);

        // MEDIÁN

        ArrayList<Integer> cisla = new ArrayList<>();

        while (true) {
            int cislo = sc.nextInt();

            if (cislo == 0) {
                break;
            }

            cisla.add(cislo);
        }

        if (cisla.isEmpty()) {
            System.out.println("Nebyla zadána žádná čísla");
        } else {
            Collections.sort(cisla);

            int pocCisel = cisla.size();
            double median;

            if (pocCisel % 2 == 1) {
                median = cisla.get(pocCisel / 2);
            } else {
                median = (cisla.get(pocCisel / 2 - 1) + cisla.get(pocCisel / 2)) / 2.0;
            }

            System.out.println("Medián: " + median);
        }
    }
}