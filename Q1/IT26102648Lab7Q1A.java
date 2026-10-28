import java.util.Scanner;

public class IT26102648Lab7Q1A{
	public static void main(String[]args){
		int sub1,sub2,sub3,sub4;
		double avg;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects:");
		System.out.print("Enter Subject Mark 1: ");
		sub1 = input.nextInt();
		
		System.out.print("Enter Subject Mark 2: ");
		sub2 = input.nextInt();
		
		System.out.print("Enter Subject Mark 3: ");
		sub3 = input.nextInt();
		
		System.out.print("Enter Subject Mark 4: ");
		sub4 = input.nextInt();

		if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100||sub4<0||sub4>100){
			System.out.println("Error: marks should be greater than 0 and less than 100");
			return;
		}

		avg = (sub1+sub2+sub3+sub4)/4;
		
		System.out.println();
		System.out.println("Average is : " + avg);
		
		grade = (avg >= 75)? "Distinction" : (avg >= 50)? "Credit" : "Fail";
		
		System.out.print("Overall Grade is : " + grade);
	}
}