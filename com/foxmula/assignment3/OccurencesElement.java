package com.foxmula.assignment3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class OccurencesElement {
        public static void main(String[] args) {
        	 Scanner scanner = new Scanner(System.in);
             System.out.println("Enter the size of an array");
             int n = scanner.nextInt();
             int arr[] = new int[n];
             System.out.println("Enter numbers in an array");
             HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
             for(int i=0;i<n;i++){
                 arr[i] = scanner.nextInt();
                 if(hashmap.containsKey(arr[i])) {
                	 hashmap.put(arr[i], hashmap.get(arr[i])+1);
                 }
                 else {
                	 hashmap.put(arr[i], 1);
                 }
             }
             System.out.println("Key"+ " " + "Frequency");
        for(Map.Entry<Integer,Integer> x : hashmap.entrySet())
        {
            System.out.println(x.getKey() + "     " + x.getValue());
        }
        scanner.close();
    }
    
   
}