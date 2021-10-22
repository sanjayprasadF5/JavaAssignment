package java11Feature_Assignment;


import java.util.ArrayList;
import java.util.List;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<>();
        a.add("A");
        a.add("quick");
        a.add("brown");
        a.add("fox");
        a.add("jumps");
        a.add("over");
        a.add("the");
        a.add("lazy");
        a.add("dog");
  
        Object[] objects = a.toArray();
  
       
        for (Object obj : objects)
            System.out.print(obj + " ");
	}

}
