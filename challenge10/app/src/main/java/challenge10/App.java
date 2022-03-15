/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge10;

import challenge10.queue.structure.Queue;
import challenge10.stack.structure.Stack;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        Stack newStack=new Stack();
        newStack.push("1");
        newStack.push("2");
        newStack.push("3");
        newStack.push("4");
        newStack.push("5");
        System.out.println(newStack);
        System.out.println(newStack.pop());
        System.out.println(newStack);
        System.out.println(newStack.peek());

        System.out.println("------------------------------------------Queue---------------------------------------");

        Queue newQueue=new Queue();
        newQueue.enqueue("1");
        newQueue.enqueue("2");
        newQueue.enqueue("3");
        newQueue.enqueue("4");
        newQueue.enqueue("5");
        System.out.println(newQueue);
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue);
        System.out.println(newQueue.peek());
    }
}
