package com.foxmula.assignment2;
import java.util.*;
public class ArrayListPair {
	ArrayList<Integer> list = new ArrayList<Integer>();
	 void push(int data) {
		 list.add(data);
	 }	 
	 void display() {
		 for (Integer i : list) {
			 System.out.print(" Elements in list "+i+"\n");
		 }
	 }	 
	 void findpair(int k) {
		 for(int i=0; i<list.size()-1; i++) {
			 for(int j=i+1; j<list.size(); j++) {
				 if (list.get(i)+list.get(j) == k) {
					 System.out.println("Required pair is: "+"("+list.get(i)+","+list.get(j)+")");
				 }
			 }
		 }
	 
	 }	 
	 public static void main(String args[]) {
		 ArrayListPair ob = new ArrayListPair();
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("1 to push");
			 System.out.println("2 to display");
			 System.out.println("3 to find pair");
			 System.out.println("4 to exit");
			 int op, data;
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("All elements are");
			 		ob.display();
			 		break;
			 case 3: System.out.println("Enter value for sum");
			 		int k = sc.nextInt();
			 		ob.findpair(k);
			 		break;
			 case 4:
				 	break;
			 default: System.out.println("Please select from specified choices"); 
			 }
			 if (op == 4) break;
		 }
	 }

}