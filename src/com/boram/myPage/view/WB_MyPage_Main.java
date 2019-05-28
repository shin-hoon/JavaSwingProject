package com.boram.myPage.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.boram.shopping.view.MainView;

public class WB_MyPage_Main {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public WB_MyPage_Main() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.setVisible(true);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(154, 214, 105, 27);
		contentPane.add(btnNewButton);
		
		MainView.frame.getContentPane().add(contentPane);
	}
}
