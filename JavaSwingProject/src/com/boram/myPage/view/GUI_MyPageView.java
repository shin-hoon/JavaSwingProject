package com.boram.myPage.view;

import java.awt.*;
import javax.swing.*;
//�����Ӹ�.setPreferredSize(new Dimension(int width,int height));
public class GUI_MyPageView extends JFrame {
	public GUI_MyPageView() {
		
		//�����ӿ� ����ø���
		//���ʹ�ư������
		//��� ī��� ��������ȯ.
		//�޼ҵ� ������ �����Ұ�.
		//
	
		JFrame frame = new JFrame("My Page");// ȸ������ ������
		frame.setSize(900, 900);

		JPanel pan1 = new JPanel();
		pan1.setPreferredSize(new Dimension( 1,100));
		pan1.setLayout(new GridLayout(1, 1));
		//pan1.setSize(1,1);// ����*���� ������ ����ȵ�. ��?
		pan1.setBackground(Color.RED);
		
		JLabel la = new JLabel("My Page");
		pan1.add(la);

		JPanel pan2 = new JPanel();
		pan2.setPreferredSize(new Dimension( 130,10));
		pan2.setLayout(new BoxLayout(pan2, BoxLayout.Y_AXIS));
		JLabel la1 = new JLabel("ȸ����������");
		JButton bt1 = new JButton("  1. ID ����           ");
		JButton bt2 = new JButton("  2. PW ����      ");
		JButton bt3 = new JButton("  3. Phone ����   ");
		JButton bt4 = new JButton("  4. �ּ� ����      ");
		JButton bt5 = new JButton("  5. �̸��� ����  ");
		JButton bt6 = new JButton("  6. ���� ����      ");
		JButton bt7 = new JButton("  0. ���� �޴���   ");
		pan2.add(la1);
		pan2.add(bt1);
		pan2.add(bt2);
		pan2.add(bt3);
		pan2.add(bt4);
		pan2.add(bt5);
		pan2.add(bt6);
		pan2.add(bt7);
		
		//��ư������ ���������?
		//���δ� �þ�µ� ���δ� �ȴþ.
		//�ϳ��� ��������� �۵�����
//		la1.setPreferredSize(new Dimension(130,100));
//		bt1.setPreferredSize(new Dimension(130,100));
//		bt2.setPreferredSize(new Dimension(130,100));
//		bt3.setPreferredSize(new Dimension(130,100));
//		bt4.setPreferredSize(new Dimension(130,100));
//		bt5.setPreferredSize(new Dimension(130,100));
//		bt6.setPreferredSize(new Dimension(130,100));
//		bt7.setPreferredSize(new Dimension(130,100));
		
		
		
		
		
		
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		JPanel card1= new JPanel();
		card1.setBackground(Color.WHITE);
		
		frame.add(pan1,"North");
		frame.add(pan2,"West");
		frame.add(card1,"Center");
		
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		
		
		
		
	}
}
