package com.boram.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.boram.member.controller.MemberController;
import com.boram.member.model.vo.Member;

public class MemberView {

	private Scanner sc = new Scanner(System.in);

	private MemberController mc = new MemberController();

	public void mainmenu() {

	}

	public void join() {

		System.out.println("=== 회원가입 ===");

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("생년월일(ex : 950417) : ");
		int birth = sc.nextInt();
		sc.nextLine();

		System.out.println("아이디 : ");
		String id = sc.nextLine();

		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();

		System.out.println("전화번호 : ");
		String phone = sc.nextLine();

		System.out.println("주소 : ");
		String address = sc.nextLine();

		System.out.println("이메일 : ");
		String email = sc.nextLine();

		mc.join(name, birth, id, pwd, phone, address, email);

		System.out.println("회원가입이 완료되었습니다.");

	}

	public void logIn() {

	}

	public void searchId() {

		System.out.println("===== 아이디 찾기 =====");

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("이메일 : ");
		String email = sc.nextLine();

		ArrayList<Member> searchId = mc.searchId(email);

		if (searchId.isEmpty()) {
			System.out.println("아이디를 찾을 수 없습니다.");

		} else {

			for (Member m : searchId) {
				System.out.println(m);
			}
		}

	}

	public void searchPwd() {

		System.out.println("===== 비밀번호 찾기 =====");

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("이메일 : ");
		String email = sc.nextLine();

		ArrayList<Member> searchPwd = mc.searchId(email);

		if (searchPwd.isEmpty()) {
			System.out.println("비밀번호를 찾을 수 없습니다.");

		} else {

			for (Member m : searchPwd) {
				System.out.println(m);

			}
		}
	}
}
