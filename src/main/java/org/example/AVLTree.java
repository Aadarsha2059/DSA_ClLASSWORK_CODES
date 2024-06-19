//package org.example;
//
//public class AVLTree {
//    public static class Node{
//        Node left;
//        Node right;
//        int height;
//        int data;
//        public Node(int data){
//            this.data = data;
//            this.left=this.right=null;
//            this.height=1;
//
//        }
//
//    }
//    public Node createNode(Node root,int data){
//        if(root==null){
//            return new Node(data);
//        }
//        else if(data<root.data){
//            root.left=createNode(root.left,data);
//
//        }
//        else if(data>root.data){
//            root.right=createNode(root.right,data);
//        }
//        else{
//            return root;
//        }
//        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));
//        return root;
//
////        int balancefactor=getBalanceFactor(root);
//
//        //LL
//        if(balancefactor>1&&data<root.left.data){
//            return rightRotate(root);
//
//        }
//        //LR
//        else if(balancefactor>1&&data>root.left.data){
//            root.left=leftRotate(root.left);
//            return rightRotate(root);
//        }
//        //RR
//        else if(balancefactor<-1&&data>root.right.data){
//            return leftRotate(root);
//        }
//        //RL
//        else if(balancefactor<-1&&data<root.right.data){
//            root.right=rightRotate(root.right);
//            return leftRotate(root);
//        }
//        return root;
//
//    }
//    Node rightRotate(Node y){
//        Node x=y.left;
//        Node T2=x.right;
//        x.right=y;
//        y.left=T2;
//        return x;
//        y.height=1+Math.max(getHeight(y.left),getHeight(y.right));
//        x.height=1+Math.max(getHeight(x.left),getHeight(x.right));
//    }
//    Node leftRotate(Node x){
//        Node y=x.right;
//        Node T2=y.left;
//        y.left=x;
//        x.right=T2;
//        y.height=1+Math.max(getHeight(y.left),getHeight(y.right));
//        x.height=1+Math.max(getHeight(x.left),getHeight(x.right));
//        return y;
//
//    }
//    int getBalanceFactor(Node node){
//        if(node==null){
//            return 0;
//        }
//        return getHeight(node.left)-getHeight(node.right);
//    }
//
//    int getHeight(Node node){
//        if(node==null){
//            return 0;
//        }
//        return node.height;
//    }
//
//}
//
//
