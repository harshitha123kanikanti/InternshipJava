package com.foxmula.assignment3;
import java.util.*;
public class ExceptionPrimeOdd {
    public static void main(String a[])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number to check");
        Integer number= scanner.nextInt();
        scanner.close();
        try
        {
            if(number%2!=0) {
            	for(int i=3;i*i<number;i++)
                {
                    if(number%i!=0) {
                    	throw new CustomException("Number is invalid");
                    }
                }
                   }
            System.out.println("Number is not prime and odd");
        }
        catch(CustomException e)
        {
           System.out.println(e.getMessage()+"Custom Exception seen");
        }
  
}
}