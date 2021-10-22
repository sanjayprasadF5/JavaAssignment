package java11Feature_Assignment;

import java.util.*; 
  
interface myInt { 
    
    int add(int a, int b); 
} 
class question2 { 
    public static void main(String[] args) 
    { 
    	/*var<Integer> a = new ArrayList<Integer>(); 
        
        
      a.add(10); 
      a.add(20); 
      a.add(30); 
      
    
      System.out.println(a);*/
      System.out.println("1.var cannot be used with generic type");
          
        /*var obj = (a, b) -> (a + b); 
        
  
          // calling add method 
        System.out.println(obj.add(2, 3));*/
      System.out.println("2.var cannot be used with Lambda Expression");
      /*
       * var x = 50; 
    public static void main(String[] args) 
    { 
        System.out.println(x); 
    }
       */
      System.out.println("3.var cannot be used in global variable declaration");
      /*
       * var variable; 
          
          
        var variable = null; 
       */
      System.out.println("4.var cannot be used without explicit initialization");
      
      
    } 
}