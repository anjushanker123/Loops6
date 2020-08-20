//To print a table of powers of 2 using for loop
import java.util.Scanner;

public class PowerofTwo {

	/**
	 * Function to print the table of 2 ^ n times
	 * pow the value for no of time the table of two is printed
	 */
	static void printTable(int pow) {
		int res = 1;
		for (int i=1; i<=pow; i++) {
			res = res * 2; // 2 is the base
			System.out.println(res);
		}
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to find the power of 2 less than 32 ");
		int pow = sc.nextInt();
		while ( pow > 31 ) {
		System.out.println("Invalid input, enter value less than 32 ");
		pow=sc.nextInt();

		}

		printTable(pow);
		sc.close();
	}
}
