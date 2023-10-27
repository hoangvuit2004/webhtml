package project7;

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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class ContactSwing {
private JFrame frame;
private JButton buttonAdd, buttonSort, buttonSearch, buttonDelete;
private JLabel labelName, labelPhone, labelEmail;
private JTextField textName, textPhone, textEmail;
private JPanel panelInfor, panelArea, panelButton;
private JTextArea textArea;
private JTable tableArea;
private ContactModel listContact;
public ContactSwing() {
	paperGui();
}
public static void main(String[] args) {
	ContactSwing contact = new ContactSwing();
	contact.demoShowSwing();
}
public void paperGui() {
	frame= new JFrame();
	frame.setTitle("Quan Li Nhan Su ");
	frame.setSize(500, 500);
	panelInfor = new JPanel();
	panelInfor.setLayout(new BoxLayout(panelInfor, BoxLayout.Y_AXIS));
	panelArea = new JPanel();
	panelButton = new JPanel();
	frame.add(panelInfor,BorderLayout.NORTH);
	frame.add(panelArea, BorderLayout.CENTER);
	frame.add(panelButton,BorderLayout.SOUTH);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	
}
public void demoShowSwing() {
	JPanel panelForm = new JPanel();
	panelForm.setLayout(new GridLayout(3,2));
	Dimension dime = new Dimension(80, 20);
	labelName = new JLabel("Name: ");
	labelPhone = new JLabel("Phone: ");
	labelEmail = new JLabel("Email: ");
	textName = new JTextField(25);
	textPhone = new JTextField(25);
	textEmail = new JTextField(25);
	JPanel panelName = new JPanel();
	labelName.setPreferredSize(dime);
	panelName.add(labelName);
	panelName.add(textName);
	panelForm.add(panelName);
	labelPhone.setPreferredSize(dime);
	JPanel panelPhone = new JPanel();
	panelPhone.add(labelPhone);
	panelPhone.add(textPhone);
	panelForm.add(panelPhone);
	labelEmail.setPreferredSize(dime);
	JPanel panelEmail = new JPanel();
	panelEmail.add(labelEmail);
	panelEmail.add(textEmail);
	panelForm.add(panelEmail);
	panelInfor.add(panelForm);
	listContact = new ContactModel();
	textArea = new JTextArea(19, 39);
	textArea.setLayout(new GridLayout());
	String []row = {"Name","Phone","Email"};
	DefaultTableModel tableModel = new DefaultTableModel(row, 0);
	for (Contact contact : listContact.getContact()) {
		Object [] row1 = {contact.getName(), contact.getPhone(), contact.getEmail()};
		tableModel.addRow(row1);
	}
	tableArea = new JTable(tableModel);
	JScrollPane paneScroll = new JScrollPane(tableArea);
	textArea.add(paneScroll);
     panelArea.add(textArea);
     buttonAdd = new JButton("Add");
     buttonDelete = new JButton("Delete");
     buttonSearch = new JButton("Search");
     buttonSort = new JButton("Sort");
     JPanel panelChangeButton = new JPanel();
     panelChangeButton.setLayout(new FlowLayout());
     panelChangeButton.add(buttonAdd);
     panelChangeButton.add(buttonSearch);
     panelChangeButton.add(buttonSort);
     panelChangeButton.add(buttonDelete);
     panelButton.add(panelChangeButton);
     buttonAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	    String id = textName.getText();
	    String phone = textPhone.getText();
	    String email = textEmail.getText();
	    Contact contact = new Contact(id, phone, email);
	    listContact.addContact(contact);
	    DefaultTableModel tableMode = (DefaultTableModel)tableArea.getModel();
	    tableMode.setRowCount(0);
	    for (Contact contact1 : listContact.getContact()) {
			Object [] row1 = {contact1.getName(), contact1.getPhone(), contact1.getEmail()};
			tableMode.addRow(row1);
		}
		}
	});
     buttonSort.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	 listContact.sortContact();
	 DefaultTableModel tableMode = (DefaultTableModel)tableArea.getModel();
	    tableMode.setRowCount(0);
	    for (Contact contact1 : listContact.getContact()) {
			Object [] row1 = {contact1.getName(), contact1.getPhone(), contact1.getEmail()};
			tableMode.addRow(row1);
		}
		}
	});
     buttonSearch.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 String id = textName.getText();
			    String phone = textPhone.getText();
			   
			    DefaultTableModel tableMode = (DefaultTableModel)tableArea.getModel();
			    tableMode.setRowCount(0);
			  Contact contact1 = listContact.searchContact(id, phone);
				Object [] row1 = {contact1.getName(), contact1.getPhone(), contact1.getEmail()};
				tableMode.addRow(row1);

		}
	});
	frame.setVisible(true);
}
}
