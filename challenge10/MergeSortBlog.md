# Merge Sort  
The MergeSort function repeatedly divides the array into two halves until we reach a stage where we try to perform MergeSort on a subarray of size 1 .  
After that, the merge function comes into play and combines the sorted arrays into larger arrays until the whole array is merged.  

## Pseudocode   

```

ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```

## Trace  

- **Sample Array:  [8,4,23,42,16,15]**
- n=6
### MergeSort and Merge methods:  
- mid=2
- left array length=3  --> [8, 4, 23]
   - call Mergesort(arr):  med=1   ,  left= [8, 4]   ,   right= [23]  
       - call Mergesort(arr) for the left array:  mid=0   , left= [8]   , right= [4]  
       - call Merge() method for [8] and [4], to sort and merge them --> [4,8]  
   - call Merge() for [4,8] and [23], to sort and merge them --> 4 is less than 23 then add 4 to arr --> **arr=[4]**, 8 is less than 23 then add 8 to arr --> **arr=[4,8]**, add 23 to arr(remaining value) --> **arr=[4,8,23]**.  


- right array length=3  --> [42, 16, 15]
    - call Mergesort(arr):  med=1   ,  left= [42, 16]   ,   right= [15]
        - call Mergesort(arr) for the left array:  mid=0   , left= [42]   , right= [16]  
        - call Merge() method for [42] and [16], to sort and merge them --> [16,42]  
    - call Merge() for [16, 42] and [15], to sort and merge them --> 15 is less than 16 then add 15 to arr --> **arr=[15]**, add [16, 42] to arr(remaining values) --> **arr=[15,16,42]**.  

- call Merge() for [4,8,23] and [15,16,42], to sort and merge them --> 4 is less than 15 then add 4 to arr --> **arr=[4]**, 8 is less than 15 then add 8 to arr --> **arr=[4,8]**, 8 is less than 15 then add 8 to arr --> **arr=[4,8]**, 15 is less than 23 then add 15 to arr --> **arr=[4,8,15]**, 16 is less than 23 then add 16 to arr --> **arr=[4,8,15,16]**, 16 is less than 23 then add 16 to arr --> **arr=[4,8,15,16]**, 23 is less than 42 then add 23 to arr --> **arr=[4,8,15,16,23]**, add 42 to arr(remaining value) --> **arr=[4,8,15,16,23,42]**.  

### The result
**[4,8,15,16,23,42]**

## Efficiency
- In the **worst case** : Big O for **time (O(nlogn))**, and for **space (O(n))**.  




    
