package challenges.Practice;

import challenges.Graph.Graph;
import challenges.Trees.data.BTNode;
import challenges.Trees.structure.BinarySearchTree;

public class Practice {
    public Integer secondMax(BinarySearchTree<Integer> bst){
        int[] count={0};
        Integer[] max=new Integer[1];
        secondMaxHelper(bst.getRoot(),count, max);
        return max[0];
    }
    private void secondMaxHelper(BTNode<Integer> node,int[] count, Integer[] max){
        if (node==null || count[0]>=2)
            return;
        secondMaxHelper(node.getRightNode(),count,max);
        count[0]+=1;
        if (count[0]==2)
        {
            max[0]= node.getData();
        }
    }

    public String starGraphCenter(Graph graph){
        for (int i=0 ; i<graph.getNodes().size() ; i++)
        {
            if (graph.getNeighbors(graph.getNodes().get(i)).size()>1)
            {
                return graph.getNodes().get(i).getData();
            }
        }
        return null;
    }
}
