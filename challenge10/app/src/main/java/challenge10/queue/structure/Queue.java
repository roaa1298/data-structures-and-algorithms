package challenge10.queue.structure;

import challenge10.queue.data.QueueNode;

public class Queue {
    private QueueNode back;
    private QueueNode front;
    private int size;
    public Queue(){
        size=0;
        front=null;
        back= null;
    }

    public void enqueue(String val){
        QueueNode newNode=new QueueNode(val);
        if (size==0)
        {
            this.front=newNode;
        } else
        {
            this.back.setNext(newNode);
        }
        this.back=newNode;
        newNode.setNext(null);
        this.size++;
    }
    public String dequeue() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        else{
            String val=front.getValue();
            this.front=this.front.getNext();
            size--;
            return val;
        }
    }
    public String peek() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        else{
            String val=front.getValue();
            return val;
        }
    }

    public boolean isEmpty(){
        if (size==0)
        {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public QueueNode getBack() {
        return back;
    }

    public QueueNode getFront() {
        return front;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "back=" + back +
                ", front=" + front +
                ", size=" + size +
                '}';
    }
}
