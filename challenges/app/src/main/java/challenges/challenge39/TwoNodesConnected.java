package challenges.challenge39;

import challenges.Graph.Edge;
import challenges.Graph.Graph;
import challenges.Graph.Vertex;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TwoNodesConnected {

    public boolean areTwoNodesConnected(Graph graph, Vertex v1,Vertex v2){
        Set<Vertex> visited = new LinkedHashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        if (graph.getNodes().contains(v1)){
            queue.add(v1);
            visited.add(v1);
        }
        while (!queue.isEmpty()){
            Vertex vertex = queue.poll();
            for(Edge v : graph.getNeighbors(vertex)){
                if(!visited.contains((v.getVertex())))
                {
                    System.out.println("<<"+v.getVertex()+"----"+v2+"----"+v.getVertex().equals(v2)+">>");
                    queue.add(v.getVertex());
                    visited.add(v.getVertex());
                    if (v.getVertex().equals(v2))
                    {
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
