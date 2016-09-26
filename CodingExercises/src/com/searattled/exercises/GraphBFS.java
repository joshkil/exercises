package com.searattled.exercises;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class GraphBFS {
	
	public static String getBFS(Node start){
		StringBuilder sb = new StringBuilder();
		Deque<Node> list = new LinkedList<Node>();
		
		// push start node onto stack
		list.addLast(start);
		
		while(!list.isEmpty()){
			Node n = list.removeFirst();
			if(!n.isVisited()){
				n.setVisited(true);
				if(sb.length()>0) sb.append(",");
				sb.append(n);
			}
			if(n.getVertices() != null){
				for(Node v : n.getVertices()){
					if(!v.isVisited()) list.addLast(v);
				}
			}
		}
		
		return sb.toString();
	}

	
	// Creating an inner class that will represent nodes for this example. 
	public static class Node{
		private List<Node> vertices;
		private String val;
		private boolean visited;
		
		public Node(String val, List<Node> vertices){
			this.val = val;
			this.vertices = vertices;
		}
		
		public String toString(){
			return val;
		}
		
		public List<Node> getVertices(){
			return vertices;
		}
		
		public void setVertices(List<Node> vertices){
			this.vertices = vertices;
		}
		
		public boolean isVisited(){return this.visited;}
		
		public void setVisited(boolean visited){this.visited = visited;}
	}

}
