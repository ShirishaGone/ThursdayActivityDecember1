package Divide;
import java.util.Scanner;

public class Divide {
	public static int Division(int a,int b)
	{
		int c=0;
		try
		{
			 c=a/b;
			 System.out.println(c);			 		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{			
		}
		return c;		
	}	
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int y=sc.nextInt();
		
		int z=Division(x,y);
		System.out.println(z);
	}

}
 