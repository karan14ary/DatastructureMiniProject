package com.java.MiniProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField deleteposition;
	private JTextField Displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 728);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblArray = new JLabel("ARRAY DATA STRUCTURE");
		lblArray.setHorizontalAlignment(SwingConstants.CENTER);
		lblArray.setBounds(298, 10, 223, 38);
		lblArray.setForeground(new Color(0, 0, 255));
		lblArray.setFont(new Font("Constantia", Font.BOLD, 15));
		contentPane.add(lblArray);

		JLabel lblNewLabel = new JLabel("ENTER THE ARRAY LENGTH");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(214, 106, 223, 38);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 15));
		contentPane.add(lblNewLabel);

		length = new JTextField();
		length.setBounds(469, 106, 175, 38);
		contentPane.add(length);
		length.setColumns(10);

		JButton btnCREATE = new JButton("CREATE ARRAY");
		btnCREATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				//String len=length.getText();
				//int l=Integer.valueOf(len);
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCREATE.setBounds(357, 173, 203, 53);
		btnCREATE.setForeground(new Color(0, 0, 64));
		btnCREATE.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(btnCREATE);

		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(34, 232, 240, 68);
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 64, 64));
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setBounds(281, 250, 203, 28);
		element.setFont(new Font("Tahoma", Font.PLAIN, 10));
		element.setColumns(10);
		contentPane.add(element);

		JButton btnINSERT = new JButton("INSERT");
		btnINSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int  pos=Integer.valueOf(position.getText());
				arr[pos]=elem;
				String message="Element "+elem+" Inserted @ position "+pos ;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				position.setText("");

			}
		});
		btnINSERT.setBounds(706, 232, 101, 48);
		btnINSERT.setForeground(new Color(0, 128, 0));
		btnINSERT.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(btnINSERT);

		JLabel lblPOSITION = new JLabel("POSITION");
		lblPOSITION.setHorizontalAlignment(SwingConstants.CENTER);
		lblPOSITION.setForeground(new Color(64, 0, 64));
		lblPOSITION.setFont(new Font("Constantia", Font.BOLD, 14));
		lblPOSITION.setBounds(494, 252, 96, 28);
		contentPane.add(lblPOSITION);

		position = new JTextField();
		position.setFont(new Font("Tahoma", Font.PLAIN, 10));
		position.setColumns(10);
		position.setBounds(588, 247, 96, 27);
		contentPane.add(position);

		JLabel lblDELETEPOSITION = new JLabel("DELETE POSITION");
		lblDELETEPOSITION.setHorizontalAlignment(SwingConstants.CENTER);
		lblDELETEPOSITION.setForeground(new Color(0, 64, 0));
		lblDELETEPOSITION.setFont(new Font("Constantia", Font.BOLD, 14));
		lblDELETEPOSITION.setBounds(212, 310, 147, 53);
		contentPane.add(lblDELETEPOSITION);

		deleteposition = new JTextField();
		deleteposition.setFont(new Font("Tahoma", Font.PLAIN, 10));
		deleteposition.setColumns(10);
		deleteposition.setBounds(390, 316, 101, 38);
		contentPane.add(deleteposition);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int  pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Elemet Deleted @ position "+pos ;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		btnDelete.setForeground(new Color(0, 0, 64));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(532, 317, 112, 38);
		contentPane.add(btnDelete);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for dispaly
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg+=" "+arr[i];
				}
				Displaybox.setText(msg);

			}
		});
		btnDisplay.setForeground(new Color(0, 0, 64));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(390, 398, 141, 62);
		contentPane.add(btnDisplay);

		Displaybox = new JTextField();
		Displaybox.setBackground(new Color(128, 255, 128));
		Displaybox.setForeground(new Color(0, 0, 0));
		Displaybox.setHorizontalAlignment(SwingConstants.CENTER);
		Displaybox.setBounds(215, 497, 509, 62);
		contentPane.add(Displaybox);
		Displaybox.setColumns(10);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnHome.setForeground(new Color(0, 0, 64));
		btnHome.setFont(new Font("Constantia", Font.BOLD, 14));
		btnHome.setBounds(403, 582, 141, 62);
		contentPane.add(btnHome);

	}
}
