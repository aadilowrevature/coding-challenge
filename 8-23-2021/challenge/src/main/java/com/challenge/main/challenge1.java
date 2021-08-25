package com.challenge.main;

public class challenge1 {
    public static void main(String[] args) {
        String card = "9000300070009007";
        String crd2 = "5555555555554444";
        String crd3 = "4012888888881881";
        String crd4 = "79927398713";

        validate(card);
        validate(crd2);
        validate(crd3);
        validate(crd4);

    }

    public static boolean validate(String card_number) {
        int length = card_number.length();
        if (length < 14 || length > 19) {
            System.out.println("CC#: " + card_number + " is invalid length");
            return false;
        }
        int check = Character.getNumericValue(card_number.charAt(card_number.length() - 1));
        String cn = card_number.substring(0, card_number.length() - 1);

        StringBuilder sb = new StringBuilder();

        sb.append(cn);

        sb.reverse();

        for (int i = 0; i < length - 1; i += 2) {

            sb.setCharAt(i, ("" + root_sum(2 * Character.getNumericValue(sb.charAt(i)))).charAt(0));
        }

        int sum = 0;
        String s;
        char c;
        int check2;

        for (int i = 0; i < length - 1; i++) {
            sum += Character.getNumericValue(sb.charAt(i));
        }

        s = "" + sum;
        c = s.charAt(s.length() - 1);
        check2 = 10 - Character.getNumericValue(c);


        if (check2 == check) {
            //valid
            System.out.println("CC#: " + card_number + " is Valid\n");
            return true;
        } else {
            //invalid
            System.out.println("CC#: " + card_number + " is Invalid\n");
            return false;

        }

    }

    public static int root_sum(int input) {
        int output = 0;
        String check = "" + input;
        while (check.length() > 1) {
            for (int i = 0; i < check.length(); i++) {

                output += Character.getNumericValue(check.charAt(i));
                //System.out.println(output);
            }
            check = "" + output;
            output = 0;
        }
        output = Integer.parseInt(check);
        //System.out.println("Root sum of Input: " +input +" = Output: "+output);
        return output;
    }
}
