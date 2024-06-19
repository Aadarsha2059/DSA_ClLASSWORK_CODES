//package org.example;
//
//public class LinearProbing {
//    int keys[];
//    int values[];
//    int capacity[];
//    LinearProbing(int capacity) {
//        this.capacity = new int[]{capacity};
//        keys = new int[capacity];
//        values=new int[capacity];
//    }
//    int findHash(int key) {
//        return (2*key+3)%capacity;
//    }
//    void add(int key,int value){
//        int temp=findHash(key);
//        int i=temp;
//        do{
//
//
//            if(keys[i]==0){
//                keys[i]=key;
//                values[i]=value;
//                return;
//            }
//            if(keys[i]==key){
//                values[i]=value;
//                return;
//            }
////            for quadratic probing
////            int x=1;
////            i=(i+x*x)%capacity;
//
//            i=(i+1)%capacity;
//        } while (i!=temp);
//
//    }
//    int get(int key){
//        int temp=findHash(key);
//        int i=temp;
//        do{
//            if(keys[i]==key){
//                return values[i];
//            }
//            i=(i+1)%capacity;
//        }
//        while(i!=temp);
//        return -1;
//    }
//}
