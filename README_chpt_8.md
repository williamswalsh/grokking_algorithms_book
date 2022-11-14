## Greedy Algorithm
We will be dealing with "approximation algorithms".  
"Approximation algorithms" find approximate solutions to problems .  
These are used when there is no fast way to solve problem.  

### Classroom scheduling problem
- Classroom - single resource
- Must pick which classes can be arranged in the available time slot.

#### Greedy approach
- Pick the class that ends the soonest
  - this is your first choice
- then pick the class that ends the soonest again, after the first class ends
  - this is your second choice

At each step, pick the local optimal move.   
In games where local optimal moves compile into global optimal approaches then you can use the greedy strategy.  

### Knapsack problem
- Knapsack - backpack
- What is the maximum value that you can fit into bag, that can only hold 30lbs in weight?
- minimizing weight - max limit - 30 lbs
- maximizing cost of items $$$ 
- Greedy algorithms doesn't give optimal strategy here - approximate solution/strategy
- Solution doesn't have to be perfect - just good.

### The set covering problem
- You have a radio show
- There are multiple radio towers 
- What is the min number of towers you must use to achieve full US radio coverage?

#### Approximation approach
- pick the station that covers the largest number of states.
- then pick the station that covers the largest number of states which haven't already been covered.
- repeat.

These algorithms are rated by:
- How fast they are.
- How close they are to the optimal solution.


O(n) for brute force approach - O(2^n)  
O(n) for greedy approach - O(n^2)  

#### Pseudocode
in1: Set<State> enum/Set<Strings>
in2: Map<Station, Set<State>>



