package if_else;
import java.util.*;
public class voting_eligiblity {

	public static void main(String[] args) 
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		
		if(age<=18)
		{
			System.out.println("you are not eligibal for voting");
		}
		else if(age>=23)
		{
			System.out.println("you are not eligibal for voting");
		}
		else
		{
			System.out.println("you are eligibal for voting");
		}
	}

}
