package com.boram.member.view;

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

	/**
	 * ȸ������ �ϴ°�
	 */
	public void join() {

		System.out.println("=== ȸ������ ===");

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�������(ex : 950417) : ");
		int birth = sc.nextInt();
		sc.nextLine();

		System.out.print("���̵� : ");
		String id = sc.nextLine();

		System.out.print("��й�ȣ : ");
		String pwd = sc.nextLine();

		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();

		System.out.print("�ּ� : ");
		String address = sc.nextLine();

		System.out.print("�̸��� : ");
		String email = sc.nextLine();

		mc.join(name, birth, id, pwd, phone, address, email);

		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");

	}

	/**
	 * �α��� �ϴ°�
	 */
	public void logIn() {

		System.out.println("===== �α��� =====");

		System.out.print("ID : ");
		String id = sc.nextLine();

		System.out.print("PWD : ");
		String pwd = sc.nextLine();

		Member logIn = mc.logIn(id, pwd);
		
		if(logIn == null) {
			System.out.println("ã�� �� ���� ȸ���Դϴ�.");
		} else {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
	}

	/**
	 * ���̵� ã��
	 */
	public void searchId() {

		System.out.println("===== ���̵� ã�� =====");

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�̸��� : ");
		String email = sc.nextLine();

		 String id =mc.searchId(name, email);

		if (id==null) {
			System.out.println("���̵� ã�� �� �����ϴ�.");

		} else {

			System.out.println("ã���ô� ID�� " +  id + " �Դϴ�.");
		}

	}

	/**
	 * ��й�ȣ ã��
	 */
	public void searchPwd() {

		System.out.println("===== ��й�ȣ ã�� =====");

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		
		String pwd = mc.searchPwd(name, email);

		if (pwd==null) {
			System.out.println("���̵� ã�� �� �����ϴ�.");

		} else {

			System.out.println("ã���ô� PWD�� " +  pwd + " �Դϴ�.");
		}
		
	}
}
