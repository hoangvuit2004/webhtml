package project14;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SwingStudent {
	public SwingStudent() {
		paperGui();
	}
private JFrame frame,aboutFrame;
private JButton buttonAdd, buttonSort;
private JLabel labelCode,labelFirstName, labelLastName, labelAge, labelAverge, labelTeacher;
private JTextArea textArea;
private JTextField textCode, textFirstName, textLastName,textAge, textAverge;
private JComboBox comboTeacher;
private JPanel panelInfor, panelArea, panelButton;
private JTable tableStudent;
private StudentList listStudent;
private Student stu;
String teacher;
String code;
public static void main(String[] args) {
	SwingStudent demo = new SwingStudent();
	demo.demoSwingStudent();
	
}
public void paperGui() {
	frame  = new JFrame();
	frame.setTitle("Student ManagerSystem");
	frame.setSize(700, 600);
	panelInfor = new JPanel();
	panelInfor.setLayout(new BoxLayout(panelInfor, BoxLayout.Y_AXIS));
	panelArea = new JPanel();
	panelButton = new JPanel();
	frame.add(panelInfor,BorderLayout.NORTH);
	frame.add(panelArea,BorderLayout.CENTER);
	frame.add(panelButton,BorderLayout.SOUTH);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
public void demoSwingStudent() {
	Dimension dime  = new Dimension(290, 20);
	Dimension dime1  = new Dimension(536, 20);
	JPanel panelForm = new JPanel();
	panelInfor.add(panelForm);
	panelForm.setLayout(new GridLayout(6, 0));
	JPanel panelCode = new JPanel();
	labelCode = new JLabel("Code:");
	labelCode.setPreferredSize(dime);
	textCode = new JTextField(30);
	panelCode.add(labelCode);
	panelCode.add(textCode);
	panelForm.add(panelCode);
	JPanel panelFirstName = new JPanel();
	labelFirstName = new JLabel("FirstName:");
	labelFirstName.setPreferredSize(dime);
	textFirstName = new JTextField(30);
	panelFirstName.add(labelFirstName);
	panelFirstName.add(textFirstName);
	panelForm.add(panelFirstName);
	JPanel panelLastName = new JPanel();
	labelLastName = new JLabel("LastName:");
	labelLastName.setPreferredSize(dime);
	textLastName = new JTextField(30);
	panelLastName.add(labelLastName);
	panelLastName.add(textLastName);
	panelForm.add(panelLastName);
	JPanel panelAge = new JPanel();
	labelAge = new JLabel("Age:");
	labelAge.setPreferredSize(dime);
	textAge = new JTextField(30);
	panelAge.add(labelAge);
	panelAge.add(textAge);
	panelForm.add(panelAge);
	JPanel paneAverge = new JPanel();
	labelAverge = new JLabel("AvergeGrade:");
	labelAverge.setPreferredSize(dime);
	textAverge = new JTextField(30);
	paneAverge.add(labelAverge);
	paneAverge.add(textAverge);
	panelForm.add(paneAverge);
	JPanel panelTeacher = new JPanel();
	labelTeacher = new JLabel("Teacher:");
	labelTeacher.setPreferredSize(dime1);
	String []row = {"Hoang Vu", "Vu Hoang","Vu Nguyen"};
	DefaultComboBoxModel comboModel = new DefaultComboBoxModel<>(row);
	comboTeacher = new JComboBox<>(comboModel);
	panelTeacher.add(labelTeacher);
	panelTeacher.add(comboTeacher);
	panelForm.add(panelTeacher);
	textArea = new JTextArea(18, 57);
	panelArea.add(textArea);
	JPanel panelButtonChange = new JPanel();
	panelButtonChange.setLayout(new FlowLayout());
	buttonAdd = new JButton("AddStudent");
	buttonSort = new JButton("SortStudent");
	panelButtonChange.add(buttonAdd);
	panelButtonChange.add(buttonSort);
	panelButton.add(panelButtonChange);
	String row2[] = {"Code","FullName","Age","AvegerGrade","Teacher"};
	DefaultTableModel tableModel = new DefaultTableModel(row2, 0);
	tableStudent = new JTable(tableModel);
	JScrollPane pane = new JScrollPane(tableStudent);
	textArea.setLayout(new GridLayout());
	textArea.add(pane);
	listStudent = new StudentList();
	DefaultTableModel tabelMode = (DefaultTableModel)tableStudent.getModel();
	tabelMode.setRowCount(0);
	
	buttonAdd.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        // Lấy thông tin sinh viên từ các trường nhập liệu
	      code = textCode.getText();
	        String firstName = textFirstName.getText();
	        String lastName = textLastName.getText();
	        int age = Integer.parseInt(textAge.getText());
	        String average = textAverge.getText();
	    teacher = (String) comboTeacher.getSelectedItem();

	        // Tạo thông báo xác nhận
	        String message = "Bạn có chắc muốn thêm sinh viên?";
	        int option = JOptionPane.showConfirmDialog(frame, message, "Xác nhận", JOptionPane.YES_NO_OPTION);

	        // Kiểm tra xem người dùng đã xác nhận hay không
	        if (option == JOptionPane.YES_OPTION) {
	            // Thêm sinh viên vào bảng và danh sách sinh viên
	            Student stu = new Student(code,teacher,age, firstName, lastName, average);
	            listStudent.addStudent(stu);
	            DefaultTableModel tableModel = (DefaultTableModel) tableStudent.getModel();
	            Object[] row = {code, lastName + firstName, age, average, teacher};
	            tableModel.addRow(row);
	        }
	    }
	});
	
	buttonSort.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	   listStudent.sortStudent();	
	   tableModel.setRowCount(0);
	   for (Student student : listStudent.getStudent()) {
           Object[] row = {student.getCode(), student.getLastName() + " " + student.getFirstName(), student.getAge(), student.getAvegerGrade(), student.getTeacher()};
           tableModel.addRow(row);
       }
	  
		}
		
	});
	frame.setVisible(true);
}


}
