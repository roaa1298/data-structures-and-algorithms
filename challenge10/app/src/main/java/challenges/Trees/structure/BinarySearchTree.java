package challenges.Trees.structure;

import challenges.Trees.data.BTNode;
import challenges.Trees.data.BinaryNode;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    private int size;

    public BinarySearchTree() {
    }

    public BinarySearchTree(T value) {
        super(value);
    }

    @Override
    public BTNode<T> getRoot() {
        return super.getRoot();
    }

    @Override
    public void setRoot(BTNode<T> root) {
        super.setRoot(root);
    }

    public void add(T data) {
        if (isTreeEmpty()) {
            setRoot(new BinaryNode<>(data));
            size++;
        } else {
            add(data, getRoot());
        }
    }

    private void add(T data, BTNode<T> root) {
        if (data.compareTo(root.getData())<0)
        {
            if (root.getLeftNode()!= null)
            {
                add(data,root.getLeftNode());
            } else {
                BTNode<T> newNode=new BinaryNode<>(data);
                root.setLeftNode(newNode);
                size++;
            }
        } else if (data.compareTo(root.getData())>0) {
            if (root.getRightNode() != null) {
                add(data, root.getRightNode());
            } else {
                BTNode<T> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }
    }

    public boolean Contains (T searchTerm) {
        if (isTreeEmpty()) {
            return false;
        } else {
            return searchHelper(searchTerm, getRoot());
        }
    }

    private boolean searchHelper(T searchTerm, BTNode<T> root) {
        if (searchTerm.compareTo(root.getData()) !=0 )
        {
            if (searchTerm.compareTo(root.getData())<0 && root.getLeftNode()!=null)
            {
                return searchHelper(searchTerm,root.getLeftNode());
            } else if (searchTerm.compareTo(root.getData())>0 && root.getRightNode()!=null)
            {
                return searchHelper(searchTerm,root.getRightNode());
            }
        } else
            if (searchTerm.compareTo(root.getData()) == 0)
            {
                return true;
            }

        return false;
    }

    public boolean isTreeEmpty() {
        return getRoot() == null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + getRoot() +
                ", size=" + size +
                '}';
    }
}
