package lambda;

interface calculate{
	int calculate(int n1,int n2);
}
public class question1 {
	public static void main(String[] args) {
		calculate calculate =(n1,n2)->{
			return n1+n2;
		};
		calculate calculate1 =(n1,n2)->{
			return n1-n2;
		};
		calculate calculate2 =(n1,n2)->{
			return n1*n2;
		};
		calculate calculate3=(n1,n2)->{
			if(n2==0) return 0;
			return n1/n2;
		};
		System.out.println("The addition of two numbers : "+calculate.calculate(2, 3));
		System.out.println("The subtraction of two numbers : "+calculate1.calculate(2, 3));
		System.out.println("The multiplication of two numbers : "+calculate2.calculate(2, 3));
		System.out.println("The division of two numbers : "+calculate3.calculate(6, 0));
	}

}
