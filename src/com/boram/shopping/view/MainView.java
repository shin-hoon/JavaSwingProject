package com.boram.shopping.view;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;

public class MainView{
	public static JFrame frame;
	boolean outerChk = false;
	boolean topChk = false;
	
	/**
	 * ���� ������
	 */
	public MainView() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.setTitle("���ѹα� NO.1 ���θ� Boram����");
		frame.getContentPane().setLayout(null);
        frame.setSize(718, 1064);  // 600,0,418,900
		frame.setLocationRelativeTo(null);
        
		
		// ���� ������(����, ���� �޴�)
		JPanel subMenu = new JPanel();
		subMenu.setBounds(0,0,256,682);
		subMenu.setLayout(null);
		subMenu.setVisible(true);
		
		JLabel subMenuClose = new JLabel("X");
		subMenuClose.setForeground(Color.GRAY);
		subMenuClose.setFont(new Font("����", Font.PLAIN, 35));
		subMenuClose.setBackground(new Color(255, 255, 255));
		subMenuClose.setBounds(220, 12, 22, 17);
		subMenu.add(subMenuClose);
		
		
		subMenuClose.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				new Thread() {
					public void run() {
						try {
							for(int i = 0; i >= -376; i--) {
								subMenu.setLocation(i,0);
								Thread.sleep(1);
							}
						} catch (Exception e) {
							System.out.println("����޴� �ݱ� ���� : "+e.getMessage());
						}
					}
				}.start();
			}
		});
