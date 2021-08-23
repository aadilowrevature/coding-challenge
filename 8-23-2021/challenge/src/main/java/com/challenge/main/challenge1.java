package com.challenge.main;

public class challenge1 {
    public static void main(String[] args) {
        String card="9000900090009000";

        root_sum(7250);

    }

    public static void validate(String card_number){
        int length=card_number.length();
        int check=Character.getNumericValue(card_number.charAt(card_number.length()-1));
        card_number=card_number.substring(0,card_number.length()-2);
        
        for(int i=0;i<length;i++){

        }


    }

    public static int root_sum(int input){
        int output=0;
        String check= ""+input;
        while(check.length()>1) {
            for (int i = 0; i < check.length(); i++) {

                output+=Character.getNumericValue(check.charAt(i));
                //System.out.println(output);
            }
            check=""+output;
            output=0;
        }
        output=Integer.parseInt(check);
        System.out.println("Root sum of Input: " +input +" = Output: "+output);
        return output;
    }
}
