package if_else;
import java.util.*;
public class trangle {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the the side of the trangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b))
		{
			System.out.println("Right angle trangle...");
		}
		else if((a==b) && (b==c))
		{
			System.out.println("Equilateral trangle");
		}
		else if((a==b) || (b==c) || (c==a))
		{
			System.out.println("Isosceles triangle");	
		}
		else if((a!=b && b!=c && c!=a))
		{
			System.out.println("Scalene trangle");
		}
		else
		{
			System.out.println("Enter correct input");
		}
	}

}
