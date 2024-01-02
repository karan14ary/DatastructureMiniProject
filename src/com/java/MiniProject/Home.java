package com.java.MiniProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 252, 131));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbLCHOOSEADATASTRUCTURE = new JLabel("CHOOSE A DATASTRUCTURE");
		lbLCHOOSEADATASTRUCTURE.setHorizontalAlignment(SwingConstants.CENTER);
		lbLCHOOSEADATASTRUCTURE.setForeground(new Color(255, 0, 0));
		lbLCHOOSEADATASTRUCTURE.setFont(new Font("Algerian", Font.BOLD, 14));
		lbLCHOOSEADATASTRUCTURE.setBounds(196, 10, 222, 41);
		contentPane.add(lbLCHOOSEADATASTRUCTURE);

		JButton btnARRAY = new JButton("ARRAY");
		btnARRAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Array window opening page
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		btnARRAY.setForeground(new Color(0, 0, 255));
		btnARRAY.setFont(new Font("Constantia", Font.BOLD, 12));
		btnARRAY.setBounds(240, 50, 99, 41);
		contentPane.add(btnARRAY);

		JButton btnSTACK = new JButton("STACK");
		btnSTACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		btnSTACK.setForeground(new Color(255, 128, 64));
		btnSTACK.setFont(new Font("Constantia", Font.BOLD, 12));
		btnSTACK.setBounds(101, 117, 106, 41);
		contentPane.add(btnSTACK);

		JButton btnQUEUE = new JButton("QUEUE");
		btnQUEUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		btnQUEUE.setForeground(new Color(255, 0, 255));
		btnQUEUE.setFont(new Font("Constantia", Font.BOLD, 12));
		btnQUEUE.setBounds(351, 117, 99, 41);
		contentPane.add(btnQUEUE);

		JButton btnSLL = new JButton("SINGLYLINKEDLIST");
		btnSLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SinglyLinkedList().setVisible(true);
			}
		});
		btnSLL.setForeground(new Color(0, 64, 0));
		btnSLL.setFont(new Font("Constantia", Font.BOLD, 12));
		btnSLL.setBounds(336, 183, 169, 49);
		contentPane.add(btnSLL);

		JButton btnDoublylinkedlist = new JButton("DOUBLYLINKEDLIST");
		btnDoublylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DoublyLinkedList().setVisible(true);
			}
		});
		btnDoublylinkedlist.setForeground(new Color(64, 0, 0));
		btnDoublylinkedlist.setFont(new Font("Constantia", Font.BOLD, 12));
		btnDoublylinkedlist.setBounds(196, 265, 176, 54);
		contentPane.add(btnDoublylinkedlist);

		JButton btnCircularqueue = new JButton("CIRCULARQUEUE");
		btnCircularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		btnCircularqueue.setForeground(new Color(64, 0, 64));
		btnCircularqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		btnCircularqueue.setBounds(89, 183, 169, 49);
		contentPane.add(btnCircularqueue);
	}
}
