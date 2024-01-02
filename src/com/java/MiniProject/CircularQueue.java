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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displayBox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 762);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCircularQueueData = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblCircularQueueData.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircularQueueData.setForeground(Color.RED);
		lblCircularQueueData.setFont(new Font("Constantia", Font.BOLD, 15));
		lblCircularQueueData.setBounds(466, 60, 260, 53);
		contentPane.add(lblCircularQueueData);

		JLabel lblEnterTheCircular = new JLabel("ENTER THE CIRCULAR QUEUE LENGTH");
		lblEnterTheCircular.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheCircular.setForeground(new Color(64, 0, 0));
		lblEnterTheCircular.setFont(new Font("Constantia", Font.BOLD, 15));
		lblEnterTheCircular.setBounds(269, 129, 223, 38);
		contentPane.add(lblEnterTheCircular);

		length = new JTextField();
		length.setColumns(10);
		length.setBounds(515, 129, 175, 38);
		contentPane.add(length);

		JButton btnCreateCircularQueue = new JButton("CREATE CIRCULAR QUEUE");
		btnCreateCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create circular queue
				size=Integer.valueOf(length.getText());
				cq= new int[size];
				JOptionPane.showMessageDialog(contentPane, "Circular Queue of size "+size+" Created");
			}
		});
		btnCreateCircularQueue.setForeground(Color.BLUE);
		btnCreateCircularQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		btnCreateCircularQueue.setBounds(466, 186, 253, 53);
		contentPane.add(btnCreateCircularQueue);

		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(226, 249, 240, 68);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.PLAIN, 10));
		element.setColumns(10);
		element.setBounds(476, 268, 203, 28);
		contentPane.add(element);

		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert element
				int elem;
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					element.setText("");
				}
				else {
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful");
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(0, 128, 0));
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(708, 259, 101, 48);
		contentPane.add(btnInsert);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Deletetion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+cq[f]);
					f=(f+1)%size;
					count--;
				}
			}
		});
		btnDelete.setForeground(new Color(0, 0, 64));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(515, 335, 141, 48);
		contentPane.add(btnDelete);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=1;i<=count;i++) {
						msg+=" "+cq[f];

						f=(f+1)%size;
					}
					displayBox.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 64));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(515, 393, 141, 62);
		contentPane.add(btnDisplay);

		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setForeground(Color.BLACK);
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(255, 128, 128));
		displayBox.setBounds(336, 467, 509, 48);
		contentPane.add(displayBox);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnHome.setForeground(new Color(0, 0, 64));
		btnHome.setFont(new Font("Constantia", Font.BOLD, 14));
		btnHome.setBounds(515, 555, 141, 62);
		contentPane.add(btnHome);
	}
}
