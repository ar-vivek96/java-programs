package awtDemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class AppChoice extends Frame implements ActionListener
{
	Choice c;
	Label l1;
	Button b;
	AppChoice()
	{
		super("Choice");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		c=new Choice();
		c.setBounds(30,50,100,200);
		l1=new Label("---------");
		l1.setBounds(30,80,600,200);
		b=new Button("Show Details");
		b.setBounds(150,50,100,20);
		b.addActionListener(this);
		add(b);
		add(l1);
		c.add("C ");
		c.add("C++");
		c.add("JAVA");
		c.add("PHYTHON");
		c.add("C#");
		add(c);
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String data="Programming language Selected:"+c.getItem(c.getSelectedIndex());
		l1.setText(data);
	}
	
}
public class ChoiceinAwt {

	public static void main(String[] args) {
		
		AppChoice a=new AppChoice();


	}

}
