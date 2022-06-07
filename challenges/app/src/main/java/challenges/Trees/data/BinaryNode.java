package challenges.Trees.data;

public class BinaryNode <T extends Comparable<T>> extends BTNode<T>{
    public BinaryNode(T value) {
        super(value);
    }

    @Override
    public int compareTo(BTNode<T> o) {
        return 0;
    }
}
