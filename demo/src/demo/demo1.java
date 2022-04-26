package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class demo1 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	String name,div,gender;
	int num;
	
	private JLabel divlb;
	private JLabel genderlb;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo1 window = new demo1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public demo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel namelb = new JLabel("Name: ");
		namelb.setFont(new Font("Verdana", Font.PLAIN, 14));
		namelb.setBounds(22, 26, 77, 13);
		frame.getContentPane().add(namelb);
		
		JLabel rnlb = new JLabel("Roll.No: ");
		rnlb.setFont(new Font("Verdana", Font.PLAIN, 14));
		rnlb.setBounds(22, 64, 77, 13);
		frame.getContentPane().add(rnlb);
		
		tf1 = new JTextField();
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_SPACE)))
				{
					JOptionPane.showMessageDialog(tf1, "Only Alphabets");
					e.consume();
				}
				
			
			}
		});
		tf1.setBounds(98, 25, 96, 19);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_SPACE))) {
					JOptionPane.showMessageDialog(tf1, "Only Digits");
					e.consume();
		
		}	
			}});
		tf2.setBounds(98, 63, 96, 19);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton b1 = new JButton("Save");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = tf1.getText();
				num = Integer.parseInt(tf2.getText());
				
				
				Exp1 s1 = new Exp1(name,num,div,gender);
				
				frame.dispose();
			}
		});
		b1.setFont(new Font("Verdana", Font.PLAIN, 14));
		b1.setBounds(326, 218, 85, 21);
		frame.getContentPane().add(b1);
		
		divlb = new JLabel("Division: ");
		divlb.setFont(new Font("Verdana", Font.PLAIN, 14));
		divlb.setBounds(22, 108, 77, 13);
		frame.getContentPane().add(divlb);
		
		genderlb = new JLabel("Gender:");
		genderlb.setFont(new Font("Verdana", Font.PLAIN, 14));
		genderlb.setBounds(22, 150, 77, 13);
		frame.getContentPane().add(genderlb);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"A", "B"}));
		cb1.setFont(new Font("Verdana", Font.PLAIN, 14));
		cb1.setBounds(98, 106, 50, 21);
		frame.getContentPane().add(cb1);
		div = (String)cb1.getSelectedItem();
		
		JRadioButton rb1 = new JRadioButton("Male");
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Verdana", Font.PLAIN, 14));
		rb1.setBounds(98, 146, 103, 21);
		frame.getContentPane().add(rb1);
		gender = rb1.getActionCommand();
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Verdana", Font.PLAIN, 14));
		rb2.setBounds(98, 169, 103, 21);
		frame.getContentPane().add(rb2);
	}
}
