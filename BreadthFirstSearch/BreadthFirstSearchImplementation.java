package Algorithms.BreadthFirstSearch;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jatingarg on 11/30/16.
 *
 * In breadth  first search or in any graph search strategy we aim at exploring each node of the graph only once.
 *
 * The plan is to systematically explore the nodes of this graph beginning with the given starting vertex in layers.
 * So let's think about the  example graph where S is the starting point for our breadth first search.
 * So to start vertex S will constitute the first layer. So we'll call that L zero.
 * And then the neighbors of S are going to be the first layer. And so those are the vertices that we explore just after S.
 * So those are L one. Now the second layer is going to be the vertices that are neighboring vertices of L one but are
 * not themselves in L one or for that matter L zero.  That's going to be the second layer and so on.
 * Now you'll notice for example S is itself a neighbor of these nodes in layer one, but we've already counted that in
 * a previous layer so we don't count S toward L two.  So that's the high level
 * picture of breadth first search you should have. We'll talk about how to actually precisely implement it on the next
 * slide. Again just a couple other things that you can do with breadth first search which we'll explore in this video
 * is computing shortest paths.
 *
 * See Link :: https://en.wikipedia.org/wiki/Breadth-first_search for breadth first search
 *
 * Must see :: http://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/
 */
public class BreadthFirstSearchImplementation {

    public static void main(String args[]) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");

        /*List<Node> adjacentNodeListForNodeA = new ArrayList<>();
        adjacentNodeListForNodeA.add(b);
        adjacentNodeListForNodeA.add(c);
        a.setAdjacentNodeList(adjacentNodeListForNodeA);
        List<Node> adjacentNodeListForNodeB= new ArrayList<>();
        adjacentNodeListForNodeB.add(d);
        adjacentNodeListForNodeB.add(e);
        b.setAdjacentNodeList(adjacentNodeListForNodeB);
        List<Node> adjacentNodeListForNodeC = new ArrayList<>();
        adjacentNodeListForNodeC.add(f);
        adjacentNodeListForNodeC.add(g);
        c.setAdjacentNodeList(adjacentNodeListForNodeC);
        List<Node> adjacentNodeListForNodeE = new ArrayList<>();
        adjacentNodeListForNodeE.add(h);
        e.setAdjacentNodeList(adjacentNodeListForNodeE);*/



        /*List<Node> adjacentNodeListForNodeA = new ArrayList<>();
        adjacentNodeListForNodeA.add(b);
        adjacentNodeListForNodeA.add(c);
        a.setAdjacentNodeList(adjacentNodeListForNodeA);
        List<Node> adjacentNodeListForNodeB= new ArrayList<>();
        adjacentNodeListForNodeB.add(d);
        adjacentNodeListForNodeB.add(a);
        b.setAdjacentNodeList(adjacentNodeListForNodeB);
        List<Node> adjacentNodeListForNodeC = new ArrayList<>();
        adjacentNodeListForNodeC.add(d);
        adjacentNodeListForNodeC.add(e);
        adjacentNodeListForNodeC.add(a);
        c.setAdjacentNodeList(adjacentNodeListForNodeC);
        List<Node> adjacentNodeListForNodeD = new ArrayList<>();
        adjacentNodeListForNodeD.add(b);
        adjacentNodeListForNodeD.add(c);
        adjacentNodeListForNodeD.add(f);
        d.setAdjacentNodeList(adjacentNodeListForNodeD);
        List<Node> adjacentNodeListForNodeE = new ArrayList<>();
        adjacentNodeListForNodeE.add(f);
        adjacentNodeListForNodeE.add(c);
        e.setAdjacentNodeList(adjacentNodeListForNodeE);*/


        List<Node> adjacentNodeListForNodeA = new ArrayList<>();
        adjacentNodeListForNodeA.add(b);
        adjacentNodeListForNodeA.add(c);
        a.setAdjacentNodeList(adjacentNodeListForNodeA);
        List<Node> adjacentNodeListForNodeB= new ArrayList<>();
        adjacentNodeListForNodeB.add(d);
        adjacentNodeListForNodeB.add(a);
        b.setAdjacentNodeList(adjacentNodeListForNodeB);
        List<Node> adjacentNodeListForNodeC = new ArrayList<>();
        adjacentNodeListForNodeC.add(c);
        c.setAdjacentNodeList(adjacentNodeListForNodeC);
        List<Node> adjacentNodeListForNodeD = new ArrayList<>();
        adjacentNodeListForNodeD.add(a);
        d.setAdjacentNodeList(adjacentNodeListForNodeD);
        BreadthFirstSearchImplementation impl=new BreadthFirstSearchImplementation();
        System.out.println(impl.BreadthFirstCode(a));


    }

    public List<Node> BreadthFirstCode(Node startNode)
    {
        List<Node> queue=new LinkedList<>();
        List<Node> traversedList=new LinkedList<>(); //List to store the nodes that are being traversed one by one
        startNode.setExplored(true);        // setting the explore status of start node to true and adding to queue
        queue.add(startNode);

        while(queue.size()!=0)  //looping through the queue till the queue is not null
        {
            Node currentlyExploredNode=queue.remove(0); //getting the first element from queue
            traversedList.add(currentlyExploredNode);   //as this has been explored adding it to traversed list
            List<Node> adjacentNodeListForCurrentlyExploredList=currentlyExploredNode.getAdjacentNodeList();  //getting list of all the adjacent elements to the currently explored list
            if(adjacentNodeListForCurrentlyExploredList!=null) {

                //if the adjacent list is not null ,traversing through the list and checking whether each node in
                //this list has been explored or not
                //if not explored ,adding it to the end of the queue and updating staus to explored
                for (Node adjacentNode : adjacentNodeListForCurrentlyExploredList) {
                    if (!adjacentNode.isExplored()) {
                        queue.add(adjacentNode);
                        adjacentNode.setExplored(true);
                    }
                }
            }
        }

        return traversedList;

    }


}
