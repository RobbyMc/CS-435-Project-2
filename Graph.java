import java.lang;
import java.util.*;
public class Graph {

 class Node{
     String item;
     Node next;
     Node head = null;
     Node tail = null;
    public Node(String nodeVal, Node next){
       this.next = next;
       this.item = null;
      
    }
  }

 Node current;
 private Node vertices;
 private Node vertex1;
 private Node vertex2;
  
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
     
     
     
  public void addUndirectedEdge(final Node first,final Node second){
       Node v1 = vertices;
       Node v2 = vertices;
       
       while(vertices != null){
          if(first.equals(vertices.item)){
             v1 = firstvertex;
           }
           if(second.equals(vertices.item)){
             v2 = vertex2;
             }
             vertices = vertices.next;
             }
    
    }
    
    
  public  void removeUndirectedEdge(final Node first, Node second){
        return removeUndirectedEdge(new Node(first,last));
  
  
  }
  
  public HashSet<Node> getAllNodes(){
     HashSet<Node> numNodes = new HashSet<Node>();
     return numNodes;
  
  
  }
  
  }
  
  
  
  
