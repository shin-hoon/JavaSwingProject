package com.boram.member.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		pwd = new JTextField();
		pwd.setBounds(208, 302, 303, 39);
		frmLogin.getContentPane().add(pwd);
		pwd.setColumns(10);
		
		JButton logIn = new JButton("\uB85C\uADF8\uC778");
		logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
