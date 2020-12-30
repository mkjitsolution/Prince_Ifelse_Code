
class LogicalDemo
{
	public static void main(String args[])
	{
		int x = 10;
		
		// means allying true or false conditions
		
		boolean b1 = (x != 20); // !=> Not (reverse), != not equals 
		 // not equals => gives true if both operands are not same
		
		System.out.print(" b1 "+b1);
		
		
		////
		
		// 2. compare both operands
		int d = 1000;
		boolean b2 = !(x == d);
		System.out.print(" b2 "+b2);
		
		
		// 3. greater than <= 
		//4. less than >=
		
		// -----------  Sugar test 100-140
		boolean b3 = (x == 100)&&(x == 140);  // && operator used to check both sides 
		System.out.print(" Sugar is in Safe Range "+x);
		boolean b4 = (x == 100)||(x == 140);  // || operator used to check any one of the sides 
		System.out.print(" Sugar is in Safe Range "+x);
		
	}//end main

}//end class











