package challenge8;

public class LinkedList<T> {
    Node<T> head;

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

    public LinkedList<T> zipLists(LinkedList<T> list1,LinkedList<T> list2){
        Node<T> pointer1=list1.head;
        Node<T> pointer2=list2.head;
        if (list1.head == null && list2.head == null) {
            return null;
        } else if (pointer1 == null) {
            return list2;
        } else if (pointer2 == null) {
            return list1;
        }
        else {
            while (pointer1.next!=null && pointer2.next!=null) {
                Node t1 = pointer1.next;
                Node t2 = pointer2.next;

                pointer1.next = pointer2;
                pointer2.next = t1;

                pointer1 = t1;
                pointer2 = t2;
            }
            if(pointer2.next==null){
                pointer2.next=pointer1.next;
                pointer1.next=pointer2;
            }
            if (pointer1.next==null){
                pointer1.next=pointer2;
            }
        }

        return list1;
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
