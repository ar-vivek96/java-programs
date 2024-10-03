package awtDemo;
import java.awt.*;
import java.awt.event.*;
class AppList extends Frame implements ActionListener
{
	List l;
	Button btn;
	Label l1;
	AppList()
	{
		super("List");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		l=new List(1,true);
		l.setBounds(20,50,200,100);
		btn=new Button("Show Details");
		btn.setBounds(20,200,150,30);
		l1=new Label("----------");
		l1.setBounds(250,150,500,40);
		add(btn);
		add(l1);
		add(l);
		l.add("Neptune");
		l.add("Pluto");
		l.add("Satran");
		l.add("Uranus");
		l.add("Mercury");
		l.add("Earth");
		l.add("Mars");
		l.add("Venus");
		l.add("Jupitor");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String list[]=l.getSelectedItems();
				String data="Selected planet: ";
				for(String X:list)
				{
					data=data+X+",";}
					l1.setText(data);
				
				
				
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
public class ListDemo {

	public static void main(String[] args) {
		AppList a=new AppList();
		

	}

}
