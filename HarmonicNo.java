
//Program to Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N

import java.util.Scanner;

public class HarmonicNo
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The Harmonic Series is : ");

		double h = 0.0;
		for(double i=1; i<=num; i++)
		{
			h = h + 1/i;  // gives as  1/1 + 1/2 + ...
		System.out.print(h + " ");

		}
		System.out.println("");
	        System.out.println("Output of Harmonic Series is "+h);
	}
}

