/*
 * File: FibonacciSequence.java
 * ---------------------------------------
 * This program solves the Fibonacci sequence within a set maximum value. In this case 10000. 
 *  
 */

public class FibonacciSequence {

	public static void main(String[] args) {
	
	
			final	int FIRST_TERM = 0;
			final	int SECOND_TERM = 1; 
			final   int MAX_TERM_VALUE = 10000;
			
			System.out.println("This program lists the Fibonacci sequence: ");
			
			Fibonacci(FIRST_TERM, SECOND_TERM, MAX_TERM_VALUE);
		
	
	}


	/*
	 * The method accepts the parameters and 
	 * returns the fibonacci sequence within a given maximum value
	 * Local variable currentTerm will store the current value of the sum 
	 * and firstTerm will serve as the current value holder. 
	 */
	private static void Fibonacci(int firstTerm, int secondTerm, int maxTermValue) {
		
		int currentTerm = 0;
		
		while (currentTerm < maxTermValue) {
			if(currentTerm < maxTermValue) {
				System.out.println(currentTerm);
			}
			currentTerm = firstTerm + secondTerm;
			secondTerm = firstTerm;
			firstTerm = currentTerm; 
			
				
		}
	}
}


