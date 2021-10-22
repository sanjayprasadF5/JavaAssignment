
package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.TYPE_USE)

@interface test{}

public class question1 {
	public static void main(String[] args) {

		
		@test String string = "hii";
		System.out.println(string);
		testcase();
	    
	  
	}
	  @test
	static
	int testcase(){
			System.out.println("hello");
			return 0;
			
		}
	
	
		
	
}


