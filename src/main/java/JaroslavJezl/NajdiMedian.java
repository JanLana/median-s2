package JaroslavJezl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NajdiMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> cisla = new ArrayList<>();

        double a = sc.nextDouble();
        while (a != 0) {
            cisla.add(a);
            a = sc.nextDouble();
        }

        Collections.sort(cisla);

        int stred = cisla.size() / 2;

        if (cisla.size() % 2 == 0) {
            System.out.println((cisla.get(stred - 1) + cisla.get(stred)) / 2);
        } else {
            System.out.println(cisla.get(stred));
        }
    }
}