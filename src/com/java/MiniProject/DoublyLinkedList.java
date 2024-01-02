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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertrear;
	private JTextField insertfront;
	private JTextField displayBox;
	class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublylinkedlistDataStructure = new JLabel("DOUBLYLINKEDLIST DATA STRUCTURE");
		lblDoublylinkedlistDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoublylinkedlistDataStructure.setForeground(Color.RED);
		lblDoublylinkedlistDataStructure.setFont(new Font("Constantia", Font.BOLD, 15));
		lblDoublylinkedlistDataStructure.setBounds(329, 10, 413, 53);
		contentPane.add(lblDoublylinkedlistDataStructure);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(194, 106, 240, 68);
		contentPane.add(lblNewLabel_1);
		
		insertrear = new JTextField();
		insertrear.setFont(new Font("Tahoma", Font.PLAIN, 10));
		insertrear.setColumns(10);
		insertrear.setBounds(444, 125, 203, 28);
		contentPane.add(insertrear);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem=Integer.valueOf(insertrear.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Inserted At the rear end");
					insertrear.setText("");
				}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "Inserted At the rear end");
					insertrear.setText("");
				}
			}
		});
		btnInsertRear.setForeground(new Color(0, 128, 0));
		btnInsertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertRear.setBounds(683, 116, 141, 48);
		contentPane.add(btnInsertRear);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front
				int elem=Integer.valueOf(insertfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Inserted At the front ");
					insertfront.setText("");
				}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Inserted At the front");
					insertfront.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(0, 128, 0));
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBounds(683, 194, 141, 48);
		contentPane.add(btnInsertFront);
		
		insertfront = new JTextField();
		insertfront.setFont(new Font("Tahoma", Font.PLAIN, 10));
		insertfront.setColumns(10);
		insertfront.setBounds(444, 203, 203, 28);
		contentPane.add(insertfront);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 64, 64));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(194, 184, 240, 68);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
			
				
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane,"Element deleted from rear is :"+first.data);
					first=null;
				}
				else {
					temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane,"Element deleted from rear is :"+temp.nextlink.data);
				
					temp.nextlink=null;
				}
			}
		});
		btnDeleteRear.setForeground(new Color(0, 128, 0));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(454, 255, 163, 48);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletefront
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				
			
				}
				if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane,"Element deleted from front is :"+first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Element deleted from front is :"+first.data);
					first=first.nextlink;
					first.prelink=null;
				
				}
			}
		});
		btnDeleteFront.setForeground(new Color(0, 128, 0));
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(444, 321, 173, 48);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward
				String msg="";
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
					
				}
				else if(first.nextlink==null) {
					msg+=" "+first.data;
					displayBox.setText(msg);
				}
				else {
					temp=first;
					while(temp !=null) {
						msg+=" "+temp.data;
						
						temp=temp.nextlink;
					}
				}
				displayBox.setText(msg);
			}
		});
		btnDisplayForward.setForeground(new Color(128, 0, 0));
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayForward.setBounds(442, 379, 173, 62);
		contentPane.add(btnDisplayForward);
		
		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setForeground(Color.BLACK);
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(255, 128, 128));
		displayBox.setBounds(304, 555, 509, 48);
		contentPane.add(displayBox);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display reverse
				String msg="";
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
					 
				}
				else if(first.nextlink==null) {
					msg+=" "+first.data;
					displayBox.setText(msg);
					
				}
				else {
					temp=first;
					while(temp.nextlink !=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						msg+=" "+temp.data;
						temp=temp.prelink;
					}
				}

				displayBox.setText(msg);
			}
		});
		btnDisplayReverse.setForeground(new Color(0, 0, 64));
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayReverse.setBounds(444, 464, 173, 62);
		contentPane.add(btnDisplayReverse);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnHome.setForeground(new Color(0, 0, 64));
		btnHome.setFont(new Font("Constantia", Font.BOLD, 14));
		btnHome.setBounds(476, 624, 141, 62);
		contentPane.add(btnHome);
	}

}
