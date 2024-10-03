package awtDemo;
import java.awt.*;
import java.awt.event.*;

class MyChoice extends Frame
{
	Choice c;
	Label lbl;
	Button b;
	
	public MyChoice()
	{
		super("Choice");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		c=new Choice();
		c.setBounds(20,50,100,100);
		c.add("c");
		c.add("C++");
		c.add("java");
		c.add("phython");
		add(c);
		b=new Button("Show Details");
		b.setBounds(140,50,300,30);
		b.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						String data="Programming language Selected:"+c.getItem(c.getSelectedIndex());
						lbl.setText(data);
						
					}
			
			
				});
		
		lbl=new Label("Empty Label");
		lbl.setBounds(20,70,300,30);
		add(b);
		add(lbl);
		this.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			
				});
		
	}
}
public class choice_Demo {

	public static void main(String[] args) {
		
		MyChoice a=new MyChoice();
	}

}
