package challenge10.queue.data;

import challenge10.stack.data.StackNode;

public class QueueNode {
    private String value;
    private QueueNode next;

    public QueueNode(String value){
        this.value=value;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public String getValue() {
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
