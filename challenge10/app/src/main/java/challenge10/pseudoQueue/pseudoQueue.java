package challenge10.pseudoQueue;

import challenge10.stack.structure.Stack;

public class pseudoQueue {
    private int size;
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public pseudoQueue(){
        size=0;
    }

    public void enQueue(String value) throws Exception {
        while (true) {
            if (!s1.isEmpty()) {
                s2.push(s1.pop());
            } else {
                break;
            }
        }
        s1.push(value);
        while (true) {
            if (!s2.isEmpty()) {
                s1.push(s2.pop());
            } else {
                break;
            }
        }
        size++;
    }

    public String deQueue() throws Exception {
        String lastValue=null;
        if (!s1.isEmpty()) {
            lastValue = s1.getTop().getValue();
            s1.pop();
            size--;

        }
        return lastValue;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Stack getS1() {
        return s1;
    }

    public Stack getS2() {
        return s2;
    }

    @Override
    public String toString() {
        return "pseudoQueue{" +
                "size=" + size +
                ", s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }
}
