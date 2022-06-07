package challenges.challenge41;

import challenges.stack.structure.Stack;

public class Navigator {
    private Stack backStack;
    private Stack forwardStack;
    private String currentLink;

    public Navigator() {
        this.backStack =new Stack();
        this.forwardStack =new Stack();
        currentLink=null;
    }

    public String back() throws Exception {
        if (backStack.getSize()>1){
            forwardStack.push(backStack.pop());
                currentLink=backStack.peek();
                return currentLink;
        }
        return null;
    }
    public String forward() throws Exception {
        if (!forwardStack.isEmpty())
        {
            currentLink=forwardStack.peek();
            backStack.push(forwardStack.pop());
            return currentLink;
        }

        return null;
    }
    public void go(String link){
        backStack.push(link);
    }
}
