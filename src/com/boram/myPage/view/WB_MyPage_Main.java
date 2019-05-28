package com.boram.myPage.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.boram.shopping.view.MainView;

public class WB_MyPage_Main extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public WB_MyPage_Main() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(78, 44, 241, 165);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		MainView.frame.add(contentPane);
	}
}
