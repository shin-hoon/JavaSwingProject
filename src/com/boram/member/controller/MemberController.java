package com.boram.member.controller;

import java.util.ArrayList;

import com.boram.manager.vo.Order;
import com.boram.manager.vo.Product;
import com.boram.member.vo.Member;



public class MemberController {
	
	
	private ArrayList<Member> memberList = new ArrayList<>();
	
	
	public void join(String name, int age, String id, String pwd, String phone, String address, String email) {
		
		memberList.add(new Member(name, age, id, pwd, phone, address, email));
	}
	
	public Member logIn(String id, String pwd) {
		
		ArrayList<Member> logIn = new ArrayList<>();
		
		for(int i = 0; i<memberList.size(); i++) {
			
			// ����� ���̵�� �н����尡 �Է��� ���̴ٶ� �н������ ������
			if(memberList.get(i).getId().equals(id) && memberList.get(i).getPwd().equals(pwd)) {
				return memberList.get(i);
	
		}
	}
		return null;
	}
	
	public String searchId(String name,String email) {
		
		String id =null;
		
		for(int i = 0; i<memberList.size(); i++) {
		
		if(memberList.get(i).getEmail().equals(email)&&(memberList.get(i).getName().equals(name))) { // ����� ȸ�� ���� �̸��Ͽ� �Է��� �̸����� ��ġ�ϸ�
			id =memberList.get(i).getId();
		}
		}
		
		return id;
		

	}
	public String searchPwd(String name, String email) {
		
		String pwd =null;
	
		for(int i = 0; i<memberList.size(); i++) {
		
		if(memberList.get(i).getEmail().equals(email)&&(memberList.get(i).getName().equals(name))) { // ����� ȸ�� ���� �̸��Ͽ� �Է��� �̸����� ��ġ�ϸ�
			pwd=memberList.get(i).getPwd();
		}
		}
		
		return pwd;
		
	}

}
