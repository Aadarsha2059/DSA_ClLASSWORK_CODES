//
//
//
//import org.example.SinglyLinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class AdjacencyList {
//    SinglyLinkedList adjList[];;
//    int v;
//    public AdjacencyList(int v) {
//        this.v=v;
//        adjList=new SinglyLinkedList[v];
//        for(int i=0;i<v;i++){
//            adjList[i]=new SinglyLinkedList();
//        }
//    }
//    //source and destination
//    public void addEdge(int s, int d){
//        adjList[s].addNode(d);
//        adjList[d].addNode(s);
//    }
//    void printGraph(){
//        for(int i=0;i<v;i++){
//            System.out.print(i+"is connected to");
//            SinglyLinkedList.Node current= adjList[i].head;
//            while(current!=null){
//                System.out.println(current.data+"");
//                current=current.next;
//            }
//            System.out.println();
//        }
//    }
//
//    public void main(String[] args) {
//        AdjacencyList adj=new AdjacencyList(6);
//        adj.addEdge(0, 1);
//        adj.addEdge(0, 2);
//        adj.addEdge(0, 3);
//        adj.addEdge(0, 5);
//        adj.addEdge(2, 4);
//        adj.addEdge(2, 3);
//        adj.addEdge(1, 4);
//        adj.addEdge(3, 5);
//        adj.addEdge(4, 5);
//
//        adj.printGraph();
//
//
//    }
//}
//
//List<Integer> getAdjNodes(int i){
//    List<Integer> list=new ArrayList<Integer>();
//    SinglyLinkedList[] adjList = new SinglyLinkedList[0];
//    SinglyLinkedList.Node current= adjList[i].head;
//    while(current!=null){
//       list.add(current.data);
//       current=current.next;
//    }
//    return list;
//}
//
//public void main(String[] args) {
//    AdjacencyList adj= new AdjacencyList(6);
//    adj.addEdge(0, 1);
//    adj.addEdge(0, 2);
//    adj.addEdge(0, 3);
//    adj.addEdge(0, 5);
//}