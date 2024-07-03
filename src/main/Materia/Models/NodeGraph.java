package main.Materia.Models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    int value;
    private List<NodeGraph> neighbors;

    public NodeGraph(int value){
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    public int getValue(){
        return value;
    }
    public void addNeighbor(NodeGraph neighbor){
        neighbors.add(neighbor);
    }

    public NodeGraph[] getNeighbors() {
        return neighbors.toArray(new NodeGraph[0]);
    }
    


    
}
