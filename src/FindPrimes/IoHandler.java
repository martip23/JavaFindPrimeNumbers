/**
 * 
 */
package FindPrimes;

/**
 * @author Patrick Martinez
 * A class to handle text files for input or output of integers in 
 * a findPrimes assignment.
 */
public class IoHandler {
	
	/**
	 * Constructor that takes fileName to parse/process data.
	 * If file not found, will ask for a filename correction 3 times before
	 * giving up.
	 * @param fileName path to file for input processing.
	 */
	public IoHandler (String fileName) {
		try {
			System.out.println("IoHandler constructor called!");
			
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
	
	/**
	 * Writes data to a text file in the same folder. Creates file
	 * if it does not exist yet.
	 * @return Returns true if successful, false if not.
	 */
	public boolean writeToFile() {
		System.out.println("Writing to file");
		return false;
	}
}