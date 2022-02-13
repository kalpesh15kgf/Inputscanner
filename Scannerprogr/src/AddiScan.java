import java.util.Scanner;

public class AddiScan {

	public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter First Number :- ");
		  int input1 = scanner.nextInt();
		  System.out.print("Enter Second Number :- ");
		  int input2 = scanner.nextInt();

		  
		  int sum = input1 + input2;

		  System.out.println("Sum of two numbers (" + input1 + " + " + input2 + ") = " + sum);

		 
	}

}
