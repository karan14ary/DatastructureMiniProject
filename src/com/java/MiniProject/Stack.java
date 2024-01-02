package com.java.MiniProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int []s;
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStack = new JLabel("STACK DATA STRUCTURE");
		lblStack.setForeground(new Color(0, 128, 255));
		lblStack.setHorizontalAlignment(SwingConstants.CENTER);
		lblStack.setFont(new Font("Constantia", Font.BOLD, 15));
		lblStack.setBounds(334, 10, 260, 37);
		contentPane.add(lblStack);

		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK LENGTH");
		lblEnterTheStack.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheStack.setForeground(Color.RED);
		lblEnterTheStack.setFont(new Font("Constantia", Font.BOLD, 15));
		lblEnterTheStack.setBounds(137, 79, 223, 38);
		contentPane.add(lblEnterTheStack);

		length = new JTextField();
		length.setColumns(10);
		length.setBounds(383, 79, 175, 38);
		contentPane.add(length);

		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create Stack
				size=Integer.valueOf(length.getText());
				s=new int[size];
				String msg="Stack of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, msg);


			}
		});
		btnCreateStack.setForeground(new Color(0, 0, 64));
		btnCreateStack.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateStack.setBounds(338, 144, 203, 53);
		contentPane.add(btnCreateStack);

		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(54, 197, 240, 68);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.PLAIN, 10));
		element.setColumns(10);
		element.setBounds(304, 216, 203, 28);
		contentPane.add(element);

		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	push element
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane,"Push not possible" );
				}
				else {	
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push Successful");
					element.setText("");
				}
			}
		});
		btnPush.setForeground(new Color(0, 128, 0));
		btnPush.setFont(new Font("Constantia", Font.BOLD, 14));
		btnPush.setBounds(536, 207, 101, 48);
		contentPane.add(btnPush);

		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pop Element
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane,"Pop not possible" );

				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+s[top] );

					--top;
				}
			}
		});
		btnPop.setForeground(new Color(0, 0, 64));
		btnPop.setFont(new Font("Constantia", Font.BOLD, 14));
		btnPop.setBounds(383, 283, 141, 48);
		contentPane.add(btnPop);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display element
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane,"Display not possible" );
				}
				else {
					for(int i=top;i>=0;i--) {
						msg+=" "+s[i];
					}
					displaybox.setText(msg);
				}

			}
		});
		btnDisplay.setForeground(new Color(0, 0, 64));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(383, 341, 141, 62);
		contentPane.add(btnDisplay);

		displaybox = new JTextField();
		displaybox.setHorizontalAlignment(SwingConstants.CENTER);
		displaybox.setForeground(Color.BLACK);
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(128, 255, 128));
		displaybox.setBounds(192, 434, 509, 62);
		contentPane.add(displaybox);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnHome.setForeground(new Color(0, 0, 64));
		btnHome.setFont(new Font("Constantia", Font.BOLD, 14));
		btnHome.setBounds(383, 522, 141, 62);
		contentPane.add(btnHome);


	}
}
