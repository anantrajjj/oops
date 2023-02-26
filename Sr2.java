//program to count number of words
import java.util.*;
class Sr2
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	String s;
	System.out.println("Enter a String");
	s=sc.nextLine();// to read a sentence
	int i,w=0;
		for(i=0;i<s.length();i++)
		{
		if(s.charAt(i)==' ')
		w++;
		}
	w++;// to count last word
	System.out.println("Total number of words in string, \""+s+"\", is "+w);
	}
}