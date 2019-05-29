package com.boram.manager.vo;

public class Category {
	
	
	
	private int num;
	private String kind;
	
	
	
	public Category(int num, String kind) {
		super();
		this.num = num;
		this.kind = kind;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Category [num=" + num + ", kind=" + kind + "]";
	}
	
	
}
