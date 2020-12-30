
import java.util.Scanner;

public class DiagonesticLab
{
   public static void main(String args[])
   {
		Scanner sc = new Scanner(System.in);
	   
		System.out.print("\n --- Welcome In ABC Diagonestic Lab ----");
		System.out.print("\n -----------------------------------------");
		
		
		System.out.print("\n\n Please Enter Your Current Sugar Level ");
		
		int patientSugarLevel = sc.nextInt();
		
		boolean status = (patientSugarLevel>100) && (patientSugarLevel<140); // true : Normal Report , False -> Problematic Report
		
		String comment = "";
		
		if(status == true) // means reports are normal
		{
				comment = "Normal";
		}
		else
		{
			if(patientSugarLevel < 90)
			{
				comment = "Low ";
			}
			else if(patientSugarLevel > 180)
			{
				comment = "High";
			}
				
		}
		
		
		System.out.print(" !!! Sugar Status "+patientSugarLevel+" is "+comment);
		
		
		System.out.print(" \n\n ========= END Report ===============");
   
   }

}