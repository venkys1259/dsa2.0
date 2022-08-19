package com.practice.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    int v,e;
    int[][] adj; // adjacency matrix where adj[i][j] = 1 represents there is an edge
    // between i and j
    BreadthFirstSearch(int numberOfVertices){
        this.v = numberOfVertices;
        adj = new int[numberOfVertices][numberOfVertices];
        for(int i = 0; i<numberOfVertices;i++){
            for(int j = 0; j<numberOfVertices;j++){
                adj[i][j]=0;
            }
        }
    }
    void addEdge(int startNode, int endNode){
        // There is an edge between two nodes
        adj[startNode][endNode] = 1;
        adj[endNode][startNode] = 1;// bi-directional
    }
    void bfs(int start){
        boolean[] visited = new boolean[v];
        Queue<Integer> verticesQueue = new LinkedList<>();
        verticesQueue.add(start);
        while(!verticesQueue.isEmpty()){
            Integer currentNode = verticesQueue.poll();
            System.out.println(currentNode);

        }


    }
    public static void main(String[] args) {

    }

}
