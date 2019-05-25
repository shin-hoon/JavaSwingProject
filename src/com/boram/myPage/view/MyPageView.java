package com.boram.myPage.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.boram.myPage.controller.ChangeMember;

public class MyPageView {
	Scanner sc = new Scanner(System.in);
	ChangeMember cm = new ChangeMember();

	public MyPageView() {
	}

	public void mainMenu() {//��ȸ�� �ӽø޴� 7 �� �����Ұ�.
		int inp = 0;
		while (true) {
			System.out.println("===== ȸ������ ���� =====");
			System.out.println("1. ID ���� ");
			System.out.println("2. PW ����");
			System.out.println("3. ���� ����");
			System.out.println("4. �ּ� ����");
			System.out.println("5. �̸��� ����");
			System.out.println("6. Phone ����");
			System.out.println("0. �����޴���");
			System.out.print("�Է� : ");
			
//				 inp = sc.nextInt();
//				 sc.nextLine();
				try {
					inp = sc.nextInt();
					sc.nextLine();

				} catch (InputMismatchException e) {
					System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���.");
					sc.nextLine();
					break;
				}

				switch (inp) {
				case 1:
					idChange();
					break;
				case 2:
					pwChange();
					break;
				case 3:
					ageChange();
					break;
				case 4:
					addressChange();
					break;
				case 5:
					emailChange();
					break;
				case 6:
					phoneChange();
					break;
				case 7 : printMem();//��ȸ�� �ӽø޴�.
					break;
				case 0:
					System.out.println("�����޴��� �̵��մϴ�.");
					return;
				default:
					System.out.println("�߸��Ȱ��Դϴ�.\n�ٽ��Է��ϼ���");
					break;
				}
			
		

		}
	}

	// *�� ~ ���� ~ �� ���������� ����Ǿ����ϴ�.
	// ������ 1, ���н� 0.
	// ���ΰ͸� �����Ҽ� �ֵ��� �����ÿ� mNo���
	// ȸ����ȣ�Է¶� ������ ������ȣ �Ѱ��ٰ�.
	public void idChange() {
		System.out.print("������ ȸ���� ȸ����ȣ�� �Է����ּ��� : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("������  id�� �Է����ּ��� : ");
		String newinp = sc.nextLine();
		int result = cm.idChange(mNo, newinp);
		if (result == 0) {
			System.out.println("ID ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("ID ���濡 �����Ͽ����ϴ�.");
		}
	}

	public void pwChange() {
		System.out.print("������ ȸ���� ȸ����ȣ�� �Է����ּ��� : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("������  ��й�ȣ�� �Է����ּ��� : ");
		String newinp = sc.nextLine();
		int result = cm.pwChange(mNo, newinp);
		if (result == 0) {
			System.out.println("��й�ȣ ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("��й�ȣ ���濡 �����Ͽ����ϴ�.");
		}
	}

	public void phoneChange() {
		System.out.print("������ ȸ���� ȸ����ȣ�� �Է����ּ��� : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("������  �޴�����ȣ�� �Է����ּ��� : ");
		String newinp = sc.nextLine();
		int result = cm.phoneChange(mNo, newinp);
		if (result == 0) {
			System.out.println("�޴�����ȣ ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("�޴�����ȣ ���濡 �����Ͽ����ϴ�.");
		}
	}

	public void addressChange() {
		System.out.print("������ ȸ���� ȸ����ȣ�� �Է����ּ��� : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("������  �ּҸ� �Է����ּ��� : ");
		String newinp = sc.nextLine();
		int result = cm.addressChange(mNo, newinp);
		if (result == 0) {
			System.out.println("�ּ� ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("�ּ� ���濡 �����Ͽ����ϴ�.");
		}
	}

	public void emailChange() {
		System.out.print("������ ȸ���� ȸ����ȣ�� �Է����ּ��� : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("������  �̸����� �Է����ּ��� : ");
		String newinp = sc.nextLine();
		int result = cm.emailChange(mNo, newinp);
		if (result == 0) {
			System.out.println("�̸��� ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("�̸��� ���濡 �����Ͽ����ϴ�.");
		}
	}

	public void ageChange() {
		System.out.print("������ ȸ���� ȸ����ȣ�� �Է����ּ��� : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("������  ���̸� �Է����ּ��� : ");
		int newinp = sc.nextInt();
		sc.nextLine();
		int result = cm.ageChange(mNo, newinp);
		if (result == 0) {
			System.out.println("���� ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� ���濡 �����Ͽ����ϴ�.");
		}
	}
	/**
	 * ��ȸ�� �ӽø޴�.
	 */
	public void printMem() {
		cm.printMem();
	}
}
