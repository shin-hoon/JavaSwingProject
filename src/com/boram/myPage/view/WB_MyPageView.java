package com.boram.myPage.view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import com.boram.member.vo.Member;

public class WB_MyPageView extends JFrame {
	public static final int FWID = 718;
	public static final int FHIT = 500;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea ta;
	private ArrayList<Member> MemberList = new ArrayList<>();
	private int gran = /*mem.getGrant()*/0;
	{
		MemberList.add(new Member("name1",950411,"id1","pwd1","01029346331","seoul","1mail.com"));
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB_MyPageView frame = new WB_MyPageView();
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

	public WB_MyPageView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, FWID, FHIT);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, FWID, 90);
		getContentPane().add(panel);

		JLabel lblMyCart = new JLabel("My Page");
		lblMyCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyCart.setFont(new Font("Segoe Script", Font.ITALIC, 50));
		panel.add(lblMyCart);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 91, 718, 370);

		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel label = new JLabel("idChange : ");
		label.setBounds(12, 36, 80, 15);
		panel_2.add(label);

		JLabel label_0 = new JLabel("pwChange : ");
		label_0.setBounds(12, 72, 80, 15);
		panel_2.add(label_0);

		JLabel label_1 = new JLabel("ageChange : ");
		label_1.setBounds(12, 102, 80, 15);
		panel_2.add(label_1);

		JLabel label_2 = new JLabel("addressChange : ");
		label_2.setBounds(12, 132, 80, 15);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("emailChange : ");
		label_3.setBounds(12, 162, 80, 15);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("phoneChange : ");
		label_4.setBounds(12, 192, 80, 15);
		panel_2.add(label_4);

		// id
		textField = new JTextField();
		textField.setBounds(114, 36, 116, 21);
		panel_2.add(textField);
		textField.setColumns(10);

		// pw
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 72, 116, 21);
		panel_2.add(textField_1);

		// age
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(114, 102, 116, 21);
		panel_2.add(textField_2);

		// address
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(114, 132, 116, 21);
		panel_2.add(textField_3);

		// email
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(114, 162, 116, 21);
		panel_2.add(textField_4);

		// phone
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(114, 192, 116, 21);
		panel_2.add(textField_5);

		JButton btnChange = new JButton("Change!");

		btnChange.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btnChange();
			}
		});
		btnChange.setBounds(111, 302, 97, 23);
		panel_2.add(btnChange);
		
		
		//ȸ��������� temp.
		JButton btnTemp = new JButton("Temp!");

		btnTemp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				for(Member i:MemberList) {
					ta.append(i.toString());
				}
			}
		});
		btnChange.setBounds(150, 302, 97, 23);
		panel_2.add(btnTemp);

		JLabel lblResult = new JLabel("Result : ");
		lblResult.setBounds(250, 51, 57, 15);
		panel_2.add(lblResult);

		//����ڰ� �����Ұ����ϰ� �����Ұ�.
		JTextArea ta = new JTextArea();
		ta.setBounds(250, 72, 440, 170);
		panel_2.add(ta);
		
		
	}

	/**
	 * �Է��� �׸� ��������.
	 * ������ ���� textArea�� ���
	 * ������ �����̾�����textArea�� �������׾������.
	 * �ؿ� ����޼ҵ忡�� textArea�� ������ ����Ǿ����� ���.
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
	 * @param newId �ٲܾ��̵�.
	 * @return ����0, ����1
	 */
	public int idChange(String newId) {
		int result = 0;
		try {
			MemberList.get(gran).setId(newId);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("1�߸��� ���Դϴ�!");
			result = 0;
		}

		return result;
	}

	/**
	 * @param newPw �ٲ� ��й�ȣ
	 * @return ����0, ����1
	 */
	public int pwChange(String newPw) {
		int result = 0;
		try {
			MemberList.get(gran).setPwd(newPw);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("2�߸��� ���Դϴ�!");
			result = 0;
		}
		return result;
	}

	/**
	 * @param newPh ������ ����ȣ
	 * @return ����0, ����1
	 */
	public int phoneChange(String newPh) {
		int result = 0;
		try {
			MemberList.get(gran).setPhone(newPh);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("3�߸��� ���Դϴ�!");
			result = 0;
		}
		return result;
	}

	/**
	 * @param newAdd �ٲ��ּ�
	 * @return ����0, ����1
	 */
	public int addressChange(String newAdd) {
		int result = 0;
		try {
			MemberList.get(gran).setAddress(newAdd);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("4�߸��� ���Դϴ�!");
			result = 0;
		}
		return result;
	}

	/**
	 * @param newEmail �ٲ��̸���
	 * @return ����0, ����1
	 */
	public int emailChange(String newEmail) {
		int result = 0;
		try {
			MemberList.get(gran).setEmail(newEmail);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("5�߸��� ���Դϴ�!");
			result = 0;
		}
		return result;
	}

	/**
	 * @param newAge �ٲ� ����
	 * @return ����0, ����1
	 */
	public int ageChange(int newAge) {
		int result = 0;
		try {
			MemberList.get(gran).setAge(newAge);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("6�߸��� ���Դϴ�!");
			result = 0;
		}
		return result;
	}
}
