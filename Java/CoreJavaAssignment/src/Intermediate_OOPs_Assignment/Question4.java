package Intermediate_OOPs_Assignment;

abstract class Question{
    public Question( ) {
        // default constructor
    }
   
    public void isHard(){
        System.out.println("it is hard...");
    }
    public void isEasy() {
        System.out.println("it is easy...");
    }
  
    
    public abstract void skip();
}

class levelOfDifficulty extends Question{
    public levelOfDifficulty( ) {
    }
   
    @Override
    public void skip() {
        System.out.println("question is skipped...");
    }
}
public class Question4{
    public static void main(String[] args) {
        Question an = new levelOfDifficulty( );
       
        an.isEasy();
        an.isHard();
      
        an.skip();

        
    }
}