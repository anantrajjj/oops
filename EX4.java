//Check the given no is palindrom or not
import java.util.Scanner;
class EX4
{  
 public static void main(String args[])
 { 
  Scanner ob1=new Scanner(System.in);
  int n=ob1.nextInt(); //number checked for palindrome
  int r,sum=0,temp;    
  //int n=454;  
  
  temp=n;    
  while(n>0)
	  {    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
 }  
}  