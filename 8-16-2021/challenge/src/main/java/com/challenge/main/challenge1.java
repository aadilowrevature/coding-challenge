package com.challenge.main;

import java.util.ArrayList;
import java.util.List;

public class challenge1 {
    public static void main(String[] args) {

        String s = " dont    eat bread with mold  ";
        bucketize(s, 8);
        bucketize(s, 3);
        bucketize(s, 25);
    }

    public static ArrayList<String> bucketize(String phrase, int bucket_size) {

        //String[] bucket=new String[]{};
        ArrayList bucket = new ArrayList() {
        };

        phrase = phrase.trim();
        String[] split = phrase.split(" ");

        List<String> parse = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("")) {

            } else {
                parse.add(split[i]);
            }
            //System.out.println(split[i]);
        }

        int index = 0;
        int length = 0;
        String temp = "";
        int words = 0; //track # of words placed in bucket
        int z=0;

        while(words<parse.size()){

            while((length+parse.get(index).length() + 1 <= bucket_size+1 )&& index< parse.size()-1){


                if(parse.get(index).length()>bucket_size){

                    bucket.clear();
                    break;
                    //return bucket;
                }
                    length += parse.get(index).length() + 1;
                    index++;

                //System.out.println(index);
            }

                for(int i = z;i<index;i++){
                    temp+=parse.get(i)+" ";
                    words++;
                    //System.out.println(words);
                }

                //System.out.println(temp);
                //index--;

                bucket.add(temp);

                temp="";
                z=index;
                length=0;

            if(temp.length()<=bucket_size) {
                    //bucket.add(temp);
                }


        }
/*
        while (words < parse.size()) {

            if (index < parse.size()) {
                while (length < bucket_size) {
                    if (length + parse.get(index).length() + 1 > bucket_size) {
                        break;
                    } else {
                        length += parse.get(index).length() + 1;
                        index++;
                        if(index<parse.size()) {

                        }
                        //System.out.println(length + " I: "+ index);
                    }
                }
            }
            temp = "";
            for (int j = z; j <= index; j++) {

                temp += parse.get(j) + " ";
                words++;
            }

            z=index;
            temp = temp.trim();
            //System.out.println(temp);
            if (temp.length() <= bucket_size) {
                bucket.add(temp.trim());
            } else {

            }

            length = 0;

           // System.out.println(words);

        }


 */
        /*
        for(int i=0;i<parse.size();i++){
            //length+=parse.get(i).length();

            if(parse.get(i).length()<=bucket_size){

                while(words<parse.size()){

                    if(index<parse.size()-1) {
                        length += parse.get(index).length()+1;
                        index++;
                    }
                        for(int j=0;j<index;j++){

                            temp+=parse.get(j)+" ";
                        }
                        bucket.add(temp.trim());
                        words++;
                       // length=0;
                        temp="";

                }

                //bucket.add(parse.get(i));
                if(i<parse.size()-1){
                    if(parse.get(i).length()<=bucket_size){

                    }
                }
            }else{

                bucket=new ArrayList<String>(){};
                System.out.println(bucket);

                return bucket;
            }

        }
*/


        System.out.println(bucket);
        return bucket;
    }
}
