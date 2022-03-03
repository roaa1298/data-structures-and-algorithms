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
