## Recursion

Recursive methods have 2 intrinsic cases:
- A recursive case - which continues the recursion
- A terminal/base case - which ends the recursion

There are no performance benefits to recursion.    
Loops are sometimes more performant.  
Each recursion requires a new function stack frame.  
If the recursion amount is very large the memory usage(RAM) will become considerable.  
This uses the JVM's stack memory.  
Object's references are stored on the stack.  
Object's content is stored in the heap.  

