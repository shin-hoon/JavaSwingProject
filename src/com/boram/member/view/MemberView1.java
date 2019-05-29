package com.boram.member.view;

import java.awt.Color;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.boram.manager.controller.ManagerController2;
import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;
import com.boram.shopping.view.MainView;

public class MemberView1 {

	private JPanel Login;
	private JTextField id;
	private JTextField pwd;

	// 메인 페이지 호출을 위한 JPanel 반환
	public JPanel getLoginView() {
		return this.Login;
	}

	/**
	 * Create the application.
	 */
	public MemberView1() {
		MemberDao md = new MemberDao();
		ArrayList<Member> mArr = md.fileRead();
		Login = new JPanel();
		Login.setBackground(new Color(255, 255, 255));
		Login.setBounds(550, 0, 647, 596);
		Login.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(73, 40, 515, 528);
		panel.setLayout(null);
		Login.add(panel);

		JLabel BORAMLABEL = new JLabel("BORAM");
		BORAMLABEL.setBounds(40, 75, 234, 83);
		BORAMLABEL.setFont(new Font("굴림", Font.BOLD, 54));
		panel.add(BORAMLABEL);

		JLabel MEMLABEL = new JLabel("MEMBERSHIP LOGIN");
		MEMLABEL.setFont(new Font("굴림", Font.BOLD, 23));
		MEMLABEL.setBounds(42, 147, 340, 27);
		panel.add(MEMLABEL);

		JLabel IDLABEL = new JLabel("ID*");
		IDLABEL.setFont(new Font("굴림", Font.PLAIN, 26));
		IDLABEL.setBounds(46, 227, 109, 44);
		panel.add(IDLABEL);

		id = new JTextField();
		id.setBounds(208, 227, 303, 39);
		panel.add(id);
		id.setColumns(10);

		JLabel PWDLABEL = new JLabel("Password*");
		PWDLABEL.setFont(new Font("굴림", Font.PLAIN, 26));
		PWDLABEL.setBounds(48, 302, 207, 39);
		panel.add(PWDLABEL);

		pwd = new JPasswordField();
		pwd.setBounds(208, 302, 303, 39);
		panel.add(pwd);
		pwd.setColumns(10);

		
		
		/* 로그인 버튼 */
		JButton logIn = new JButton("\uB85C\uADF8\uC778"); 
		logIn.setForeground(Color.WHITE);
		logIn.setBackground(Color.BLACK);
		logIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼 클릭하면
				String userId = id.getText();
				String userPwd = pwd.getText();

				ManagerController2 mc = new ManagerController2();

				int result = mc.checkLogin(userId, userPwd);

				if (result == 1) {
					// 로그인 성공
					MainView mv = new MainView(); // 메인창뜨기
					Login.setVisible(false); // 로그인 창 끄기

				} else if (result == 0) {
					// 로그인 실패
					
					// 실패 창 뜸
					JFrame loginCheck = new JFrame();
					
					loginCheck.setBackground(Color.BLACK);
					loginCheck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					loginCheck.setBounds(100, 100, 450, 300);
					JPanel contentPane = new JPanel();
					contentPane.setBackground(Color.WHITE);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					loginCheck.setContentPane(contentPane);
					contentPane.setLayout(null);
					
					JButton checkBtn = new JButton("\uD655\uC778");
					checkBtn.setForeground(Color.WHITE);
					checkBtn.setBackground(Color.BLACK);
					checkBtn.setFont(new Font("굴림", Font.PLAIN, 20));
					checkBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							// 확인하는 버튼 누르면 창 닫아지기
							loginCheck.setVisible(false);
							
						}
					});
					checkBtn.setBounds(139, 172, 167, 27);
					contentPane.add(checkBtn);
					
					JLabel label = new JLabel("\uAC00\uC785\uB418\uC9C0 \uC54A\uC740 \uD68C\uC6D0\uC785\uB2C8\uB2E4. ");
					label.setFont(new Font("굴림", Font.BOLD, 18));
					label.setBounds(106, 40, 241, 48);
					contentPane.add(label);
					
					JLabel lblNewLabel = new JLabel("\uB2E4\uC2DC \uC785\uB825\uD558\uC138\uC694.");
					lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
					lblNewLabel.setBounds(149, 100, 167, 27);
					contentPane.add(lblNewLabel);

				} else {
					// 관리자 로그인
				}
			}
		});

		logIn.setBounds(66, 370, 189, 44);
		panel.add(logIn);

		
		
		/* 회원가입 버튼 */
		JButton join = new JButton("\uD68C\uC6D0\uAC00\uC785"); 
		join.setForeground(Color.WHITE);
		join.setBackground(Color.BLACK);
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입 버튼 클릭하면
				Login.setVisible(false); // 로그인 창 끄기

				JPanel joinPanel = new JPanel();
				
				joinPanel.setBackground(Color.WHITE);
				joinPanel.setLayout(null);
				
				JLabel memberjoinLb = new JLabel("MEMBER JOIN");
				memberjoinLb.setFont(new Font("굴림", Font.BOLD, 28));
				memberjoinLb.setHorizontalAlignment(SwingConstants.CENTER);
				memberjoinLb.setBounds(155, 39, 222, 72);
				joinPanel.add(memberjoinLb);
				
				JLabel idLb = new JLabel("\uC544\uC774\uB514 * ");
				idLb.setFont(new Font("굴림", Font.PLAIN, 18));
				idLb.setBounds(41, 164, 102, 28);
				joinPanel.add(idLb);
				
				JButton idcheckBtn = new JButton("ID CHECK");
				idcheckBtn.setForeground(Color.WHITE);
				idcheckBtn.setBackground(Color.BLACK);
				idcheckBtn.setFont(new Font("굴림", Font.PLAIN, 20));
				idcheckBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 아이디 입력후 사용가능한 아이디인지 확인하는 버튼
						
						
						
						
						
					}
				});
				idcheckBtn.setBounds(500, 164, 150, 25);
				joinPanel.add(idcheckBtn);
				
				JLabel pwdLb = new JLabel("\uBE44\uBC00\uBC88\uD638 * ");
				pwdLb.setFont(new Font("굴림", Font.PLAIN, 18));
				pwdLb.setBounds(40, 217, 103, 36);
				joinPanel.add(pwdLb);
				
				JLabel nameLb = new JLabel("\uC774\uB984 *");
				nameLb.setFont(new Font("굴림", Font.PLAIN, 18));
				nameLb.setBounds(41, 287, 62, 18);
				joinPanel.add(nameLb);
				
				JLabel birthLb = new JLabel("\uC0DD\uB144\uC6D4\uC77C(ex:950417) *");
				birthLb.setFont(new Font("굴림", Font.PLAIN, 18));
				birthLb.setBounds(41, 342, 191, 28);
				joinPanel.add(birthLb);
				
				JLabel addressLb = new JLabel("\uC8FC\uC18C *");
				addressLb.setFont(new Font("굴림", Font.PLAIN, 18));
				addressLb.setBounds(41, 409, 62, 18);
				joinPanel.add(addressLb);
				
				JLabel phoneLb = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638 *");
				phoneLb.setFont(new Font("굴림", Font.PLAIN, 18));
				phoneLb.setBounds(41, 463, 118, 28);
				joinPanel.add(phoneLb);
				
				JLabel emailLb = new JLabel("\uC774\uBA54\uC77C *");
				emailLb.setFont(new Font("굴림", Font.PLAIN, 18));
				emailLb.setBounds(41, 526, 80, 28);
				joinPanel.add(emailLb);
				
				JButton joinBtn = new JButton("\uD68C\uC6D0\uAC00\uC785");
				joinBtn.setForeground(Color.WHITE);
				joinBtn.setBackground(Color.BLACK);
				joinBtn.setFont(new Font("굴림", Font.PLAIN, 22));
				joinBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 정보입력후 회원가입 버튼 누르면
						
						
						
						
						
					}
				});
				joinBtn.setBounds(202, 609, 160, 52);
				joinPanel.add(joinBtn);
				
				JTextField idText = new JTextField();
				idText.setBounds(301, 162, 176, 36);
				joinPanel.add(idText);
				idText.setColumns(10);
				
				JTextField pweText = new JTextField();
				pweText.setColumns(10);
				pweText.setBounds(301, 225, 176, 36);
				joinPanel.add(pweText);
				
				JTextField nameText = new JTextField();
				nameText.setColumns(10);
				nameText.setBounds(301, 286, 176, 36);
				joinPanel.add(nameText);
				
				JTextField birthText = new JTextField();
				birthText.setColumns(10);
				birthText.setBounds(301, 342, 176, 36);
				joinPanel.add(birthText);
				
				JTextField phoneText = new JTextField();
				phoneText.setColumns(10);
				phoneText.setBounds(301, 463, 176, 36);
				joinPanel.add(phoneText);
				
				JTextField emailText = new JTextField();
				emailText.setColumns(10);
				emailText.setBounds(301, 518, 176, 36);
				joinPanel.add(emailText);
				
				JTextField addressText = new JTextField();
				addressText.setBounds(100, 399, 377, 43);
				joinPanel.add(addressText);
				addressText.setColumns(10);
				
				MainView.setMainPage(joinPanel);
			}
		});

		join.setBounds(301, 370, 199, 44);
		panel.add(join);

	
		
		
		/* 아이디 찾기 버튼 */
		JButton searchId = new JButton("\uC544\uC774\uB514 \uCC3E\uAE30"); 
		searchId.setForeground(Color.WHITE);
		searchId.setBackground(Color.BLACK);
		searchId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 아이디찾기 버튼 클릭하면
				panel.setVisible(false); // 로그인 창 끄기

				JPanel idSearchPanel = new JPanel();
				
				idSearchPanel.setBackground(Color.WHITE);
				idSearchPanel.setLayout(null);

				JLabel lblIdpwFind = new JLabel("ID/PW FIND");
				lblIdpwFind.setFont(new Font("굴림", Font.BOLD, 38));
				lblIdpwFind.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdpwFind.setBounds(133, 55, 288, 54);
				idSearchPanel.add(lblIdpwFind);

				JLabel searchLb = new JLabel("\uC544\uC774\uB514 \uCC3E\uAE30");
				searchLb.setFont(new Font("굴림", Font.BOLD, 17));
				searchLb.setBounds(64, 155, 98, 31);
				idSearchPanel.add(searchLb);

				JLabel nameLb = new JLabel("\uC774\uB984 : ");
				nameLb.setFont(new Font("굴림", Font.PLAIN, 19));
				nameLb.setBounds(100, 214, 62, 49);
				idSearchPanel.add(nameLb);

				JLabel emailLb = new JLabel("\uC774\uBA54\uC77C : ");
				emailLb.setFont(new Font("굴림", Font.PLAIN, 19));
				emailLb.setBounds(100, 275, 78, 31);
				idSearchPanel.add(emailLb);

				JTextField nametext = new JTextField();
				nametext.setBounds(173, 218, 248, 38);
				idSearchPanel.add(nametext);
				nametext.setColumns(10);

				JTextField emailtext = new JTextField();
				emailtext.setColumns(10);
				emailtext.setBounds(174, 273, 248, 38);
				idSearchPanel.add(emailtext);

				JButton confirmBtn = new JButton("\uD655  \uC778");
				confirmBtn.setForeground(Color.WHITE);
				confirmBtn.setBackground(Color.BLACK);
				confirmBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 아이디 찾기 확인 버튼 누르면
						
						
						
						
						
						
						
					}
				});
				confirmBtn.setBounds(217, 342, 119, 54);
				idSearchPanel.add(confirmBtn);
				
				MainView.setMainPage(idSearchPanel);

			}
		});
		searchId.setBounds(144, 496, 130, 27);
		panel.add(searchId);
		
		
		
		/*비밀번호 찾기 버튼*/
		JButton searchPwd = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		searchPwd.setBackground(Color.BLACK);
		searchPwd.setForeground(Color.WHITE);
		searchPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 비밀번호찾기 버튼 클릭하면
				panel.setVisible(false); // 로그인 창 끄기

				
				JPanel pwdSearchPanel = new JPanel();
				
				pwdSearchPanel.setBackground(Color.WHITE);
				pwdSearchPanel.setLayout(null);

				JLabel lblIdpwFind = new JLabel("ID/PW FIND");
				lblIdpwFind.setFont(new Font("굴림", Font.BOLD, 38));
				lblIdpwFind.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdpwFind.setBounds(133, 55, 288, 54);
				pwdSearchPanel.add(lblIdpwFind);

				JLabel searchLb = new JLabel("\uC544\uC774\uB514 \uCC3E\uAE30");
				searchLb.setFont(new Font("굴림", Font.BOLD, 17));
				searchLb.setBounds(64, 155, 98, 31);
				pwdSearchPanel.add(searchLb);

				JLabel nameLb = new JLabel("\uC774\uB984 : ");
				nameLb.setFont(new Font("굴림", Font.PLAIN, 19));
				nameLb.setBounds(100, 214, 62, 49);
				pwdSearchPanel.add(nameLb);

				JLabel emailLb = new JLabel("\uC774\uBA54\uC77C : ");
				emailLb.setFont(new Font("굴림", Font.PLAIN, 19));
				emailLb.setBounds(100, 275, 78, 31);
				pwdSearchPanel.add(emailLb);

				JTextField nametext = new JTextField();
				nametext.setBounds(173, 218, 248, 38);
				pwdSearchPanel.add(nametext);
				nametext.setColumns(10);

				JTextField emailtext = new JTextField();
				emailtext.setColumns(10);
				emailtext.setBounds(174, 273, 248, 38);
				pwdSearchPanel.add(emailtext);

				JButton confirmBtn = new JButton("\uD655  \uC778");
				confirmBtn.setForeground(Color.WHITE);
				confirmBtn.setBackground(Color.BLACK);
				confirmBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 비밀번호 찾기 확인버튼 누르면
						
						
						
						
						
						
					}
				});
				confirmBtn.setBounds(217, 342, 119, 54);
				pwdSearchPanel.add(confirmBtn);

				MainView.setMainPage(pwdSearchPanel);
			}
		});
		searchPwd.setBounds(287, 496, 130, 27);
		panel.add(searchPwd);

	}
}
