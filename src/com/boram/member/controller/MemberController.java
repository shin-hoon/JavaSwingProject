package com.boram.member.controller;

import java.util.ArrayList;

import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;

public class MemberController {

	MemberDao md = new MemberDao();
	ArrayList<Member> memberList = md.fileRead();
	//md.fileSave(memberList);
	public void join(String name, int age, String id, String pwd, String phone, String address, String email) {
		
		memberList.add(new Member(name, age, id, pwd, phone, address, email));
	}

	public Member logIn(String id, String pwd) {

		for (int i = 0; i < memberList.size(); i++) {

			// 저장된 아이디랑 패스워드가 입력한 아이다랑 패스워드랑 같으면
			if (memberList.get(i).getId().equals(id) && memberList.get(i).getPwd().equals(pwd)) {
				return memberList.get(i);

			}
		}
		return null;
	}

	public String searchId(String name, String email) {

		String id = null;

		for (int i = 0; i < memberList.size(); i++) {

			if (memberList.get(i).getEmail().equals(email) && (memberList.get(i).getName().equals(name))) { // 저장된 회원 정보
																											// 이메일에 입력한
																											// 이메일이 일치하면
				id = memberList.get(i).getId();
			}
		}

		return id;

	}

	public String searchPwd(String name, String email) {

		String pwd = null;

		for (int i = 0; i < memberList.size(); i++) {

			if (memberList.get(i).getEmail().equals(email) && (memberList.get(i).getName().equals(name))) { // 저장된 회원 정보
																											// 이메일에 입력한
																											// 이메일이 일치하면
				pwd = memberList.get(i).getPwd();
			}
		}

		return pwd;

	}

}
