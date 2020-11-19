package graphs;

import linkedList.LinkedList;

import java.util.ArrayList;

public class Graphs {
    private int V;   // No. of vertices
    private ArrayList<ArrayList<Integer>> adjList;

    Graphs(int v) {
        this.V = v;
        this.adjList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < this.V; i++) {
            this.adjList.add(new ArrayList<Integer>());
        }
    }

    void addToList(int source,int destination){
        this.adjList.get(source).add(destination);
        this.adjList.get(destination).add(source);
    }

    void printArrayList(ArrayList<ArrayList<Integer>> adjList){
        for(int i = 0 ; i < adjList.size();i++){
            ArrayList<Integer> values = adjList.get(i);
            for(int j = 0 ; j < values.size();j++){
                System.out.println(values.get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Adjacency list");

    }




}
