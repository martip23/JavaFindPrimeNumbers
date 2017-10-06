package FindPrimes;

import java.util.Scanner; // For INPUT operations.
import java.io.*;

/**
 * Program to test the class PrimeFinder
 * @author Patrick Martinez
 */
public class TestDriver {

	public static void main(String[] args) {
		
		// Default value
		final int DEFAULT_SIZE = 1000;

		int input = DEFAULT_SIZE;
		
		// IO Operations
	
		// No arguments
		if (args.length == 0 || args == null) {
			System.out.print("Enter the upper limit for the prime finder "
					+ "(Default " + DEFAULT_SIZE + "):");
			
			try {
				Scanner sc = new Scanner (System.in);
				input = sc.nextInt();
				sc.close();
			}
			catch(Exception ex) {
				System.out.println("Error on input block!");
				System.out.println("Setting input to default " + DEFAULT_SIZE
						+ "!");
			}
		}
		
		// Filename in arguments
		else {
			String filename = args[0];
			String line;
			
			try {
				File inputFile = new File(filename);
				Scanner sc = new Scanner(inputFile);
				input = sc.nextInt();
				System.out.println(args[0]);
				}
			catch(Exception ex) {
				
			}
		}
	primePrint(input);
		
	}
	
	public static void primePrint (int input) {
		
		boolean[] primeList = PrimeFinder.primeCalculator(input);
		
		System.out.print("Primes: ");
		for (int i = 2; i < primeList.length; i++)
			if (primeList[i])
				System.out.print(i + " ");			
	}

}
