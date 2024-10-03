package awtDemo;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class AppPanel extends Frame
{ 
	Panel p;
	Button b1,b2;
	AppPanel()
	{
		super("PANEL");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		p=new Panel();
		p.setBackground(Color.PINK);
		p.setBounds(40,30,200,500);
		b1=new Button("Button 1");
		b1.setBounds(60,50,80,30);
		b1.setBackground(Color.CYAN);
		
		b2=new Button("Button 2");
		b2.setBounds(100,50,80,30);
		b2.setBackground(Color.LIGHT_GRAY);
		add(p);
		p.add(b1);
		p.add(b2);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}


public class PanelDemo {

	public static void main(String[] args) {

		AppPanel Ap =new AppPanel(); 

	}

}
