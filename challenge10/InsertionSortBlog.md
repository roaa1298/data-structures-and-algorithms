# Insertion Sort
Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.

Insertion sort works similarly as we sort cards in our hand in a card game.

We assume that the first card is already sorted then, we select an unsorted card. If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left. In the same way, other unsorted cards are taken and put in their right place.

## Pseudocode  
   ```
InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```
## Trace  
**Sample Array:  [8,4,23,42,16,15]**

### Pass 1:  
- compare 4 with 8 , the 4 is less than 8 , then:  
   - put 4 in temp
   - replace index1 with 8
   - replace index0 with temp
- the result --> **[4,8,23,42,16,15]**  

### Pass 2:
- compare 23 with 8 , the 23 greater than 8 , then it will be the same.
- the result --> **[4,8,23,42,16,15]**  

### Pass 3:
- compare 42 with 23 , the 42 greater than 23 , then it will be the same.
- the result --> **[4,8,23,42,16,15]**  

### Pass 4:
- compare 16 with 42 , the 16 is less than 42 , then replace index4 with 42 --> **[4,8,23,42,42,15]**
- compare 16 with 23 , the 16 is less than 23 , then replace index3 with 23 --> **[4,8,23,23,42,15]**
- compare 16 with 8 , the 16 is greater than 8 , then replace index2 with 16 --> **[4,8,16,23,42,15]**

### Pass 5:
- compare 15 with 42 , the 15 is less than 42 , then replace index5 with 42 --> **[4,8,16,23,42,42]**
- compare 15 with 23 , the 15 is less than 23 , then replace index4 with 23 --> **[4,8,16,23,23,42]**
- compare 15 with 16 , the 15 is less than 16 , then replace index3 with 16 --> **[4,8,16,16,23,42]**
- compare 15 with 8 , the 15 is greater than 8 , then replace index2 with 15 --> **[4,8,15,16,23,42]**

### The result
**[4,8,15,16,23,42]**

## Efficiency
- In the **worst case** : Big O for **time (O(n^2))**, and for **space (O(1))**.
- In the **best case** : Big O for **time (O(n))**, and for **space (O(1))**.