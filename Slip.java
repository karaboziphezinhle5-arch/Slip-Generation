import java.util.Scanner;

public class Slip{
	public static void main(String[] arg){
		
		//Instantiation of Scanner
		Scanner target = new Scanner(System.in);
		
		//Declaring variables
		String sName, sA, sB, sC,sCashier;
		int iA, iB, iC, iCost;
		final double VAT = 0.15;
		final double DISC_AMOUNT = 0.25;
		double rCost, rDiscountAmount, rItemPrice, finalamount;
		
		//Input
		System.out.print("\nCustomer name: ");
		sName =  target.nextLine();
		System.out.print("\nCashiers name: ");
		sCashier = target.nextLine();
		System.out.println("\nItems bought: ");
		sA = target.nextLine();
		sB = target.nextLine();
		sC = target.nextLine();
		System.out.println("\n");
		System.out.println("\nPrice of items: ");
		iA = target.nextInt();
		iB = target.nextInt();
		iC = target.nextInt();
		rItemPrice = iA + iB + iC;
		rDiscountAmount = rItemPrice * DISC_AMOUNT; 
		rCost = rDiscountAmount * VAT;
		finalamount = rDiscountAmount + rCost;
		
		
		//Output
		System.out.println("============Customer Reciept===========");
		System.out.print("Name of Cashier: " + sName);
		System.out.print("\nWhat is the name of the cashier: " + sCashier);
		System.out.println("\nWhat items where bought?: ");
		System.out.print("1." + sA +"\n2." + sB + "\n3." + sC);
		System.out.println("\nCost of items?: R" + rItemPrice );
		System.out.println("VAT Amount: " + rCost);
		System.out.println("\n");
		System.out.println("Final Amount: " + finalamount);
		System.out.println("======================================= ");
		
	}
}
		
		
		
		
		
		
		
		
		
		