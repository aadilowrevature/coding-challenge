package com.challenge.main;

import java.util.ArrayList;
import java.util.List;

public class challenge1 {
    public static void main(String[] args) {

        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        int[] arr2 = {142, 122, 70, 15, 99, 65, 7, 90};

        //finds only the first array that makes the sum.

        int X = 97;
        List<Integer> result = solution(arr2, X);

        int test = 0;

        System.out.println(result + "\n");

        //psuedo test case
        for (int i = 0; i < result.size(); i++) {
            test += arr2[result.get(i)];
        }

        if (test != X) {
            System.out.println("Wrong Result: " + test);
        } else {
            System.out.println("Correct Result: " + test);
        }

    }

    public static List<Integer> solution(int[] ar, int X) {
        List<Integer> result = new ArrayList<>();
        int sum;


        for (int i = 0; i < ar.length; i++) {
            sum = 0;
            for (int j = i; j < ar.length; j++) {


                if (sum != X) {
                    sum += ar[j];
                    System.out.println(sum);
                }
                if (sum == X) {
                    for (int k = i; k <= j; k++) {
                        result.add(k);
                    }
                    break;
                }
            }
            if (sum == X) {
                break;
            }
        }
        return result;
    }
}
