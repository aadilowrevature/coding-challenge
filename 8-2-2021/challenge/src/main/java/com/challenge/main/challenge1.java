package com.challenge.main;

public class challenge1 {
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="verify";

        String s1b="foggy";
        String s2b="ydog";
        String ans=solution(s1b,s2b);

        System.out.println(ans);

    }

    public static String solution(String input1,String input2){
        String ans="";

        for(int i = 0; i <input2.length(); i ++){
            if(input1.contains(""+input2.charAt(i))){

                ans+=input2.charAt(i);
            }
        }
        return ans;
    }
}
