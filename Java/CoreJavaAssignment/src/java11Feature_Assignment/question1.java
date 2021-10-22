package java11Feature_Assignment;

interface calculate{
	int calculate(int p,int t,int r);
}
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate calculate =(p,t,r)->{
			return p*t*r/100;
		};
		System.out.println("Simple Interest : "+calculate.calculate(2000,6,3));

	}

}
