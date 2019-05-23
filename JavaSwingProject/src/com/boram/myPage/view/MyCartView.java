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
			System.out.println("===== 장바구니 메뉴 =====");
			System.out.println("1. 장바구니 출력");// 결제예상금액 출력.
			System.out.println("2. 장바구니 삭제");
			System.out.println("3. 장바구니 전체 삭제");
			System.out.println("4. 장바구니 주문하기");
			System.out.println("5. 장바구니 저장하기");
			System.out.println("0. 이전메뉴로");
			System.out.print("입력  : ");
			try {
				inp = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
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
			System.out.println("장바구니가 비어있습니다.");
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
		System.out.println("삭제할 품목번호를 입력하세요.");
		int delete = sc.nextInt();
		sc.nextLine();
		int result = mc.deleteCart(delete);
		if (result == 0) {
			System.out.println("삭제실패");
		} else {
			System.out.println(delete + "가 삭제되었습니다.");
		}

	}

	public void cartDeleteAll() {
		while (true) {
			System.out.print("정말 전체 삭제하시겠습니까?(Y/N) : ");
			char inp = sc.nextLine().charAt(0);
			switch (inp) {
			case 'y':
			case 'Y':
				mc.cartDeleteAll();
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			case 'n':
			case 'N':
				System.out.println("이전메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println("다시입력해주세요.");
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
