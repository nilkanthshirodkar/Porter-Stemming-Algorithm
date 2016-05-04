package com.mycompany.algo;


import java.io.IOException;
import java.util.*;

public class PorterCheck {
    
    public static void main(String args[]) throws IOException{
        //stemming the words
        ArrayList<String> tok = new ArrayList<String>();
        String[] tokens = {"normalize","technical","education","Nilkanth"};
        for (String x: tokens){
            tok.add(x);
        }
        System.out.println(completeStem(tok));

       
    }

    //method to completely stem the words in an array list
    public static ArrayList<String> completeStem(List<String> tokens1){
        PorterAlgo pa = new PorterAlgo();
        ArrayList<String> arrstr = new ArrayList<String>();
        for (String i : tokens1){
            String s1 = pa.step1(i);
            String s2 = pa.step2(s1);
            String s3= pa.step3(s2);
            String s4= pa.step4(s3);
            String s5= pa.step5(s4);
            arrstr.add(s5);
        }
        return arrstr;
    }

   
    public static ArrayList<String> fileTokenizer(){
        StringTokenizer strtoken = new StringTokenizer("this is a book");
        ArrayList<String> filetoken = new ArrayList<String>();
        while(strtoken.hasMoreElements()){
            filetoken.add(strtoken.nextToken());
        }
        return filetoken;
    }
}