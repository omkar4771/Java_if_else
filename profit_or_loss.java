package if_else;
import java.util.*;
public class profit_or_loss 
{

	public static void main(String[] args)
	{
		double sp,cp,amt,disc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price and selling price");
		cp=sc.nextDouble();
		sp=sc.nextDouble();
		
		if(cp>sp)
		{	
			amt=cp-sp;
			disc=(amt/cp)*100;
			System.out.println("loss = "+amt+" percentage = "+disc);
		}
		else if(sp>cp)
		{
			amt=sp-cp;
			disc=(amt/cp)*100;
			System.out.println("profit = "+amt+" percentage = "+disc);
		}
		else
		{
			System.out.println("no profit no loss");
				
		}



	}

}
