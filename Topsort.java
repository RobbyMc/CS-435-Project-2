import java.util.*;
import java.lang.io;
import java.util.ArrayList;

public class TopSort extends DirectedGraph{
 
 class Node{
  private int index;
  private ArrayList<Integer> neighbors;
  public Node(int index){
   this.index = index;
   this.neighbors = new ArrayList<>();
   }
   
  }
  private ArrayList<Node> nodes;
  public int getNeighbors(){
   return neighbors;
  }
  public DirectedGraph(ArrayList<Node> nodes){
   this.nodes = nodes;
  }
  public ArrayList<Node> getNodes(){
    return nodes;
   }
  public int getIndex(){
   return index;
  }
  public static ArrayList<Node> Kahns(final DirectedGraph graph){
    ArrayList<Node> adjacentList = new ArrayList<>();
    boolean visited[] = new boolean[v];
    for(Node temp : graph.getNodes())){
      visited.put(temp.getIndex(),false);
      }
     }
     
  public static ArrayList<Node> mDFS(final DirectedGraph graph){ 
     ArrayList<Node> firstnode = new ArrayList<Node>();
     firstnode.add(graph);
     while(!firstnode.isEmpty())
     {
      Node element = firstnode.pop();
      if(!element.visited)
      {
       System.out.println(element.index + "  ");
       element.visited = true;
      }
      ArrayList<Node> neighbors = element.getNeighbors();
      for(int i = 0; i < neighbor.size(); i++){
       Node n = neighbors.get(i);
       if(n != null && !n.visited)
        {
         graph.add(n);
        }
     }
     
   
  }
 
