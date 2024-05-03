package if_else;

import java.util.Scanner;

public class vaccine_eligibal_for_interviewe {

	public static void main(String[] args)
	{
		int vaccine;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your vaccine count");
		vaccine=sc.nextInt();
		
		if(vaccine>=2)
		{
			System.out.println("You are eligibal for interview");
		}
		else
		{
			System.out.println("you are not eligibal for interview");
		}
	}

}
