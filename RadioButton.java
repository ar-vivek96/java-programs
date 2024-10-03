package awtDemo;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class application extends Frame
{
	Checkbox c1,c2;
	Label l1,l2;
	CheckboxGroup cbg;
	
	public application()
	{
		super("Radio Button");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		cbg=new CheckboxGroup();
		c1=new Checkbox("Male",cbg,false);
		c1.setBounds(10,70,250,30);
		c2=new Checkbox("Female",cbg,false);
		c2.setBounds(10,100,250,30);
		l1=new Label("Not Selceted");
		l1.setBounds(300,70,250,30);
		l2=new Label("Not Selceted");
		l2.setBounds(300,100,250,30);
		add(c1);
		add(c2);
		add(l1);
		add(l2);
		c1.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
				{
					l1.setText(e.getStateChange()==1?"Checked":"Un Checked");
					l2.setText("Unchecked");
				}
			}
		});
		c2.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e)
			{
				l2.setText(e.getStateChange()==1?"Checked":"Unchecked");
				l1.setText("Unchecked");
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
		});
		
	}
}
public class RadioButton {
	public static void main(String args[]) 
	{
		application a=new application();
	}

}
