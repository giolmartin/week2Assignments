/*
 * File: BeautifulFace.java
 * ----------------------------------
 * This class complies with all the requirements given on the assignment for week 2 SimpleJava. 
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class BeautifulFace extends GraphicsProgram {

	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;
	
	
	
	public void run() {
		
		int HEAD_WIDTH = 250;
		int HEAD_HEIGHT = 375;
		int EYE_RADIUS = 25;
		int MOUTH_WIDTH = 150;
		int MOUTH_HEIGHT = 50;
		
		drawFace(HEAD_WIDTH, HEAD_HEIGHT, EYE_RADIUS, MOUTH_WIDTH, MOUTH_HEIGHT);
	}
	
	/*
	 * drawFace calls drawHead(), drawRightEye(), drawLeftEye(), drawMouth() in that order. also the center(X,Y)
	 * variables are resolved on this method.
	 */
	private void drawFace(double headWidth, double headHeight, double eyeRadius
			,double mouthWidth, double mouthHeight) {
		
		double centerX = APPLICATION_WIDTH ;
		double centerY = APPLICATION_HEIGHT;
		
		/*
		 * This is not the center of the canvas, but the coordinates to center 
		 * all methods called in drawFace.
		 */
		
		centerX = centerX/2 - (headWidth/2);
		centerY = centerY/2 - (headHeight/2);
	
		drawHead(centerX, centerY, headWidth, headHeight);
		drawRightEye(centerX,centerY, eyeRadius, headWidth,headHeight );
		drawLeftEye(centerX,centerY, eyeRadius, headWidth,headHeight );
		drawMouth(centerX, centerY, mouthWidth, mouthHeight, headWidth, headHeight);
	}
	
	/*
	 * drawHead draws the head of the image. Fills with color
	 * GRAY and 
	 * BLACK outline.
	 */
	private void drawHead( double centerX, double centerY, double headWidth, double headHeight) {
		
		GRect head = new GRect(centerX, centerY, headWidth, headHeight);
		head.setFillColor(Color.GRAY);
		head.setFilled(true);
		add(head);
	}
	
	/*
	 * drawMouth draws the mouth and uses the centerMouth(X,Y) to draw it on the correct spot. 
	 * mouth is filled and outlined
	 * WHITE
	 */
	private void drawMouth(double centerX, double centerY, double mouthWidth, double mouthHeight
			, double headWidth, double headHeight) {
		
		double mouthCenterX = centerX + (headWidth * 0.25) -((headWidth - mouthWidth)*0.125);
		double mouthCenterY = centerY + (headHeight*0.75 - mouthHeight) ;
		
		GRect mouth = new GRect(mouthCenterX, mouthCenterY,mouthWidth, mouthHeight);
		mouth.setColor(Color.WHITE);
		mouth.setFillColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);		
	}

	/*
	 * drawEye creates an oval object that is printed as a circle.
	 */
	private GOval drawEye(double centerX, double centerY, double eyeRadius) {
		double eyeDiameter = eyeRadius*2;
		GOval eye = new GOval(centerX, centerY, eyeDiameter, eyeDiameter);
		return eye;
	}
	
	/*
	 * Uses the center(X,Y) and the head Height and Width to center the left eye
	 * 1/4 of the head on the x axis and 1/4 on the y axis
	 * YELLOW
	 * Calls drawEye() to create itself.
	 */
	private void drawLeftEye(double centerX, double centerY, double eyeRadius, 
			double headWidth, double headHeight) {
		
		double leftEyeX = centerX + (headWidth * 0.25) - eyeRadius;
		double leftEyeY = centerY + (headHeight* 0.25) - eyeRadius;
		
		GOval leftEye = new GOval(0,0,0,0);
		leftEye = drawEye(leftEyeX, leftEyeY, eyeRadius);
		leftEye.setColor(Color.YELLOW);
		leftEye.setFillColor(Color.YELLOW);
		leftEye.setFilled(true);
		add(leftEye);
		
	}
	
	/*
	 * Uses the center(X,Y) and the head Height and Width to center the right eye
	 * 3/4 of the head on the x axis and 1/4 on the y axis
	 * Fill and outline are 
	 * YELLOW
	 * Calls drawEye() to create itself.
	 */
	private void drawRightEye(double centerX, double centerY, double eyeRadius, 
			double headWidth, double headHeight) {
		
		double rightEyeX = centerX + (headWidth *0.75) -eyeRadius;
		double rightEyeY = centerY + (headHeight *0.25) -eyeRadius;
		
		GOval rightEye = new GOval(0,0,0,0);
		rightEye = drawEye(rightEyeX, rightEyeY, eyeRadius);	
		rightEye.setColor(Color.YELLOW);
		rightEye.setFillColor(Color.YELLOW);
		rightEye.setFilled(true);
		add(rightEye);
		
	}
	
	
	/*
	 * Class that was meant to divide the face 16 equal squares. will finish if time allows. 
	 */
	public void coordinates(double centerX, double centerY, double headWidth, double headHeight) {
		
		
	}
}
