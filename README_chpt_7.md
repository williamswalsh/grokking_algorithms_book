## Dijkstra's Algorithm
Dijkstra's Algorithm solves the shortest path problem for directed acyclic graphs(D.A.G.).
Its doesn't handle a cycle in the graph.
Weights are assigned to each edge.  
These weights could represent time, effort, cost, etc.  
Dijkstra's algorithm does not work with graphs which contain cycles.  
Only works with positive weights, no negative weights allowed.  
The Bellman-Ford algorithm can be used when there are negative weights.  

### Graph Terminology
- Directed graph
    - A->B or B->A
- Undirected graph
    - A-B == B-A
    - 2 way relationship
    - this is a cycle
- Following a cycle will never give you the shortest path. 

### Algorithm


### Data Structures
- Weighted graph
  - A graph that has weights on each of the edges.
  - Dijkstra's Algorithm can be used to get the shortest path.
- unweighted graph
  - A graph that has no weights on each of the edges.
  - Breadth first search can be used to get the shortest path.
