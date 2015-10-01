// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
	public void paint(Graphics g)
	{
		
		// Random color
		
		int R = (int)(Math.random( )*256);
		int G = (int)(Math.random( )*256);
		int B = (int)(Math.random( )*256);
		Color randomColor = new Color(R, G, B);
		
		// base code
		
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);
		
		// right side
		
		int x = x1;
		int y = y2;
	
		for(int k = 0; k < 63; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B = (int)(Math.random( )*256);
			 Color randomColor1 = new Color(R, G, B);
			g.setColor(randomColor1);
			x += 15;
			y -= 10;
			g.drawLine(x,y1,x2,y);
		}
		
		// Left side
		
		x = x2;
		y = y1;
		
		for(int k = 0; k < 63; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor2 = new Color(R, G, B);
			g.setColor(randomColor2);
			x -= 15;
			y -= 10;
			g.drawLine(x1,y,x,y2);
		}
		
		// Top
		
		x1 = 10;
		y1 = 10;
		x2 = 990;
		y2 = 10;
		
		// Top Right side
		
		x = x1;
		y = y2;
		
		for(int k = 0; k < 63; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor3 = new Color(R, G, B);
			g.setColor(randomColor3);
			x += 15;
			y += 10;
			g.drawLine(x, y1, x2, y);
		}
		
		// Top Left Side
		
		x = x2;
		y = y1;
		
		for(int k = 0; k < 63; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor4 = new Color(R, G, B);
			g.setColor(randomColor4);
			x -= 15;
			y += 10;
			g.drawLine(x1, y, x, y1);
		}
		
		// Middle
		
		width = 590;
		height = 230;
		x1 = 205;
		y1 = 440;
		x2 = 795;
		y2 = 440;
		g.drawRect(205,210,width,height);
		
		// Bottom Right middle
		
		x = x1;
		y = y2;
		
		for(int k = 0; k < 39; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor5 = new Color(R, G, B);
			g.setColor(randomColor5);
			x += 15;
			y -= 6;
			g.drawLine(x, y1, x2, y);
		}
		
		// Bottom Left middle
		
		x = x2;
		y = y1;
		
		for(int k = 0; k < 39; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor6 = new Color(R, G, B);
			g.setColor(randomColor6);
			x -= 15;
			y -= 6;
			g.drawLine(x1, y, x, y2);
		}
		
		// Top middle
		
		x1 = 205;
		y1 = 210;
		x2 = 795;
		y2 = 210;
	
		// Top Right middle
		
		x = x1;
		y = y2;
		
		for(int k = 0; k < 39; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor7 = new Color(R, G, B);
			g.setColor(randomColor7);
			x += 15;
			y += 6;
			g.drawLine(x, y1, x2, y);
		}
		
		// Top Left middle
		
		x = x2;
		y = y1;
		
		for(int k = 0; k < 39; k++){
			 R = (int) (Math.random( )*256);
			 G = (int)(Math.random( )*256);
			 B= (int)(Math.random( )*256);
			 Color randomColor8 = new Color(R, G, B);
			g.setColor(randomColor8);
			x -= 15;
			y += 6;
			g.drawLine(x1, y, x, y2);
		}
		
		
	}
}

