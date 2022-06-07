# Stacks and Queues

### Stack
- **stacks** : it is a data structure that consists of nodes. Stacks follow these concepts:
    - **FILO** (First In Last Out) : it is means that the first node that inter the stack will be the last node that popped out of the stack.  
    - **LIFO** (Last In First Out) : it is means that the last node that enter the stack will be first node to popped out of the stack.  
- Also, for the stack that all the functions apply for the last node in the stack like **(push,pop,peek,isEmpty)**.
- There is a pointer called **top** that point at the last node in the stack.

### Queue
- **queue** : also it is a data structure that consists of nodes. Queues follow these concepts:  
    - **FIFO** (First In First Out) : This means that the first node in the queue will be the first node out of the queue.
    - **LILO** (Last In Last Out) : This means that the last node in the queue will be the last node out of the queue.
- There is two pointers in the queue called **(front, back)**, **front** pointer point at the first node in the queue(the first node was added to the queue), and **back** point to the last node in the queue(the last node that added to the queue).
- Common terminology for a queue is(**Enqueue**(add at the end of the queue), **Dequeue**(remove from the first of the queue), **Peek**(receive the value of the node at the front of the queue), **isEmpty**)

## Challenge

### Node class 
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.

### stack class
- At first, we have to create a stack class that have a top property to point at the top of the stack (the last node in the stack).
- and inside this class we have to create these methods:
   - push : adds a new node with that value(in the argument) to the top of the stack with an O(1) Time performance.
   - pop : Returns the value from node from the top of the stack, and Removes the node from the top of the stack, Should raise exception when called on empty stack.  
   - peek : Returns Value of the node located at the top of the stack, Should raise exception when called on empty stack.
   - isEmpty : Returns Boolean indicating whether the stack is empty or not.
  
### queue class
- At first, we have to create a queue class that have front property to point at the first node in the queue.
- and inside this class we have to create these methods:
   - enqueue : adds a new node with that value(in the argument) to the back of the queue with an O(1) Time performance.  
   - dequeue : Returns the value from node from the front of the queue, Removes the node from the front of the queue, Should raise exception when called on empty queue.
   - peek : Returns Value of the node located at the front of the queue, Should raise exception when called on empty stack.  
   - isEmpty : Returns Boolean indicating whether the stack is empty or not.

## Approach & Efficiency

- push method : adds a new node with that value(in the argument) to the back of the queue, by making the next of the new node point at the top and the top pointer point at the new node.
- pop method : just make the top pointer point at the next of the last node in the stack (big O --> O(1)).
- peek method : just return the value of the node that the top point to(big O --> O(1)).
- isEmpty : check if the size of the stack is zero or not(big O --> O(1)).
- 
- enqueue : make the next of the back pointer equal to the new node and then make the back pointer point to the new node and the next of the new node equal to null(big O --> O(1)).  
- dequeue : Returns the value from node from the front of the queue, Removes the node from the front of the queue, Should raise exception when called on empty queue. by making the front pointer point to the next node.  
- peek : just return the value of the front pointer.
- isEmpty : check if the size of the queue is zero or not.

## API

- push method :  adds a new node with that value(in the argument) to the top of the stack, by creating a new node and make the next of the new node point at the top and the top pointer point at the new node.
- pop method : Returns the value from node from the top of the stack, and Removes the node from the top of the stack, and it is raise exception when called on empty stack. by making the top pointer point at the next of the last node in the stack.
- peek method : just return the value of the node that the top point to.
- isEmpty : check if the size of the stack is zero or not.
-
- enqueue : make the next of the back pointer equal to the new node and then make the back pointer point to the new node and the next of the new node equal to null(big O --> O(1)).
- dequeue : just make the front pointer point to the next node(big O --> O(1)).
- peek : just return the value of the front pointer(big O --> O(1)).
- isEmpty : check if the size of the queue is zero or not(big O --> O(1)).
