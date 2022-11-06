## Breadth-first Search
- Breadth is the width of something.
- Used to solve "the shortest path" problem.
- You prefer a first-degree connection to a second degree connection.(Shorter)
- This search radiates out from the starting point.
- 1st-degree connections are added to the search list before 2nd-degree connections
- You search the elements in the order that they are added in - Queue data structure(FIFO).
- You must track the nodes that you have tested the predicate on
  - otherwise you could reprocess already processed nodes
  - it can also lead to infinite loops if A -> B & B -> A.  
    N.B: When A is friends with C and B is friends with C. A -> C & B -> C 

### Graph Data Structure
A graph is made up of nodes and edges.  
Edges connect nodes together(looks like a line).  
Nodes that are connected to one another by a single edge is called a neighbour.  
Can be represented in code by using the Hash Table data structure.  
Hash Tables model relationships. Hash Tables have no ordering.    
Guava's Multi-map can be used to model keys which have more than 1 value.
Multi-maps map a key to an array/linked list depending on the implementation.

### Memory Usage
This algorithm creates a list to store nodes that are already searched. (n)  

### Runtime
If we think about what BFS is actually doing, the work done per node probably looks more like c1 + c2E / V,   
since there's some baseline amount of work done per node (setting up loops, checking basic conditions, etc.),  
which is what's accounted for by the c1 term,  
plus some amount of work proportional to the number of edges visited (E / V, times the work done per edge).  
If we multiply this by V, we get that:
<pre>
    = V · (c1 + c2 * E / V)
    = c1V + c2E
    = O(V + E)
    = O(number of vertices + number of edges)
</pre>
E / V - Average number of edges per vertex(node)
The runtime is a min of O(number of edges) - if there is a graph which resembles a linked list. A->B->C->D->etc.


To read an item from the Hash Table(Graph) data structure requires constant time O(1).

### Topological Sort
This is when you sort a graph to a sorted list.

### Pseudocode
- Create a graph
- select the starting point of the search - "you"
- Add your neighbours to the search queue
- while the search queue has people in it
  - iterate through the search queue
    - check if they meet the predicate condition
    - if not continue
    - if yes stop return true
  - if not found in neighbour
  - remove neighbour
  - Mark neighbour as processed
  - then add neighbour's neighbours to queue
- if no match ever found -> return false



#### Directed/Undirected Graph
- Directed Graph
  - the relationship is one-way
  - edges are arrows
  - A -> B
    - B is A's neighbour, but A isn't B's neighbour.
- Undirected Graph
  - edges are lines
  - no arrows used A -- B
  - both nodes are each other's neighbours.

### Queue
FIFO first-in-first-out
Processes data in the order in which the data is submitted.  
Enqueue - add    item to   list
Dequeue - remove item from list



