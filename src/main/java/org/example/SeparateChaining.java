package org.example;

import org.w3c.dom.Node;

public class SeparateChaining {
    SinglyLinkedList hashtable[];
    int capacity;
    public SeparateChaining(int capacity) {
        this.capacity = capacity;
        hashtable = new SinglyLinkedList[capacity];
        for(int i = 0; i < capacity; i++){
            hashtable[i] = new SinglyLinkedList();
        }
    }
    int findHash(int key){
        return (2*key+3)%10;
    }
    void add(int key){
        int temp=findHash(key);
        hashtable[temp].addNode(key);

    }
    int get(int key){
        int temp=findHash(key);
        SinglyLinkedList.Node current=hashtable[temp].head;
        while(current!=null) {
            if (current.data == key) {
                return current.data;

            }
            current=current.next;

        }
        return -1;
    }
}
