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
			System.out.println("== �޴� ==");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���̵� ã��");
			System.out.println("4. ��й�ȣ ã��");
			System.out.println("0. ����");
			System.out.print("�޴����� : ");
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
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				break;
			}

		}

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

		System.out.println("===== �α��� =====");

		System.out.println("ID : ");
		String id = sc.nextLine();

		System.out.println("PWD : ");
		String pwd = sc.nextLine();

		mc.logIn(id, pwd);
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
