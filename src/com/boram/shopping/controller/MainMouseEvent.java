package com.boram.shopping.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainMouseEvent extends MouseAdapter{
	JPanel subMenu;
	JScrollPane subMenuScroll;
	String what;

	public MainMouseEvent(JPanel subMenu, JScrollPane subMenuScroll,String what) {
		this.subMenu= subMenu;
		this.subMenuScroll = subMenuScroll;
		this.what = what;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(what.equals("서브메뉴닫기")) {
			new MainThreadEvent(subMenu,subMenuScroll,-376,0,"서브메뉴닫기").start();
		}
		else if(what.equals("서브메뉴열기")) {
			new MainThreadEvent(subMenu,subMenuScroll,-376,0,"서브메뉴열기").start();
		}
	}
}
