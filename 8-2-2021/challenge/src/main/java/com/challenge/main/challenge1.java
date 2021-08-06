package com.challenge.main;

public class challenge1 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "verify";

        String s1a="Minneapolis";
        String s2a="Minnesota";

        String s1b = "foggy";
        String s2b = "ydog";

        String s1c="god";
        String s2c="good";


        solution(s1, s2);
        solution(s1a, s2a);
        solution(s1b, s2b);
        solution(s1c, s2c);

    }

    public static String solution(String input1, String input2) {
        String ans = "";
        String check1 = "";
        String check2 = "";
        for (int i = 0; i < input2.length(); i++) {
            if (input1.contains("" + input2.charAt(i))) {

                check1 += input2.charAt(i);
            }
        }

        for (int i = 0; i < input1.length(); i++) {
            if (input2.contains("" + input1.charAt(i))) {

                check2 += input1.charAt(i);
            }
        }

        System.out.println(check1 + " " + check2);
        if (check1.equals(check2)) {
            ans = check1;
        } else {
            ans = "";
            int L1 = check1.length();
            int L2 = check2.length();

            String[] temp = new String[2 * L1];
            String[] temp2 = new String[2 * L2];

            for (int i = 0; i < L1; i++) {
                temp[i] = "";
                temp[i + L1] = "";
                for (int j = i; j < L1; j++) {
                    temp[i] += "" + check1.charAt(j);
                }
                for (int k = 0; k < i; k++) {
                    temp[i + L1] += "" + check1.charAt(k);
                }
            }

            for (int i = 0; i < L2; i++) {
                temp2[i] = "";
                temp2[i + L2] = "";
                for (int j = i; j < L2; j++) {
                    temp2[i] += "" + check2.charAt(j);
                }
                for (int k = 0; k < i; k++) {
                    temp2[i + L2] += "" + check2.charAt(k);
                }
            }

            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp2.length; j++) {
                    if (temp[i].equals(temp2[j])) {

                        if(temp[i].length()>ans.length()){
                            ans=temp[i];
                        }
                    }
                }
            }
        }

        System.out.println("LCS: " + ans);
        System.out.println("LCS Length: " +(ans.length()+1)); //added 1
        return ans;
    }
}
