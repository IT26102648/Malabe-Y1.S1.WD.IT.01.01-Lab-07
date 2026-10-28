import java.util.Scanner;

public class IT26102648Lab7Q3{
	public static void main(String[]args){
		double amount,discount,totalWithDiscount;
		char method;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1 ; i <= 5 ; i++ ){
			
			System.out.println("Customer " + i );
			System.out.print("Enter total bill amount: ");
			
			amount = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other):");
			method = input.next().charAt(0);
			
			switch (method){
				case ('C'):
						discount = amount * 0.05;
						totalWithDiscount = amount - discount;
						System.out.println("Discount is : " + discount );
						break;
				
				case ('O'):
						System.out.println("No discount applicable");
						totalWithDiscount = amount;
						break;
						
				default:
						System.out.println("Payment Mode is Not Valid");
						System.out.print("\n");
						continue;
						
			}
			System.out.println("Amount to be paid: " + totalWithDiscount);	
			System.out.print("\n");
		}	
		
	}
}