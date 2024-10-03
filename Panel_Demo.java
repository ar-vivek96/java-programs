package awtDemo;
import java.awt.*;
import java.awt.event.*;
class Mypanel extends Frame
{
	 public Mypanel()
	 {
		 super("panel");
		 setSize(1000,600);
		 setLayout(null);
		 setVisible(true);
		 Panel panel=new Panel();
		 panel.setBounds(40,80,200,200);
		 panel.setBackground(Color.yellow);
		 Button b1=new Button("Button 1");
		 Button b2=new Button("Button 2");
		 b1.setBounds(50,100,80,20);
		 b1.setBackground(Color.gray);
		 b2.setBounds(100,100,80,20);
		 panel.add(b1);
		 panel.add(b2);
		add(panel);
		 
		 this.addWindowListener(new WindowAdapter()
				 {
			 public void windowClosing(WindowEvent we)
			 {
				 System.exit(0);
			 }
			 
				 });
		 
		
	 }
}

public class Panel_Demo {

	public static void main(String[] args) {
		
		Mypanel p=new Mypanel();
		

	}

}
