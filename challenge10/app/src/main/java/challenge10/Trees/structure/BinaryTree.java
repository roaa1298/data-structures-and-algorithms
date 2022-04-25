package challenge10.Trees.structure;

import challenge10.Trees.data.BTNode;
import challenge10.Trees.data.BinaryNode;
import challenge10.queue.structure.Queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree<T extends Comparable<T>> {
    ArrayList<T> inOrderNode=new ArrayList<>();
    ArrayList<T> preOrderNode=new ArrayList<>();
    ArrayList<T> postOrderNode=new ArrayList<>();
    private BTNode<T> root;
    int treeSize=0;


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
                System.out.println("");
                return inOrderNode;
            case PREORDER:
                preOrder(root);
                System.out.println("");
                return preOrderNode;
            case POSTORDER:
                postOrder(root);
                System.out.println("");
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

    public ArrayList<T> breadthFirst() throws Exception {
        ArrayList<T> breadthList=new ArrayList<>();
        if (root!=null){
            Queue<BTNode<T>> q=new Queue<>();
            q.enqueue(root);
            BTNode<T> node;
            while (!q.isEmpty()){
                node=q.dequeue();
                breadthList.add(node.getData());
                if (node.getLeftNode()!=null){
                    q.enqueue(node.getLeftNode());
                }
                if (node.getRightNode()!=null){
                    q.enqueue(node.getRightNode());
                }
            }
            return breadthList;
        }
        else {
            System.out.println("Tree is Empty");
            return null;
        }

    }

    private void printNode(BTNode<T> node) {
        System.out.print(node.getData()+" -> ");
    }

    public Integer getMaxNum(){
        ArrayList<T> list=traverse(TraversalOrder.PREORDER);
        if (root!=null) {
            Integer maxNumber= (Integer) list.get(0);
            for (T num : list) {
                if ((Integer) num > maxNumber) {
                    maxNumber = (Integer) num;
                }
            }
            return maxNumber;
        } else {
            System.out.println("Tree is Empty");
            return null;
        }
    }

    public BinaryTree<String> fizzbuzzTree(BinaryTree<Integer> tree){
        BinaryTree<String> newTree = new BinaryTree<>();
        newTree.setRoot(new BTNode<>());

        if (tree.getRoot() != null) {
            recursionFizzBuzzTree(tree.getRoot(), newTree.getRoot());
        } else {
            System.out.println("tree is empty");
        }

        return newTree;
    }
    public void recursionFizzBuzzTree(BTNode<Integer> oldTree, BTNode<String> newTree){
        if (oldTree.getData() % 5 == 0 && oldTree.getData() % 3 == 0) {
            newTree.setData("FizzBuzz");
        } else if (oldTree.getData() % 5 == 0) {
            newTree.setData("Buzz");
        } else if (oldTree.getData() % 3 == 0) {
            newTree.setData("Fizz");
        } else {
            newTree.setData(oldTree.getData().toString());
        }

        if (oldTree.getLeftNode() != null) {
            newTree.setLeftNode(new BTNode<>());
            recursionFizzBuzzTree(oldTree.getLeftNode(), newTree.getLeftNode());
        }

        if (oldTree.getLeftNode() != null) {
            newTree.setRightNode(new BTNode<>());
            recursionFizzBuzzTree(oldTree.getRightNode(), newTree.getRightNode());
        }
    }

    public Boolean directoryFile(BinaryTree<String> tree1,BinaryTree<String> tree2){
        if (tree1.getRoot() == null && tree2.getRoot() == null) {
            return true;
        }
        int size1=0;
        int size2=0;
        if (tree1.getRoot() != null && tree2.getRoot() != null) {
            recursionDirectoryFiles(tree1.getRoot());
            size1=treeSize;
            treeSize=0;
            recursionDirectoryFiles(tree2.getRoot());
            size2=treeSize;
            if (size1==size2)
            {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public void recursionDirectoryFiles(BTNode<String> rootTree){
        if (rootTree.getLeftNode()==null && rootTree.getRightNode()==null){
            treeSize++;
        }
        if (rootTree.getLeftNode() !=null){
            recursionDirectoryFiles(rootTree.getLeftNode());
        }
        if (rootTree.getRightNode() !=null){
            recursionDirectoryFiles(rootTree.getRightNode());
        }

    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
