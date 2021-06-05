  
package com.foxmula.assignment3;
import java.util.Scanner;

public class ExceptionPrimeOdd {
	static boolean isPrime(int num)
	{
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
				count++;
			if(count>=2)
				return false;
		}
		return true;
	}
	static boolean isOdd(int num)
	{
		if((num%2)!=0)
			return true;
		else
			return false;
	}
	static void validate(int num) throws InvalidNumber{  
	     if(isPrime(num) || isOdd(num))  
	      throw new InvalidNumber("Number is invalid.");  
	     else  
	      System.out.println("Valid Number");  
	   }  
	static void checkException(int num){
		try{  
			validate(num);  
			}catch(Exception m){
			System.out.println("Exception occured: "+m);
			}  
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		checkException(num);
		scan.close();

	}

}