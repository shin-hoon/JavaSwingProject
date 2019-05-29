package com.boram.myPage.view;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.boram.shopping.view.*;
public class WB_MyPage_Main{
	public static final int FWID = 718;
	public static final int FHIT = 500;
	private JPanel contentPane;
	
	
	// ���� ������ ȣ���� ���� JPanel ��ȯ
	public JPanel myPageMain() {
		return this.contentPane;
	}
	
	public WB_MyPage_Main() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0,0,FWID,FHIT);
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		
		
		
		JButton btnNewButton = new JButton("<HTML><Center> ȸ������<br>����</HTML>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainView.setMainPage(new WB_MyPageView().getmyPageView());
				
			}
		});
		btnNewButton.setBounds(78, 371, 103, 94);
		contentPane.add(btnNewButton);
		
		
		JButton button = new JButton("��ٱ���");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView.setMainPage(new WB_MyCartView().getMyCartView());
			}
		});
		button.setBounds(215, 371, 103, 94);
		contentPane.add(button);
		
		JButton button_1 = new JButton("���Ȯ��");
		button_1.setBounds(346, 371, 103, 94);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("<HTML><Center>���ų���<br>Ȯ��</HTML>");
		button_2.setBounds(482, 371, 103, 94);
		contentPane.add(button_2);
		
		
		JLabel lblMyCart = new JLabel("My Page");
		lblMyCart.setBounds(0,0, 700,112);
		lblMyCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyCart.setFont(new Font("����", Font.ITALIC, 50));
		contentPane.add(lblMyCart);
		
		JLabel lblNewLabel = new JLabel("���� ������");
		lblNewLabel.setBounds(78, 149, 507, 40);
		contentPane.add(lblNewLabel);
	}
}
