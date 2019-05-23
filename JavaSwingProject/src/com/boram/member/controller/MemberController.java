package com.boram.member.controller;

import java.util.ArrayList;

import com.boram.manager.vo.Order;
import com.boram.manager.vo.Product;
import com.boram.member.model.vo.Member;



public class MemberController {
	
	
	private ArrayList<Member> memberList = new ArrayList<>();
	
	
	public void join(String name, int age, String id, String pwd, String phone, String address, String email) {
		
		memberList.add(new Member(name, age, id, pwd, phone, address, email));
	}
	
	public void logIn() {
		
	}
	
	public ArrayList<Member> searchId(String email) {
		
		ArrayList<Member> searchId = new ArrayList<>();
		
		for(int i = 0; i<memberList.size(); i++) {
		
		if(memberList.get(i).getEmail().equals(email)) {
			searchId.add(memberList.get(0));
		}
		}
		
		return searchId;
		

	}
	public ArrayList<Member> searchPwd(String email) {
		
		ArrayList<Member> searchPwd = new ArrayList<>();
		
		for(int i = 0; i<memberList.size(); i++) {
		
		if(memberList.get(i).getEmail().equals(email)) {
			searchPwd.add(memberList.get(0));
		}
		}
		
		return searchPwd;
		
	}

}
