//package org.example;
//
//import javax.management.Descriptor;
//import java.util.Arrays;
//
//import static java.nio.file.Files.find;
//import static javax.management.ImmutableDescriptor.union;
//import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;
//import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;
//
//public class AdjacencyMatrix2 {
//    public static class Edge implements Comparable<Edge> {
//        int u,v,w;
//        public Edge(int u, int v, int w) {
//            this.u = u;
//            this.v = v;
//            this.w = w;
//
//        }
//
//        //union helps to navigate the abs roots
//
//        void union(int uabsroot,int vabsroot){
//            if(size[uabsroot]<size[vabsroot]){
//                parent[vabsroot]=uabsroot;
//
//
//            }
//            else if(size[vabsroot]>size[uabsroot]){
//                parent[uabsroot]=vabsroot;
//            }
//            else{
//                parent[vabsroot]=uabsroot;
//                size[uabsroot]++;
//            }
//        }
//
//
//        //find helps to find abs root
//        int find(int x){
//            if(parent[x]==-1) {
//                return x;
//            }
//            return   parent[x]=find(parent[x]);
//
//
//        }
//
//        @Override
//        public int compareTo(Edge o) {
//            return w - o.w;
//
//        }
//    }
//    int v;
//    int matrix[][];
//    Edge edges[];
//    AdjacencyMatrix2(int v){
//        this.v = v;
//        matrix = new int[v][v];
//        edges = new Edge[v*(v-1)/2];
//    }
//    int edgecnt=-1;
//    void addEdge(int source, int destination ,int w){
//        matrix[source][destination]=w;
//        matrix[destination][source]=w;
////        edges[edgecnt++] = new Edge(source,destination,w);
//
//    }
//    void populateEdgesList(){
//        for(int i=0;i<v;i++){
//            for(int j=0;j<v;j++){
//                if(matrix[i][j]!=0){
//                    edges[++edgecnt]=new Edge(i,j,matrix[i][j]);
//
//
//                }
//            }
//        }
//    }
//    //in exam write from krusal and avoid union and finds
//    //in exam we have to accept edges edgecnt and int edges as parameter
//
//    void kruskal(){
//        int mst[][]=new int[v][v];
//        int parent[][]= new int[][]{new int[v]};
//        int size[]=new int[v];
//        for(int i=0;i<v;i++){
//            parent[i]= new int[]{-1};
//        }
//        int edgeCounter=0;
//        int edgeTaken=1;
//        Arrays.sort(edges);
//        while (edgeTaken<v){
//            Edge edge= edges[edgeCounter];
//
//            edgeCounter++;
//
//            if(isCycleDetected(edge.u,edge.v,parent)){
//                continue;
//
//            }
//            union(find(edge.u,parent),find(edge.v,parent),size,parent);
//            mst[edge.u][edge.v]=edge.w;
//            mst[edge.v][edge.u]=edge.w;
//            edgeTaken++;
//
//        }
//
//    }
//
//    private void union(Descriptor descriptor, Descriptor descriptor1, int[] size, int[][] parent) {
//    }
//
//    private Descriptor find(int u, int[][] parent) {
//    }
//
//    boolean isCycleDetected(int u, int v, int[][] parent) {
//        //find helps to find  absolute root
//        return find(u,parent)==find(v,parent);
//    }
//}
