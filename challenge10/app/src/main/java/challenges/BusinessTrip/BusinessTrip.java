package challenges.BusinessTrip;

import challenges.Graph.Graph;
import challenges.Graph.Vertex;

import java.util.List;

public class BusinessTrip {

    public Integer businessTrip(Graph graph, List<String> cityNames){
        final int[] cost = {0};
        final boolean[] flag = new boolean[1];
        if (cityNames.isEmpty())
        {
            return null;
        }
        for (int i=0 ; i<cityNames.size()-1 ; i++){
            int finalI = i;
            flag[0]=false;
            if (graph.getAdjVertices().contains(new Vertex(cityNames.get(i)))) {
                graph.getAdjVertices().get(new Vertex(cityNames.get(i))).forEach(edge -> {
                    if (edge.getVertex().getData() == cityNames.get(finalI + 1)) {
                        cost[0] += edge.getWeight();
                        flag[0] = true;
                    }
                });
            }

            if (!flag[0])
            {
                return null;
            }
        }
        return cost[0];
    }
}
