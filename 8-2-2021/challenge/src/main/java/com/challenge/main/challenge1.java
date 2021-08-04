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
        String check1="";
        String check2="";
        for(int i = 0; i <input2.length(); i ++){
            if(input1.contains(""+input2.charAt(i))){

                check1+=input2.charAt(i);
            }
        }

        for(int i = 0; i <input1.length(); i ++){
            if(input2.contains(""+input1.charAt(i))){

                check2+=input1.charAt(i);
            }
        }

        System.out.println(check1+" "+check2);
        if(check1.equals(check2)){
            ans=check1;
        }
        else{
            ans="";
            for(int i=0;i<check1.length();i++){
                if(check1.charAt(i)==check2.charAt(i)){
                    ans+=check1.charAt(i);
                }
            }
        }
        return ans;
    }
}
