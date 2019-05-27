package com.boram.myPage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class WB_MyCart extends JFrame {
	public static final int FWID = 718;
	public static final int FHIT = 500;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB_MyCart frame = new WB_MyCart();
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
	public WB_MyCart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, FWID,FHIT);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, FWID, 90);
		getContentPane().add(panel);
		
		JLabel lblMyCart = new JLabel("My Cart");
		lblMyCart.setFont(new Font("Segoe Script", Font.ITALIC, 50));
		panel.add(lblMyCart);
	}
}