//		subMenu.setVisible(false);
		
		
		
		// OUTER �޴�
		JLabel outer = new JLabel("OUTER");
		outer.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
		outer.setBounds(40, 74, 125, 35); //109
		subMenu.add(outer);
		

		// OUTER ����޴�
		JPanel outerSubMenu = new JPanel();
		outerSubMenu.setBounds(40, 124, 116, 121); 
		outerSubMenu.setLayout(null);
		outerSubMenu.setVisible(false);

		JLabel coat = new JLabel("��Ʈ");
		coat.setFont(new Font("����", Font.BOLD, 18));
		coat.setBounds(0, 0, 62, 21);
		outerSubMenu.add(coat);

		JLabel jacket = new JLabel("����");
		jacket.setFont(new Font("����", Font.BOLD, 18));
		jacket.setBounds(0, 31, 62, 21);
		outerSubMenu.add(jacket);

		JLabel blazer = new JLabel("������");
		blazer.setFont(new Font("����", Font.BOLD, 18));
		blazer.setBounds(0, 62, 76, 21);
		outerSubMenu.add(blazer);

		JLabel cardigan = new JLabel("�����");
		cardigan.setFont(new Font("����", Font.BOLD, 18));
		cardigan.setBounds(0, 93, 62, 21);
		outerSubMenu.add(cardigan);



		
		
		
		
		
		
		// TOP �޴�
		JLabel top = new JLabel("TOP");
		top.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
		top.setBounds(40, 124, 91, 35); // 50, 15
		subMenu.add(top);
		
		
		// TOP ����޴�
		JPanel topSubMenu = new JPanel();
		topSubMenu.setLayout(null);
		topSubMenu.setBounds(40, 174, 133, 147);
		topSubMenu.setVisible(false);
		subMenu.add(topSubMenu);
		
		
		JLabel LongSleeve = new JLabel("����");
		LongSleeve.setFont(new Font("����", Font.BOLD, 18));
		LongSleeve.setBounds(0, 0, 62, 21);
		topSubMenu.add(LongSleeve);
		
		JLabel ShortSleeves = new JLabel("����/����");
		ShortSleeves.setFont(new Font("����", Font.BOLD, 18));
		ShortSleeves.setBounds(0, 31, 85, 21);
		topSubMenu.add(ShortSleeves);
		
		JLabel hoodT = new JLabel("������/�ĵ�Ƽ");
		hoodT.setFont(new Font("����", Font.BOLD, 18));
		hoodT.setBounds(0, 62, 133, 21);
		topSubMenu.add(hoodT);
		
		JLabel neat = new JLabel("��Ʈ");
		neat.setFont(new Font("����", Font.BOLD, 18));
		neat.setBounds(0, 93, 62, 21);
		topSubMenu.add(neat);
		
		JLabel overFit = new JLabel("������");
		overFit.setFont(new Font("����", Font.BOLD, 18));
		overFit.setBounds(0, 124, 62, 21);
		topSubMenu.add(overFit);
		
		
		
		
		
		
		JLabel shirt = new JLabel("SHIRT");
		shirt.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
		shirt.setBounds(40, 174, 116, 30);
		subMenu.add(shirt);
		/*
		JLabel PANTS = new JLabel("PANTS");
		PANTS.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
		PANTS.setBounds(40, 224, 116, 35);
		subMenu.add(PANTS);
		
		JLabel SHOES = new JLabel("SHOES");
		SHOES.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
		SHOES.setBounds(40, 274, 116, 35);
		subMenu.add(SHOES);
		
		JLabel ACC = new JLabel("ACC");
		ACC.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30)); // Berlin Sans FB Demi
		ACC.setBounds(40, 324, 67, 35);
		subMenu.add(ACC);
		*/
		
		
		
		
		
		outer.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {			}
			public void mousePressed(MouseEvent e) {			}
			public void mouseExited(MouseEvent e) {			}
			public void mouseEntered(MouseEvent e) {			}
			public void mouseClicked(MouseEvent e) {
				if(outerChk == false) {
					new Thread() {
						@Override
						public void run() {
							try {
								for(int i = 124; i <= 250; i++) {
									top.setLocation(40,i);
									Thread.sleep(1);
								}
							} catch(Exception ex) {
								
							}
						}
					}.start();
					outerChk = true;
					outerSubMenu.setVisible(true);
				}
				else {
					new Thread() {
						@Override
						public void run() {
							try {
								for(int i = 250; i >= 124; i--) {
									top.setLocation(40,i);
									Thread.sleep(1);
								}
							} catch(Exception ex) {
								
							}
						}
					}.start();
					outerChk = false;
					outerSubMenu.setVisible(false);
				}
			}
		});


		top.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {			}
			public void mousePressed(MouseEvent e) {			}
			public void mouseExited(MouseEvent e) {			}
			public void mouseEntered(MouseEvent e) {			}
			public void mouseClicked(MouseEvent e) {
				if(topChk == false) {
					new Thread() {
						@Override
						public void run() {
							try {
								for(int i = 174; i <= 336; i++) {
									shirt.setLocation(40,i);
									Thread.sleep(1);
								}
							} catch(Exception ex) {
								System.out.println("top����޴� ����" + ex.getMessage());
							}
						}
					}.start();
					topChk = true;
					topSubMenu.setVisible(true);
				}
				else {
					new Thread() {
						@Override
						public void run() {
							try {
								for(int i = 336; i >= 174; i--) {
									shirt.setLocation(40,i);
									Thread.sleep(1);
								}
							} catch(Exception ex) {
								System.out.println("top����޴� ����" + ex.getMessage());
							}
						}
					}.start();
					topChk = false;
					topSubMenu.setVisible(false);
				}
			}
		});

		
		
		
		
		
		
		
		
		subMenu.add(outerSubMenu);
		frame.getContentPane().add(subMenu);
		
		
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		
		// ���� ������(����, �α���&����������&������ ������,�˻�)
		JPanel mainMenu = new JPanel();
		mainMenu.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mainMenu.setBackground(new Color(255, 255, 255));
		mainMenu.setBounds(-16, 0, 729, 79);
		mainMenu.setLayout(null);

		JLabel kategorie = new JLabel(new ImageIcon("C:\\git\\JavaSwingProject\\Image\\MainImage\\kategorie.jpg"));
		kategorie.setBackground(new Color(255, 204, 51));
		kategorie.setBounds(30, 12, 55, 57);
		mainMenu.add(kategorie);
		
		kategorie.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				subMenu.setVisible(true);
				new Thread() {
					public void run() {
						try {
							for(int i = -376; i <= 0; i++) {
								subMenu.setLocation(i,0);
								Thread.sleep(1);
							}
						} catch (Exception e) {
							System.out.println("����޴� ���� : "+e.getMessage());
						}
					}
				}.start();
			}
		});
		
		
		JLabel logo = new JLabel("Boram");
		logo.setFont(new Font("Broadway", Font.BOLD, 50));
		logo.setBounds(118, -2, 201, 79);
		mainMenu.add(logo);
		
		JLabel search = new JLabel(new ImageIcon("C:\\git\\JavaSwingProject\\Image\\MainImage\\search.jpg"));
		search.setBounds(583, 26, 30, 28);
		mainMenu.add(search);
		
		JLabel login = new JLabel(new ImageIcon("C:\\git\\JavaSwingProject\\Image\\MainImage\\login.jpg"));
		login.setBounds(627, 26, 30, 28);
		mainMenu.add(login);
		
		
		JLabel myPage = new JLabel(new ImageIcon("C:\\git\\JavaSwingProject\\Image\\MainImage\\myPage.jpg"));
		myPage.setBounds(667, 26, 30, 28);
		mainMenu.add(myPage);
		
		JLabel adminPage = new JLabel(new ImageIcon("C:\\git\\JavaSwingProject\\Image\\MainImage\\adminPage.jpg"));
		adminPage.setBounds(540, 26, 30, 28);
		mainMenu.add(adminPage);
		
		JPanel boderPanel = new JPanel();
		boderPanel.setBackground(new Color(255, 255, 255));
		boderPanel.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		boderPanel.setBounds(0, 2, 102, 75);
		mainMenu.add(boderPanel);
		
		frame.getContentPane().add(mainMenu);

		
		
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		//////////////////////////////////////////////////////
		
        // �ٲ�� ������(�Ʒ���, JPanel)
        JPanel mainPage = new JPanel();
        mainPage.setBackground(new Color(255, 255, 255));
		mainPage.setBounds(0, 259, 700, 490);
		mainPage.setLayout(null);
		mainPage.setVisible(true);
	/*	
		JScrollPane scroll = new JScrollPane(mainMenu);
		mainMenu.setPreferredSize(new Dimension(318,5200));		
		add(scroll);
	*/	
		Image image = null;
		Image image2 = null;
		
        try {
            URL url = new URL("https://m.mutnam.com/web/product/medium/201905/fc7e31fe79e7108dfc8882cfba71da4d.gif");
            URL ur2 = new URL("https://m.mutnam.com/web/product/medium/201905/0c774c7b53fa9f91cd60ccb96502a97e.gif");
            image = ImageIO.read(url).getScaledInstance(450, 430, Image.SCALE_SMOOTH);
            image2 = ImageIO.read(ur2).getScaledInstance(450, 430, Image.SCALE_SMOOTH);
        } catch (IOException e) {
        	System.out.println("�̹��� �ҷ����� ���� : " + e.getMessage());
        }
        
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(15, 0, 325, 432);
        JLabel label2 = new JLabel(new ImageIcon(image2));
        label2.setBounds(359, 0, 325, 432);
        
        mainPage.add(label);
        mainPage.add(label2);
        
        JLabel label_1 = new JLabel("��ӳ���Ʈ ƾ ����");
        label_1.setFont(new Font("�޸տ�����", Font.PLAIN, 15));
        label_1.setBounds(15, 436, 150, 18);
        mainPage.add(label_1);
        
        JLabel label_2 = new JLabel("42,000");
        label_2.setForeground(new Color(255, 153, 0));
        label_2.setFont(new Font("�޸տ�����", Font.PLAIN, 15));
        label_2.setBounds(19, 460, 87, 18);
        mainPage.add(label_2);
        
        JLabel label_3 = new JLabel("���̵� ���� ������");
        label_3.setFont(new Font("�޸տ�����", Font.PLAIN, 15));
        label_3.setBounds(357, 436, 150, 18);
        mainPage.add(label_3);
        
        JLabel label_4 = new JLabel("72,000");
        label_4.setForeground(new Color(255, 153, 0));
        label_4.setFont(new Font("�޸տ�����", Font.PLAIN, 15));
        label_4.setBounds(361, 460, 87, 18);
        mainPage.add(label_4);
        frame.getContentPane().add(mainPage);
        
        
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
