package challenge7;

public class LinkedList<T> {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void InsertNode(T val){
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Boolean Includes(T val){
        Node pointer = this.head;
        while(pointer != null)
        {
            if (pointer.value==val)
            {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
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

    public T Kth(int k){
        Node<T> p = this.head;
        Node<T> p1 = this.head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (k > count) {
            throw new IndexOutOfBoundsException("value out of bounds");
        }
        while (count - k > 1) {
            p1 = p1.next;
            count--;
        }
        return p1.value;
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