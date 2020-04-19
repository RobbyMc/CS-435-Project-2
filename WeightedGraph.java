import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import.java.lang.io;

public class WeightedGraph {
    class Node{
     String item;
     Node next;
     Node head = null;
     Node tail = null;
    public Node(String nodeVal, Node next){
       this.next = next;
       this.item = null
       }
    }
   static class Graph{
    int vector;
    LinkedList<Node>[] list;
    Vector<Integer>[] adj;
    static int level;
    public Graph(int vector){
      this.vector = vector;
      this.adj = new Vector[2* vector];
     for(int i = 0; i < 2 * vector;i++){
      this.adj[i] = new Vector<>();
      }
     }
   }
    
   Node current;
 public void addNode(final String nodeVal){
        if(current != null)
          {
            Node newNode = new Node(nodeVal,current.next);
            current.next = newNode;
            current = newNode;
          }
          else
            {
              head = tail = new Node(nodeVal,null );
              current = head;
              }
     }
  public void addWeightedEdge(final Node first, final Node second, final int edgeweight){
        if(edgeweight ==2){
        
         adj[first].add(first + this.vector);
         adj[first].add(second);
         }
         else
         {
          adj[first].add(second);
          }
         
      }
      
  public void removeDirectedEdge(final Node first, final Node second){
    return removeDirectedEdge(new Node(first,last));
  }
  
  public HashSet<Node> getAllNodes(){
     HashSet<Node> numNodes = new HashSet<Node>();
     return numNodes;
   }
  
  }
  class Main{
   
   WeightedGraph createRandomCompleteWeightedGraph(final int n){
         this.n = n;
         list = new LinkedList[n];
         for(int i = 0; i < n; i++){
          list[i] = new LinkedList<>();
    }
    WeightedGraph createLinkedList(final int n){
      for(int i = ; i<n; i++){
        list[i]= new LinkedList<> ();
        }
     }
    public static void main(String [] args){
     WeightedGraph graph = new WeigthedGraph(n);
     int n = 6;
     graph.addWeightedEdge(0,1,4);
     graph.addWeightedEdge(0,2,3);
     graph.addWeightedEdge(1,3,2);
     graph.addWeightedEdge(1,2,5);
     graph.addWeightedEgde(2, 3, 7);
     graph.addWeightedEgde(3, 4, 2);
     graph.addWeightedEgde(4, 0, 4);
     graph.addWeightedEgde(4, 1, 4);
     graph.addWeightedEgde(4, 5, 6);
    }
   }
  }


    
