package org.example;

import java.util.HashMap;

public class LruCaching {
    int capacity;


    public static class Node{
        int capacity;
        int key;
        Node next;
        Node prev;
        int k;
        int v;

        public Node(int v, int k){
            this.v=v;
            this.k=k;

            this.next=this.prev=null;

        }
    }

    HashMap<Integer,Node> map;
    LruCaching(int capacity){
        this.capacity=capacity;
        map=new HashMap<>();
    }
    public void put(int k,int v){
        if(map.containsKey(k)){
            //remove node
            remove(map.get(k));
        }
        else if(map.size()==capacity){
            //remove least recently used data
            remove(tail);


        }
        else {
            Node newNode= new Node(v,k);
            insert(newNode);

        }
    }
    public int get(int k){
        Node node=map.get(k);
        if(node==null){
            return -1;

        }
        remove(node);
        insert(node);
        return node.v;


    }


    Node head=null;
    Node tail=null;

    void insert(Node newNode){
        map.put(newNode.k,newNode);
        if(head==null||tail==null){
            head=tail=newNode;

        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

        }

    }
    void remove(Node node){
        map.remove(node.k);
        if(node==null){
            return;
        }
        if(node==head){
            Node temp=head;
            head=head.next;
            head.prev=null;
            temp.next=null;


        }
        else if(node==tail){
            tail=tail.prev;
            tail.next=null;
            node.prev=null;

        }
        else{
            node.prev.next=node.next;
            node.next.prev=node.prev;
            node.next=node.prev=null;


        }
        }
    }


