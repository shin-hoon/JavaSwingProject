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
			System.out.println("6. ��ٱ��� �ҷ�����");
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
			case 6:
				loadCart();
			case 0:
				return;
			default:
				return;
			}
		}
	}
	/**
	 * ��ٱ��� ��ü���
	 * �������������
	 * ��ǰ��, ī�װ�, ������, ���� ���
	 */
	public void cartPrint() {
		ArrayList<Product> p = mc.cartPrint();
		if (p.isEmpty()) {
			System.out.println("��ٱ��ϰ� ����ֽ��ϴ�.");
		} else {
			for (Product i : p) {
				System.out.print(i.getpNo()+"\t");
				System.out.print(i.getProductName()+"\t");
				System.out.print(i.getCategory()+"\t");
				System.out.print(i.getSize()+"\t");
				System.out.print(i.getPrice()+"\t");
				System.out.println();

			}
		}

	}

	/**
	 * ��������1/���� 0
	 */
	public void cartDelete() {
		System.out.print("������ ǰ���ȣ�� �Է��ϼ��� : ");
		int delete = sc.nextInt();
		sc.nextLine();
		
		int result = mc.cartDelete(delete);
		if (result == 0) {
			System.out.println("��������");
		} else {
			System.out.println(delete + "���� �����Ǿ����ϴ�.");
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

	/**
	 * �׽�Ʈ�Ϸ��� �ٽüպ���!! �ֹ����ϻ�������(�ֹ�����) =0
	 *  �ֹ����� �����Ϸ� �Ǿ����� ��ٱ��� ���� �Ǵ� ����Ʈ ������������ 1
	 *  �ֹ����ϻ����Ϸ��� ��ٱ������� �� ��ٱ��ϸ���Ʈ �����Ϸ� =2 (��������) 
	 */
	public void cartOrder() {
		int result = mc.cartOrder();
		switch (result) {
		case 1:System.out.println("�ֹ����ϸ������Ϸ�.");
		System.out.println("���� �Ǵ� ����Ʈ ��������");
			break;
		case 2:System.out.println("�ֹ����� �� ��ٱ�������,����Ʈ���� ����!");
			break;
		case 0:System.out.println("�ֹ����� ��������, ��ٱ������Ϲ� ����Ʈ ������������.");
			break;
		default:
			System.out.println("????");
			break;
		}
	}

	public void saveCart() {
		System.out.println("��ٱ��ϸ� �����Ͻðڽ��ϱ�?");
		System.out.println("���� ��ٱ��ϸ������ ��������ϴ�.");
		System.out.print("�Է�(Y/N) : ");
		char inp = sc.nextLine().charAt(0);
		switch(inp) {
		case 'y':
		case 'Y':int result=mc.saveCart();
		if(result==0) {
			System.out.println("�������");
			System.out.println(result);//���п��θ���.//�ӽ�.
		}else {
			System.out.println("���强��");
		}
			return;
		case 'n':
		case 'N':System.out.println("�����޴���");
			return;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("�����޴���.");
			return;
		}
	}

	public void addCart() {
		//mc.addCart(product);
	}

	public void loadCart() {
		mc.loadCart();
		return;
	}
}
