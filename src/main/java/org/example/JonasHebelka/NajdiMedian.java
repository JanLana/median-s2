package org.example.JonasHebelka;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NajdiMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();

        int daneCislo = 1;
        int pocetArray = 0;
        int median = 0;
        double medianFinale;

        while (daneCislo != 0) {
            daneCislo = sc.nextInt();
            if (daneCislo == 0) {

            } else {
                arr.add(daneCislo);
                pocetArray = pocetArray + 1;
            }
        }
        Collections.sort(arr);
        median = pocetArray / 2;
        if (pocetArray % 2 == 0){
            medianFinale = (arr.get(median) + arr.get((median - 1)));
            medianFinale = medianFinale / 2 ;
        }else{
            medianFinale = arr.get(median);
        }

        System.out.println(medianFinale);

    }
}