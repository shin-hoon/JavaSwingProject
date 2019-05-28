package com.boram.shopping.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainMouseEvent extends MouseAdapter{
	JPanel subMenu;
	JScrollPane subMenuScroll;

	public MainMouseEvent(JPanel subMenu, JScrollPane subMenuScroll) {
		this.subMenu= subMenu;
		this.subMenuScroll = subMenuScroll;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//subMenuClose
		new Thread() {
			public void run() {
				try {
					for(int i = 0; i >= -376; i--) {
//						subMenu.setLocation(i,0);
						subMenuScroll.setLocation(i,0);
						Thread.sleep(1);
					}
				} catch (Exception e) {
					System.out.println("서브메뉴 닫기 오류 : "+e.getMessage());
				}
			}
		}.start();
		
	/*	subMenuScroll.setVisible(true);
		subMenu.setVisible(true);
		new Thread() {
			public void run() {
				try {
					for(int i = -376; i <= 0; i++) {
						subMenu.setLocation(i,0);
						subMenuScroll.setLocation(i,0);
						Thread.sleep(1);
					}
				} catch (Exception e) {
					System.out.println("서브메뉴 오류 : "+e.getMessage());
				}
			}
		}.start();*/
	}
}
