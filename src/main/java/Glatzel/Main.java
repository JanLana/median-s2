package Glatzel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();

        while (sc.hasNextInt()) {
            int cislo = sc.nextInt();
            if (cislo == 0) {
                break;
            }
            arr.add(cislo);
        }


        if (arr.isEmpty()) {
            return;
        }

        Collections.sort(arr);

        int size = arr.size();
        int median = arr.get(size / 2);



        System.out.println("Medián je: " + median);

        sc.close();
    }
}
