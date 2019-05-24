package com.boram.myPage.view;

import java.awt.*;
import javax.swing.*;
//프레임명.setPreferredSize(new Dimension(int width,int height));
public class GUI_MyPageView extends JFrame {
	public GUI_MyPageView() {
		
		//프레임에 제목올리고
		//왼쪽버튼누르면
		//가운데 카드로 페이지전환.
		//메소드 나눠서 적용할것.
		//
	
		JFrame frame = new JFrame("My Page");// 회원관리 프레임
		frame.setSize(900, 900);

		JPanel pan1 = new JPanel();
		pan1.setPreferredSize(new Dimension( 1,100));
		pan1.setLayout(new GridLayout(1, 1));
		//pan1.setSize(1,1);// 가로*세로 사이즈 적용안됨. 왜?
		pan1.setBackground(Color.RED);
		
		JLabel la = new JLabel("My Page");
		pan1.add(la);

		JPanel pan2 = new JPanel();
		pan2.setPreferredSize(new Dimension( 130,10));
		pan2.setLayout(new BoxLayout(pan2, BoxLayout.Y_AXIS));
		JLabel la1 = new JLabel("회원정보수정");
		JButton bt1 = new JButton("  1. ID 수정           ");
		JButton bt2 = new JButton("  2. PW 수정      ");
		JButton bt3 = new JButton("  3. Phone 수정   ");
		JButton bt4 = new JButton("  4. 주소 수정      ");
		JButton bt5 = new JButton("  5. 이메일 수정  ");
		JButton bt6 = new JButton("  6. 나이 수정      ");
		JButton bt7 = new JButton("  0. 이전 메뉴로   ");
		pan2.add(la1);
		pan2.add(bt1);
		pan2.add(bt2);
		pan2.add(bt3);
		pan2.add(bt4);
		pan2.add(bt5);
		pan2.add(bt6);
		pan2.add(bt7);
		
		//버튼사이즈 조정어떻게함?
		//세로는 늘어나는데 가로는 안늘어남.
		//하나라도 적용빠지면 작동안함
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
