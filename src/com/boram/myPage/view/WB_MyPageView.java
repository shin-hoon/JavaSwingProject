package com.boram.myPage.view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import com.boram.myPage.controller.*;
import com.boram.member.vo.Member;

public class WB_MyPageView {
	ChangeMember cm = new ChangeMember();
	public static final int FWID = 718;
	public static final int FHIT = 500;
	private JPanel myPageView;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea ta;
	private ArrayList<Member> MemberList = new ArrayList<>();
	private int gran = /* mem.getGrant() */0;
	// �ʱ� �ӽõ�����.
	/*
	 * { //0,"name1",950417,"id1","pwd2","01029346330","seoul","email.com"
	 * MemberList.add(new
	 * Member("name1",950411,"id1","pwd1","01029346331","seoul","1mail.com"));
	 * MemberList.add(new
	 * Member("name2",950412,"id2","pwd2","01029346332","seou1","2mail.com"));
	 * MemberList.add(new
	 * Member("name3",950413,"id3","pwd3","01029346333","seou2","3mail.com"));
	 * MemberList.add(new
	 * Member("name4",950414,"id4","pwd4","01029346334","seou3","4mail.com"));
	 * MemberList.add(new
	 * Member("name5",950415,"id5","pwd5","01029346335","seou4","5mail.com")); }
	 */

	// ���� ������ ȣ���� ���� JPanel ��ȯ
	public JPanel getmyPageView() {
		return this.myPageView;
	}

	public WB_MyPageView() {
		myPageView = new JPanel();
		myPageView.setBackground(Color.WHITE);
		myPageView.setBounds(0, 0, FWID, 1000);
		myPageView.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, FWID, 90);
		myPageView.add(panel);

