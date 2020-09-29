/*
 * File: RandomCircles.java
 * -----------------------------------
 * Creates 10 circles at random position with random colors and sizes.
 * Made the size of the circles a bit larger taking into account the resolution of the screen. 
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
import java.awt.*;


public class RandomCircles extends GraphicsProgram{

	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;
	
	public void run() {
		
		double MAX_POSITION = APPLICATION_WIDTH;
		double MAX_SIZE = 150.0;
		double MIN_SIZE = 25.0;
		int MAX_CIRCLES = 10;
	
		for(int i = 0; i < MAX_CIRCLES; i++) {	
		drawRandomCircle(MAX_POSITION, MAX_SIZE, MIN_SIZE);
		}
	}
	
	/*
	 * drawRandomCircle draws a circle with random coordinates on the X and Y position.
	 * Selects a random color 
	 * Selects a random size for the circle. 
	 */
	private void drawRandomCircle(double maxPosition, double minSize, double maxSize) {
		
		Color rgenColor = randomColor();
		double rgenPositionX = randomPosition(maxPosition);
		double rgenPositionY = randomPosition(maxPosition);
		double rgenSize = randomSize(minSize, maxSize);	

		/*
		 * The two if under the comment are implemented to eliminate the partial out of bounds circles. 
		 */
		
		if (rgenPositionX + rgenSize > maxPosition) {
			rgenPositionX = rgenPositionX - rgenSize;
		} 
		if (rgenPositionY + rgenSize > maxPosition) {
			rgenPositionY = rgenPositionY - rgenSize; 
		}
		GOval circle = new GOval(rgenPositionX, rgenPositionY, rgenSize, rgenSize);
		circle.setColor(rgenColor);
		circle.setFillColor(rgenColor);
		circle.setFilled(true);
		add(circle);
	}
	
	/*
	 * randomColor creates a random color.
	 */
	private Color randomColor() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		Color rgenColor = rgen.nextColor();
		return rgenColor;
	}
	
	/*
	 * randomPosition creates a random position between the origin and maximum size of the canvas. 
	 */
	private double randomPosition(double maxPosition) {
		 RandomGenerator rgen = RandomGenerator.getInstance();
		 double rgenPosition = rgen.nextDouble(0.0, maxPosition);
		 return rgenPosition;
	}
	
	/*
	 * randomSize creates a random number between the MIN and MAX given.
	 */
	private double randomSize(double minSize, double maxSize) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		double rgenSize = rgen.nextDouble(minSize, maxSize);
		return rgenSize;
	}
	
}
