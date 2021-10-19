package stringAssignment;
public class StringBuffer2
{
	public static void main(String[] args) 
	{
		StringBuffer sfb1 = new StringBuffer("StringBuffer ");
		System.out.println(sfb1);
		sfb1.insert(6,true);
		System.out.println(sfb1);
	}
}