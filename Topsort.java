import java.util.*;
import java.lang.io;
import java.util.ArrayList;

public class TopSort extends DirectedGraph{
 
 class Node{
  private int id;
  private ArrayList<Integer> neighbors;
  public Node(int id){
   this.id = id;
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
  public int getId(){
   return id;
  }
  public static ArrayList<Node> Kahns(final DirectedGraph graph){
    ArrayList<Node> L = new ArrayList<>();
    boolean visited[] = new boolean[v];
    for(Node temp : graph.getNodes())){
      visited.put(temp.getId(),false);
      }
     }
     
  public static ArrayList<Node> mDFS(final DirectedGraph graph){ 
     ArrayList<Node> nd = new ArrayList<Node>();
     nd.add(graph);
     while(!nd!.isEmpty())
     {
      Node element = nd.pop();
      if(!element.visited)
      {
       System.out.println(element.id + "  ");
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
 