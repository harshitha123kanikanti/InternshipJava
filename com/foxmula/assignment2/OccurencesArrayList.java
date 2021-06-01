package com.foxmula.assignment2;
import java.util.*;
public class OccurencesArrayList {
	ArrayList<Integer> checkList = new ArrayList<Integer>();
	 void push(int data) {
		 checkList.add(data);
	 }
	 
	 void display() {
		 HashSet<Integer> freq = new HashSet<Integer>();
		 for (Integer i: freq) {
			 System.out.println(i+" has occured "+Collections.frequency(freq, i)+" times");
		 }
	 }	 
	 public static void main(String args[]) {
		 OccurencesArrayList ob = new OccurencesArrayList();
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("1 to push");
			 System.out.println("2 to Display occurences");
			 System.out.println("3 to exit");
			 int op, data;
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter  data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Occurence");
			 		ob.display();
			 		break;
			 case 3:break;
			 default: System.out.println("Select from mentioned choices");
			 }
			 if (op==3) {
				 break;
			 }
		 }
	 }

}