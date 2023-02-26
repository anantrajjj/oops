//program to count #of vowels, consonants, digits, special symbols and white spaces
import java.util.*;
class Sr1
	{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	String s;
	System.out.println("Enter a String");
	s=sc.nextLine();// To read a @sentence1
	int i,v=0,con=0,space=0,sp=0,d=0;
	char c;
	boolean cv,lv;
	for(i=0;i<s.length();i++)
		{
		c=s.charAt(i);
		if((c>=65&&c<=90)||(c>=97&&c<=122))
			{
				cv=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
				lv=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
				if(cv||lv)
				v++;
				else
				con++;
			}
		else if(c>=48&&c<=57)
			d++;
		else if(c==32)//32 is ASCII Value of space
			space++;
		else
			sp++;
			
		}	
	System.out.println("Total number of vowels in string, \""+s+"\", is "+v);
	System.out.println("Total number of consonants in string, \""+s+"\", is "+con);
	System.out.println("Total number of digits in string, \""+s+"\", is "+d);
	System.out.println("Total number of spaces in string, \""+s+"\", is "+space);
	System.out.println("Total number of special symbols in string, \""+s+"\", is "+sp);
	}
}