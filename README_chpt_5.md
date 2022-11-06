## Hash Tables

- Made up of a hash fx and an array.
- Hash tables have no ordering of keys.
- Can be used to model relationships
- Creates a mapping from one item to another.

- DNS Resolution - one application of hashing.
  
- Hash Tables choose where to store certain values. 
  
### Hash F(x)
- Must distribute values evenly.
- Must choose different outputs for different inputs.
- Must be consistent:
  - If a key once you should get value x
  - If a key again, you should get the same value x
- A bad hash function will cluster values together.
- A good hash function will distribute the values "evenly" across the array.

### Duplicate Keys
- Keys must be unique 
- If the same key is written to twice - the original value is overwritten.
- Hash Tables are like sets in that they don't allow duplicate keys.

### Collisions
- Occurs when the hash value fx output is the same for a different key.
- Duplicate keys will overwrite any already existing values.
- Collision strategy - store multiple values in a LL stored at the key value.

### Load Factor
- This value represents how "full" the underlying array is.
<pre>
              number of items in hash table
Load Factor = -----------------------------
              Total memory spaces available
</pre>
- The lower bound is 0 - the array is empty.
- The upper bound is not 1 - which would mean that the array is full.
- The upper bound can be greater than 1, only for Multi-map data structures.    
  - If the Load factor is 2 it means that there are twice as many elements stored in hash table as there  are in the underlying array.
  - This can only happen if Linked Lists are pointed at from the hash table values.
  - Each value in array could have a linked list with 2 values.
- If the load factor is 0.7 - then the underlying array should be increased.  
  Normally this is achieved by doubling the size of the underlying array.
- Keeping the load factor below 0.7, helps to decrease the probability of a collision.

### Caching
- This is when servers will remember website data so that it doesn't require recreating the webpage.
- Login Pages can be cached to local servers to enable faster user 

### Performance
- Reads: O(1) - Constant Time - growth of n - doesn't influence runtime
- Writes: O(1) - Constant Time - growth of n - doesn't influence runtime
- Inserts: O(1) - Constant Time - growth of n - doesn't influence runtime
- Deletes: O(1) - Constant Time - growth of n - doesn't influence runtime
