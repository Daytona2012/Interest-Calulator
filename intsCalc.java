import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class intsCalc {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interst Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			//Get Loan Amount from user
			System.out.print("Enter Loan Amount: ");
			double loanAmt = sc.nextDouble();
			
			//Get Interest Rate from user
			System.out.print("Enter Interest rate: ");
			double intRate = sc.nextDouble();
			
			//Initialize BigDecimal Object 
			BigDecimal decimalLoanAmt = new BigDecimal(Double.toString(loanAmt));
			decimalLoanAmt = decimalLoanAmt.setScale(1, RoundingMode.HALF_UP);
			BigDecimal decimalIntRate = new BigDecimal(Double.toString(intRate));
			decimalIntRate = decimalIntRate.setScale(1, RoundingMode.HALF_UP);
			
			//Calculate Interest
			BigDecimal Interest = decimalIntRate.multiply(decimalLoanAmt);
			
			System.out.println("Interest: $" + Interest);
			
			System.out.print("Continue (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		
		
		

	}

}
