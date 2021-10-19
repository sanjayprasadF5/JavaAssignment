package exceptionhandling;

import java.util.*;

public class Question1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		try
		{
		    int res=n/n1;
		    System.out.println(res);
		}
		catch(ArithmeticException e)
		{
		    System.out.println(e);
		}
	}
}