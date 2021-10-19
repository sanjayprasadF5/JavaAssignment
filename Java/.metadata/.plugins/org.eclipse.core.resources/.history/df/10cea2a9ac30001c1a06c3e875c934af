package stringAssignment;
import java.util.*;
public class StringOperations
{
	public static void main(String[] args) 
	{
	   String s="Java String Pool";
	   System.out.println(s.toLowerCase());
	   System.out.println(s.toUpperCase());
	   for(int i=0;i<s.length();i++)
	   {
	       if(s.charAt(i)=='a')
	       {
	           s= s.substring(0, i) + '$'
              + s.substring(i+ 1);
	       }
	   }
	   System.out.println(s);
	   String s1="";
	   int j=0;
	   String[] aa=new String[3];
	   for(int i=0;i<=s.length();i++)
	   {
	       if( i==s.length())
	       {
	           //System.out.println(s1);
	           aa[j]=s1;
	           s1="";
	           j++;
	       }
	       else if(s.charAt(i)!=' ')
	       {
	           s1=s1+Character.toString(s.charAt(i));
	       }
	       else if(s.charAt(i)==' ')
	       {
	          // System.out.println(s1);
	           aa[j]=s1;
	           s1="";
	           j++;
	       }
	   }
	   for(int i=0;i<aa.length;i++)
	   {
	       if(aa[i].equals("Pool"))
	       {
	           System.out.println("Yes");
	       }
	   }
	   
	}
}