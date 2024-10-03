package awtDemo;
import java.awt.*;
import java.awt.event.*;
class Text extends Frame
{
	TextField txt;
	Label l1,l2;
	public Text()
	{
		super("TEXT FIELD");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		txt=new TextField();
		txt.setBounds(20,70,200,50);
		l1=new Label("--------");
		l1.setBounds(250,70,200,50);
		l2=new Label("------");
		l2.setBounds(20,100,200,50);
		add(txt);
		add(l1);
		add(l2);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}


public class TextDemo {

	public static void main(String[] args) {
		Text t=new Text();
		
	}

}
