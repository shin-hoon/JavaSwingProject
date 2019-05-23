package com.boram.member.view;

import java.util.Scanner;

import com.boram.member.controller.MemberController;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	public void mainmenu() {
		

	}
	
	public void join() {
		
		System.out.println("=== 회원가입 ===");
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
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

	}
	
	public void logIn() {
		
	}
	
	public void searchId() {
		

	}
	
	public void searchPwd() {
		

	}
	
	
}
