package awtDemo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class MyCanvas extends Canvas
{
	MyCanvas()
	{
		setBackground(Color.RED);
		setSize(350,250);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(75, 75, 200,100 );
	}
}
class AppFrame extends Frame
{
	AppFrame()
	{
		super("CANVAS");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		add(new MyCanvas());

		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}
public class CanvasDemo {

	public static void main(String[] args) {
	
			AppFrame a=new AppFrame();

	}

}
