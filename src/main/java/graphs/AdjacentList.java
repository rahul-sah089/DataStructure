package graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*Array is Used. The size of the array is equal to number of vertices
 * An entry array[i] represents the list of vertices adjacent to the ith vertex
 * This representation can also be used to represent a weighted graph.
 *
 * */
public class AdjacentList {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            ArrayList<Integer> value = adj.get(i);
            for (int j = 0; j < value.size(); j++) {
                System.out.print("->" + value.get(j));
            }
            System.out.println();
        }
    }

    public void BFS(ArrayList<ArrayList<Integer>> adj, int initVal) {
        //get the number of vertices
        int vertices = adj.size();
        //Mark all the vertices as not visited
        boolean visited[] = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(initVal);
        visited[initVal] = true;

        while (!queue.isEmpty()) {
            int s = queue.poll();
            System.out.print(s + ",");

            //get all the adjacent values to the dequeued vertex s
            //If adjacent vertex is not be visited then enque then in the queue
            //Mark then as visited
            ArrayList<Integer> listOfVertex = adj.get(s);
            for (int i = 0; i < listOfVertex.size(); i++) {
                int n = listOfVertex.get(i);
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }
}
