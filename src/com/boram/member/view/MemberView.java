package com.boram.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.boram.member.controller.MemberController;
import com.boram.member.vo.Member;

public class MemberView {

	private Scanner sc = new Scanner(System.in);

	private MemberController mc = new MemberController();

	public void mainmenu() {

		while (true) {
			System.out.println("== 메뉴 ==");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 아이디 찾기");
			System.out.println("4. 비밀번호 찾기");
			System.out.println("0. 종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				join();
				break;
			case 2:
				logIn();
				break;
			case 3:
				searchId();
				break;
			case 4:
				searchPwd();
				break;
			case 0:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다.");
				break;
			}

		}

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

		System.out.println("===== 로그인 =====");

		System.out.println("ID : ");
		String id = sc.nextLine();

		System.out.println("PWD : ");
		String pwd = sc.nextLine();

		mc.logIn(id, pwd);
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
