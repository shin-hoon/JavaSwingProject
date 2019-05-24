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
			System.out.println("6. 장바구니 불러오기");
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
	 * 장바구니 전체출력
	 * 비어있지않으면
	 * 상품명, 카테고리, 사이즈, 가격 출력
	 */
	public void cartPrint() {
		ArrayList<Product> p = mc.cartPrint();
		if (p.isEmpty()) {
			System.out.println("장바구니가 비어있습니다.");
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
	 * 삭제성공1/실패 0
	 */
	public void cartDelete() {
		System.out.print("삭제할 품목번호를 입력하세요 : ");
		int delete = sc.nextInt();
		sc.nextLine();
		
		int result = mc.cartDelete(delete);
		if (result == 0) {
			System.out.println("삭제실패");
		} else {
			System.out.println(delete + "번이 삭제되었습니다.");
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

	/**
	 * 테스트완료후 다시손볼것!! 주문파일생성실패(주문실패) =0
	 *  주문파일 생성완료 되었으나 장바구니 파일 또는 리스트 삭제되지않음 1
	 *  주문파일생성완료후 장바구니파일 및 장바구니리스트 삭제완료 =2 (완전성공) 
	 */
	public void cartOrder() {
		int result = mc.cartOrder();
		switch (result) {
		case 1:System.out.println("주문파일만생성완료.");
		System.out.println("파일 또는 리스트 삭제실패");
			break;
		case 2:System.out.println("주문성공 및 장바구니파일,리스트삭제 성공!");
			break;
		case 0:System.out.println("주문파일 생성실패, 장바구니파일및 리스트 삭제하지않음.");
			break;
		default:
			System.out.println("????");
			break;
		}
	}

	public void saveCart() {
		System.out.println("장바구니를 저장하시겠습니까?");
		System.out.println("현재 장바구니목록으로 덮어씌워집니다.");
		System.out.print("입력(Y/N) : ");
		char inp = sc.nextLine().charAt(0);
		switch(inp) {
		case 'y':
		case 'Y':int result=mc.saveCart();
		if(result==0) {
			System.out.println("저장실패");
			System.out.println(result);//실패원인리턴.//임시.
		}else {
			System.out.println("저장성공");
		}
			return;
		case 'n':
		case 'N':System.out.println("이전메뉴로");
			return;
		default:
			System.out.println("잘못입력하셨습니다.");
			System.out.println("이전메뉴로.");
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
