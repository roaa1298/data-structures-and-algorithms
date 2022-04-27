package challenges.stack.structure;

import challenges.stack.data.StackNode;

public class Stack {
    private StackNode top;
    private int size;

    public Stack(){
        top=null;
        size=0;
    }
    public void push(String value){
        StackNode newNode=new StackNode(value);
        newNode.setNext(this.top);
        this.top=newNode;
        size++;
    }

    public String pop() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        else {
            String val=this.top.getValue();
            this.top=this.top.getNext();
            size--;
            return val;

        }
    }

    public  String peek() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        else {
            return this.top.getValue();
        }
    }

    public boolean isEmpty(){
        if (this.top==null)
        {
            return true;
        }else{
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public StackNode getTop() {
        return top;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
