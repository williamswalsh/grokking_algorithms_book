## QuickSort

- Uses the divide-and-conquer strategy.  
- Divide-and-conquer strategies suit recursive functions.  
- Need to break the recursive case into 2 sub cases:
  - Base/Terminal case - single element or empty array
  - Recursion case - Divide stage
- More memory efficient than Merge Sort as merge sort requires an array to merge into.  
- Big O notation relies on the concept of a duration for constant time C * O(n)
- Some constants can be less than other constants - i.e. it isn't constant
- If the array is sorted -> worst case efficiency

Steps:
- Choose a pivot
- partition the elements in the array into gt and lt 
- then call quick sort on 2 sub-arrays
- Average runtime: O(n*log n)  - call stack height=log n, Need to touch "most" elements once O(n) -> O(n * log n)  
- Worst   runtime: O(n^2)

