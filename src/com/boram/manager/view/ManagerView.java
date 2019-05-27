package com.boram.manager.view;

import java.util.Scanner;

import com.boram.manager.controller.MemberController;

public class ManagerView {
	
	Scanner sc = new Scanner(System.in);
	
	MemberController mc = new MemberController();
			
	
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println(" * �޴��� �������ּ��� * ");
			// 1. �ɹ��˻�
			System.out.println("1. �ɹ��˻�");
			// 2. ��ǰ���
			System.out.println("2. ��ǰ���");
			// 3. ��ǰ����
			System.out.println("3. ��ǰ����");
			// 4. ��ǰ����
			System.out.println("4. ��ǰ����");
			// ��ȣ����(choice):
			System.out.println(" ��ȣ�� �������ּ��� ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : searchMember(); break;
			case 2 : addProduct(); break;
			case 3 : updateProduct(); break;
			case 4 : deletProdcut(); break;
			case 0 : System.out.println("�޴��� �����մϴ�.");return;
			default : System.out.println("�߸��Է��Ͽ����ϴ�.");break;
			
			
			}
			
			
		}
		
	}
	
	
	public void searchMember() { // �ϵ� ����
		
		/* ȸ����ü�� ����� ��
		 ȸ�����̵� �Է¹ް� ��Ʈ�ѷ� ��������
		 searchMember�� ����־ �˻����� ���
		 (���Ҷ� equals ���� contain���)
		 */
	}
	
	public void addProduct() {
		/*
		 * Member ArrayList�� ����
		 * pNo�� �������� ����� ��ȣ +1;
		 */
		// ī�װ�, ��ǰ��, ����, ũ��, ���� �Է¹ް�
		System.out.print("��ǰ��ȣ");
		int pNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("ī�װ� : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��ǰ�� : ");
		String productName = sc.nextLine();
		
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("ũ�� : ");
		String size = sc.nextLine();
		
		System.out.println("���� : ");
		int stock = sc.nextInt();
		
		mc.addProduct(pNo, category, productName, price, size, stock);
		
	}
	
	public void updateProduct() {
		/*
		 * pNo�� �ϳ� �Է¹޾� �ű⿡ �ִ� ���� ����
		 * pNo ��ġ�ϴ°��� �ִ��� ȭ�� �ϰ� ������ �ٽ��Է¹ް� �Ұ�	
		 * 1.ī�װ�
		 * 2.��ǰ��
		 * 3.����
		 * 4.ũ��
		 * ��ĳ�ʷ� ����� �������� ����
		 * �� �� ������ ���� ��ĳ�ʷ� �޾Ƽ� ������Ʈ
		 */
		// ����������
		System.out.println("������ ������ ����");
		
		System.out.println("1. ī�װ�");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.println("2. ��ǰ��");
		String productName = sc.nextLine();
		
		System.out.println("3. ����");
		int price = sc.nextInt();
		sc.nextInt();
		
		System.out.println("4. ũ��");
		String size = sc.nextLine();
		
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� ���� : ");
		String str = sc.nextLine();
		
		if(mc.updateProduct(category, productName, price, size, menu) == 0) {
			System.out.println("������ ������  ã�� ���߽��ϴ�.");
		}else {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}
		
	}
	
	public void deletProdcut() {
		// pNo���� �޾Ƽ� �� ���� ���� ��ü ����
		System.out.println("��ǰ ����");
		
		System.out.print("��ǰ��ȣ : ");
		int pNo = sc.nextInt();
		
		int result = mc.deletProduct(pNo);
		
		if(result == 0) {
			System.out.println("������ ��ǰ�� ã�� ���Ͽ����ϴ�.");
		}else {
			System.out.println("���������� �����Ͽ����ϴ�.");
		}
			
	}
		
		
}

