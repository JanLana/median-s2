package Barta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();

        boolean pustit = true;
        int vystup = 0;

        while (pustit){
            int vstup = sc.nextInt();
            if (vstup == 0) {
                if (arr.isEmpty()){
                    System.out.println("Žádná vložená čísla");
                } else {
                    pustit = false;
                    vystup = arr.get(arr.size() / 2);
                }
            }else{
                arr.add(vstup);
            }
        }

        System.out.println("Medián: " + vystup);
    }
}