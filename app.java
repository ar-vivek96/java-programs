
package awtDemo;
import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements ItemListener
{
	Checkbox c1,c2;
	Label L1,L2;
	CheckboxGroup cbg;
public MyApp()
{	
	
	super("vivek");
	setSize(600,300);
	setLayout(null);
	setVisible(true);
	cbg=new CheckboxGroup();

	c1=new Checkbox("Male",cbg,false);
	c1.setBounds(10,50,250,30);
	L1=new Label("Not Selected");
	L1.setBounds(300,50,600,30);
	c2=new Checkbox("Female",cbg,false);
	c2.setBounds(10,100,250,30);
	L2=new Label("Not Selected");
	L2.setBounds(300,100,600,30);
	c1.addItemListener(new ItemListener( )
			{

				@Override
				public void itemStateChanged(ItemEvent e) {
					L1.setText(e.getStateChange()==1?"checked":"unchecked");
					L2.setText("unchecked");
					
				}
		
			});
	c2.addItemListener(new ItemListener()
			{

				@Override
				public void itemStateChanged(ItemEvent e) {
					L2.setText(e.getStateChange()==1?"checked":"unchecked");
					L1.setText("unchecked");
					
				}
		
			});
	
	
			
	add(c1);
	add(L1);
	
	add(c2);
	add(L2);
	
	
	this.addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
	
	});
			
}
@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	
}
}

public class app extends Frame{

	public static void main(String[] args) {
		
		MyApp frm=new MyApp();
		
		
		
		

	}

}
