package com.datastructure.weightedgraph.path;
//端点距离类：distance:表示从起始到这个顶点的距离
//parentVert：当前节点的父节点
public class DistPar {
	   public int distance;   // distance from start to this vertex
	   public int parentVert; // current parent of this vertex
	// -------------------------------------------------------------
	   public DistPar(int pv, int d)  // constructor
	      {
	      distance = d;
	      parentVert = pv;
	      }
	// -------------------------------------------------------------
	   }  // end class DistPar
///////////////////////////////////////////////////////////////