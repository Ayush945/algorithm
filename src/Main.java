import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Node for echo wave algorithm (Node > 6):");
        int n = input.nextInt();
        System.out.print("\n");

        if (n > 6) {
            System.out.printf("You have chosen %d node for your echo wave algorithm.\n ",n);

            DynamicGraph graph = new DynamicGraph(n);
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(2, 4);
            graph.addEdge(2, 3);
            graph.addEdge(1, 5);
            graph.addEdge(5, 6);
            graph.addEdge(5, 7);
            graph.addEdge(7, 8);
            graph.printGraph();
        }
        else {
            System.out.println("No of nodes must be more than 6");
        }

    }

}