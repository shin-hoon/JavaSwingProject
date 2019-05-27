package com.boram.manager.view;

import java.util.Scanner;

import com.boram.manager.controller.MemberController;

public class ManagerView {
	
	Scanner sc = new Scanner(System.in);
	
	MemberController mc = new MemberController();
			
	
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println(" * 메뉴를 선택해주세요 * ");
			// 1. 맴버검색
			System.out.println("1. 맴버검색");
			// 2. 물품등록
			System.out.println("2. 물품등록");
			// 3. 물품수정
			System.out.println("3. 물품수정");
			// 4. 물품삭제
			System.out.println("4. 물품삭제");
			// 번호선택(choice):
			System.out.println(" 번호를 선택해주세요 ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : searchMember(); break;
			case 2 : addProduct(); break;
			case 3 : updateProduct(); break;
			case 4 : deletProdcut(); break;
			case 0 : System.out.println("메뉴를 종료합니다.");return;
			default : System.out.println("잘못입력하였습니다.");break;
			
			
			}
			
			
		}
		
	}
	
	
	public void searchMember() { // 일딴 보류
		
		/* 회원전체를 출력한 후
		 회원아이디 입력받고 컨트롤러 페이지에
		 searchMember에 집어넣어서 검색내용 출력
		 (비교할때 equals 말고 contain사용)
		 */
	}
	
	public void addProduct() {
		/*
		 * Member ArrayList에 저장
		 * pNo는 마지막에 저장된 번호 +1;
		 */
		// 카테고리, 상품명, 가격, 크기, 제고 입력받고
		System.out.print("상품번호");
		int pNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("카테고리 : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("상품명 : ");
		String productName = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("크기 : ");
		String size = sc.nextLine();
		
		System.out.println("제고 : ");
		int stock = sc.nextInt();
		
		mc.addProduct(pNo, category, productName, price, size, stock);
		
	}
	
	public void updateProduct() {
		/*
		 * pNo값 하나 입력받아 거기에 있는 것을 수정
		 * pNo 일치하는값이 있는지 화인 하고 없으면 다시입력받게 할것	
		 * 1.카테고리
		 * 2.상품명
		 * 3.가격
		 * 4.크기
		 * 스캐너로 어느걸 수정할지 받음
		 * 그 후 수정할 내용 스캐너로 받아서 업데이트
		 */
		// 수정할종류
		System.out.println("수정할 종류를 고르요");
		
		System.out.println("1. 카테고리");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.println("2. 상품명");
		String productName = sc.nextLine();
		
		System.out.println("3. 가격");
		int price = sc.nextInt();
		sc.nextInt();
		
		System.out.println("4. 크기");
		String size = sc.nextLine();
		
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.println("수정 내용 : ");
		String str = sc.nextLine();
		
		if(mc.updateProduct(category, productName, price, size, menu) == 0) {
			System.out.println("수정할 내용을  찾지 못했습니다.");
		}else {
			System.out.println("성공적으로 수정되었습니다.");
		}
		
	}
	
	public void deletProdcut() {
		// pNo값을 받아서 그 값을 가진 객체 삭제
		System.out.println("상품 삭제");
		
		System.out.print("상품번호 : ");
		int pNo = sc.nextInt();
		
		int result = mc.deletProduct(pNo);
		
		if(result == 0) {
			System.out.println("삭제할 상품을 찾지 못하였습니다.");
		}else {
			System.out.println("성공적으로 삭제하였습니다.");
		}
			
	}
		
		
}

