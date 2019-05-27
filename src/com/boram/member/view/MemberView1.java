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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.boram.manager.controller.ManagerController2;
import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;

public class MemberView1 {

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
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 570, 710);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel BORAMLABEL = new JLabel("BORAM");
		BORAMLABEL.setBounds(40, 75, 234, 83);
		BORAMLABEL.setFont(new Font("±¼¸²", Font.BOLD, 54));
		frmLogin.getContentPane().add(BORAMLABEL);
		
		JLabel MEMLABEL = new JLabel("MEMBERSHIP LOGIN");
		MEMLABEL.setFont(new Font("±¼¸²", Font.BOLD, 23));
		MEMLABEL.setBounds(42, 147, 340, 27);
		frmLogin.getContentPane().add(MEMLABEL);
		
		JLabel IDLABEL = new JLabel("ID*");
		IDLABEL.setFont(new Font("±¼¸²", Font.PLAIN, 26));
		IDLABEL.setBounds(46, 227, 109, 44);
		frmLogin.getContentPane().add(IDLABEL);
		
		id = new JTextField();
		id.setBounds(208, 227, 303, 39);
		frmLogin.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel PWDLABEL = new JLabel("Password*");
		PWDLABEL.setFont(new Font("±¼¸²", Font.PLAIN, 26));
		PWDLABEL.setBounds(48, 302, 207, 39);
		frmLogin.getContentPane().add(PWDLABEL);
		
		pwd = new JPasswordField();
		pwd.setBounds(208, 302, 303, 39);
		frmLogin.getContentPane().add(pwd);
		pwd.setColumns(10);
		
		JButton logIn = new JButton("\uB85C\uADF8\uC778");
		logIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ·Î±×ÀÎ ¹öÆ° Å¬¸¯ÇÏ¸é
				String userId = id.getText();
				String userPwd= pwd.getText();
				
				
				ManagerController2 mc = new ManagerController2();
				
				int result = mc.checkLogin(userId, userPwd);
			}
		});
		logIn.setBounds(66, 370, 189, 44);
		frmLogin.getContentPane().add(logIn);
		
		JButton join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		join.setBounds(301, 370, 199, 44);
		frmLogin.getContentPane().add(join);
		
		JButton searchId = new JButton("\uC544\uC774\uB514 \uCC3E\uAE30");
		searchId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchId.setForeground(Color.BLACK);
		searchId.setBounds(144, 496, 130, 27);
		frmLogin.getContentPane().add(searchId);
		
		JButton searchPwd = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		searchPwd.setBounds(287, 496, 130, 27);
		frmLogin.getContentPane().add(searchPwd);
	}
}
