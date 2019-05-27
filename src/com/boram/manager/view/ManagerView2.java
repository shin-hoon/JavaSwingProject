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
		System.out.println("=== 로그인 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();

		int result = mc.checkLogin(id, pwd);

		if (result == 0) {
			System.out.println("로그인에 실패하였습니다 아이디와 비밀번호를 확인해주세요");
		} else if (result == 1) {
			System.out.println("로그인에 성공하셨습니다");
		} else {
			System.out.println("=== 관리자 페이지 ===");
			while (true) {
				System.out.println("1.멤버검색");
				System.out.println("2.물품등록");
				System.out.println("3.물품 수정");
				System.out.println("4.물품 삭제");
				System.out.println("5.재고조정");
				System.out.println("6.판매분석");
				System.out.println("7.판매현황");
				System.out.println("9. 프로그램 종료");
				System.out.print("메뉴 선택");
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
					System.out.println("프로그램을 종료합니다.");
					return;

				default:
					System.out.println("번호를 잘못입력하셨습니다 다시입력해주세요");
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
		System.out.print("삭제할 회원번호를 입력하시오");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < mArr.size(); i++) {
			if(mArr.get(i).getmNo() == num) {
				mArr.remove(i);
				
			}
		}
		System.out.print("삭제할 아이디를 입력하세요");
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
		System.out.print("카테고리를 입력하세요 (1~5)");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("상품명을 입력하세요");
		String productName = sc.nextLine();
		System.out.print("가격을 입력하세요");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("크기를 입력하세요");
		String size = sc.nextLine();
		System.out.print("상세설명을  입력하세요");
		String explain = sc.nextLine();
		System.out.print("재고수 : ");
		int stock = sc.nextInt();
		mc.insertProduct(category, productName, price, size, explain, stock);
		
		pd.fileSave(mc.searchProduct());
		
	}
	public void updateProduct() {
		
		ArrayList<Product> pArr = mc.searchProduct();
		if (pArr.size() ==0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		} else {
			for (int i = 0; i < pArr.size(); i++) {
				System.out.println(pArr.get(i));
			}
		}
		
		
		System.out.println("수정할 제품번호를 입력하시오");
		int pNo = sc.nextInt();
		if(mc.searchpNo(pNo)==-1) {
			System.out.println("검색된 결과 값이 없습니다");
		}else {
			System.out.println("수정할 곳  선택");
			System.out.println("1. 카테고리");
			System.out.println("2. 제품명");
			System.out.println("3. 가격");
			System.out.println("4. 크기");
			System.out.println("5. 상세설명");
			System.out.print("번호선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("수정내용");
			String update =sc.nextLine();
			
			mc.updateProduct(mc.searchpNo(pNo), num, update);
			
		}
		pd.fileSave(mc.searchProduct());
	}
	public void deleteProduct() {
		System.out.print("삭제할 번호 선택 : ");
		int pNo = sc.nextInt();
		int result = mc.searchpNo(pNo);
		
		if(result == -1) {
			System.out.println("일치하는 번호가 없습니다.");
		}else {
			mc.deleteProduct(result);
		}
		pd.fileSave(mc.searchProduct());
	}
	public void updateStock() {
		System.out.println("수정할 제품번호를 입력하시오");
		int pNo = sc.nextInt();
		int result = mc.searchpNo(pNo);
		if(result == -1) {
			System.out.println("일치하는 번호가 없습니다.");
		}else {
			System.out.print("수정할 수량을 입력 : ");
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
			System.out.println((Integer.parseInt(sdf.format(d)) - i)+ " 매출액 : " + sales.get(i));
		}
		
	}
	
}
