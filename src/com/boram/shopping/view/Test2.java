package com.boram.shopping.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import java.awt.Font;

public class Test2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
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
	public Test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Button");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(14, 12, 103, 81);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Goudy Stout", Font.PLAIN, 11));
		btnNewButton_1.setBounds(131, 62, 168, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uBC84\uD2BC\uC774\uB2E4\u314E\u314E");
		btnNewButton_2.setFont(new Font("µ¸¿ò", Font.ITALIC, 15));
		btnNewButton_2.setBounds(204, 23, 154, 27);
		contentPane.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(26, 121, 139, 27);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(26, 169, 139, 27);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(166, 156, 139, 27);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JSlider slider = new JSlider();
		slider.setBounds(54, 215, 200, 26);
		contentPane.add(slider);
		
		setVisible(true);
	}
}
