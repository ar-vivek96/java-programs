package awtDemo;
import java.awt.*;
import java.awt.event.*;
class Addition extends Frame implements ActionListener
{
	TextField txt1,txt2;
	Label l1,l2,l3;
	Button b;
	
	public Addition()
	{
		super("ADDITION");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		l1=new Label("Enter Value 1");
		l1.setBounds(20,80,200,30);
		l2=new Label("Enter Value 2");
		l2.setBounds(20,150,200,30);
		txt1=new TextField();
		txt1.setBounds(250,80,200,30);
		txt2=new TextField();
		txt2.setBounds(250,150,200,30);
		l3=new Label("----------");
		l3.setBounds(250,200,200,30);
		b=new Button("ADD");
		b.setBounds(30,250,150,30);
		b.addActionListener(this);
		add(b);
		add(l1);
		add(l2);
		add(l3);
		add(txt1);
		add(txt2);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=txt1.getText();
		String s2=txt2.getText();
		if(s1.isEmpty()||s2.isEmpty())
		{
			l3.setText("Please Enter Data");
		}
		else
		{
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=a+b;
			String result=String.valueOf(c);
			l3.setText("TOTAL:"+result);
			
		}
		
	}
}

public class Additionawt {

	public static void main(String[] args) {
		
		Addition a=new Addition();

	}

}
