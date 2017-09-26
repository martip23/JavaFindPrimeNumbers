/**
 * 
 */
package FindPrimes;

/**
 * @author Patrick Martinez
 * A class to handle text files for input or output of integers.
 */
public class InputHandler {
	
	/**
	 * Constructor that takes fileName to parse/process data.
	 * If file not found, will ask for a filename correction 3 times before
	 * giving up.
	 * @param fileName path to file for input processing.
	 */
	public InputHandler (String fileName) {
		try {
			System.out.println("InputHandler constructor called!");
		}
		catch (Exception ex){
			System.out.println("Exception handled!");
		}
		
	}
	
	/**
	 * Returns the number found in the first line of input file.
	 * If there are letters, this will parse them out.
	 * @return integer in current line.
	 */
	private int parseNum () {
		System.out.println("Calling getNum method!");
		return 0;
	}
}
