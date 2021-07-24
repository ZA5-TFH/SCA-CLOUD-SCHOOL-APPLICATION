package com.shecodeafrica;

public class stringreverse {// Function to reverse a string in java

    public static String
    reverseString(String s){
        //Converting the string into character array
        char c []=s.toCharArray();
        String reverse="";
        // For loop to reverse a string
        for(int i=c.length-1;i>=0;i--){
            reverse+=c[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("SCA CLOUD SCHOOL APPLICATION"));
        System.out.println(reverseString("SHECODEAFRICA"));
        }



    }

