package collectionAssignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Contact{
	String name;
	String email;
	Enum gender;
	public Contact(String name,String email,Enum gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Enum getGender() {
		return gender;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGender(Enum gender)
	{
		this.gender=gender;
	}
	 public String toString()
	    {
	    	return "(" + name + ", " + email + " , " + gender + ")";
	    }
	
	
}
enum gender{
	male,female;
}
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		TreeMap<Long,Contact> list=new TreeMap<>(Collections.reverseOrder());
		gender g1=gender.male;
		gender g2=gender.female;
		list.put((long) 1983838484,new Contact("sasuke","sasuke@gmail.com",g1));
		list.put((long) 1453838444,new Contact("naruto","naruto@gmail.com",g2));
		list.put((long) 1353838444,new Contact("kakashi","kakashi@gmail.com",g1));
		
           
		
		Set<Long> keys = list.keySet();
        
        
        //using for loop
        System.out.println("Printing all keys of TreeMap");
        for(Long key : keys){
            System.out.println( key );
        }
        System.out.println("Printing all values of TreeMap");
        for(Long i1:list.keySet())
        {
        	System.out.println(list.get(i1));
        }
        System.out.println("Printing all pairs");
        System.out.println(list);

	}

}
