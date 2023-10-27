package project5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SwingStudent {
private JFrame frame;
private JButton buttonAdd, buttonDelet, buttonGpa, buttonSort;
private JLabel labelName, labelId, labelGpa;
private JTextField textId, textName, textGpa;
private JTextArea textArea;
private JPanel panelInfor,panelArea, panelButton;
StudentArrayList list;
JTable tableArea;
public SwingStudent() {
	paperGui();
}
public static void main(String[] args) {
	SwingStudent stu = new SwingStudent();
	stu.demoShowSwingStudent();
}
public void paperGui() {
	frame = new JFrame();
	frame.setTitle("Quan li sinh vien");
	frame.setSize(500, 500);
	panelInfor = new JPanel();
	panelInfor.setLayout(new GridLayout(3, 2));
	panelArea = new JPanel();
	panelButton = new JPanel();
	frame.add(panelInfor,BorderLayout.NORTH);
	panelInfor.setLayout(new BoxLayout(panelInfor, BoxLayout.Y_AXIS));
	frame.add(panelArea,BorderLayout.CENTER);
	frame.add(panelButton, BorderLayout.SOUTH);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
public void demoShowSwingStudent() {
	Dimension dime = new Dimension(80,20);
	JPanel panelName = new JPanel();
	labelName = new JLabel("Name:");
	labelId = new JLabel("ID:");
	labelGpa= new JLabel("Grades:");
	textId = new JTextField(20);
	textName = new JTextField(20);
	textGpa = new JTextField(20);
	labelName.setPreferredSize(dime);
	panelName.add(labelName);
	panelName.add(textName);
	labelId.setPreferredSize(dime);
	JPanel panelId  = new JPanel();
	panelId.add(labelId);
	panelId.add(textId);
	labelGpa.setPreferredSize(dime);
	JPanel panelGpa = new JPanel();
	panelGpa.add(labelGpa);
	panelGpa.add(textGpa);
	panelInfor.add(panelName);
	panelInfor.add(panelId);
	panelInfor.add(panelGpa);
	JPanel panelArea1 = new JPanel();
	textArea  = new JTextArea(19,40);
	textArea.setLayout(new GridLayout());
	panelArea1.add(textArea);
	panelArea.add(panelArea1);
	buttonAdd = new JButton("Add");
	buttonDelet = new JButton("Delete");
	buttonSort = new JButton("Sort");
	buttonGpa = new JButton("AverageGrades");
	JPanel panelButton1 = new JPanel();
	panelButton1.setLayout(new FlowLayout());
	panelButton1.add(buttonAdd);
	panelButton1.add(buttonSort);
	panelButton1.add(buttonDelet);
	panelButton1.add(buttonGpa);
	panelButton.add(panelButton1);
	list = new StudentArrayList();
	String []row = {"ID","Name","Grades"};
	DefaultTableModel tableMode = new DefaultTableModel(row, 0);
	
	
	for (Student stu : list.getStudent()) {
   Object []row1 = {stu.getId(),stu.getName(),stu.getGrades()};
   tableMode.addRow(row1);
	}
	 tableArea = new JTable(tableMode);
	JScrollPane paneMode = new JScrollPane(tableArea);
	textArea.add(paneMode);
	buttonSort.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			list.sortStudentsByName();
			DefaultTableModel tableMode = (DefaultTableModel)tableArea.getModel();
			tableMode.setRowCount(0);
			for (Student stu : list.getStudent()) {
				Object []row1 = {stu.getId(),stu.getName(),stu.getGrades()};
				tableMode.addRow(row1);
			}
		}
	});
	buttonAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	    String id = textId.getText();
	    String name  = textName.getText();
	    double grades = Double.parseDouble(textGpa.getText());
	    Student stu1 = new Student(id, name, grades);
	    list.addStudentList(stu1);
		DefaultTableModel tableMode = (DefaultTableModel)tableArea.getModel();
		tableMode.setRowCount(0);
		for (Student stu : list.getStudent()) {
			Object []row1 = {stu.getId(),stu.getName(),stu.getGrades()};
			tableMode.addRow(row1);
		}

		}
	});
	buttonDelet.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	 String id = textId.getText();
	 list.removeStudent(id);
	 DefaultTableModel tableMode = (DefaultTableModel)tableArea.getModel();
		tableMode.setRowCount(0);
		for (Student stu : list.getStudent()) {
			Object []row1 = {stu.getId(),stu.getName(),stu.getGrades()};
			tableMode.addRow(row1);
		}
		}
	});
	frame.setVisible(true);
	
}
}
