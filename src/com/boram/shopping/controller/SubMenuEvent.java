package com.boram.shopping.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import com.boram.shopping.vo.SubMenuEventVO;

public class SubMenuEvent implements MouseListener{
	int x, y;
	boolean outerChk = false;
	boolean topChk = false;
	
	
	public SubMenuEvent(ArrayList<SubMenuEventVO> list) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {
	/*	if(outerChk == false) {
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
			outerSubMenu.setVisible(false);*/
	}
	
}
