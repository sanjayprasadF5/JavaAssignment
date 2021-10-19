package Intermediate_OOPs_Assignment;

class SingletonInheritanceCheck{
    public static SingletonInheritanceCheck sic = null;
    private SingletonInheritanceCheck(){
        System.out.println("Instance created");
    }
    public static SingletonInheritanceCheck getInstance(){
        if(sic ==  null){
            sic = new SingletonInheritanceCheck();
        }
        return sic;
    }
}

class createCheck extends SingletonInheritanceCheck{
   
}
public class Question1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck sIC = SingletonInheritanceCheck.getInstance();

        
        createCheck chk = new SingletonInheritanceCheck();
    }
}