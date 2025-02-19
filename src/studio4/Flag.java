package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(500,500);

		 
		 StdDraw.setPenColor(115, 226, 111);
		   StdDraw.filledRectangle(0.3, 0.4, 0.2, 0.1);
		   
		   StdDraw.setPenColor(230, 108, 178);
		   StdDraw.filledRectangle(0.7, 0.40, 0.20, 0.10);
		   
		   StdDraw.setPenColor(103, 182, 215);
		   StdDraw.filledRectangle(0.30, 0.60,0.20, 0.10);
		   
		   StdDraw.setPenColor(34, 111, 56);
		   StdDraw.filledRectangle(0.70, 0.60, 0.20, 0.10);
		   
		   StdDraw.setPenColor(Color.BLACK);
		   StdDraw.text(0.5,0.5,"Table 11");
		   
		   StdDraw.setPenColor(Color.BLACK);
		   StdDraw.filledCircle(0.3, 0.5, 0.02);
		   StdDraw.setPenColor(Color.BLACK);
		   StdDraw.filledCircle(0.7, 0.5, 0.02);
		   
		   StdDraw.setPenColor(Color.BLACK);
		   StdDraw.rectangle(0.5, 0.5, 0.24, 0.04);
	}
}