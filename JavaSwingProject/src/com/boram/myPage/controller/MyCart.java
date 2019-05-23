package com.boram.myPage.controller;

import java.util.ArrayList;

import com.boram.manager.vo.Product;

public class MyCart extends Product{
	 ArrayList<Product> PList= new ArrayList<>();
	 //product 에서 몇개만 뽑아서 장바구니리스트 만들어야함.
	 //장바구니리스트에 추가하는건 상품쪽에서.
	
	 
	 public MyCart() {
	}
	
	/**
	 * @param product 장바구니 추가될 product객체리스트.
	 */
	public void addCart(Product product) {
		PList.add(product);
	}
	/**
	 * 전체조회
	 * @return 전체리스트 리턴
	 */
	public ArrayList<Product> cartPrint() {
		return PList;
	}
	/**
	 * 삭제품목번호 받아서 삭제..
	 * @param delete 삭제할 품목번호
	 * @return 삭제성공1/실패0
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
	 * 장바구니 전체삭제.
	 */
	public void cartDeleteAll() {
		PList.clear();
	}
	
	/**
	 * 주문목록txt만들어서 그리옮기고 주문완료출력
	 * 비어있을경우엔 장바구니 비어있다고 출력.
	 * if PList == null return 0.
	 */
	public void cartOrder() {
		
	}
	
	/**
	 * 실행시 회원번호 + cartList .txt만들어서 PList저장. 
	 */
	public void saveCart() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
