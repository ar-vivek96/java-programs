package awtDemo;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AppMenu extends Frame
{
	MenuBar m;
	Menu menu,submenu;
	MenuItem i1,i2,i3,i4,i5;
	
	AppMenu()
	{
		super("MENU BAR");
		setSize(1000,600);

		setVisible(true);
		m=new MenuBar();
		menu=new Menu("Menu");
		submenu=new Menu("SubMenu");
		i1=new MenuItem("Item 1");
		i2=new MenuItem("Item 2");
		i3=new MenuItem("Item 3");
		i4=new MenuItem("Item 4");
		i5=new MenuItem("Item 5");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		m.add(menu);
		menu.add(submenu);
		this.setMenuBar(m);
		
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}

public class MenubarDemo {

	public static void main(String[] args) {

		AppMenu a=new AppMenu();

	}

}
