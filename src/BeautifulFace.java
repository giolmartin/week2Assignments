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
	
	double HEAD_WIDTH = 250;
	double HEAD_HEIGHT = 375;
	double EYE_RADIUS = 25;
	double MOUTH_WIDTH = 150;
	double MOUTH_HEIGHT = 50;
	
	/*
	 * This is not the center of the canvas, but the coordinates to center 
	 * all methods called in drawFace.
	 */
	double centerX = APPLICATION_WIDTH/2 - (this.HEAD_WIDTH/2);
	double centerY = APPLICATION_HEIGHT/2 - (this.HEAD_HEIGHT/2);
	
	public void run() {
		drawFace();
	}
	
	/*
	 * drawFace calls drawHead(), drawRightEye(), drawLeftEye(), drawMouth() in that order. also the center(X,Y)
	 * variables are resolved on this method.
	 */
	private void drawFace() {
		drawHead();
		drawRightEye();
		drawLeftEye();
		drawMouth();
	}
	
	/*
	 * drawHead draws the head of the image. Fills with color
	 * GRAY and 
	 * BLACK outline.
	 */
	private void drawHead( ) {	
		GRect head = new GRect(centerX, centerY, this.HEAD_WIDTH, this.HEAD_HEIGHT);
		head.setFillColor(Color.GRAY);
		head.setFilled(true);
		add(head);
	}
	
	/*
	 * drawMouth draws the mouth and uses the centerMouth(X,Y) to draw it on the correct spot. 
	 * mouth is filled and outlined
	 * WHITE
	 */
	private void drawMouth() {	
		double mouthCenterX = centerX + (this.HEAD_WIDTH * 0.25) -((this.HEAD_WIDTH - this.MOUTH_WIDTH)*0.125);
		double mouthCenterY = centerY + (this.HEAD_HEIGHT*0.75 - this.MOUTH_HEIGHT) ;
		
		GRect mouth = new GRect(mouthCenterX, mouthCenterY,this.MOUTH_WIDTH, this.MOUTH_HEIGHT);
		mouth.setColor(Color.WHITE);
		mouth.setFillColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);		
	}

	/*
	 * drawEye creates an oval object that is printed as a circle.
	 */
	private GOval drawEye(double eyeX, double eyeY ) {
		double eyeDiameter = this.EYE_RADIUS * 2;
		GOval eye = new GOval(eyeX, eyeY, eyeDiameter, eyeDiameter);
		return eye;
	}
	/*
	 * Uses the center(X,Y) and the head Height and Width to center the left eye
	 * 1/4 of the head on the x axis and 1/4 on the y axis
	 * YELLOW
	 * Calls drawEye() to create itself.
	 */
	private void drawLeftEye() {
		double leftEyeX = centerX + (this.HEAD_WIDTH * 0.25) - this.EYE_RADIUS;
		double leftEyeY = centerY + (this.HEAD_HEIGHT* 0.25) - this.EYE_RADIUS;
		
		GOval leftEye = new GOval(0,0,0,0);
		leftEye = drawEye(leftEyeX, leftEyeY);
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
	private void drawRightEye() {
		double rightEyeX = centerX + (this.HEAD_WIDTH *0.75) - this.EYE_RADIUS;
		double rightEyeY = centerY + (this.HEAD_HEIGHT *0.25) - this.EYE_RADIUS;
		
		GOval rightEye = new GOval(0,0,0,0);
		rightEye = drawEye(rightEyeX, rightEyeY);	
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
