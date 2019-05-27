package com.boram.member.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.boram.manager.controller.ManagerController2;
import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;
import com.boram.shopping.view.MainView;

public class MemberView1 extends JFrame{

	private JFrame frmLogin;
	private JTextField id;
	private JTextField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberView1 window = new MemberView1();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MemberView1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MemberDao md = new MemberDao();
		ArrayList<Member> mArr = md.fileRead();
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 570, 710);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel BORAMLABEL = new JLabel("BORAM");
		BORAMLABEL.setBounds(40, 75, 234, 83);
		BORAMLABEL.setFont(new Font("����", Font.BOLD, 54));
		frmLogin.getContentPane().add(BORAMLABEL);
		
		JLabel MEMLABEL = new JLabel("MEMBERSHIP LOGIN");
		MEMLABEL.setFont(new Font("����", Font.BOLD, 23));
		MEMLABEL.setBounds(42, 147, 340, 27);
		frmLogin.getContentPane().add(MEMLABEL);
		
		JLabel IDLABEL = new JLabel("ID*");
		IDLABEL.setFont(new Font("����", Font.PLAIN, 26));
		IDLABEL.setBounds(46, 227, 109, 44);
		frmLogin.getContentPane().add(IDLABEL);
		
		id = new JTextField();
		id.setBounds(208, 227, 303, 39);
		frmLogin.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel PWDLABEL = new JLabel("Password*");
		PWDLABEL.setFont(new Font("����", Font.PLAIN, 26));
		PWDLABEL.setBounds(48, 302, 207, 39);
		frmLogin.getContentPane().add(PWDLABEL);
		
		pwd = new JPasswordField();
		pwd.setBounds(208, 302, 303, 39);
		frmLogin.getContentPane().add(pwd);
		pwd.setColumns(10);
		
		JButton logIn = new JButton("\uB85C\uADF8\uC778"); // �α��� ��ư
		logIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �α��� ��ư Ŭ���ϸ�
				String userId = id.getText();
				String userPwd= pwd.getText();
				
				ManagerController2 mc = new ManagerController2();
				
				int result = mc.checkLogin(userId, userPwd);
				
				if(result == 1) {
					//�α��� ����
				}else if(result == 0) {
					//�α��� ����
				}else {
					//������ �α���
				}
			}
		});
		
		
		frmLogin.setVisible(true);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		logIn.setBounds(66, 370, 189, 44);
		frmLogin.getContentPane().add(logIn);
		
		JButton join = new JButton("\uD68C\uC6D0\uAC00\uC785"); // ȸ������ ��ư
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ȸ������ ��ư Ŭ���ϸ�
				frmLogin.setVisible(true);
				frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				JPanel joinPanel = new JPanel();
				
				MainView.frame.add(joinPanel);

				
				joinPanel.add(new JLabel("�̸� : "));
				JTextField name = new JTextField(10);
				joinPanel.add(name);
				
				joinPanel.add(new JLabel("�������(ex: 950417) : "));
				JTextField birth = new JTextField(10);
				joinPanel.add(birth);
				
				joinPanel.add(new JLabel("���̵� : "));
				JTextField id = new JTextField(10);
				joinPanel.add(id);
				
				//���̵� �ߺ�Ȯ��
				JLabel idCheck = new JLabel();
				joinPanel.add(idCheck);
				
				joinPanel.add(new JLabel("��й�ȣ : "));
				JTextField pwd = new JTextField(10);
				joinPanel.add(pwd);
				
				joinPanel.add(new JLabel("�������ȣ : "));
				JTextField phone = new JTextField(10);
				joinPanel.add(phone);
				
				joinPanel.add(new JLabel("�ּ� : "));
				JTextField address = new JTextField(10);
				joinPanel.add(address);
				
	
			}
		});
		
		
		join.setBounds(301, 370, 199, 44);
		frmLogin.getContentPane().add(join);
		
		JButton searchId = new JButton("\uC544\uC774\uB514 \uCC3E\uAE30"); // ���̵� ã�� ��ư
		searchId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���̵�ã�� ��ư Ŭ���ϸ�
				frmLogin.setVisible(true);
				frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				
				
				
			}
		});
		searchId.setBounds(144, 496, 130, 27);
		frmLogin.getContentPane().add(searchId);
		
		JButton searchPwd = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30"); // ��й�ȣ ã�� ��ư
		searchPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��й�ȣã�� ��ư Ŭ���ϸ�
				frmLogin.setVisible(true);
				frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				
				
				
				
			}
		});
		searchPwd.setBounds(287, 496, 130, 27);
		frmLogin.getContentPane().add(searchPwd);
	}
}
