package project12;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class SwingInFor {
	private JFrame frame;
	private JLabel labelProfession;
	private JCheckBox checkNewspaper, checkBook, checkMusic;
	private JRadioButton radiStudent, radiStudent2, radiEngineer;
	private JComboBox comboHappy;
	private JTextArea textArea;
	private JPanel panelInfor, panelHappy;
	public SwingInFor() {
		paperGui();
	}
public static void main(String[] args) {
	SwingInFor demo = new SwingInFor();
	demo.demoSwingInfor();
}
public void paperGui() {
	frame = new JFrame();
	frame.setTitle("Quản lí hoạt ");
	frame.setSize(450, 250);
	panelInfor = new JPanel();
	panelHappy = new JPanel();
	frame.add(panelInfor,BorderLayout.NORTH);
	frame.add(panelHappy,BorderLayout.SOUTH);
	panelInfor.setLayout(new BoxLayout(panelInfor, BoxLayout.Y_AXIS));
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
public void demoSwingInfor() {
	String rowStudent[] = {"Phân ban ","Không phân ban "};
	
	String rowStudent2[] = {"Kỹ thuật ","Xã hội "};
	String rowEngineer[] = {"Cơ khí ","CNTT"};
	JPanel panelChange = new JPanel();
	panelChange.setLayout(new GridLayout(4, 0));
	Dimension dime = new Dimension(250,30);
	Dimension dime1 = new Dimension(300,30);
	JPanel panelProfession = new JPanel();
	labelProfession = new JLabel("Nghề nghiệp ");
	DefaultComboBoxModel comboModel = new DefaultComboBoxModel<>(rowStudent);
	comboHappy = new JComboBox<>(comboModel);
	labelProfession.setPreferredSize(dime);
	panelProfession.add(labelProfession);
	panelProfession.add(comboHappy);
	panelChange.add(panelProfession);
	panelInfor.add(panelChange);
	JPanel panelRadiStudent = new JPanel();
	radiStudent = new JRadioButton("Học sinh ");
	checkNewspaper = new JCheckBox("Đọc báo  ");
	radiStudent.setPreferredSize(dime1);
	panelRadiStudent.add(radiStudent);
	panelRadiStudent.add(checkNewspaper);
	panelChange.add(panelRadiStudent); 
	JPanel panelRadiStudent2 = new JPanel();
	radiStudent2 = new JRadioButton("Sinh viên ");
	checkBook = new JCheckBox("Đọc sách ");
	radiStudent2.setPreferredSize(dime1);
	panelRadiStudent2.add(radiStudent2);
	panelRadiStudent2.add(checkBook);
	panelChange.add(panelRadiStudent2);
	JPanel panelRadiEngineer = new JPanel();
	radiEngineer = new JRadioButton("Kỹ sư ");
	checkMusic = new JCheckBox("Nghe nhạc ");
	radiEngineer.setPreferredSize(dime1);
	panelRadiEngineer.add(radiEngineer);
	panelRadiEngineer.add(checkMusic);
	panelChange.add(panelRadiEngineer);
	ButtonGroup gp = new ButtonGroup();
	gp.add(radiStudent);
	gp.add(radiStudent2);
	gp.add(radiEngineer);
	textArea = new JTextArea(2, 35);
	panelHappy.add(textArea);
	radiStudent2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 comboHappy.setModel(new DefaultComboBoxModel<>(rowStudent2));
		}
	});
	radiEngineer.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	comboHappy.setModel(new DefaultComboBoxModel<>(rowEngineer));		
		}
	});
radiStudent.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	comboHappy.setModel(new DefaultComboBoxModel<>(rowStudent));	
	
		}
	});
radiStudent.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		if (radiStudent.isSelected()) {
	        sb.append("Hoc Sinh ");
	        sb.append(comboHappy.getSelectedItem());
	        sb.append(" thich: ");

	        if (checkBook.isSelected()) {
	            sb.append(checkBook.getText());
	            sb.append(", ");
	        }
	        if (checkMusic.isSelected()) {
	            sb.append(checkMusic.getText());
	            sb.append(", ");
	        }
	        if (checkNewspaper.isSelected()) {
	            sb.append(checkNewspaper.getText());
	            sb.append(", ");
	        }

	        // Xóa dấu phẩy cuối cùng nếu có
	        if (sb.charAt(sb.length() - 1) == ',') {
	            sb.deleteCharAt(sb.length() - 1);
	        }
	}
		textArea.setText(sb.toString());
	}
	
});
radiStudent2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		if (radiStudent2.isSelected()) {
	        sb.append("Sinh vien ");
	        sb.append(comboHappy.getSelectedItem());
	        sb.append(" thich: ");

	        if (checkBook.isSelected()) {
	            sb.append(checkBook.getText());
	            sb.append(", ");
	        }
	        if (checkMusic.isSelected()) {
	            sb.append(checkMusic.getText());
	            sb.append(", ");
	        }
	        if (checkNewspaper.isSelected()) {
	            sb.append(checkNewspaper.getText());
	            sb.append(", ");
	        }

	      
	        if (sb.charAt(sb.length() - 1) == ',') {
	            sb.deleteCharAt(sb.length() - 1);
	        }
	}
		textArea.setText(sb.toString());
	}
});
radiEngineer.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		if (radiEngineer.isSelected()) {
	        sb.append("Ky su ");
	        sb.append(comboHappy.getSelectedItem());
	        sb.append(" thich: ");

	        if (checkBook.isSelected()) {
	            sb.append(checkBook.getText());
	            sb.append(", ");
	        }
	        if (checkMusic.isSelected()) {
	            sb.append(checkMusic.getText());
	            sb.append(", ");
	        }
	        if (checkNewspaper.isSelected()) {
	            sb.append(checkNewspaper.getText());
	            sb.append(", ");
	        }

	      
	        if (sb.charAt(sb.length() - 1) == ',') {
	            sb.deleteCharAt(sb.length() - 1);
	        }
	}
		textArea.setText(sb.toString());
	}
});
	frame.setVisible(true);
	
	
	
}

	
}


