package if_else;
import java.util.*;
public class marks_class {

	public static void main(String[] args) 
	{
		int m1,m2,m3,total,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sub marks");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		
		total = m1+m2+m3;
		percentage = total/3;
		
		System.out.println("Total = "+total);
		System.out.println("percentage = "+percentage);
		
		if(percentage<=100 && percentage>=70)
		{
			System.out.println("dist...!");
		}
		else if (percentage<=70 && percentage>=60)
		{
			System.out.println("1st class...!");
		}
		else if(percentage<=60 && percentage>=55)
		{
			System.out.println("heigher 2nd class...!");
		}
		else if(percentage<=55 && percentage>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail...!");
		}
	}
}
