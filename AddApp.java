package awtDemo;

import java.awt.*;
import java.awt.event.*;
class Application extends Frame implements ActionListener
{
	Label L1,L2,L3;
	TextField txt1,txt2;
	Button b;
	
	
	public Application()
	{
		super("Additon");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		L1=new Label("Enter Value 1");
		L1.setBounds(10,50,100,30);
		L2=new Label("Enter Value 2");
		L2.setBounds(10,100,100,30);
		txt1=new TextField();
		txt1.setBounds(150,50,250,30);
		txt2=new TextField();
		txt2.setBounds(150,100,250,30);
		b=new Button("Click Me");
		b.setBounds(150,150,100,30);
		b.addActionListener(this);
		L3=new Label("----");
		L3.setBounds(10,200,300,30);
		add(txt1);
		add(txt2);
		add(L1);
		add(L2);
		add(b);
		add(L3);
		
		addWindowListener(new WindowAdapter()
				{

					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					}
			
				});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s1=txt1.getText();
		String s2=txt2.getText();
		if(s1.isEmpty()||s2.isEmpty()) {
			L3.setText("Please Enter The Data");
		}
		else
		{
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=a+b;
			String result=String.valueOf(c);
			L3.setText("Total :"+result);
			
			
		}
		
	}

}
public class AddApp {

	public static void main(String[] args) {
		Application a=new Application();

	}

}
