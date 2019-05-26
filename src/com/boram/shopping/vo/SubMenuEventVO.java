package com.boram.shopping.vo;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubMenuEventVO {
	private JLabel menu;
	private JPanel subMenu;
	private boolean menuChk;
	private int x;
	private int y;
	
	@Override
	public String toString() {
		return "x = "       + x +
		       "y = "       + y +
		       "menuChk = " + menuChk +
			   "menu = "    + menu.getName() +
			   "subMenu = " + subMenu.getName();
	}
	
	public JLabel getMenu() {
		return menu;
	}
	public void setMenu(JLabel menu) {
		this.menu = menu;
	}
	public JPanel getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(JPanel subMenu) {
		this.subMenu = subMenu;
	}
	public boolean isMenuChk() {
		return menuChk;
	}
	public void setMenuChk(boolean menuChk) {
		this.menuChk = menuChk;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
