# Graphs
- Graph is a non-linear data structure consisting of nodes and edges.
- The nodes are also called a vertices, and the edges are lines or arcs that connect any two nodes in the graph.
- A Graph consists of a finite set of vertices(or nodes) and set of Edges which connect a pair of nodes.

## Challenge
- Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
   - add node
      - Arguments: value
      - Returns: The added node
      - Add a node to the graph
   - add edge
      - Arguments: 2 nodes to be connected by the edge, weight (optional)
      - Returns: nothing
      - Adds a new edge between two nodes in the graph
      - If specified, assign a weight to the edge
      - Both nodes should already be in the Graph
   - get nodes
      - Arguments: none
      - Returns all of the nodes in the graph as a collection (set, list, or similar)
   - get neighbors
      - Arguments: node
      - Returns a collection of edges connected to the given node
         - Include the weight of the connection in the returned collection
   - size
      - Arguments: none
      - Returns the total number of nodes in the graph


## Approach & API
- addVertex -> This method will add a new node or vertex to the hash table as a key and initialize empty list as a value. before adding we have to check if the new node exists in the hash table or not to avoid replacing the edges list of the node by empty list if it was exists already in the hash table, if the node exists just return null.  
- addEdges -> This method will create a new edge between Two nodes and include a weight for the edge. At first, we have to create two instances of Vertex class to hold the two values from the argument to create an edge between them. then we will check if the two values are existed or not, if exists then we have to check also if the edge is exists or not to avoid duplicate the edge. if it's exists then we will just update the weight of the edge by looping through the list of the node and search about the other vertex inside the list and update its weight. and do the same with the other vertex edges and update the first vertex's weight. but if the edge is not exists we can add the new edge by adding the first vertex to the second vertex's list and add the second vertex to the first vertex's list. the new edge include the vertex and the edge weight.  
- getNodes -> This method will return all the vertices from the hash table as a list by just updating the list inside the addVertex method every time we add a vertex. and just return this list.  
- getNeighbors -> This method will return the list of edges for a specific vertex. by just calling the get method that return the value of a specific key.  
- getSize -> return the hash table size (the number of vertices). we can also create a size variable and update it (increase it) every time we add a new vertex.


## Efficiency
- addVertex -> time complexity: O(1)
- addEdges -> time complexity: O(n)
- getNodes -> time complexity: O(1)
- getNeighbors -> time complexity: O(1)
- getSize -> time complexity: O(1)
