package awtDemo;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class App1 extends Frame
{
	TextField txt;
	Label L1,L2;
	public App1()
	{
		super("Text");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		txt=new TextField();
		txt.setBounds(10,50,250,30);
		L1=new Label("----");
		L1.setBounds(10,100,250,30);
		L2=new Label("----");
		L2.setBounds(300,50,250,10);
	
		this.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				
			
				});
		add(txt);
		add(L1);
		add(L2);
	}
}
public class myApp1 {

	public static void main(String[] args) {
		
		App1 o=new App1();
	}

}
