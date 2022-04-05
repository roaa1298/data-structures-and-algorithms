package challenge10.Trees.data;

public class BTNode <T extends Comparable<T>> implements Comparable<BTNode<T>>{
    private T data;
    private BTNode<T> leftNode;
    private BTNode<T> rightNode;

    public BTNode(T data) {
        this.data = data;
    }

    public BTNode() {}

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BTNode<T> getLeftNode() {
        return leftNode;
    }

    public BTNode<T> getRightNode() {
        return rightNode;
    }

    public void setLeftNode(BTNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(BTNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BTNode{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }

    @Override
    public int compareTo(BTNode<T> o) {
        return 0;
    }
}

