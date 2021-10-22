package lambda;

import java.util.Collection;
import java.util.LinkedList;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> list = new LinkedList<>();
		list.add("naruto");
		list.add("sasuke");
		list.add("kakashi");
		

        list.removeIf( item -> item.length()%2!= 0 );
        
        System.out.println(list);

	}

}
