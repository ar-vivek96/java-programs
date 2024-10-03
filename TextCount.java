package awtDemo;
import java.awt.*;
import java.awt.event.*;
class Count extends Frame implements ActionListener
{
	TextArea t;
	Label l1,l2;
	Button b;
	
	public Count()
	{
		super("FRAME");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		t=new TextArea(10,20);
		t.setBounds(20,100,200,150);
		l1=new Label("---------");
		l1.setBounds(20,30,200,30);
		l2=new Label("---------");
		l2.setBounds(20,50,200,30);
		b=new Button("Click Me");
		b.setBounds(20,250,200,30);
		b.addActionListener(this);
		add(t);
		add(l1);
		add(l2);
		add(b);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String text=t.getText();
		String words[]=text.split("\\s");
		l1.setText("Words:"+words.length);
		l2.setText("Character:"+text.length());
		
	}
}
public class TextCount {

	public static void main(String[] args) {

		Count c=new Count();

	}

}
