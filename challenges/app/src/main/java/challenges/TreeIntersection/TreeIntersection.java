package challenges.TreeIntersection;

import challenges.HashMap.Structure.HashMap;
import challenges.Trees.structure.BinarySearchTree;
import challenges.Trees.structure.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {
    public List<Integer> tree_intersection(BinarySearchTree<Integer> tree1, BinarySearchTree<Integer> tree2) {
        if (tree1.getRoot() != null && tree2.getRoot() !=null) {
            HashMap<Integer, Integer> hash2 = new HashMap<>();
            List<Integer> res = new ArrayList<>();

            List<Integer> tree1List = tree1.traverse(BinaryTree.TraversalOrder.PREORDER);
            List<Integer> tree2List = tree2.traverse(BinaryTree.TraversalOrder.PREORDER);

            for (int i = 0; i < tree2List.size(); i++) {
                hash2.put(tree2List.get(i), tree2List.get(i));
            }

            for (int i = 0; i < tree1List.size(); i++) {
                if (hash2.contains(tree1List.get(i))) {
                    res.add(tree1List.get(i));
                }
            }
            return res;
        }
        return null;
    }
}
