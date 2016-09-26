package com.searattled.exercises;

import static org.junit.Assert.*;


import java.util.Arrays;

import org.junit.Test;

public class GraphBFSTest {

	@Test
	public void testGetBFS() {
		// Create a set of Nodes
		GraphBFS.Node na = new GraphBFS.Node("A", null);
		GraphBFS.Node nb = new GraphBFS.Node("B", null);
		GraphBFS.Node nc = new GraphBFS.Node("C", null);
		GraphBFS.Node nd = new GraphBFS.Node("D", null);
		GraphBFS.Node ne = new GraphBFS.Node("E", null);
		GraphBFS.Node nf = new GraphBFS.Node("F", null);
		
		na.setVertices(Arrays.asList(nb, nc));
		nb.setVertices(Arrays.asList(nd));
		nc.setVertices(Arrays.asList(nd));
		nd.setVertices(Arrays.asList(ne, nf));
		ne.setVertices(Arrays.asList(nd));
		nf.setVertices(null);
		
		assertEquals("A,B,C,D,E,F", GraphBFS.getBFS(na));
	}

}
