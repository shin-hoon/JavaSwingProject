package com.boram.member.view;

import java.util.Scanner;

import com.boram.member.controller.MemberController;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	public void mainmenu() {
		

	}
	
	public void join() {
		
		System.out.println("=== ȸ������ ===");
		
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���̵� : ");
		String id = sc.nextLine();
		
		System.out.println("��й�ȣ : ");
		String pwd = sc.nextLine();
		
		System.out.println("��ȭ��ȣ : ");
		String phone = sc.nextLine();
		
		System.out.println("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.println("�̸��� : ");
		String email = sc.nextLine();

	}
	
	public void logIn() {
		
	}
	
	public void searchId() {
		

	}
	
	public void searchPwd() {
		

	}
	
	
}
