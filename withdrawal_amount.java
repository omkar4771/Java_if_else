package if_else;
import java.util.Scanner;
public class withdrawal_amount {

	public static void main(String[] args)
	{
		int amt,balance;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the withrawal amount");
		amt=sc.nextInt();
		
		if(amt<=5000)
		{
			balance=5000-amt;
			System.out.println("Your remaining balance is "+balance);
		}
		else
		{
			System.out.println( "insufficient balance...!");
		}
	}

}
