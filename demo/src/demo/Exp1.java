package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exp1 {

	private JFrame frame;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Exp1 window = new Exp1();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Exp1(String name,int num,String div,String gender) {
		initialize(name,num,div,gender);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name,int num,String div,String gender) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setBounds(28, 61, 96, 19);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		tf3.setText(name);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setBounds(164, 61, 96, 19);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		tf4.setText(String.valueOf(num));
		
		
		JButton b2 = new JButton("Close");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		b2.setFont(new Font("Verdana", Font.PLAIN, 14));
		b2.setBounds(325, 214, 85, 21);
		frame.getContentPane().add(b2);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setBounds(28, 103, 96, 19);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		tf5.setText(div);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setBounds(164, 103, 96, 19);
		frame.getContentPane().add(tf6);
		tf6.setColumns(10);
		tf6.setText(gender);
		
		frame.setVisible(true);
	}

}
