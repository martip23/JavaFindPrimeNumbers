package FindPrimes;

import java.lang.Math;

/**
 * Class to hold the primeFinder function.
 * @author Patrick Martinez
 *
 */
public class PrimeFinder {
	
	/**
	 * Function to return a list of booleans where each true index is a prime,
	 * up to limit n.
	 * Uses sieve of Erastosthenes.
	 * @param n The upper limit of the numbers for which to find primes.
	 * @return A boolean list with each 
	 */
	public static boolean[] primeCalculator(int n) {
		
		// Creating array of integers.
		boolean[] boolList = new boolean[n+1];
		
		// 2 and odd numbers up to true
		boolList[2] = true;
		for (int i = 3; i < n; i += 2)
			boolList[i] = true;
		
		// Sieve magic
		for (int i = 3; i < Math.sqrt(n); i++) {
			if (boolList[i]) {
				for (int j = i*i, k = 1; j < n; j+=k*i, k++) {
						boolList[j] = false;
				}
			}
		}
		
		return boolList;
	}
	
	

}
