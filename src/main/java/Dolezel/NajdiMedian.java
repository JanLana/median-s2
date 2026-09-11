package Dolezel;

import javax.naming.PartialResultException;
import java.util.*;

public class NajdiMedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();

        int vstup = 1;
        boolean konec = false;


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
