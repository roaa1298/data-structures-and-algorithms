# Challenge Summary

- Write a function called zip lists  
- Arguments: 2 linked lists  
- Return: New Linked List, zipped  
- Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the the zipped list.  


## Whiteboard Process
![linked-list-zip](linked-list-zip.png)

## Approach & Efficiency

- I added the second list nodes to the first one every loop and i didn't use additional linked list to merge the two linked lists to save the space to O(1) and increase the efficiency.

## Solution

- I run my code by writing some functions to test the code, these functions test many cases of the linked lists that passes to the function.
- I used assertEqual to test the output, it checks if the expected output is equal to the actual output.
- example:
   ````
       @Test void zipListsTest(){
       LinkedList<Integer> numbers = new LinkedList<>();
       numbers.Append(1);
       numbers.Append(3);
       numbers.Append(2);
       LinkedList<Integer> numbers2 = new LinkedList<>();
       numbers2.Append(5);
       numbers2.Append(9);
       numbers2.Append(4);
       String res="{1} ->{5} ->{3} ->{9} ->{2} ->{4} -> NULL";
       assertEquals(res,numbers.zipLists(numbers,numbers2).toString());
     }
   ````
