package challenge_5;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
        this.head = null;
    }
    public void InsertNode(T val){
        Node<T> newNode = new Node<>(val);
        newNode.next = this.head;
        this.head = newNode;
    }
    public Boolean Includes(T val){
        Node<T> pointer = this.head;
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
        Node<T> p=this.head;
        StringBuilder str= new StringBuilder();
        while (p!=null)
        {
            str.append("{").append(p.value).append("} ->");
            if (p.next==null)
            {
                str.append(" NULL");
                break;
            }
            p=p.next;
        }
        return str.toString();
    }
}
