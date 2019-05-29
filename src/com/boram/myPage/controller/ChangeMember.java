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
	 * ����. ���ϵ���..
	 * 
	 * @param mNo �����ȣ -> ���ΰ͸� �����Ҽ� �ֵ��� �����ؾ���.
	 * @param new* �ٲ��׸�
	 * @return ������1, ���н�0��ȯ.
	 */
	// id
	public int idChange(String newId) {
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
	public int pwChange(String newPw) {
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
	public int phoneChange(String newPhone) {
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
	public int addressChange(String newAddress) {
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
	public int emailChange(String newEmail) {
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
	public int ageChange(int newAge) {
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
	
	
	
	/**
	 * ��ȸ�� �ӽø޴� 
	 */
	public void printMem() {
		for(Member i:MemberList) {
			
			System.out.println(i);
		}
			
	}
}
