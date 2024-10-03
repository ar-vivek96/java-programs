package awtDemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyApp extends Frame implements ActionListener
{
	Button btn;
	Label lbl;
	MyApp()
	{
		super("FRAME");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		btn=new Button("Click Me");
		btn.setBounds(75, 75, 200, 90);
		add(btn);
		btn.addActionListener(this);
		lbl=new Label("-------");
		lbl.setBounds(75, 150, 200, 90);
		add(lbl);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
			
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		lbl.setText("Button clicked");
		
	}
}
public class App  extends Frame{

	public static void main(String[] args) {
		MyApp a=new MyApp();
		
		

	}

}
