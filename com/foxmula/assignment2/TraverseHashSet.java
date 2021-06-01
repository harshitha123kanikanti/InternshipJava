package com.foxmula.assignment2;
import java.util.*;
public class TraverseHashSet {
public static void main(String[] args) {
	Set<Integer> traverse=new HashSet<Integer>();
	traverse.add(1);
	traverse.add(2);
	traverse.add(3);
	traverse.add(4);
	traverse.add(5);
	for(Integer i: traverse) {
		System.out.println(i);
	}
	
}
}
