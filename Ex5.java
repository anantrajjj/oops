//series 1/1! + 2/2! + 3/3! + 4/4! +…….+ n/n!, 
//find out the sum of the series till nth term.
import java.util.Scanner;
class Ex5 
{
    public static void main(String[] args)
    {
		Scanner ob1=new Scanner(System.in);
		System.out.println("Enter the value of n  ");
        double n=ob1.nextDouble(); //double n = 5;
		double sum = 0, fact = 1; //multiple variable declaration
        for (int i = 1; i <= n; i++) 
		{
            fact = fact * i; /*fact variable store factorial of the i.*/
            sum = sum + (i / fact);
        }
        System.out.println("Sum: " + sum);
    }
}