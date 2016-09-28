package com.searattled.exercises;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class GraphDFSTest {

	@Test
	public void testGetDFS_v1() {
		// Create a set of Nodes
		GraphDFS.Node na = new GraphDFS.Node("A", null);
		GraphDFS.Node nb = new GraphDFS.Node("B", null);
		GraphDFS.Node nc = new GraphDFS.Node("C", null);
		GraphDFS.Node nd = new GraphDFS.Node("D", null);
		GraphDFS.Node ne = new GraphDFS.Node("E", null);
		GraphDFS.Node nf = new GraphDFS.Node("F", null);

		na.setVertices(Arrays.asList(nb, nc));
		nb.setVertices(Arrays.asList(nd));
		nc.setVertices(Arrays.asList(nd));
		nd.setVertices(Arrays.asList(ne, nf));
		ne.setVertices(Arrays.asList(nd));
		nf.setVertices(null);

		assertEquals("ABDEFC", GraphDFS.getDFS_v1(na));
	}
	
	
	@Test
	public void testGetDFS_v2() {
		// Create a set of Nodes
		GraphDFS.Node na = new GraphDFS.Node("A", null);
		GraphDFS.Node nb = new GraphDFS.Node("B", null);
		GraphDFS.Node nc = new GraphDFS.Node("C", null);
		GraphDFS.Node nd = new GraphDFS.Node("D", null);
		GraphDFS.Node ne = new GraphDFS.Node("E", null);
		GraphDFS.Node nf = new GraphDFS.Node("F", null);

		na.setVertices(Arrays.asList(nb, nc));
		nb.setVertices(Arrays.asList(nd));
		nc.setVertices(Arrays.asList(nd));
		nd.setVertices(Arrays.asList(ne, nf));
		ne.setVertices(Arrays.asList(nd));
		nf.setVertices(null);

		assertEquals("ACDFEB", GraphDFS.getDFS_v2(na));
	}

}
