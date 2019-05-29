package com.boram.myPage.controller;

import java.util.ArrayList;

import com.boram.member.controller.MemberController;
import com.boram.member.vo.Member;

public class ChangeMember {
	private ArrayList<Member> MemberList = new ArrayList<>();
	MemberController mc= new MemberController();
	Member m = mc.nugu(); 
	int mNo = m.getmNo();
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
	public int idChange(String newId) {
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
	public int pwChange(String newPw) {
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
	public int phoneChange(String newPhone) {
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
	public int addressChange(String newAddress) {
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
	public int emailChange(String newEmail) {
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
	public int ageChange(int newAge) {
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
