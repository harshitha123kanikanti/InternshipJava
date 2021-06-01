package com.foxmula.assignment2;
import java.util.*;
public class SetContainsElement {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter element to search in the set");
	  String str=sc.nextLine();
	  Set<String> check=new HashSet<>();
	  check.add("One");
	  check.add("Two");
	  check.add("Three");
	  if(check.contains(str)) {
		  System.out.println(str+" is present in the List");
	  }
	  else {
		  System.out.println(str+" is not present in the List");

	  }
  }
}
