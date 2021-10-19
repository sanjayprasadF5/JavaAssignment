package stringAssignment;

public class StringBuffer1
{
	public static void main(String[] args) 
	{
		String s1="is a peer class of String ";
		String s2="that provides much of ";
		String s3="the functionality of Strings ";
		StringBuffer sfb1 = new StringBuffer("StringBuffer ");
		sfb1.append(s1);
		sfb1.append(s2);
		sfb1.append(s3);
		System.out.println(sfb1);
	}
}