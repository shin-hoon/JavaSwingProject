package com.boram.myPage.controller;

import java.util.ArrayList;

import com.boram.member.vo.Member;

public class ChangeMember {
	private ArrayList<Member> MemberList = new ArrayList<>();
	{
		 //Member m[0]= new Member(0,"name1",950417,"id1","pwd2","01029346330","seoul","email.com");
		MemberList.add(new Member("name1",950411,"id1","pwd1","01029346331","seoul","1mail.com"));
		MemberList.add(new Member("name2",950412,"id2","pwd2","01029346332","seou1","2mail.com"));
		MemberList.add(new Member("name3",950413,"id3","pwd3","01029346333","seou2","3mail.com"));
		MemberList.add(new Member("name4",950414,"id4","pwd4","01029346334","seou3","4mail.com"));
		MemberList.add(new Member("name5",950415,"id5","pwd5","01029346335","seou4","5mail.com"));
		
	}
	//0,"name1",950417,"id1","pwd2","01029346330","seoul","email.com" 
	public ChangeMember() {
	}

	/**
	 * 변경. 이하동일..
	 * 
	 * @param mNo 멤버번호 -> 본인것만 변경할수 있도록 수정해야함.
	 * @param new* 바꿀항목
	 * @return 성공시1, 실패시0반환.
	 */
	// id
	public int idChange(int mNo, String newId) {
		int result = 0;
		try {
			MemberList.get(mNo).setId(newId);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("잘못된 값입니다!");
			result=0;
		}
		
		return result;
	}

	// pwd
	public int pwChange(int mNo, String newPw) {
		int result = 0;
		try {
			MemberList.get(mNo).setPwd(newPw);
			result=1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("잘못된 값입니다!");
			result=0;
		}
		return result;
	}

	// phone
	public int phoneChange(int mNo, String newPhone) {
		int result = 0;
		try {
			MemberList.get(mNo).setPhone(newPhone);
			result=1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("잘못된 값입니다!");
			result=0;
		}
		return result;
	}

	// address
	public int addressChange(int mNo, String newAddress) {
		int result = 0;
		try {
			MemberList.get(mNo).setAddress(newAddress);
			result=1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("잘못된 값입니다!");
			result = 0;
		}
		return result;
	}

	// email
	public int emailChange(int mNo, String newEmail) {
		int result = 0;
		try {
			MemberList.get(mNo).setEmail(newEmail);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("잘못된 값입니다!");
			result = 0;
		}
		return result;
	}

	// age
	public int ageChange(int mNo, int newAge) {
		int result = 0;
		try {
			MemberList.get(mNo).setAge(newAge);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("잘못된 값입니다!");
			result = 0;
		}
		return result;
	}
	/**
	 * 조회용 임시메뉴 
	 */
	public void printMem() {
		for(Member i:MemberList) {
			
			System.out.println(i);
		}
			
	}
}
