package org.example;

public class Queues {
    int front = -1;
    int rear = -1;
    int queue[];
    int size;

    Queues(int size) {
        this.size = size;
        queue = new int[size];
    }

    boolean isFull() {
        return rear == size - 1;
    }

    boolean isEmpty() {
        return rear == -1 || front == -1;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1 && rear == -1) {
                front = rear = 0;
                queue[rear] = data;
            } else {
//                rear=rear+1;
                queue[++rear] = data;
            }
        }

    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        if (front == rear) {
            int temp = front;
            front = rear = -1;
            return queue[temp];
        }
        return queue[front++];

    }
     public static void main(String[]args){
        Queues q = new Queues(1);
     }

}
