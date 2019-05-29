package com.boram.shopping.controller;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainThreadEvent extends Thread{
	int min, max;
	String what;
	JPanel subMenu;
	JScrollPane subMenuScroll;
	
	public MainThreadEvent(JPanel subMenu, JScrollPane subMenuScroll, int min, int max, String what) {
		this.min = min;
		this.max = max;
		this.what = what;
		this.subMenu = subMenu;
		this.subMenuScroll = subMenuScroll;
	}
	
	@Override
	public void run() {
		try {
			if(what.equals("����޴��ݱ�")) {
				for(int i = max; i >= min; i--) {
					subMenuScroll.setLocation(i,0);
					Thread.sleep(1);
				}
			}
			else if(what.equals("����޴�����")) {
				subMenuScroll.setVisible(true);
				subMenu.setVisible(true);
				for(int i = min; i <= max; i++) {
					subMenuScroll.setLocation(i,0);
					Thread.sleep(1);
				}
			}
		} catch (Exception e) {
			System.out.println("����޴� ���� : "+e.getMessage());
		}
	}

}
