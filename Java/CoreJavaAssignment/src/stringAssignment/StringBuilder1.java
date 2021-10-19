package stringAssignment;

public class StringBuilder1
{
	public static void main(String[] args) 
	{
		String s1="is a peer class of String ";
		String s2="that provides much of ";
		String s3="the functionality of Strings ";
		StringBuilder sbu1 = new StringBuilder("StringBuffer ");
		sbu1.append(s1);
		sbu1.append(s2);
		sbu1.append(s3);
		System.out.println(sbu1);
	}
}