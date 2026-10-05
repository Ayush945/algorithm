import java.util.*;

public class DynamicGraph {

    int totalNodes;
    List<Integer>[] adjList;


    public DynamicGraph(int n){
        totalNodes = n;
        adjList = new ArrayList[n];

        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int father,int son){
        if(father>=0 && father<totalNodes && son>=0 && son<totalNodes){
            adjList[father].add(son);
        }
    }

    public void printGraph(){
        for(int i = 0; i < totalNodes; i++){
            System.out.println("Node " + i + " is connected to: " + adjList[i]);
        }
    }
}
