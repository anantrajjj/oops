import java.io.*;
  
class Ar1 {
    public static void main (String[] args) 
	{
      //DT[] varname={,,,};   
      int[] age = {18, 19, 17, 20, 18};
	  System.out.println("Fourth Element: " + age[3]);
	  int sum=0;
	  for(int i = 0; i < age.length; i++) 
	  {
	  //if(i%2==0)
	  if(age[i]%2==0)
		  sum=sum+age[i];
	  }
      System.out.println("Even position element sum"+sum);
    }
}