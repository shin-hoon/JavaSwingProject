package com.boram.shopping.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainPage extends JFrame{
	
	public void start() {
		setTitle("Boram����");
		setBounds(600,0,418,900);  //  600������ ��ġ x , ������ ��ġ y , �����̳� x , �����̳� y
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainManu = new JPanel();
//		MainManu.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		mainManu.setBackground(Color.WHITE);
		
		JScrollPane scroll = new JScrollPane(mainManu);
		mainManu.setPreferredSize(new Dimension(318,5200));		
		add(scroll);
		
	}

}
