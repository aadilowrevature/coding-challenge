package com.challenge.main;

public class challenge2 {
    public static void main(String[] args) {

        scanArray find= new scanArray();
        int ar[]={1,2,-4,3,4,4,5,66};

        find.max(ar);
        find.min(ar);
    }

    public static class scanArray{

        int max(int[] ar){
            int ans=0;
            for(int i =0; i<ar.length;i++){
                if(ar[i]>ans){
                    ans=ar[i];
                }
            }
            System.out.println("The max is "+ans);
            return ans;
        }

        int min(int[] ar){
            int ans=0;

            for(int i =0; i<ar.length;i++){
                if(i==0){
                    ans=ar[i];
                }
                else
                if(ar[i]<ans){
                    ans=ar[i];
                }
            }
            System.out.println("The min is "+ans);
            return ans;
        }
    }
}
