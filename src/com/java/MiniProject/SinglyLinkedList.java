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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertrear;
	private JTextField displayBox;
	private JTextField insertfront;
	class Node{
		Node link;
		int data;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(198, 129, 240, 68);
		contentPane.add(lblNewLabel_1);
		
		insertrear = new JTextField();
		insertrear.setFont(new Font("Tahoma", Font.PLAIN, 10));
		insertrear.setColumns(10);
		insertrear.setBounds(448, 148, 203, 28);
		contentPane.add(insertrear);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertRear
				Node temp;
				int elem=Integer.valueOf(insertrear.getText());
				Node newnode=new Node();

				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion At Rear Succesful" );
					insertrear.setText("");
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion At Rear Succesful" );
					insertrear.setText("");

				}

			}
		});
		btnInsertRear.setForeground(new Color(0, 128, 0));
		btnInsertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertRear.setBounds(687, 139, 141, 48);
		contentPane.add(btnInsertRear);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				Node temp;

				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display not poossible" );
				}
				else if(first.link==null) {
					msg+=" "+first.data;
				  displayBox.setText(msg);
				  
					first=null;
				}
				else {
					temp=first;
					while(temp!=null) {
						msg+=" "+temp.data;
						temp=temp.link;
					}
				}
				 displayBox.setText(msg);
				
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 64));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(478, 432, 141, 62);
		contentPane.add(btnDisplay);
		
		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setForeground(Color.BLACK);
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(255, 128, 128));
		displayBox.setBounds(300, 518, 509, 48);
		contentPane.add(displayBox);
		
		JLabel lblSinglylinkedlistDataStructure = new JLabel("SINGLYLINKEDLIST DATA STRUCTURE");
		lblSinglylinkedlistDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinglylinkedlistDataStructure.setForeground(Color.RED);
		lblSinglylinkedlistDataStructure.setFont(new Font("Constantia", Font.BOLD, 15));
		lblSinglylinkedlistDataStructure.setBounds(333, 33, 413, 53);
		contentPane.add(lblSinglylinkedlistDataStructure);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(198, 207, 240, 68);
		contentPane.add(lblNewLabel_1_1);
		
		insertfront = new JTextField();
		insertfront.setFont(new Font("Tahoma", Font.PLAIN, 10));
		insertfront.setColumns(10);
		insertfront.setBounds(448, 226, 203, 28);
		contentPane.add(insertfront);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertfront
				int elem=Integer.valueOf(insertfront.getText());
				Node newnode=new Node();

				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion At Front Succesful" );
					insertfront.setText("");
				}
				else {
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion At Front Succesful" );
					insertfront.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(0, 128, 0));
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBounds(687, 217, 141, 48);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Deleterear
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Delete not poossible" );
					
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,"Element deleted from rear is :"+first.data );
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane,"Element deleted from rear is : "+temp.link.data );
				
					temp.link=null;

				}

			}
		});
		btnDeleteRear.setForeground(new Color(0, 128, 0));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(478, 316, 141, 48);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletefront
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Delete not poossible" );
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,"Element deleted from front is :"+first.data );
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Element deleted from front  is : "+first.data );
					first=first.link;
				}
			}
		});
		btnDeleteFront.setForeground(new Color(0, 128, 0));
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(478, 374, 141, 48);
		contentPane.add(btnDeleteFront);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
			
		});
		btnHome.setForeground(new Color(0, 0, 64));
		btnHome.setFont(new Font("Constantia", Font.BOLD, 14));
		btnHome.setBounds(478, 595, 141, 62);
		contentPane.add(btnHome);
	}
}
