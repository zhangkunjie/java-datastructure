package com.datastructure.weightedgraph.path;
//短点类
public class Vertex {
	public char label; // label (e.g. 'A')
	public boolean isInTree;
	// -------------------------------------------------------------
	public Vertex(char lab) // constructor
	{
		label = lab;
		isInTree = false;
	}
	// -------------------------------------------------------------
} // end class Vertex
// //////////////////////////////////////////////////////////////