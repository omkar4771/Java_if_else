package if_else;
import java.util.*;
public class range_between 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(b>a&&b<c)
		{
			System.out.println(b+" is between "+a+" and "+c);
		}
		else
		{		
             System.out.println(b+" is not between "+a+" and "+c);
    	}
	}
}
