package com.boram.myPage.view;

import java.awt.*;
import javax.swing.*;

import com.boram.member.controller.MemberController;
import com.boram.member.vo.Member;

public class WB_MyCartView  {
	private JPanel myCartView;
	public static final int FWID = 718;
	public static final int FHIT = 500;
	private JTable table;
	
	
	private MemberController mc = new MemberController();
	Member m =mc.nugu();

	
	
	/**
	 * Launch the application.
	 */

	public JPanel getMyCartView() {
		return this.myCartView;
	}

	/**
	 * Create the frame.
	 */
	public WB_MyCartView() {
		
		myCartView = new JPanel();
		myCartView.setBackground(Color.white);
		myCartView.setBounds(0, 0, FWID, 800);
		myCartView.setLayout(null);
		//getContentPane().add(myCartView);
		
		JPanel panel1 = new JPanel();
		
		panel1.setBackground(Color.WHITE);
		panel1.setForeground(Color.WHITE);
		panel1.setBounds(0, 0, FWID, 90);
		myCartView.add(panel1);
		
		
		JLabel lblMyCart = new JLabel("My Cart ");
		panel1.add(lblMyCart);
		lblMyCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyCart.setFont(new Font("����", Font.ITALIC, 50));
		//lblMyCart.setBounds(0,0,55,100);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setForeground(Color.WHITE);
		panel2.setBounds(0,90, FWID, 710);
		myCartView.add(panel2);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(Color.LIGHT_GRAY);
		JScrollPane sp = new JScrollPane();
		panel2.add(sp);
		sp.add(table);
		
		//��ư : ����, �ֹ��ϱ�, ��������, �����޴�
		
		
	}
	
	/**
	 * https://m.blog.naver.com/highkrs/220584897023
	 * ��ٱ��� �����ִ� ���̺�.
	 * @return ���̺� ���� ���̺�������.
	 * [��ٱ��ϻ�����][�޺��ڽ�,��ȣ,���������ּ�, ǰ���̸�, ���� , ����](6)
	 * 
	 */
	public String[][] tableCont(){
		
	
		String[][] tc = null;
		
		
		return tc;
	}

	}

