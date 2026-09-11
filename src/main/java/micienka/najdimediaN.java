package micienka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class najdimediaN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> arr = new ArrayList<>();

        while (true) {
            double cislo = input.nextDouble();
            if (cislo == 0) break;
            arr.add(cislo);
        }

        Collections.sort(arr);
        int prostredni = arr.size() / 2;
        double median = arr.get(prostredni);

        if (arr.size() % 2 == 0) {
            median = (arr.get(prostredni - 1) + arr.get(prostredni)) / 2.0;
        }
        else {
            median = (arr.get(prostredni));
        }
        System.out.println(median);
    }
}
