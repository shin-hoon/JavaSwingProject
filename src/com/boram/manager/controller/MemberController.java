package com.boram.manager.controller;

import java.util.ArrayList;

import com.boram.manager.vo.Product;
import com.boram.member.vo.Member;

public class MemberController {
	
	private ArrayList<Product> list = new ArrayList<Product>();
	private MemberDao md = new MemberDao();
	
	public Member[] selectMemberList() {
		
		return md.fildRead();
		
	}
	
	public void addProduct(int pNo, int category, String productName, int price, String size, int stock) {
		
		list.add(new Product(pNo, category, productName, price, size, stock));
	}
	
	public int updateProduct(int category, String productName, int price, String size, int stock) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getpNo().contain(pNo)){
				
				list.get(i).setCategory(category);
				list.get(i).setProductName(productName);
				list.get(i).setPrice(price);
				list.get(i).setSize(size);
				list.get(i).setStock(stock);
				
				result = 1;
				
			}
		}
		return result;
		
		
	}
	
	public int deletProduct(int pNo) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getpNo().equals(pNo)) {
				
				list.remove(i);
				result = 1;
			}
		}
		
	}

}
