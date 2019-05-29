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
			if(what.equals("서브메뉴닫기")) {
				for(int i = max; i >= min; i--) {
					subMenuScroll.setLocation(i,0);
					Thread.sleep(1);
				}
			}
			else if(what.equals("서브메뉴열기")) {
				subMenuScroll.setVisible(true);
				subMenu.setVisible(true);
				for(int i = min; i <= max; i++) {
					subMenuScroll.setLocation(i,0);
					Thread.sleep(1);
				}
			}
		} catch (Exception e) {
			System.out.println("서브메뉴 오류 : "+e.getMessage());
		}
	}

}
