package lambda;

import java.io.*;
import java.util.*;
import java.util.function.UnaryOperator;

class lower implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toLowerCase();
   }
}
public class question6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;

		
		ArrayList<String> arrlist
			= new ArrayList<String>(n);

		arrlist.add("Naruto");
       	arrlist.add("Sasuke");
        arrlist.add("kakashi");
     	arrlist.add("Asuma");
        arrlist.add("Baruto");
      	
      	System.out.println(arrlist);
  		arrlist.replaceAll(new lower());
		
       
		for (int i = 0; i < arrlist.size(); i++)
			System.out.print(arrlist.get(i) + " ");
	}
	
}
