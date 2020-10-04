/*
 * File: DrawingLines.java 
 * ----------------------------------
 * 
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingLines extends GraphicsProgram {
	
	private double originX;
	private double originY ;
	private double currentX;
	private double currentY;
	private double endX;
	private double endY;
	private GLine line = new GLine(0,0,0,0);
	
	public void run() {
		drawLine();
	}
	private void drawLine() {
		addMouseListeners();
		}
	public void mousePressed(MouseEvent e) {
		this.originX = e.getX();
		this.originY = e.getY();
		this.line.setStartPoint(originX, originY);
		this.line = new GLine(originX, originY, currentX, currentY);
	}
	
	public void mouseDragged(MouseEvent e) {
		currentX = e.getX();
		currentY = e.getY();
		this.line.setEndPoint(currentX, currentY);
		add(this.line);
		}
	public void mouseReleased(MouseEvent e) {
		endX = e.getX();
		endY = e.getY();
		this.line = new GLine(originX, originY, endX, endY);
		
		
	}
}
