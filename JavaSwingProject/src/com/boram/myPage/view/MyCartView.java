package com.boram.myPage.view;

import java.util.Scanner;

public class MyCartView {
	Scanner sc = new Scanner(System.in);

	public MyCartView() {
	}

	public void cartMenu() {
		int inp = 0;
		while (true) {
			System.out.println("===== 장바구니 메뉴 =====");
			System.out.println("1. 장바구니 출력");// 결제예상금액 출력.
			System.out.println("2. 장바구니 삭제");
			System.out.println("3. 장바구니 전체 삭제");
			System.out.println("4. 장바구니 주문하기");
			System.out.println("0. 이전메뉴로");
			System.out.print("입력  : ");
			// try {
			// inp = sc.nextInt();
			// sc.nextLine();
			// }catch(InputMismatchException e) {
			// System.out.println("잘못된 값입니다. 다시 입력해주세요.");
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
