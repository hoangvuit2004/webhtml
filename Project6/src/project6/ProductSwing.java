package project6;

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

public class ProductSwing {
private JFrame frame;
private JButton buttonAdd, buttonDelete, buttonSort;
private JTable tableArea;
private JTextArea textArea;
private JPanel panelInfor, panelArea, panelButton;
private JTextField textId, textName, textPrice, textQuantity;
JLabel labelId, labelName, labelPrice, labelQuantity;
private ProductModel listProduct;
public ProductSwing() {
	paperGui();
}
public static void main(String[] args) {
	ProductSwing productMode = new ProductSwing();
	productMode.demoShowSwingProduct();
}
public void paperGui() {
	frame= new JFrame();
	frame.setTitle("Quan Li Cua Hang");
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
public void demoShowSwingProduct() {
	JPanel panelChange = new JPanel();
	panelChange.setLayout(new GridLayout(4, 2));
	Dimension dime = new Dimension(80, 20);
	labelId = new JLabel("ID: ");
	labelName = new JLabel("Name: ");
	labelPrice = new JLabel("Price: ");
	labelQuantity = new JLabel("Quantity: ");
	textId = new JTextField(25);
	textName = new JTextField(25);
	textPrice = new JTextField(25);
	textQuantity = new JTextField(25);
	JPanel panelId = new JPanel();
	labelId.setPreferredSize(dime);
	panelId.add(labelId);
	panelId.add(textId);
	panelChange.add(panelId);
	labelName.setPreferredSize(dime);
	JPanel panelName = new JPanel();
	panelName.add(labelName);
	panelName.add(textName);
	panelChange.add(panelName);
	JPanel panelPrice = new JPanel();
	labelPrice.setPreferredSize(dime);
	panelPrice.add(labelPrice);
	panelPrice.add(textPrice);
	panelChange.add(panelPrice);
	labelQuantity.setPreferredSize(dime);
	JPanel panelQuantity = new JPanel();
	panelQuantity.add(labelQuantity);
	panelQuantity.add(textQuantity);
	panelChange.add(panelQuantity);
	panelInfor.add(panelChange);
	textArea = new JTextArea(16, 40);
	textArea.setLayout(new GridLayout());
	panelArea.add(textArea);
	listProduct = new ProductModel();
	String []row = {"ID","Name","Price","Quantity","Total"};
	DefaultTableModel tableModel = new DefaultTableModel(row, 0);
	for(Product pro  : listProduct.getProduct()) {
		Object []row1 = {pro.getId(),pro.getName(),pro.getPrice(), pro.getQuantity(), pro.getTotalValue()};
		tableModel.addRow(row1);
	}
	tableArea = new JTable(tableModel);
	JScrollPane panelMode = new JScrollPane(tableArea);
	textArea.add(panelMode);
	JPanel panelTempButton = new JPanel();
	buttonAdd = new JButton("Add");
	buttonSort = new JButton("Sort");
	buttonDelete = new JButton("Delete");
	panelTempButton.setLayout(new FlowLayout());
	panelTempButton.add(buttonAdd);
	panelTempButton.add(buttonSort);
	panelTempButton.add(buttonDelete);
	panelButton.add(panelTempButton);
	buttonAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	      String id = textId.getText();
	      String name = textName.getText();
	      double price = Double.parseDouble(textPrice.getText());
	      int quantity = Integer.parseInt(textQuantity.getText());
	      Product product = new Product(id, name, price, quantity);
	      listProduct.addProduct(product);
	      DefaultTableModel tableModel = (DefaultTableModel)tableArea.getModel();
	      tableModel.setRowCount(0);
	      for (Product pro : listProduct.getProduct()) {
			Object [] row1  = {pro.getId(), pro.getName(), pro.getPrice(), pro.getQuantity(), pro.getTotalValue()};
			tableModel.addRow(row1);
		}
		}
	});
	buttonSort.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	      listProduct.sortProduct();
	      DefaultTableModel tableModel = (DefaultTableModel)tableArea.getModel();
	      tableModel.setRowCount(0);
	      for (Product pro : listProduct.getProduct()) {
			Object [] row1  = {pro.getId(), pro.getName(), pro.getPrice(), pro.getQuantity(), pro.getTotalValue()};
			tableModel.addRow(row1);
		}
		
		}
	});
	buttonDelete.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	    String id = textId.getText();
	    listProduct.removeProduct(id);
	    DefaultTableModel tableModel = (DefaultTableModel)tableArea.getModel();
	      tableModel.setRowCount(0);
	      for (Product pro : listProduct.getProduct()) {
			Object [] row1  = {pro.getId(), pro.getName(), pro.getPrice(), pro.getQuantity(), pro.getTotalValue()};
			tableModel.addRow(row1);
		}
		}
	});
	frame.setVisible(true);
	
	
	
}
}
