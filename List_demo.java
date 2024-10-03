package awtDemo;
//List in java
import java.awt.*;
import java.awt.event.*;

class MyList extends Frame
{
	List lst;
	Label lbl;
	Button b;
	public MyList()
	{
		super("List");
		setSize(1000,600);
		setVisible(true);
		setLayout(null);
		lst=new List(1,true);
		lst.setBounds(20,50,100,100);
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("jupiter");
		lst.add("saturn");
		lst.add("ureanus");
		lst.add("Neptune");
		lst.add("pluto");
		lst.add("Mars");
		 
		b=new Button("Show Details");
		b.setBounds(20,170,100,30);
		
		lbl=new Label("Empty label");
		lbl.setBounds(200,170,300,30);
		add(lbl);
		add(b);
		add(lst);
		b.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						String list[]=lst.getSelectedItems();
						String data="Selected palnet :";
						for(String X:list)
						{
							data=data+X+",";
							lbl.setText(data);
						}
						
					}
			
				});
		
		
		this.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
				});
	}
}
public class List_demo {

	public static void main(String[] args) {
		
		MyList l=new MyList();

	}

}
