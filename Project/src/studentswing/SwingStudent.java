package studentswing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SwingStudent {
protected static final int Student = 0;
protected static final int ArrayList = 0;
JFrame mainFrame;
JButton buttonAdd, buttonUpdate, buttonSearch,buttonSave, buttonSort;
JTextField textID, textName, textAge, textGPA;
JMenuItem menuAdd, menuUpdate, menuSort, menuLoad, menuSave, menuExit,menuSearch,menuDelete;
JPanel panelInfor,panelButton,panelTable;
JTable textTable;
JTextArea textArea;
StudentModel studentModel;
ArrayList<Student> list;
DefaultTableModel tableMode;
public SwingStudent() {
	paperGui();
}
public static void main(String[] args) {
	SwingStudent swing = new SwingStudent();
	swing.showDemoSwingStudent();
}
public void paperGui() {
	mainFrame =  new JFrame();
	mainFrame.setTitle("Student Management System");
	mainFrame.setSize(600,600);
	 panelInfor = new JPanel();
	 
	 panelTable = new JPanel();
	 panelButton = new JPanel();
	
	mainFrame.add(panelInfor, BorderLayout.NORTH);
	panelInfor.setLayout(new BoxLayout(panelInfor, BoxLayout.Y_AXIS));
	mainFrame.add(panelTable, BorderLayout.CENTER);
	mainFrame.add(panelButton, BorderLayout.SOUTH);
	//mainFrame.setLayout(new GridLayout());
	mainFrame.setLocationRelativeTo(null);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainFrame.setVisible(true);
}
public void showDemoSwingStudent() {
	Dimension dimeInfor = new Dimension(80, 20);
	JPanel formPanel = new JPanel();
	formPanel.setLayout(new GridLayout(4, 2));
	panelInfor.add(formPanel);
	
	JLabel labelID =  new JLabel("ID: ");
	JLabel labelName =  new JLabel("Name: ");
	JLabel labelAge =  new JLabel("Age: ");
	JLabel labelGPA =  new JLabel("GPA: ");
	textID = new JTextField(30);
	textName = new JTextField(30);
	textAge = new JTextField(30);
	textGPA = new JTextField(30);
	JPanel panelChangeID = new JPanel();
	panelChangeID.add(labelID);
	labelID.setPreferredSize(dimeInfor);
	panelChangeID.add(textID);
	formPanel.add(panelChangeID);

//PanelID
	JPanel panelChangeName = new JPanel();
    panelChangeName.add(labelName);
    labelName.setPreferredSize(dimeInfor);
    panelChangeName.add(textName);
    formPanel.add(panelChangeName);
    //PanelName
    JPanel panelAge = new JPanel();
    panelAge.add(labelAge);
    labelAge.setPreferredSize(dimeInfor);
    panelAge.add(textAge);
    formPanel.add(panelAge);
    //PanelAge
    JPanel panelGPA = new JPanel();
    panelGPA.add(labelGPA);
    labelGPA.setPreferredSize(dimeInfor);
    panelGPA.add(textGPA);
    formPanel.add(panelGPA);
    //PanelGPA
    JMenuBar menuBar = new JMenuBar();
    mainFrame.setJMenuBar(menuBar);
    JMenu menu = new JMenu("Menu");
    menu.setMnemonic('M');
    menuAdd = new JMenuItem("Add");
    menuUpdate = new JMenuItem("Update");
    menuDelete = new JMenuItem("Delete");
    menuSearch = new JMenuItem("Search");
    menuSave =  new JMenuItem("Save To File");
    menuLoad = new JMenuItem("Load To File");
    menuSort =  new JMenuItem("Sort");
    menuExit = new JMenuItem("Exit");
    menuExit.setMnemonic('x');
    menuBar.add(menu);
    menu.add(menuAdd);
    menu.add(menuUpdate);
    menu.add(menuSearch);
    menu.add(menuDelete);
    menu.addSeparator();
    menu.add(menuSort);
    menu.addSeparator();
    menu.add(menuSave);
    menu.add(menuLoad);
    menu.addSeparator();
    menu.add(menuExit);
    //Menu
    studentModel = new StudentModel();
    String []inFor = {"ID","Name","Age","GPA"};
    DefaultTableModel tableMode = new DefaultTableModel(inFor, 0);
    for(Student stu : studentModel.getStudents()) {
		Object[] row = {stu.getId(),stu.getName(),stu.getAge(),stu.getGpa()};
		tableMode.addRow(row);
	}
    
    textTable = new JTable(tableMode);
    JScrollPane paneScroll = new JScrollPane(textTable);
    
    textArea = new JTextArea(20, 47);
    
    textArea.setLayout(new GridLayout());
    textArea.add(paneScroll);
    
    panelTable.add(textArea);
    buttonAdd =  new JButton("Add");
    buttonUpdate =  new JButton("Update");
    buttonSearch =  new JButton("Search");
    buttonSort =  new JButton("Sort");
    buttonSave =  new JButton("Save To File");
    JPanel panelChangeButton = new JPanel();
    panelChangeButton.add(buttonAdd);
    panelChangeButton.add(buttonUpdate);
    panelChangeButton.add(buttonSearch);
    panelChangeButton.add(buttonSort);
    panelChangeButton.add(buttonSave);
    panelButton.add(panelChangeButton);
    buttonAdd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String id = textID.getText();
            String name = textName.getText();
            String age = textAge.getText();
            String gpa = textGPA.getText();

            studentModel.addStudentFromTextField(id, name, age, gpa);
           
            // Refresh bảng JTable
            DefaultTableModel model = (DefaultTableModel) textTable.getModel();
            model.setRowCount(0);
           for (Student stu : studentModel.getStudents()) {
			Object []row = {stu.getId(), stu.getName(), stu.getAge(), stu.getGpa()};
			model.addRow(row);
		}

            // Xóa nội dung trong các JTextField
            textID.setText("");
            textName.setText("");
            textAge.setText("");
            textGPA.setText("");
        }
    });
    buttonSort.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            studentModel.sortStudentsByName();

            // Cập nhật lại bảng JTable sau khi sắp xếp
            DefaultTableModel model = (DefaultTableModel) textTable.getModel();
            model.setRowCount(0); // Xóa hết các hàng hiện tại

            ArrayList<Student> sortedStudents = studentModel.getStudents();
            for (Student student : sortedStudents) {
            	Object []row = {student.getId(), student.getName(), student.getAge(), student.getGpa()};
                model.addRow(row);
            }
        }
    });
    buttonSearch.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String searchName = textName.getText();
			String id = textID.getText();
	        ArrayList<Student> searchResults = studentModel.searchStudentByName(id);

	        // Cập nhật lại bảng JTable với kết quả tìm kiếm
	        DefaultTableModel model = (DefaultTableModel) textTable.getModel();
	        model.setRowCount(0); // Xóa hết các hàng hiện tại

	        for (Student student : searchResults) {
	            model.addRow(new Object[] { student.getId(), student.getName(), student.getAge(), student.getGpa() });
	        }
		}
	});
    menuDelete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = textID.getText();
            // Xóa sinh viên từ danh sách
            studentModel.removeStudentById(id);

            // Cập nhật lại bảng JTable
            DefaultTableModel model = (DefaultTableModel) textTable.getModel();
            model.setRowCount(0); // Xóa hết các hàng hiện tại

            for (Student student : studentModel.getStudents()) {
                model.addRow(new Object[] { student.getId(), student.getName(), student.getAge(), student.getGpa() });
            }
        }
    });
    menuExit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	 if(e.getSource() == menuExit) {
		 System.exit(0);
	 }
		}
	});
    buttonUpdate.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 String id = textID.getText();
	            String name = textName.getText();
	            int age = Integer.parseInt(textAge.getText());
	            double gpa = Double.parseDouble(textGPA.getText());
	            studentModel.updateStudent(id, name, age, gpa);
	            DefaultTableModel model = (DefaultTableModel) textTable.getModel();
	            model.setRowCount(0); // Xóa hết các hàng hiện tại

	            for (Student student : studentModel.getStudents()) {
	                model.addRow(new Object[] { student.getId(), student.getName(), student.getAge(), student.getGpa() });
	            }
		}
	});
    buttonSave.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String fileName = "students.csv";
            saveToFile(fileName);
        }
    });
menuSort.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		studentModel.sortStudentsByName();

        // Cập nhật lại bảng JTable sau khi sắp xếp
        DefaultTableModel model = (DefaultTableModel) textTable.getModel();
        model.setRowCount(0); // Xóa hết các hàng hiện tại

        ArrayList<Student> sortedStudents = studentModel.getStudents();
        for (Student student : sortedStudents) {
            tableMode.addRow(new Object[] { student.getId(), student.getName(), student.getAge(), student.getGpa() });
        }

	}
});
	mainFrame.setVisible(true);
	
}
public void saveToFile(String fileName) {
    try (FileWriter writer = new FileWriter(fileName)) {
        for (Student student : studentModel.getStudents()) {
            writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGpa() + "\n");
        }
        writer.flush();
        System.out.println("Dữ liệu đã được lưu vào tệp: " + fileName);
    } catch (IOException e) {
        System.out.println("Lỗi khi lưu dữ liệu vào tệp: " + e.getMessage());
    }
}

}
