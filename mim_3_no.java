package if_else;

import java.util.Scanner;

public class mim_3_no {

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number..");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<b&&a<c)
		{
			System.out.println(a+" is min...!");
		}
		else if(b<c&&b<a)
		{
			System.out.println(b+" is min...!");
		}
		else if (c<a&&c<b)
		{
			System.out.println(c+" is min...!");
		}
		else if(a==b && a<c)
		{
			System.out.println(a+"and"+b+"is min & equal");
		}
		else if (a==c && a<b)
		{
			System.out.println(a+"and"+c+"is min & equal");
		}
		else if(c==b&&c<a)
		{
			System.out.println(c+"and"+b+"is min & equal");
		}
		else
		{
			System.out.println("all are equal..!");
		}
	}

}
