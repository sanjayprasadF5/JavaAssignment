package exceptionhandling;

import java.util.*;
public class Question2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		try
		{
		    if(n1==0)
		    {
		        throw new UnsupportedOperationException("UnsupportedOperationException");
		    }
		    int res=n/n1;
		    System.out.println(res);
		}
		catch(UnsupportedOperationException e)
		{
		    System.out.println(e);
		}
	}
}