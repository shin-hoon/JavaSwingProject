package com.boram.myPage.controller;

import java.util.ArrayList;

import com.boram.model.vo.Member;

public class ChangeMember {
	private ArrayList<Member> MemberList = new ArrayList<>();

	// private Member m= new Member();
	public ChangeMember() {
	}

	/**
	 * 변경. 이하동일.
	 * 
	 * @param mNo
	 *            멤버번호 -> 본인것만 변경할수 있도록 수정해야함.
	 * @param new*
	 *            바꿀항목
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
}
