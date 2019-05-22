package com.boram.myPage.controller;

import java.util.ArrayList;

import com.boram.model.vo.Member;

public class ChangeMember {
	private ArrayList<Member> MemberList = new ArrayList<>();

	// private Member m= new Member();
	public ChangeMember() {
	}

	/**
	 * ����. ���ϵ���.
	 * 
	 * @param mNo
	 *            �����ȣ -> ���ΰ͸� �����Ҽ� �ֵ��� �����ؾ���.
	 * @param new*
	 *            �ٲ��׸�
	 * @return ������1, ���н�0��ȯ.
	 */
	// id
	public int idChange(int mNo, String newId) {
		int result = 0;
		try {
			MemberList.get(mNo).setId(newId);
			result = 1;
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("�߸��� ���Դϴ�!");
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
			System.out.println("�߸��� ���Դϴ�!");
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
			System.out.println("�߸��� ���Դϴ�!");
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
			System.out.println("�߸��� ���Դϴ�!");
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
			System.out.println("�߸��� ���Դϴ�!");
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
			System.out.println("�߸��� ���Դϴ�!");
			result = 0;
		}
		return result;
	}
}
