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
		
		else {
			String filename = args[0];
			
			try {
				FileReader filereader = new FileReader(filename);
				
			}
			catch() {
				
			}
		}
		
		boolean[] primeList = PrimeFinder.primeCalculator(input);
		
		System.out.print("Primes: ");
		for (int i = 0; i < primeList.length; i++)
			if (primeList[i])
				System.out.print(i + " ");		
	}

}
