package com.boram.member.controller;

import java.util.ArrayList;

import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;
import com.boram.myPage.controller.MyCart;

public class MemberController {

	MemberDao md = new MemberDao();
	MyCart ca=new MyCart();
	ArrayList<Member> memberList = md.fileRead();
	Member m= new Member();
	//md.fileSave(memberList);
	{//�ʱ��ӽõ����� �߰� : ����
		//"name1",950417,"id1","pwd2","01029346330","seoul","email.com" 
		memberList.add(new Member("name1",950411,"id1","pwd1","01029346331","seoul","1mail.com"));
		memberList.add(new Member("name2",950412,"id2","pwd2","01029346332","seou1","2mail.com"));
		memberList.add(new Member("name3",950413,"id3","pwd3","01029346333","seou2","3mail.com"));
		memberList.add(new Member("name4",950414,"id4","pwd4","01029346334","seou3","4mail.com"));
		memberList.add(new Member("name5",950415,"id5","pwd5","01029346335","seou4","5mail.com"));
	}
	
	public void join(String name, int age, String id, String pwd, String phone, String address, String email) {
		
		memberList.add(new Member(name, age, id, pwd, phone, address, email));
	}

	public Member logIn(String id, String pwd) {

		for (int i = 0; i < memberList.size(); i++) {

			// ����� ���̵�� �н����尡 �Է��� ���̴ٶ� �н������ ������
			if (memberList.get(i).getId().equals(id) && memberList.get(i).getPwd().equals(pwd)) {
				//grant=memberList.get(i).getmNo();
				//memberList.get(i)�� �����԰����ÿ� nugu�޼ҵ带���� ���� �α����޴��� �˷���.
				m = memberList.get(i);
				//�α��ΰ� ���ÿ� �����س��Ѵ� ��ٱ��� �ҷ�����.
				ca.loadCart();
				return m;
			}
		}
		return null;
	}

	public String searchId(String name, String email) {

		String id = null;

		for (int i = 0; i < memberList.size(); i++) {

			if (memberList.get(i).getEmail().equals(email) && (memberList.get(i).getName().equals(name))) { // ����� ȸ�� ����
				id = memberList.get(i).getId();
			}
		}

		return id;

	}

	public String searchPwd(String name, String email) {

		String pwd = null;

		for (int i = 0; i < memberList.size(); i++) {

			if (memberList.get(i).getEmail().equals(email) && (memberList.get(i).getName().equals(name))) { // ����� ȸ�� ����
				pwd = memberList.get(i).getPwd();
			}
		}

		return pwd;

	}
	
	public Member nugu() {
		return m;
	}


}
