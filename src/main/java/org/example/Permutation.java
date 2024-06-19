package org.example;

public class Permutation {
    void printPermutation(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr,perm+curr);
        }
    }


        public static void main(String[] args){
            Permutation p = new Permutation();
            String str="ABC";
            p.printPermutation(str,"");
        }
    }

