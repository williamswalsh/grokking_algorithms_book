## Breadth-first Search
- Breadth is the width of something.
- Used to solve "the shortest path" problem.
- You prefer a first-degree connection to a second degree connection.(Shorter)
- This search radiates out from the starting point.
- 1st-degree connections are added to the search list before 2nd-degree connections
- You search the elements in the order that they are added in - Queue data structure(FIFO).
- 

### Graph Data Structure
A graph is made up of nodes and edges.  
Edges connect nodes together(looks like a line).  
Nodes that are connected to one another by a single edge is called a neighbour.  
Can be represented in code by using the Hash Table data structure.  
Hash Tables model relationships. Hash Tables have no ordering.    
Guava's Multi-map can be used to model keys which have more than 1 value.
Multi-maps map a key to an array/linked list depending on the implementation.

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



