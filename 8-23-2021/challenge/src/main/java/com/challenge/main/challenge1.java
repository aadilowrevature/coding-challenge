package com.challenge.main;

public class challenge1 {
    public static void main(String[] args) {
        String card="9000300070009007";
        String c2="5555555555554444";

        validate(card);
        validate(c2);

    }

    public static boolean validate(String card_number){
        int length=card_number.length();
        int check=Character.getNumericValue(card_number.charAt(card_number.length()-1));
        String cn=card_number.substring(0,card_number.length()-1);

        StringBuilder sb = new StringBuilder();

        sb.append(cn);
        sb.reverse();


        for(int i=0;i<length-1;i+=2){

            sb.setCharAt(i,(""+root_sum(2*Character.getNumericValue(sb.charAt(i)))).charAt(0));
        }

        int sum=0;
        String s="";
        char c=' ';
        int check2=0;

        for(int i=0;i<length-1;i+=2){
            sum+=Character.getNumericValue(sb.charAt(i));
         }
           s=""+sum;
        System.out.println(s);

        c=s.charAt(s.length()-1);

        check2=Character.getNumericValue(c);

        System.out.println(c);
        System.out.println(check2);
            check2=10-check2;
        System.out.println(check2);
        System.out.println(check);

            if(check2==check){
                //valid
                System.out.println("CC#: "+ card_number + " is Valid");
                return true;
            } else{
                //invalid
                System.out.println("CC#: "+ card_number + " is Invalid");
                return false;

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
        //System.out.println("Root sum of Input: " +input +" = Output: "+output);
        return output;
    }
}
