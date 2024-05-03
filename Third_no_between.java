package if_else;
import java.util.*;
public class Third_no_between 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(c>a&&c<b)
		{
			System.out.println(c+" is between "+a+" and "+b);
		}
		else
		{		
             System.out.println(c+" is not between "+a+" and "+b);
    	}
	}
}
