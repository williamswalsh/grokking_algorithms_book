## Intro

### Big O Runtime notation
Tells you **how fast** the algorithm **grows**.  
Establishes the **worst-case runtime**.
Simple search worst-runtime is O(n) even if the item is the first item in the list.  
If the item is first -> its the best case scenario.  
Simple search **will never be slower than O(n)**.  
<pre>
Samples:
O(log n)        very fast  log time      binary search
O(1)            fast for large n         constant time (doesn't change)
O(n)            fast       linear time   simple search
O(n * log n)    fast                     fast sorting algorithm
O(n^2)          slow                     slow sorting algorithm  selection sort
O(n!)           very slow                very slow algorithm     travelling salesman
</pre>
Algorithms aren't measured in speed.  
Algorithms are    measured in the growth of the number of operations, per input size.  
Algorithms are    measured how quickly the runtime increases as the size of the input increases.  




### Search Types
- Simple Search
  - Sorted or unsorted data
  - Check 1st, then 2nd, then 3rd, etc.
  - For n items you can have a max of n guesses
  - linear search
  - linear time
  - O(n)
- Binary Search
  - Sorted data only
  - Check middle and compare with target
  - If mid > target - remove upper half of items
  - If mid < target - remove lower half of items
  - O(log n)
  - log time
    <pre>
    log -> log to base 2
    n -> number of items
    log n = steps_to_target   ||  2^steps_to_target = n     >> ceil(steps_to_target) >> Steps=steps_to_target
    log 8 = ?                 ||  2^steps_to_target = 8     >> ceil(3)               >> Steps=3 
    log 100 = ?               ||  2^steps_to_target = 100   >> ceil(6.6)             >> Steps=7
    log 4_000_000_000 = ?     ||  2^steps_to_target = 4bill >> ceil(31.9)            >> Steps=32
    </pre>