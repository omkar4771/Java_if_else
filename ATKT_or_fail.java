package if_else;
import java.util.Scanner;
public class ATKT_or_fail 
{

	public static void main(String[] args)
	{	int m1,m2,m3,total;
		double per;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Total= "+total);
		System.out.println("Percentage= "+per);
		if(m1>=40 && m2>=40 && m3>=40)
		{
		      if(per>=70 && per<=100)
				{
				System.out.println("Distinction");
				}
				else if(per>=60 && per<70)  
				{
					System.out.println(" First");
				}
				else if(per>=55 && per<60)  
				{
					System.out.println(" Higher");
				}
				else if(per>=50 && per<55)  
				{
					System.out.println(" Second");
				}
				else if(per>=40 && per<50)  
				{
					System.out.println(" Pass");
				}                       
		}
		else if(m1<40 && m2<40 && m3<40)
		{
			System.out.println(" Fail");
		}
		else
		{
			System.out.println(" ATKT fail");
		}

		
		
	}

}
