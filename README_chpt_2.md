## Selection Sort

### Arrays
Arrays store items in memory contiguously.  
Contiguously - bordering each other.
If there is not enough space to add a new item to an array,  
then the whole array must be moved to a new location in memory where   
there is enough space.  
So adding new items to an array can be slowwwww. 
Arrays can hold large chunks by initialising them with a large size.  
For 10000 elements -> arrays require 10000 memory slots together.   
The memory locations are contiguous, therefore they are predetermined.  
**Random Access:** You can determine the memory location without linear traversal.

**N.B.:** Binary Search needs random access.  
**N.B.:** For insertion - add new memory location to end - if available(otherwise move whole array).  
          All elements after inserted element have to be shifted by 1.


### Linked list
Your items are not contiguous.  
One item points to the next item in memory.  
A bunch of memory addresses are Linked together.  
Adding an item(inserting) to a linked list is easy.  
For 10000 elements -> linked lists don't require 10000 memory slots together.  
If there is enough space in memory -> you have enough space for a linked list.  
**Sequential Access:** Must traverse a linked list to determine the memory location of an item in the list.  
Lists are better if you will be inserting data into the middle of the list.  
If arrays were used all elements after the inserted element will have to be shifted by one, and it may a moving of the whole array.  
Better for Insertions and deletions.

**N.B.:** If it's the first item to be inserted or deleted in a LL, its O(1).   
As those references are always known to a LL.  

### Linked lists vs arrays
<pre>
                Linked List         Arrays      Hybrid(Sorted Array of unsorted LL)
Reading            O(n)              O(1)             O(1) + O(n) 
Insertion          O(1)              O(n)             O(1) + O(1) (insert at end)
Deletion           O(1)              O(n)             O(1) + O(n) (delete can be at any position in LL)
</pre>

