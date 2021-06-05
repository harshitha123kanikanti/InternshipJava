package com.foxmula.assignment3;
import java.util.*;
public class ArrayFreqSort {
    static HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
	public static void sortByValue()
	{
	    List<Map.Entry<Integer, Integer> > list =new ArrayList<Map.Entry<Integer, Integer> >(hm.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        for (Map.Entry<Integer, Integer> aa : list) {
        	System.out.println(aa.getKey()+" occurs "+aa.getValue()+" times");
        }
     }
	public static void findOccurence(ArrayList<Integer> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(hm.containsKey(a.get(i)))
			{
				int count=(Integer)(hm.get(a.get(i)))+1;
				hm.replace(a.get(i),count);
			}
			else
				hm.put(a.get(i),1);	
		}
	}
	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);  
		System.out.println("Enter the number of elements: ");
		int ele= scanner.nextInt();  
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("Enter the elements of array");
		for(int i=0;i<ele;i++)
		{
			arr.add(scanner.nextInt());
		}
		findOccurence(arr);
		sortByValue();
		scanner.close();
	}
}