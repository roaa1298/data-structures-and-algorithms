# Singly Linked List

- The singly linked list is a list of objects or elements called nodes, every node have a value and pointer that point at the next element in the list.
- there is a pointer called head, this pointer always point at the first element in the list.
- The pointer of the last element point at null.

## Challenge

- At first, we should make a node class to make instants of this class to make the structure of every node in the linked list.
- Node class should have properties for the **value** stored in the Node, and a pointer to the **next** Node.
- then we will make the linked list class to make instants of this class to make the structure of the linked list class.
- Inside the linked list class we should include properties and methods to build the structure of the class.
    1. we should  include a **head** property.
    2. And some methods like **insertNode** to insert a node to the linked list, and **Includes** to check if the value from the Arguments exists in the list or not, And **toString** method we can use it to print the whole object at once without for loop in the main by just using the System.out.print without even calling the method, we just type System.out.print(Animals) for example.

## Approach & Efficiency

- The approach for insert any node will take big O => o(1).

## API

- #### InsertNode
    1. first we will make a new node and pass a value to it as argument.
    2. then make the pointer of the node point to the next node(head).
    3. then make the head point to this new node.
- #### Includes
    1. first we will create a pointer from the class Node and make it point at the head.
    2. and then we will loop through the list and check everytime if the value of the current node equal to the value from the argument if we found the value we will return true, otherwise we will still looping until the pointer is equal to null, inside the loop we increase the pointer everytime, if the loop ends, and we didn't find the value we will return false.
- #### toString
    1. first we will create a pointer from the class Node and make it point at the head.
    2. create a variable of type string to hold the result and initialize it with empty string.
    3. then we will loop through the list until the pointer equal null, and inside the loop we will access the value of the current node everytime and add it to the variable that we created.
    4. we are increasing the pointer every loop to go to the next node(we increase the address here).
    5. and finally return the result variable.
