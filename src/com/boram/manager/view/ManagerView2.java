package com.boram.manager.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.boram.manager.controller.ManagerController2;
import com.boram.manager.vo.OrderDao;
import com.boram.manager.vo.Product;
import com.boram.manager.vo.ProductDao;
import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;

public class ManagerView2 {

	Scanner sc = new Scanner(System.in);
	ManagerController2 mc = new ManagerController2();
	private MemberDao md = new MemberDao();
	private ProductDao pd = new ProductDao();
	private OrderDao od = new OrderDao();
	
	
	
	public void mainMenu() {
		System.out.println("=== �α��� ===");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pwd = sc.nextLine();

		int result = mc.checkLogin(id, pwd);

		if (result == 0) {
			System.out.println("�α��ο� �����Ͽ����ϴ� ���̵�� ��й�ȣ�� Ȯ�����ּ���");
		} else if (result == 1) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�");
		} else {
			System.out.println("=== ������ ������ ===");
			while (true) {
				System.out.println("1.����˻�");
				System.out.println("2.��ǰ���");
				System.out.println("3.��ǰ ����");
				System.out.println("4.��ǰ ����");
				System.out.println("5.�������");
				System.out.println("6.�Ǹźм�");
				System.out.println("7.�Ǹ���Ȳ");
				System.out.println("9. ���α׷� ����");
				System.out.print("�޴� ����");
				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {
				case 1:
					searchMember();
					break;
				case 2:
					insertProduct();
					break;
				case 3:
					updateProduct();
					break;
				case 4:
					deleteProduct();
					break;
				case 5:
					updateStock();
					break;
				case 6:
					analysis();
					break;
				case 7:
					salesState();
					break;
				case 9:
					System.out.println("���α׷��� �����մϴ�.");
					return;

				default:
					System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ� �ٽ��Է����ּ���");
					break;
				}
			}

		}

	}
	
	public void searchMember() {
		
		ArrayList<Member> mArr = mc.searchMember();
		
		
		for (int i = 0; i < mArr.size(); i++) {
			System.out.println(mArr.get(i));
		}
		System.out.print("������ ȸ����ȣ�� �Է��Ͻÿ�");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < mArr.size(); i++) {
			if(mArr.get(i).getmNo() == num) {
				mArr.remove(i);
				
			}
		}
		System.out.print("������ ���̵� �Է��ϼ���");
		String id = sc.nextLine();
		for (int i = 0; i < mArr.size(); i++) {
			if(mArr.get(i).getmNo() == num) {
				mArr.remove(i);
				
			}
		}
		
		MemberDao md  = new MemberDao();
		md.fileSave(mArr);
		
	}
	public void insertProduct() {
		System.out.print("ī�װ��� �Է��ϼ��� (1~5)");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ���� �Է��ϼ���");
		String productName = sc.nextLine();
		System.out.print("������ �Է��ϼ���");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("ũ�⸦ �Է��ϼ���");
		String size = sc.nextLine();
		System.out.print("�󼼼�����  �Է��ϼ���");
		String explain = sc.nextLine();
		System.out.print("���� : ");
		int stock = sc.nextInt();
		mc.insertProduct(category, productName, price, size, explain, stock);
		
		pd.fileSave(mc.searchProduct());
		
	}
	public void updateProduct() {
		
		ArrayList<Product> pArr = mc.searchProduct();
		if (pArr.size() ==0) {
			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
			return;
		} else {
			for (int i = 0; i < pArr.size(); i++) {
				System.out.println(pArr.get(i));
			}
		}
		
		
		System.out.println("������ ��ǰ��ȣ�� �Է��Ͻÿ�");
		int pNo = sc.nextInt();
		if(mc.searchpNo(pNo)==-1) {
			System.out.println("�˻��� ��� ���� �����ϴ�");
		}else {
			System.out.println("������ ��  ����");
			System.out.println("1. ī�װ�");
			System.out.println("2. ��ǰ��");
			System.out.println("3. ����");
			System.out.println("4. ũ��");
			System.out.println("5. �󼼼���");
			System.out.print("��ȣ���� : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("��������");
			String update =sc.nextLine();
			
			mc.updateProduct(mc.searchpNo(pNo), num, update);
			
		}
		pd.fileSave(mc.searchProduct());
	}
	public void deleteProduct() {
		System.out.print("������ ��ȣ ���� : ");
		int pNo = sc.nextInt();
		int result = mc.searchpNo(pNo);
		
		if(result == -1) {
			System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
		}else {
			mc.deleteProduct(result);
		}
		pd.fileSave(mc.searchProduct());
	}
	public void updateStock() {
		System.out.println("������ ��ǰ��ȣ�� �Է��Ͻÿ�");
		int pNo = sc.nextInt();
		int result = mc.searchpNo(pNo);
		if(result == -1) {
			System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
		}else {
			System.out.print("������ ������ �Է� : ");
			int stock = sc.nextInt();
			mc.updateProduct(result, stock);
		}
		pd.fileSave(mc.searchProduct());
	}
	public void analysis() {
		HashMap<Integer, Double> anl =new HashMap<Integer, Double>();
		ArrayList<Integer> keyValue = new ArrayList<Integer>();
		
		anl = mc.analysis();
		
		Set<Integer> key = anl.keySet();
		Iterator<Integer> itKey = key.iterator();
		while(itKey.hasNext()) {
			int value = itKey.next();
			double result = anl.get(value);
			
			System.out.println(value + " : " + result);
		}
		
		
		
		
	}
	public void salesState() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		int month =Integer.parseInt(sdf.format(d)); 
		
		int term = 2;
		
		ArrayList<Integer> sales = mc.salesState(month, term);
		
		for (int i = 0; i < sales.size(); i++) {
			System.out.println((Integer.parseInt(sdf.format(d)) - i)+ " ����� : " + sales.get(i));
		}
		
	}
	
}
