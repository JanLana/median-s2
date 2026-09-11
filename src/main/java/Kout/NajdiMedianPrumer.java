package Kout;

import java.util.*;

public class NajdiMedianPrumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();
        boolean konec = false;
        int vstup = 1;

        while (konec == false) {
            vstup = sc.nextInt();

            if (vstup == 0) {
                konec = true;
            }
            else {
                arr.add(vstup);
            }
        }

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(arr.size()/2));

    }
}

