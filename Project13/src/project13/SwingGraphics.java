package project13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class SwingGraphics {
	private JFrame frame;
	private JButton buttonClear, buttonExit;
	private JRadioButton radiGreen, radiRed, radiYellow, radiFill, radiOutLine;
	private JMenuBar menuBar;
	private JMenu menuColor, menuPicture;
	private JMenuItem menuOval, menuRec, menuLine;
	private JPanel panelArea, panelInfor;
	private JLabel labelRed, labelBlack, labelWhile, labelYellow,labelBlue, labelGreen;
	private JTextArea textArea;
	public SwingGraphics() {
		papgerGui();
	}
public static void main(String[] args) {
	SwingGraphics demo = new SwingGraphics();
	demo.demoSwingGraphics();
}
public void papgerGui() {
	frame = new JFrame();
	frame.setTitle("Draw Paint");
	frame.setSize(700, 350);
	panelInfor = new JPanel();
	panelInfor.setLayout(new FlowLayout());
	panelArea = new JPanel();
	 frame.add(panelInfor, BorderLayout.NORTH);
	frame.add(panelArea);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
public void demoSwingGraphics() {
	menuBar = new JMenuBar();
	menuPicture = new JMenu("Hinh");
	menuColor = new JMenu("Mau");
	menuBar.add(menuPicture);
	menuBar.add(menuColor);
	frame.setJMenuBar(menuBar);
	menuOval = new JMenuItem("Oval");
	menuRec = new JMenuItem("Rec");
	menuLine = new JMenuItem("Line");
	menuPicture.add(menuOval);
	menuPicture.addSeparator();
	menuPicture.add(menuRec);
	menuPicture.addSeparator();
	menuPicture.add(menuLine);
	JPanel panelTool = new JPanel();
	panelTool.setLayout(new FlowLayout());
	panelTool.setLayout(new GridLayout(0, 2));
	JPanel panelToolChange = new JPanel();
	panelToolChange.setLayout(new FlowLayout());
	TitledBorder titleBorder = new TitledBorder("Tool");
	panelTool.setBorder(titleBorder);
	radiGreen = new JRadioButton("Green");
	radiRed = new JRadioButton("Red");
	radiYellow = new JRadioButton("Yellow");
	ButtonGroup bg = new ButtonGroup();
	bg.add(radiGreen);
	bg.add(radiRed);
	bg.add(radiYellow);
	panelToolChange.add(radiGreen);
	panelToolChange.add(radiRed);
	panelToolChange.add(radiYellow);
	panelTool.add(panelToolChange);
	JPanel panelSecle = new JPanel();
	TitledBorder titleSeclec = new TitledBorder("Select Type");
	panelSecle.setBorder(titleSeclec);
	radiFill = new JRadioButton("Fill");
	radiOutLine = new JRadioButton("Out Line");
	bg.add(radiFill);
	bg.add(radiOutLine);
	panelSecle.add(radiFill);
	panelSecle.add(radiOutLine);
	JPanel panelSecleChange = new JPanel();
	panelSecleChange.add(panelSecle);
	panelTool.add(panelSecleChange);
	panelInfor.add(panelTool);
	TitledBorder titleColor = new TitledBorder("Color");
	JPanel panelColor = new JPanel();
	panelColor.setBorder(titleColor);
	labelRed = new JLabel(new ImageIcon("Hopstarter-Soft-Scraps-Button-Blank-Red.24"));
	labelWhile = new JLabel("Trang");
	labelBlue = new JLabel("Xanh");
	labelYellow = new JLabel("Vang");
	labelBlack = new JLabel("Den");
	labelGreen = new JLabel("Xanh Le");
	JPanel panelColorTemp = new JPanel();
	panelColorTemp.setLayout(new GridLayout(3, 3));
	panelColorTemp.add(labelBlack);
	panelColorTemp.add(labelBlue);
	panelColorTemp.add(labelGreen);
	panelColorTemp.add(labelWhile);
	panelColorTemp.add(labelYellow);
	panelColorTemp.add(labelRed);
	panelColor.add(panelColorTemp);
	JPanel panelColorChange = new JPanel();
	panelColorChange.add(panelColor);
	panelInfor.add(panelColorChange);
	JPanel panelButton = new JPanel();
	panelButton.setLayout(new GridLayout(2, 0));
	buttonClear = new JButton("Clear");
	buttonExit = new JButton("Exit");
	panelButton.add(buttonClear);
	panelButton.add(buttonExit);
	JPanel panelButton1 = new JPanel();
	panelButton1.add(panelButton);
	panelInfor.add(panelButton1);
	textArea = new JTextArea(12, 57);
	panelArea.add(textArea);
	buttonExit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	
	frame.setVisible(true);
}
}
