//package org.example;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class AdjacencyMatrix {



////
////    int v;
////    int i;
////    int s;
////    int matrix[][];
////
////
////    AdjacencyMatrix(int v){
////        this.v=v;
////        matrix=new int[v][v];
////    }
////    //shorted path implementation on matrix              26th may class
////    int shortestPathBFS (int source,int destination) {
////        Queues q = new Queues(v);
////        boolean visited[] = new boolean[v];
////        int dist[] = new int[v];
////        int prevpath[] = new int[v];
////        for (int i = 0; i < v; i++) {
////            dist[i] = Integer.MAX_VALUE;
////            prevpath[i] = -1;
////        }
////        dist[source] = 0;
////        q.enqueue(source);
////        visited[source] = true;
////        while (!q.isEmpty()) {
////            int u = q.dequeue();
////            for (int j = 0; j < v; j++) {
////                if (matrix[u][j] != 0) {
////                    if (!visited[j]) {
////                        dist[j] = dist[u] + 1;
////                        prevpath[j] = u;
////                        visited[j] = true;
////
////                    }
////                }
////            }
////        }
////
////        Stack stk= new Stack(v);
////        int temp=destination;
////        stack.push(temp);
////        while(prevpath[temp]!=-1){
////            temp=prevpath[temp];
////            stack.push(temp);
////        }
////        while(!stk.isEmpty()){
////            System.out.println("printing path");
////            int val=stk.pop();
////            System.out.println(val);
////        }
////
////        return dist[destination];
////
////
////
////
////
////
////
////
////    }
////
////
////    void addEdge(int source,int destination,int w){
////        matrix[source][destination]=w;
////        matrix[destination][source]=w;
////
////    }
////    List<Integer> printGraph(){
////        for(int i=0;i<v;i++){
////            System.out.print(i+"is connected to ");
////            for(int j=0;j<v;j++){
////                if(matrix[i][j]!=1){
////                    System.out.print(j+",");
////                }
////
////                //BFS
////
////                void BFS(int s){
////                    boolean visited[]=new boolean[v];
////                    Queues q=new Queues(v);
////                    q.enqueue(s);
////                    visited[s]=true;
////                    while(!q.isEmpty()) {
////                        int u = 0;
////                        System.out.println(u);
////                        u = q.dequeue();
////                        for (j = 0; j < v; j++) {
////                            if (matrix[u][j] != 0) {
////                                if (!visited[j]) {
////                                    q.enqueue(j);
////                                    visited[j] = true;
////                                }
////                            }
////                        }
////                    }
////
////                }
////                //dfs
////                void depthFirstSearch(int s){
////                    boolean visited[]=new boolean[v];
////                    dfs(s,visited);
////
////
////                }
////                void dfs(int s, boolean visted[]){
////                    visted[s] = true;
////                    System.out.println(s);
////                    for (int j = 0; j < v; j++) {
////                        if (matrix[s][j] != 0) {
////                            if (!visited[j]) {
////                                dfs(j, visited);
////                            }
////                        }
////                    }
////                }
////
////            }
////            System.out.println();
////        }
////
////        //get adj nodes
////        List<Integer> getAdjNodes;{
////            List<Integer> nodes=new ArrayList<>();
////            for(int j=0;j<v;j++){
////                if(matrix[i][j]!=0){
////                    nodes.add(j);
////
////                }
////
////            }
////            return nodes;
////        }
////        //print adj matrix
////    }
////
////    //26th may class
////
////    int dijakstraAlgorithm(int source,int destination){
////        boolean visited[]= new boolean[v];
////        int dist[]= new int[v];
////        int prevpath[]= new int[v];
////        for(int i=0;i<v;i++){
////            dist[i]=Integer.MAX_VALUE;
////            prevpath[i]=-1;
////        }
////        dist[source]=0;
////        for(int i=0;i<v;i++){
////            int u=findMinVertex(visited,dist);
////            visited[u]=true;
////            for (int j = 0; j < v; j++) {
////                if (matrix[u][j] != 0) {
////                    //u is connected to j [u=minvertex]
////                    if(!visited[j]&& dist[u]+matrix[u][j]<dist[j]){
////                        dist[j]=dist[u]+matrix[u][j];
////                        prevpath[j]=u;
////                    }
////                }
////            }
////
////        }
////        //print path
////        return dist[destination];
////        while(!stk.isEmpty()){
////            System.out.println("printing path");
////            int val=stk.pop();
////            System.out.println(val);
////        }
////
////        return dist[destination];
////
////
////    }
////    int findMinVertex(boolean visted[], int [] dist){
////        int minvertex=-1;
////        for(int i=0;i<v;i++){
////            if(!visted[i]&& dist[i]!=Integer.MAX_VALUE && (minvertex==-1||dist[minvertex]>dist[i])){
////                minvertex=i;
////            }
////        }
////        return minvertex;
////    }
////
////
////    public static void main(String[]args){
////        AdjacencyMatrix adj= new AdjacencyMatrix(5);
////        adj.addEdge(0,1,5);
////        adj.addEdge(0,2,5);
//////        adj.addEdge(0,1);
//////        adj.addEdge(0,2);
//////        adj.addEdge(1,4);
//////        adj.addEdge(2,3);
//////        adj.addEdge(3,4);
//////        adj.addEdge(4,2);
////        adj.printGraph();
////
////    }
////
////}
//
//
//import java.util.Queue;
////2024-06-10 class (Topological Sorting) using adjmatrix
//
//public class AdjacencyMatrix {
//
//    int topologicalSorting() {
//        int cnt = 0;
//        cnt++;
//        int indegree[] = new int[v];
//        for (int i = 0; i < v; i++) {
//            for (int j = 0; j < v; j++) {
//                if (matrix[i][j] != 0) {
//                    indegree[i]++;
//                }
//            }
//        }
//        Queue<Integer> q = new LinkedList<Integer>();
//        for (int i = 0; i < v; i++) {
//            if (indegree[i] == 0) {
//                q.add(i);
//            }
//        }
//        cnt = 0;
//        while (!q.isEmpty()) {
//            cnt++;
//            int u = q.poll();
//            System.out.println(q);
//            for (int j = 0; j < v; j++) {
//                if (matrix[u][j] != 0) {
//                    indegree[j]--;
//                    if (indegree[j] == 0) {
//                        q.add(j);
//                    }
//                }
//            }
//        }
//        if (cnt != v) {
//            return 1;
//        }
//        return -1;
//    }
//
//
//
//}
//
