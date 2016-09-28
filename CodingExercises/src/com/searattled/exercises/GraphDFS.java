package com.searattled.exercises;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.searattled.exercises.GraphBFS.Node;

public class GraphDFS {

	// The first implementation uses recursion on the method call stack
	public static String getDFS_v1(Node start) {
		// create a string to hold the depth first traversal - we print the data in each 
		// node into the string as we visit. 
		StringBuilder sb = new StringBuilder();
		
		// visit the current node and append it to the string
		sb.append(start);
		start.setVisited(true);
		
		// iterate over the vertices of the current node
		if (start.getVertices() != null) {
			Iterator<Node> i = start.getVertices().iterator();
			while (i.hasNext()) {
				Node n = i.next();
				
				// for each adjacent node, check if it has already been visited
				// if not, visit the node by recursing into this function.
				// append the return value to the string
				if (!n.isVisited()) {
					sb.append(getDFS_v1(n));
				}
			}
		}

		return sb.toString();
	}

	// This second implementation uses a stack on the heap (mimicking recursion)
	public static String getDFS_v2(Node start) {
		// create a string to hold the depth first traversal, we add the data of each node
		// to the string when we visit it. 
		StringBuilder sb = new StringBuilder();
		
		// Create a double ended queue (deque) for use as a stack and push the
		// starting node onto the stack
		Deque<Node> list = new LinkedList<Node>();
		list.push(start);
		
		// Until we empty the stack pop off the top node, visit it, and
		// add it's vertices to the stack. 
		while (!list.isEmpty()) {
			Node n = list.pop();
			if (!n.isVisited()) {
				sb.append(n);
				n.setVisited(true);
			}

			// Here I loop through the vertices in order and push them onto the stack.
			// This means the last vert. in the list will be visited first. This creates
			// a different search order than my v1 implementation, but there is no string 
			// need to visit the nodes in order. 
			// Note that if a node is already visited, we don't push it back on the stack. 
			// 
			if (n.getVertices() != null) {
				List<Node> v = n.getVertices();
				Iterator<Node> i = v.iterator();
				while (i.hasNext()) {
					Node n2 = i.next();
					if(!n2.isVisited())
						list.push(n2);
				}
			}
		}
		return sb.toString();
	}

	// Creating an inner class that will represent nodes for this example.
	public static class Node {
		private List<Node> vertices;
		private String val;
		private boolean visited;

		public Node(String val, List<Node> vertices) {
			this.val = val;
			this.vertices = vertices;
			this.visited = false;
		}

		public String toString() {
			return val;
		}

		public List<Node> getVertices() {
			return vertices;
		}

		public void setVertices(List<Node> vertices) {
			this.vertices = vertices;
		}

		public boolean isVisited() {
			return this.visited;
		}

		public void setVisited(boolean visited) {
			this.visited = visited;
		}
	}

}
