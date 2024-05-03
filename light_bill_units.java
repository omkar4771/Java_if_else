package if_else;
import java.util.*;
public class light_bill_units {

	public static void main(String[] args) 
	{
		int unit;
		double total,UC,EC,totals;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units of light bill = ");
		unit =sc.nextInt();
		
		if(unit<=100)
		{
			total=unit*3.36;
			System.out.println("Electricity bill = "+total+"Rs");
		}
		else if(unit>=101 && unit<=300)
		{	
			total=unit*7.34;
			System.out.println("Electricity bill = "+total+"Rs");	
		}
		else if(unit<=301 && unit>500)
		{
			total=unit*10.37;
			System.out.println("Electricity bill = "+total+"Rs");
		}
		else if(unit<=501 && unit>1000)
		{
			total=unit*11.86;
			System.out.println("Electricity bill = "+total+"Rs");
		}
		else
		{
			total=unit*11.86;
			System.out.println("Electricity bill = "+total+"Rs");
		}
	      UC=unit*1.38;
          EC=((102+total+UC)*0.16);
          totals=102+total+UC+EC;
         System.out.println("Unit Charge="+UC);
         System.out.println("tax="+EC);
         System.out.println("Total bill="+totals);
    
	}

}
