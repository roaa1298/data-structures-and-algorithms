package challenges.queue.structure;

import challenges.queue.data.QueueNode;

public class Queue<T> {
    private QueueNode<T> back;
    private QueueNode<T> front;
    private int size;
    public Queue(){
        size=0;
        front=null;
        back= null;
    }

    public void enqueue(T val){
        QueueNode<T> newNode=new QueueNode<>(val);
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
    public T dequeue() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        else{
            T val=front.getValue();
            this.front=this.front.getNext();
            size--;
            return val;
        }
    }
    public T peek() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        else{
            T val=front.getValue();
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

    public QueueNode<T> getBack() {
        return back;
    }

    public QueueNode<T> getFront() {
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
