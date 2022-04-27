package challenges.queue.data;

public class QueueNode<T> {
    private T value;
    private QueueNode<T> next;

    public QueueNode(T value){
        this.value=value;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
