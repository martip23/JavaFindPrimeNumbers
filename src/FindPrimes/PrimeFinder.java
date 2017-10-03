package FindPrimes;

import java.util.ArrayList;

/**
 * Class to hold the primeFinder function.
 * @author Patrick Martinez
 *
 */
public class PrimeFinder {
	
	/**
	 * Function to return a list of primes up to the requested upper limit, n.
	 * Uses sieve of Erastosthenes.
	 * @param n The upper limit of the numbers for which to find primes.
	 * @return The list of all primes less than n.
	 */
	public static ArrayList<Integer> primeCalculator(int n) {
		
		// Creating array of integers.
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 2; i<=n; i++) {
			numList.add(i);
		}
		
		return numList;
	}

}
