package awtDemo;
// program to count words and characters in java AWT
import java.awt.*;
import java.awt.event.*;
class Apl extends Frame implements ActionListener
{
	Label L1,L2;
	Button b;
	TextArea t;
	
	 public Apl()
	{
		 super("Words & Letter Count");
		 setSize(1000,600);
		 setLayout(null);
		 setVisible(true);
		 t=new TextArea(10,30);
		 t.setBounds(30,100,300,200);//(x,y,l,h)
		 L1=new Label("------");
		 L1.setBounds(30,30,200,20);
		 L2=new Label("------");
		 L2.setBounds(30,60,200,20);
		 b=new Button("Get Details");
		 b.setBounds(20,320,100,30);
		 b.addActionListener(this);
		 add(L1);
		 add(L2);
		 add(t);
		 add(b);
		 
		this.addWindowListener(new WindowAdapter()
				 {
			 public void windowClosing(WindowEvent we)
			 {
				 System.exit(0);
			 }
			 
			});
		 
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text =t.getText();
		String word[]=text.split("\\s");
		L1.setText("Words"+word.length);
		L2.setText("character"+text.length());
		
	}
}


public class Appppp {

	public static void main(String[] args) {
		Apl a=new Apl();

	}

}
