package org.example;

public class SinglyLinkedList {
    public static class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    Node tail=null;
    int size=0;

    public void addNode(int data){
       size++;
        Node newNode= new Node(data);
        if(head==null|| tail==null){
            head=tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;

//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//            }
//            current.next=newNode;
        }

    }
    void addHeadFirst(int data){
        size++;

        Node newNode=new Node(data);
        if(head==null||tail==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    //algorithms to print each node of the linked list
    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data);
            current=current.next;
        }
    }

}
