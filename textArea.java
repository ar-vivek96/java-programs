package awtDemo;
//Text Area in java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Apk extends Frame implements ActionListener
{
	TextArea t;
	Label L1;
	TextField tf;
	Button b;
	public Apk()
	{
		super("TEXT AREA");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		t=new TextArea(10,30);
		t.setBounds(20,100,300,200);
		L1=new Label("--------");
		L1.setBounds(20,50,100,30);
		tf=new TextField(50);
		tf.setBounds(20,350,300,30);
		b=new Button("Click");
		b.setBounds(20,400,100,30);
		b.addActionListener(this);
		add(t);
		add(L1);
		add(tf);
		add(b);
		this.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent We)
			{
				System.exit(0);
			}
			
				});
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		//L1.setText(t.getSelectedText());
		//t.append(tf.getText());
		t.insert(tf.getText(),t.getCaretPosition());
	}
}

public class textArea {

	public static void main(String[] args) {
		Apk a=new Apk();

	}

}
