package com.boram.myPage.controller;

import java.util.ArrayList;

import com.boram.manager.vo.Product;

public class MyCart extends Product{
	 ArrayList<Product> PList= new ArrayList<>();
	 //product ���� ��� �̾Ƽ� ��ٱ��ϸ���Ʈ ��������.
	 //��ٱ��ϸ���Ʈ�� �߰��ϴ°� ��ǰ�ʿ���.
	
	 
	 public MyCart() {
	}
	
	/**
	 * @param product ��ٱ��� �߰��� product��ü����Ʈ.
	 */
	public void addCart(Product product) {
		PList.add(product);
	}
	/**
	 * ��ü��ȸ
	 * @return ��ü����Ʈ ����
	 */
	public ArrayList<Product> cartPrint() {
		return PList;
	}
	/**
	 * ����ǰ���ȣ �޾Ƽ� ����..
	 * @param delete ������ ǰ���ȣ
	 * @return ��������1/����0
	 */
	public int deleteCart(int delete) {
		int result=0;
		for(Product i:PList) {
			if(i.getpNo()==delete) {
				PList.remove(i);
				result=1;
			}else {
				result=0;
			}
		}
		return result;
	}
	/**
	 * ��ٱ��� ��ü����.
	 */
	public void cartDeleteAll() {
		PList.clear();
	}
	
	/**
	 * �ֹ����txt���� �׸��ű�� �ֹ��Ϸ����
	 * ���������쿣 ��ٱ��� ����ִٰ� ���.
	 * if PList == null return 0.
	 */
	public void cartOrder() {
		
	}
	
	/**
	 * ����� ȸ����ȣ + cartList .txt���� PList����. 
	 */
	public void saveCart() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
