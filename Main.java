import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.IndexOutOfBoundsException;
public class Main extends Graph{

  
   
  static class Graph{
     int n;
     LinkedList<Integer>list[];
     public Graph(int n){
       this. n = n;
       this.list = new LinkedList[n] ;
         }
  
    }
  public Graph createLinkedList(int n){
    
    for(int i = ; i<n; i++){
        list[i]= new LinkedList<> ();
        }
        
   }
   
   public Graph createRandomUnweightedGraphIter(final int n){
     list = new ArrayList<Node>[n];
     //Initialize all Arraylists
     for (int i = 0; i < n; i++) {

      list[i]= new ArrayList<Integer>();
     }
   }
  public DirectedGraph createRandomDAGIter(final int n){
     list = new ArrayList<Node>[n];
    
    
  }
    
   static void printGraph( Graph graph){
     for( int i = 0; i < graph.n; n++){
       System.out.println("Adjacement list of nodes: " +n);
       System.out.println("head");
       for(Integer graphnodes: graph.list[n]){
           System.out.println("-> "+graphnodes);
         }
         System.out.println("\n");
      }
      
    }
    
    public addEdge(Graph graph, int src, int dest){
      int numNodes = list.length;
      if( graph.list[src] == null || graph.list[dest] == null){
       System.err.println("There are nodes not in the graph."); 
       return;
       }
       graph.list[src].addFirst(src);
       graph.list[dest].addFirst(src);
       }
  
       
     public static void main(String[]args){
       int n = 5;
       Graph g = new Graph(n);
       addEdge(graph,0, 1);
       addEdge(graph,0, 4);
       addEdge(graph, 1, 2);
       addEdge(graph, 1, 3);
       addEdge(graph, 1, 4);
       addEdge(graph, 2, 3);
       addEdge(graph, 3, 4);
       
       printGraph(graph);
       }
  
  
   }
 
 
