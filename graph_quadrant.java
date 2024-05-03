package if_else;
import java.util.*;
public class graph_quadrant {

	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x & y co-ordinate");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0 && y>0)
		{
			System.out.println("1st quadrant");
		}
		else if(x<0 && y>0)
		{
			System.out.println("2nd quadrant");
		}
		else if(x<0 && y<0)
		{
			System.out.println("3rd quadrant");
		}
		else if(x>0 && y<0)
		{
			System.out.println("4th quadrant ");
		}
		else if(x>0 && y==0)
		{
			System.out.println("on X axis");
		}
		else if(y>0 && x==0)
		{
			System.out.println("on y axis");
		}
		else if(x==0 && y==0)
		{
			System.out.println("origine....");
		}
		else
		{
			System.out.println("Enter correct value....!");
		}
	}

}
