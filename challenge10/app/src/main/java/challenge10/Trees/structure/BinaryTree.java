package challenge10.Trees.structure;

import challenge10.Trees.data.BTNode;
import challenge10.Trees.data.BinaryNode;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
    ArrayList<T> inOrderNode=new ArrayList<>();
    ArrayList<T> preOrderNode=new ArrayList<>();
    ArrayList<T> postOrderNode=new ArrayList<>();
    private BTNode<T> root;

    public BinaryTree() {

    }

    public BinaryTree(T value) {
        this.root = new BTNode<T>(value) {
            @Override
            public int compareTo(BTNode<T> o) {
                return 0;
            }
        };
    }

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }


    public BTNode<T> getRoot() {
        return root;
    }

    public void setRoot(BTNode<T> root) {
        this.root = root;
    }

    public ArrayList<T> traverse(TraversalOrder order) {
        switch (order) {
            case INORDER:
                inOrder(root);
                return inOrderNode;
            case PREORDER:
                preOrder(root);
                return preOrderNode;
            case POSTORDER:
                postOrder(root);
                return postOrderNode;
            default:
                return null;
        }
    }

    private void inOrder(BTNode<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        inOrder(treeNode.getLeftNode());
        printNode(treeNode);
        inOrderNode.add(treeNode.getData());
        inOrder(treeNode.getRightNode());
    }

    private void preOrder(BTNode<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);
        preOrderNode.add(treeNode.getData());
        preOrder(treeNode.getLeftNode());
        preOrder(treeNode.getRightNode());
    }

    private void postOrder(BTNode<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeftNode());
        postOrder(treeNode.getRightNode());
        printNode(treeNode);
        postOrderNode.add(treeNode.getData());
    }

    private void printNode(BTNode<T> node) {
        System.out.print(node.getData()+" -> ");
    }
}
