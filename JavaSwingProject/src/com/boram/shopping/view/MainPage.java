package com.boram.shopping.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainPage extends JFrame{
	
	public void start() {
		
		setTitle("Boram닷컴");
		setBounds(600,0,918,900);  //  600윈도우 위치 x , 윈도우 위치 y , 컨테이너 x , 컨테이너 y 418,900
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainManu = new JPanel();
//		MainManu.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		mainManu.setBackground(Color.blue);
		mainManu.setBounds(100,100,100,100);
		mainManu.setVisible(true);
		
		JLabel t = new JLabel("htsadasd");
		t.setText("ggggggg");
		mainManu.add(t);
		add(mainManu);
		
		JScrollPane scroll = new JScrollPane(mainManu);
		mainManu.setPreferredSize(new Dimension(318,5200));		
//		add(scroll);
		
	}

}
