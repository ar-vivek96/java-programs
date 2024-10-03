package awtDemo;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Form extends Frame
{
	Label lblname,lblFathername,lblage,lblgender,lblcourse,lbl,lblhobbies,lbladdress,lbltitle;
	TextField txtname,txtfathername,txtage;
	TextArea taddress;
	Checkbox cbxmale,cbxfemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice Course;
	Button btnsave,btnclear;
	
	public Form()
	{
		super("Registration");
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		setBackground(Color.BLACK);
		Font lblfont=new Font("arial",Font.BOLD,15);
		Font txtFont=new Font("arial",Font.PLAIN,18);
		Font titlefont=new Font("arial",Font.BOLD,26);
		lbltitle=new Label("Registration Form");
		lbltitle.setBounds(350,40,300,30);
		lbltitle.setForeground(Color.YELLOW);
		lbltitle.setFont(titlefont);
		add(lbltitle);
		lblname=new Label("NAME");
		lblname.setBounds(200,80,150,30);
		lblname.setForeground(Color.WHITE);
		lblname.setFont(lblfont);
		add(lblname);
		txtname=new TextField();
		txtname.setBounds(400,80,400,30);
		txtname.setBackground(Color.WHITE);
		txtname.setFont(txtFont);
		add(txtname);
		lblFathername=new Label("FATHER NAME");
		lblFathername.setBounds(200,130,150,30);
		lblFathername.setForeground(Color.WHITE);
		lblFathername.setFont(lblfont);
		add(lblFathername);
		txtfathername=new TextField();
		txtfathername.setBounds(400,130,400,30);
		txtfathername.setFont(txtFont);
		txtfathername.setBackground(Color.WHITE);
		add(txtfathername);
		lblage=new Label("AGE");
		lblage.setBounds(200,180,150,30);
		lblage.setForeground(Color.WHITE);
		lblage.setFont(lblfont);
		add(lblage);
		txtage=new TextField();
		txtage.setBounds(400,180,400,30);
		txtage.setBackground(Color.WHITE);
		txtage.setFont(txtFont);
		add(txtage);
		lblgender=new Label("GENDER");
		lblgender.setBounds(200,240,150,30);
		lblgender.setForeground(Color.WHITE);
		lblgender.setFont(lblfont);
		add(lblgender);
		cbg=new CheckboxGroup();
		cbxmale=new Checkbox("Male",cbg,false);
		cbxmale.setForeground(Color.WHITE);
		cbxmale.setFont(lblfont);
		cbxmale.setBounds(400,240,100,30);
		add(cbxmale);
		cbxfemale=new Checkbox("Female",cbg,true);
		cbxfemale.setForeground(Color.WHITE);
		cbxfemale.setBounds(500,240,100,30);
		cbxfemale.setFont(lblfont);
		add(cbxfemale);
		lblcourse=new Label("COURSE");
		lblcourse.setBounds(200,300,150,30);
		lblcourse.setFont(lblfont);
		lblcourse.setForeground(Color.WHITE);
		add(lblcourse);
		Course=new Choice();
		Course.setBounds(400,300,400,30);
		Course.setBackground(Color.WHITE);
		Course.setFont(txtFont);
		add(Course);
		Course.add("C");
		Course.add("C++");
		Course.add("Java");
		Course.add("PHYTHON");
		Course.add("C#");
		lblhobbies=new Label("HOBBIES");
		lblhobbies.setBounds(200,360,150,30);
		lblhobbies.setForeground(Color.WHITE);
		lblhobbies.setFont(lblfont);
		add(lblhobbies);
		Hobbies1=new Checkbox("Drawing");
		Hobbies1.setBounds(400,360,100,30);
		Hobbies1.setForeground(Color.WHITE);
		Hobbies1.setFont(lblfont);
		add(Hobbies1);
		Hobbies2=new Checkbox("Singing");
		Hobbies2.setBounds(500,360,100,30);
		Hobbies2.setForeground(Color.WHITE);
		Hobbies2.setFont(lblfont);
		add(Hobbies2);
		Hobbies3=new Checkbox("Music");
		Hobbies3.setBounds(600,360,100,30);
		Hobbies3.setForeground(Color.WHITE);
		Hobbies3.setFont(lblfont);
		add(Hobbies3);
		Hobbies4=new Checkbox("Others");
		Hobbies4.setBounds(700,360,100,30);
		Hobbies4.setForeground(Color.WHITE);
		Hobbies4.setFont(lblfont);
		add(Hobbies4);
		lbladdress=new Label("ADDRESS");
		lbladdress.setBounds(200,420,150,30);
		lbladdress.setForeground(Color.WHITE);
		lbladdress.setFont(lblfont);
		add(lbladdress);
		taddress=new TextArea(10,20);
		taddress.setBounds(400,420,400,100);
		taddress.setBackground(Color.WHITE);
		taddress.setFont(txtFont);
		add(taddress);
		btnsave=new Button("SAVE DETAILS");
		btnsave.setBounds(400,580,150,30);
		btnsave.setBackground(Color.BLUE);
		btnsave.setForeground(Color.WHITE);
		btnsave.setFont(lblfont);
		add(btnsave);
		btnclear=new Button("CLEAR ALL");
		btnclear.setBounds(600,580,150,30);
		btnclear.setBackground(Color.RED);
		btnclear.setForeground(Color.WHITE);
		btnclear.setFont(lblfont);
		add(btnclear);
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
}

public class RegistrationForm {

	public static void main(String[] args) {
	
		Form f=new Form();
		
	}

}