		JLabel lblMyPage = new JLabel("My Page ");
		lblMyPage.setBackground(Color.BLACK);
		lblMyPage.setForeground(Color.BLACK);
		lblMyPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyPage.setFont(new Font("����", Font.ITALIC, 50));
		panel.add(lblMyPage);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 90, 718, 955);

		myPageView.add(panel_2);
		panel_2.setLayout(null);

		JLabel label = new JLabel("���̵� ���� :");
		label.setFont(new Font("����", Font.PLAIN, 20));
		label.setBounds(138, 51, 121, 27);
		panel_2.add(label);

		JLabel label_0 = new JLabel("��й�ȣ ���� :");
		label_0.setBounds(159, 137, 80, 15);
		panel_2.add(label_0);

		JLabel label_1 = new JLabel("���� ���� :");
		label_1.setBounds(159, 209, 80, 15);
		panel_2.add(label_1);

		JLabel label_2 = new JLabel("�ּ� ���� :");
		label_2.setBounds(159, 282, 80, 15);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("�̸��� ���� :");
		label_3.setBounds(159, 337, 80, 15);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("��ȭ��ȣ ���� :");
		label_4.setBounds(159, 405, 80, 15);
		panel_2.add(label_4);

		// id
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(268, 46, 220, 40);
		panel_2.add(textField);
		textField.setColumns(10);

		// pw
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 112, 220, 40);
		panel_2.add(textField_1);

		// age
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(268, 184, 220, 40);
		panel_2.add(textField_2);

		// address
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(268, 257, 220, 40);
		panel_2.add(textField_3);

		// email
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(268, 324, 220, 40);
		panel_2.add(textField_4);

		// phone
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(268, 392, 220, 40);
		panel_2.add(textField_5);

		JButton btnChange = new JButton("Change!");

		btnChange.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btnChange();
			}
		});
		btnChange.setBounds(81, 711, 97, 23);
		panel_2.add(btnChange);

		JLabel lblResult = new JLabel("Result : ");
		lblResult.setBounds(94, 457, 57, 15);
		panel_2.add(lblResult);

		// ����ڰ� �����Ұ����ϰ� �����Ұ�.
		JTextArea ta = new JTextArea();
		ta.setBackground(Color.WHITE);
		ta.setBounds(81, 472, 440, 170);
		panel_2.add(ta);

		JButton btnPre = new JButton("Pre");
		btnPre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPre.setBounds(252, 709, 105, 27);
		panel_2.add(btnPre);

		// ȸ������ ��� temp
		JButton btnTemp_1 = new JButton("Temp");
		btnTemp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Member i : MemberList) {
					ta.append(i.toString());
				}
			}
		});
		btnTemp_1.setBounds(416, 709, 105, 27);
		panel_2.add(btnTemp_1);

	}

	/**
	 * �Է��� �׸� ��������. ������ ���� textArea�� ��� ������ �����̾�����textArea�� �������׾������. �ؿ� ����޼ҵ忡��
	 * textArea�� ������ ����Ǿ����� ���.
	 */
	public void btnChange() {
		String nId = textField.getText();
		String nPw = textField_1.getText();
		// int nAge = Integer.parseInt( textField_2.getText());
		String nAge = textField_2.getText();
		String nAdd = textField_3.getText();
		String nEmail = textField_4.getText();
		String nPh = textField_5.getText();
		int count = 0;

		if (nId != null) {
			idChange(nId);
			count++;
		}
		if (nPw != null) {
			pwChange(nPw);
			count++;
		}
		if (nAge != null) {
			int nAgeI = 0;
			try {
				nAgeI = Integer.parseInt(nAge);
				ageChange(nAgeI);
			} catch (NullPointerException | IndexOutOfBoundsException e) {
				// �������Է�.���
			}
			// ageChange(nAge);
			count++;
		}
		if (nAdd != null) {
			addressChange(nAdd);
			count++;
		}
		if (nEmail != null) {
			emailChange(nEmail);
			count++;
		}
		if (nPh != null) {
			phoneChange(nPh);
			count++;
		}
		// .append(count+"���� ���������� �Ϸ�Ǿ����ϴ�.");
		// ���
		if (count == 0) {
			// �ؽ�Ʈ ���� "������ ������ �����ϴ�." ���
			ta.append("������ ������ �����ϴ�!");
		} /*
			 * else { // �ؽ�Ʈ���� // count +" ���� ���������� �Ϸ�Ǿ����ϴ�." ta.append(count +
			 * " ���� ���������� �Ϸ�Ǿ����ϴ�."); }
			 */
	}

	
	/**
	 * @param newId �ٲܾ��̵�
	 * ����/���� ta(TextArea)�� ���
	 */
	public void idChange(String newId) {
		int result = cm.idChange(newId);
		if (result == 0) {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		}
	}

	
	/**
	 * @param newId �ٲܺ�й�ȣ
	 * ����/���� ta(TextArea)�� ���
	 */
	public void pwChange(String newPw) {
		int result = cm.pwChange(newPw);
		if (result == 0) {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		}
	}

	/**
	 * @param newId �ٲ� ��ȭ��ȣ
	 * ����/���� ta(TextArea)�� ���
	 */
	public void phoneChange(String newPh) {
		int result = cm.phoneChange(newPh);
		if (result == 0) {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		}
	}

	/**
	 * @param newId �ٲ��ּ�
	 * ����/���� ta(TextArea)�� ���
	 */
	public void addressChange(String newAdd) {
		int result = cm.addressChange(newAdd);
		if (result == 0) {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		}
	}

	/**
	 * @param newId �ٲ��̸���
	 * ����/���� ta(TextArea)�� ���
	 */
	public void emailChange(String newEmail) {
		int result = cm.emailChange(newEmail);
		if (result == 0) {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		}
	}

	/**
	 * @param newId �ٲܳ���
	 * ����/���� ta(TextArea)�� ���
	 */
	public void ageChange(int newAge) {
		int result = cm.ageChange(newAge);
		if (result == 0) {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			ta.append("���� ���濡 �����Ͽ����ϴ�.");
		}
	}
}
