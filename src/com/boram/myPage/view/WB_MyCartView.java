package com.boram.myPage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WB_MyCartView extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB_MyCartView frame = new WB_MyCartView();
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
	public WB_MyCartView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 708);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 788, 104);
		getContentPane().add(panel);

		JLabel lblMyCart = new JLabel("My Cart");
		panel.add(lblMyCart);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 102, 174, 559);
		getContentPane().add(panel_1);

		JButton btnNewButton = new JButton("ID \uC218\uC815");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("PW 수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_2);

		JButton button = new JButton("phone 수정");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button);

		JButton button_1 = new JButton("주소수정");
		panel_1.add(button_1);

		JButton button_2 = new JButton("이메일 수정");
		panel_1.add(button_2);

		JButton button_3 = new JButton("나이 수정");
		panel_1.add(button_3);

		JButton button_5 = new JButton("이전 메뉴로");
		panel_1.add(button_5);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(778, 651, -559, -547);
		getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
	}
}
