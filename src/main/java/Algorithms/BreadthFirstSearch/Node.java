package Algorithms.BreadthFirstSearch;

import java.util.List;

/**
 * Created by jatingarg on 11/30/16.
 */
public class Node {

    private String name;
    private boolean explored;
    private List<Node> adjacentNodeList;


    //Constructor
    public Node(String name) {
        this.name = name;
    }



    //Getters and Setters
    public String getName() {
        return name;
    }

    public boolean isExplored() {
        return explored;
    }

    public List<Node> getAdjacentNodeList() {
        return adjacentNodeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExplored(boolean explored) {
        this.explored = explored;
    }

    public void setAdjacentNodeList(List<Node> adjacentNodeList) {
        this.adjacentNodeList = adjacentNodeList;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
