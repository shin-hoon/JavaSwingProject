package com.boram.myPage.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.boram.manager.vo.Product;
import com.boram.myPage.controller.MyCart;

public class MyCartView {
	Scanner sc = new Scanner(System.in);
	MyCart mc = new MyCart();

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
			System.out.println("5. ��ٱ��� �����ϱ�");
			System.out.println("0. �����޴���");
			System.out.print("�Է�  : ");
			try {
				inp = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���.");
			}
			// inp = sc.nextInt();
			// sc.nextLine();
			switch (inp) {
			case 1:
				cartPrint();
				break;
			case 2:
				cartDelete();
				break;
			case 3:
				cartDeleteAll();
				break;
			case 4:
				cartOrder();
				break;
			case 5:
				saveCart();
				break;
			case 0:
				break;
			default:
				return;
			}
		}
	}

	public void cartPrint() {
		ArrayList<Product> p = mc.cartPrint();
		if (p.isEmpty()) {
			System.out.println("��ٱ��ϰ� ����ֽ��ϴ�.");
		} else {
			for (Product i : p) {
				System.out.print(i.getpNo());
				System.out.print(i.getCategory());
				System.out.print(i.getPrice());
				System.out.print(i.getSize());
				System.out.println();

			}
		}

	}

	public void cartDelete() {
		System.out.println("������ ǰ���ȣ�� �Է��ϼ���.");
		int delete = sc.nextInt();
		sc.nextLine();
		int result = mc.deleteCart(delete);
		if (result == 0) {
			System.out.println("��������");
		} else {
			System.out.println(delete + "�� �����Ǿ����ϴ�.");
		}

	}

	public void cartDeleteAll() {
		while (true) {
			System.out.print("���� ��ü �����Ͻðڽ��ϱ�?(Y/N) : ");
			char inp = sc.nextLine().charAt(0);
			switch (inp) {
			case 'y':
			case 'Y':
				mc.cartDeleteAll();
				System.out.println("���������� �����Ͽ����ϴ�.");
				return;
			case 'n':
			case 'N':
				System.out.println("�����޴��� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				System.out.println("�ٽ��Է����ּ���.");
				continue;
			}
		}
	}

	public void cartOrder() {

	}

	public void saveCart() {

	}

	public void addCart() {

	}
}
