package collectionAssignment;

import java.util.Set;
import java.util.TreeSet;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> product=new TreeSet<>();
		product.add("soap");
		product.add("paste");
		product.add("brush");
		product.add("laptop");
		product.add("phone");
		product.add("stick");
		
		product.add("brush");//duplicate value
		System.out.println(product);
				

	}

}
