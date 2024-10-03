package awtDemo;
import java.awt.Frame;
import java.awt.Label;
import java.awt.*;


class RegiApp extends Frame
{
	Label lblTitle,lblName,lblFather,lblAge,lblGender,lblHobbies,lblAddress,lblCourse;
	TextField txtName,txtFather,txtAge;
	TextArea txtAddress;
	Checkbox checkMale,checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice course;
	Button btnSave,btnClear;
	public RegiApp()
	{
		super("Registraiton Form");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		Color formColor=new Color(53,59,72);
		setBackground(formColor);
		Font titleFont =new Font("arial",Font.BOLD,20);
		Font lblFont=new Font("arial",Font.PLAIN,18);
		Font txtFont=new Font("arial",Font.PLAIN,15);
		
		lblTitle =new Label("Registration Form");
		lblTitle.setBounds(300,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);		
		lblName=new Label("Name");
		lblName.setBounds(250,100,150,30);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(lblFont);
		add(lblName);
		txtName=new TextField();
		txtName.setBounds(400,100,400,30);
		txtName.setFont(txtFont);
		add(txtName);
		lblFather=new Label("Father Name ");
		lblFather.setBounds(250,150,150,30);
		lblFather.setFont(lblFont);
		lblFather.setForeground(Color.WHITE);
		add(lblFather);
		txtFather=new TextField();
		txtFather.setFont(txtFont);
		txtFather.setBounds(400,150,400,30);
		add(txtFather);
		lblAge=new Label("Age");
		lblAge.setBounds(250,200,150,30);
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(lblFont);
		add(lblAge);
		txtAge=new TextField();
		txtAge.setBounds(400,200,400,30);
		txtAge.setFont(txtFont);
		add(txtAge);
		lblGender=new Label("Gender");
		lblGender.setBounds(250,250,150,30);
		lblGender.setFont(lblFont);
		lblGender.setForeground(Color.WHITE);
		add(lblGender);
		cbg=new CheckboxGroup();
		checkMale=new Checkbox("MALE",cbg,true);
		checkMale.setBounds(400,250,100,30);
		checkMale.setForeground(Color.WHITE);
		checkMale.setFont(lblFont);
		add(checkMale);
		checkFemale =new Checkbox("Female",cbg,false);
		checkFemale.setBounds(500,250,100,30);
		checkFemale.setFont(lblFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
		lblCourse=new Label("Course");
		lblCourse.setBounds(250,300,150,30);
		lblCourse.setFont(lblFont);
		lblCourse.setForeground(Color.WHITE);
		add(lblCourse);
		
		course =new Choice();
		course.setBounds(400,300,400,50);
		course.setFont(lblFont);
		course.add("c");
		course.add("c++");
		course.add("java");
		course.add("phython");
		course.add("c#");
		add(course);
	
		lblHobbies=new Label("Hobbies");
		lblHobbies.setBounds(250,350,150,30);
		lblHobbies.setForeground(Color.WHITE);
		lblHobbies.setFont(lblFont);
		add(lblHobbies);
		Hobbies1=new Checkbox("Drawing");
		Hobbies1.setBounds(400,350,100,50);
		Hobbies1.setFont(lblFont);
		Hobbies1.setForeground(Color.WHITE);
		add(Hobbies1);
		Hobbies2=new Checkbox("Singing");
		Hobbies2.setBounds(500,350,100,50);
		Hobbies2.setFont(lblFont);
		Hobbies2.setForeground(Color.WHITE);
		add(Hobbies2);
		Hobbies3=new Checkbox("Drawing");
		Hobbies3.setBounds(600,350,100,50);
		Hobbies3.setFont(lblFont);
		Hobbies3.setForeground(Color.WHITE);
		add(Hobbies3);
		Hobbies4=new Checkbox("Others");
		Hobbies4.setBounds(700,350,100,50);
		Hobbies4.setFont(lblFont);
		Hobbies4.setForeground(Color.WHITE);
		add(Hobbies4);
		lblAddress=new Label("Address");
		lblAddress.setBounds(250,400,150,30);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(lblFont);
		add(lblAddress);
		txtAddress=new TextArea(10,30);
		txtAddress.setBounds(400,400,400,100);
		add(txtAddress);
		btnSave=new Button("Save Details");
		btnSave.setBounds(400,530,150,30);
		btnSave.setForeground(Color.WHITE);
		btnSave.setBackground(Color.RED);
		btnSave.setFont(txtFont);
		add(btnSave);
		btnClear=new Button("Clear All");
		btnClear.setBounds(560,530,150,30);
		btnClear.setBackground(Color.BLUE);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(txtFont);
		add(btnClear);
		
		
		
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		});
	}
	
}
public class Regi_Demo {

	public static void main(String[] args) {
		
		RegiApp r=new RegiApp();
	}

}
