package com.java.MiniProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displayBox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQueueDataStructure = new JLabel("QUEUE DATA STRUCTURE");
		lblQueueDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		lblQueueDataStructure.setForeground(new Color(255, 0, 0));
		lblQueueDataStructure.setFont(new Font("Constantia", Font.BOLD, 15));
		lblQueueDataStructure.setBounds(427, 10, 260, 53);
		contentPane.add(lblQueueDataStructure);

		JLabel lblEnterTheQueue = new JLabel("ENTER THE QUEUE LENGTH");
		lblEnterTheQueue.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheQueue.setForeground(new Color(64, 0, 0));
		lblEnterTheQueue.setFont(new Font("Constantia", Font.BOLD, 15));
		lblEnterTheQueue.setBounds(230, 79, 223, 38);
		contentPane.add(lblEnterTheQueue);

		length = new JTextField();
		length.setColumns(10);
		length.setBounds(476, 79, 175, 38);
		contentPane.add(length);

		JButton btnCreateQueue = new JButton("CREATE QUEUE");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create queue
				size=Integer.valueOf(length.getText());
				q= new int[size];
				String msg="Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane,msg);
			}
		});
		btnCreateQueue.setForeground(new Color(0, 0, 255));
		btnCreateQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateQueue.setBounds(459, 138, 203, 53);
		contentPane.add(btnCreateQueue);

		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(187, 199, 240, 68);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.PLAIN, 10));
		element.setColumns(10);
		element.setBounds(437, 218, 203, 28);
		contentPane.add(element);

		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
					element.setText("");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Insertion Successful");
					element.setText("");
				}

			}
		});
		btnInsert.setForeground(new Color(0, 128, 0));
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(669, 209, 101, 48);
		contentPane.add(btnInsert);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane,"Deletetion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+q[f]);

					++f;
				}
			}
		});
		btnDelete.setForeground(new Color(0, 0, 64));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(476, 285, 141, 48);
		contentPane.add(btnDelete);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String msg="";
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else {
					for(int i=f;i<=r;i++) {
						msg+=" "+q[i];

					}
					displayBox.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 64));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(476, 343, 141, 62);
		contentPane.add(btnDisplay);

		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setForeground(Color.BLACK);
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(255, 128, 128));
		displayBox.setBounds(297, 417, 509, 48);
		contentPane.add(displayBox);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnHome.setForeground(new Color(0, 0, 64));
		btnHome.setFont(new Font("Constantia", Font.BOLD, 14));
		btnHome.setBounds(476, 527, 141, 62);
		contentPane.add(btnHome);
	}
}
