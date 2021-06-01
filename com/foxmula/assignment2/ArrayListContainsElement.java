package com.foxmula.assignment2;
import java.util.*;
public class ArrayListContainsElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to check whether it is present in list");
		String str= sc.nextLine();
		ArrayList<String> check=new ArrayList<String>();
		check.add("One");
		check.add("Two");
		check.add("three");
	    if(check.contains(str)) {
	    	System.out.println(str+" is present in List");
	    }
	    else {
	    	System.out.println(str+" is not present in List");
	    }
	}

}
