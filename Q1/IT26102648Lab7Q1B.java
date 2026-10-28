import java.util.Scanner;

public class IT26102648Lab7Q1B{
	public static void main(String[]args){
		int sub1,sub2,sub3,sub4;
		double avg;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1 ; i <= 3 ; i++ ){
			System.out.println("Student " + i);
			
			System.out.print("Enter mark : ");
			sub1 = input.nextInt();
			sub2 = input.nextInt();
			sub3 = input.nextInt();
			sub4 = input.nextInt();
			
			if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100||sub4<0||sub4>100){
				System.out.println("Error: marks should be greater than 0 and less than 100");
				return;
			}
			
			avg = (sub1+sub2+sub3+sub4)/4;
			grade = (avg >= 75)? "Distinction" : (avg >= 50)? "Credit" : "Fail";
			
			System.out.println("Average is : " + avg);
			System.out.println("Overall Grade is : " + grade);	
			System.out.println();
		}
	}
}