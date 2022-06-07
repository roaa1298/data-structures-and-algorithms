# Hashtables
- Hash tables are a data structure that store the data as key and value pairs, By using that key you can access the elements faster. Using the key, the algorithm (hash function) computes an index that suggests where an entry can be found or inserted.  
- The key is converted into an integer by using a hash function. This integer number can be used as an index to store the original element, which falls into the hash table.  
- Collisions: A collision occurs when more than one key hashes to the same index in an array. Collisions are solved by chaining, It is usually implemented using linked lists (each element of the hash table is a linked list).

## Challenge
- Implement a Hashtable Class with the following methods:  
   - set: 
      - Arguments: key, value
      - Returns: nothing
      - This method should hash the key, and set the key and value pair in the table, handling collisions as needed.  
      - Should a given key already exist, replace its value from the value argument given to this method.
   - get:  
      - Arguments: key  
      - Returns: Value associated with that key in the table  
   - contains:  
      - Arguments: key  
      - Returns: Boolean, indicating if the key exists in the table already.  
   - keys:  
      - Returns: Collection of keys  
   - hash:  
      - Arguments: key  
      - Returns: Index in the collection for that key  


## Approach & Efficiency
- put (set) method -->   
   - At first, we computed the index for the element we want to add by using the key that converted to integer.  
   - Then create a new node and assign the key and value to it.  
   - Then receive the head for that index to add the new node to it.  
   - Check if the liked list at that index empty or not, if empty then just add the node to that index, otherwise we will add the node at the first of the linked list.
   - Before adding the element we should check if the key is redundant or not, if redundant we will replace the value of the exist key with the new value.
   - The time complexity of this method ==> O(1)
   - The space complexity of this method ==> O(1)
- get methode :  
   - Hashing the given key and receive its index.
   - Do a while loop through the liked list in that index and searching for the given key and return its value.
   - Return null if the key not exist.
   - The time complexity of this method ==> O(n) in the worst case, and O(1) in the best case.
   - The space complexity of this method ==> O(1)
- contains method :  
   - Hashing the given key and receive its index.  
   - Do a while loop through the liked list in that index and searching for the given key and return true if it exists.  
   - Return false if the key not exist.
   - The time complexity of this method ==> O(n) in the worst case, and O(1) in the best case.
   - The space complexity of this method ==> O(1)
- keys method :  
   - Create a new array to hold the keys.
   - Looping through the array, and do a while loop through the linked list at every index and add every key to the new array.
   - The time complexity of this method ==> O(n)  
   - The space complexity of this method ==> O(n)
- hash method :
   - It's the same as **getBucketIndex** method, but **getBucketIndex** method we use it when we want add a new element and hash its key, and it's a privet method. but the **hash** method we use it when want to know the index of any element inside the hash table, and if the key not exist in the hash table we will return null.  
   - If the key exist in the hash table we will call **getBucketIndex** method and return the value that returned from it.
   - In the **getBucketIndex** method we computed the index by calling the hashCode function for the key and divide it by the number of buckets and return the modulus for that division. 
   - The time complexity of this method ==> O(1)
   - The space complexity of this method ==> O(1)

## API
- put (set) : it inserts a new element in the hash table by computing an index for that element and insert the element at that index at the beginning of the linked list.
- get : returns the value corresponding to the key if the key is present in Hast Table.  
- contains : it returns true if the key is present in the hash table, otherwise it returns false.  
- keys : it returns an array of all the keys in the hash table.
- hash : it returns the index of a specific key in the hash table.
