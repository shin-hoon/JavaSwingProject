package com.boram.myPage.view;

import java.util.Scanner;

public class MyCartView {
	Scanner sc = new Scanner(System.in);

	public MyCartView() {
	}

	public void cartMenu() {
		int inp = 0;
		while (true) {
			System.out.println("===== ��ٱ��� �޴� =====");
			System.out.println("1. ��ٱ��� ���");// ��������ݾ� ���.
			System.out.println("2. ��ٱ��� ����");
			System.out.println("3. ��ٱ��� ��ü ����");
			System.out.println("4. ��ٱ��� �ֹ��ϱ�");
			System.out.println("0. �����޴���");
			System.out.print("�Է�  : ");
			// try {
			// inp = sc.nextInt();
			// sc.nextLine();
			// }catch(InputMismatchException e) {
			// System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���.");
			// }
			inp = sc.nextInt();
			sc.nextLine();
			switch (inp) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				break;
			default:
				return;
			}
		}
	}
	public void cartPrint() {
		
	}
	public void cartDelete() {
		
	}
	public void cartDeleteAll() {
		
	}
	public void cartOrder() {
		
	}
}
