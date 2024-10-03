package awtDemo;
//MenuBar
import java.awt.*;
import java.awt.event.*;
class MyMenuBar extends Frame

{
	public MyMenuBar()
	{
		super("MenuBar");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		MenuBar m=new MenuBar();
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("Sub Menu");
		MenuItem i1=new MenuItem("item 1");
		MenuItem i2=new MenuItem("item 2");
		MenuItem i3=new MenuItem("item 3");
		MenuItem i4=new MenuItem("item 4");
		MenuItem i5=new MenuItem("item 5");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		m.add(menu);
		setMenuBar(m);
		
		this.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
				});
		
		
	}
}

public class MenuBar_Demo {

	public static void main(String[] args) {
		
		MyMenuBar m=new MyMenuBar();

	}

}
