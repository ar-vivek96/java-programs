//Canvas Demo
package awtDemo;
import java.awt.*;
import java.awt.event.*;
class Mycanvas extends Canvas
{
	public Mycanvas()
	{
		setBackground(Color.red);
		setSize(500,200);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(75,75,150,75);
	}
}

class CanApp extends Frame
{
	public CanApp()
	{
		super("Canvas");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		Mycanvas v=new Mycanvas();
		add(v);
		this.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
				});
		
	}
	
	
	
	
}
public class Canvas_Demo {

	public static void main(String[] args) {

		CanApp c=new CanApp();
	}

}
