package challenges.stack.data;

public class StackNode {
    private String value;
    private StackNode next;

    public StackNode(String value){
        this.value=value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public StackNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
