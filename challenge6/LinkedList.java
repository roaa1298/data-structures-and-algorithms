package lib.src.main.java.challenge6;

import lib.src.main.java.challenge6.Node;

public class LinkedList<T> {
    Node head;

    public LinkedList(){
        this.head = null;
    }
    public void Append(T newValue){
        Node p=this.head;
        if (p==null){
            Node newNode = new Node(newValue);
            this.head=newNode;
            newNode.next=null;
        }
        else {
        while (p!=null)
        {
            if (p.next==null)
            {
                Node newNode = new Node(newValue);
                p.next = newNode;
                newNode.next = null;
                break;
            }
            p=p.next;
        }
        }
    }

    public void InsertBefore(T val,T newVal){
        Node p=this.head;
        if (this.head.value==val)
        {
            Node newNode=new Node(newVal);
            newNode.next=p;
            this.head=newNode;
        }else {
        while (p!=null){
            if (p.next.value==val){
                Node newNode=new Node(newVal);
                Node temp=p.next;
                p.next=newNode;
                newNode.next=temp;
                break;
            }
            p=p.next;
        }
        }
    }
    public void InsertAfter(T val,T newVal){
        Node p=this.head;
        while (p!=null){
            if (p.value==val){
                Node newNode=new Node(newVal);
                if (p.next==null){
                    p.next = newNode;
                    newNode.next = null;
                    break;
                }
                Node temp = p.next;
                p.next=newNode;
                newNode.next=temp;
                break;
            }
            p=p.next;
        }
    }

    @Override
    public String toString() {
        Node p=this.head;
        String str="";
        while (p!=null)
        {
            str+="{"+p.value+"} ->";
            if (p.next==null)
            {
                str+=" NULL";
                break;
            }
            p=p.next;
        }
        return str;
    }

}
