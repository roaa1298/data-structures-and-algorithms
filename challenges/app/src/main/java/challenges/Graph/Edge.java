package challenges.Graph;

public class Edge {
    private Vertex vertex;
    private int weight;

    public Edge(Vertex vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }


    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "vertex=" + vertex +
                ", weight=" + weight +
                '}';
    }
}
