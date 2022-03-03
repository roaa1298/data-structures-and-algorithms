public class Main {
    public static void main(String[] args) {
        LinkedList<String> Animals = new LinkedList();
        Animals.InsertNode("cat");
        Animals.InsertNode("dog");
        Animals.InsertNode("bird");
        Animals.InsertNode("horse");
        Animals.InsertNode("bear");
        Animals.InsertNode("lion");
        Animals.InsertNode("fish");

        //the insertNode method insert the value at the first everytime

        System.out.println(Animals);
        boolean isExist=Animals.Includes("bear");
        boolean isExist2=Animals.Includes("fox");

        if (isExist==true)
        {
            System.out.println("bear is exists in the linkedList: "+isExist);
        }else {
            System.out.println("bear is not exists in the linkedList: "+isExist);
        }

        if (isExist2==true)
        {
            System.out.println("fox is exists in the linkedList: "+isExist2);
        }else {
            System.out.println("fox is not exists in the linkedList: "+isExist2);
        }

        System.out.println("The head point at "+Animals.head.value);

    }
}
