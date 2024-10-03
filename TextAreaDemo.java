package awtDemo;
import java.awt.*;
import java.awt.event.*;
class Text1 extends Frame implements ActionListener
{
	TextArea t;
	TextField tf;
	Label l;
	Button b;
	public Text1()
	{
		super("Text Area");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		l=new Label("-------");
		l.setBounds(20,30,200,30);
		t=new TextArea(10,30);
		t.setBounds(20,60,300,100);
		tf=new TextField();
		tf.setBounds(20,200,200,30);
		b=new Button("Click Me");
		b.setBounds(20,250,200,50);
		b.addActionListener(this);
		add(b);
		add(l);
		add(t);
		add(tf);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		l.setText(t.getSelectedText());
		t.append(tf.getText());
		t.insert(tf.getText(),t.getCaretPosition());

			
		
	}
}

public class TextAreaDemo {

	public static void main(String[] args) {
		Text1 obj=new Text1();
		
	}

}
