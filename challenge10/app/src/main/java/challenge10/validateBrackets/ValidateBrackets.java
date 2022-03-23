package challenge10.validateBrackets;

import java.util.Stack;

public class ValidateBrackets {
    public ValidateBrackets() {
    }
    public Boolean validateBrackets(String str){
        Stack brackets=new Stack<>();
        for (int i=0 ; i<str.length() ; i++)
        {
            if (str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
            {
                brackets.push(str.charAt(i));
            }
            if (str.charAt(i)=='}' || str.charAt(i)==')' || str.charAt(i)==']')
            {
                if (brackets.isEmpty())
                {
                    brackets.push(str.charAt(i));
                }
                if (((char) brackets.peek())=='{')
                {
                    if (str.charAt(i)=='}')
                    {
                        brackets.pop();
                    }
                }
                else if (((char) brackets.peek())=='(')
                {
                    if (str.charAt(i)==')')
                    {
                        brackets.pop();
                    }
                }
                else if (((char) brackets.peek())=='[')
                {
                    if (str.charAt(i)==']')
                    {
                        brackets.pop();
                    }
                }
                else
                {
                    brackets.push(str.charAt(i));
                }
            }
        }


        return brackets.isEmpty();
    }
}
