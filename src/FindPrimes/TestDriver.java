package FindPrimes;

import java.util.Scanner; // For INPUT operations.

/**
 * Program to test the class PrimeFinder
 * @author Patrick Martinez
 *
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
		
		System.out.println(PrimeFinder.primeCalculator(input));
	}

}
