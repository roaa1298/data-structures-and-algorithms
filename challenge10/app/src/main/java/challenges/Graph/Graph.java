package challenges.Graph;

import challenges.HashMap.Structure.HashMap;

import java.util.*;

public class Graph {

    private HashMap<Vertex, List<Edge>> adjVertices;
    private List<Vertex> nodesList;

    public Graph() {
        this.adjVertices = new HashMap<>();
        this.nodesList=new ArrayList<>();
    }

    public HashMap<Vertex, List<Edge>> getAdjVertices() {
        return adjVertices;
    }

    public Vertex addVertex(String data) {
        Vertex vertex = new Vertex(data);
        if (!adjVertices.contains(vertex))
        {
            nodesList.add(vertex);
            adjVertices.put(vertex,new ArrayList<>());
            return vertex;
        }
        return null;
    }

    public void addEdges(String data1, String data2, int weight){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);
        if (adjVertices.contains(vertex1) && adjVertices.contains(vertex2))
        {
            for (int i=0 ; i<adjVertices.get(vertex1).size() ; i++)
            {
                if (Objects.equals(adjVertices.get(vertex1).get(i).getVertex().getData(), vertex2.getData()))
                {
                    adjVertices.get(vertex1).get(i).setWeight(weight);
                }
            }
            for (int i=0 ; i<adjVertices.get(vertex2).size() ; i++)
            {
                if (Objects.equals(adjVertices.get(vertex2).get(i).getVertex().getData(), vertex1.getData()))
                {
                    adjVertices.get(vertex2).get(i).setWeight(weight);
                    return;
                }
            }

                adjVertices.get(vertex1).add(new Edge(vertex2,weight));
                adjVertices.get(vertex2).add(new Edge(vertex1,weight));


        } else {
            System.out.println("<<<One of the vertices or both of them are not exists!>>>");
        }
    }

    public int getSize(){
        return adjVertices.getSize();
    }

    public List<Vertex> getNodes(){
        return nodesList;
    }

    public List<Edge> getNeighbors(Vertex node){
        return adjVertices.get(node);
    }

    public Set<Vertex> bfs(Vertex root){
        Set<Vertex> visited = new LinkedHashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        if (this.getNodes().contains(root)){
            queue.add(root);
            visited.add(root);
        }
        while (!queue.isEmpty()){
            Vertex vertex = queue.poll();
            for(Edge v : this.getNeighbors(vertex)){
                if(!visited.contains((v.getVertex())))
                {
                    queue.add(v.getVertex());
                    visited.add(v.getVertex());

                }
            }
        }
        return visited;
    }
}
