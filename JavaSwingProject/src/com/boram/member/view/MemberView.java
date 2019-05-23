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

		System.out.println("=== ȸ������ ===");

		System.out.println("�̸� : ");
		String name = sc.nextLine();

		System.out.println("�������(ex : 950417) : ");
		int birth = sc.nextInt();
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

		mc.join(name, birth, id, pwd, phone, address, email);

		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");

	}

	public void logIn() {

	}

	public void searchId() {

		System.out.println("===== ���̵� ã�� =====");

		System.out.println("�̸� : ");
		String name = sc.nextLine();

		System.out.println("�̸��� : ");
		String email = sc.nextLine();

		ArrayList<Member> searchId = mc.searchId(email);

		if (searchId.isEmpty()) {
			System.out.println("���̵� ã�� �� �����ϴ�.");

		} else {

			for (Member m : searchId) {
				System.out.println(m);
			}
		}

	}

	public void searchPwd() {

		System.out.println("===== ��й�ȣ ã�� =====");

		System.out.println("�̸� : ");
		String name = sc.nextLine();

		System.out.println("�̸��� : ");
		String email = sc.nextLine();

		ArrayList<Member> searchPwd = mc.searchId(email);

		if (searchPwd.isEmpty()) {
			System.out.println("��й�ȣ�� ã�� �� �����ϴ�.");

		} else {

			for (Member m : searchPwd) {
				System.out.println(m);

			}
		}
	}
}
