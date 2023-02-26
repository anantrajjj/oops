import java.util.Scanner;
class Fn1
{ 
 public static void checkPal(int n)
  {
  int r,sum=0,temp;      
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
  
 public static void main(String args[])
  { 
  Scanner ob1=new Scanner(System.in);
  int a=ob1.nextInt(); //number checked for palindrome
  checkPal(a);   
  }  
}  