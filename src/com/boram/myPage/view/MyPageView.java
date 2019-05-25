package com.boram.myPage.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.boram.myPage.controller.ChangeMember;

public class MyPageView {
	Scanner sc = new Scanner(System.in);
	ChangeMember cm = new ChangeMember();

	public MyPageView() {
	}

	public void mainMenu() {//조회용 임시메뉴 7 번 삭제할것.
		int inp = 0;
		while (true) {
			System.out.println("===== 회원정보 수정 =====");
			System.out.println("1. ID 수정 ");
			System.out.println("2. PW 수정");
			System.out.println("3. 나이 수정");
			System.out.println("4. 주소 수정");
			System.out.println("5. 이메일 수정");
			System.out.println("6. Phone 수정");
			System.out.println("0. 이전메뉴로");
			System.out.print("입력 : ");
			
//				 inp = sc.nextInt();
//				 sc.nextLine();
				try {
					inp = sc.nextInt();
					sc.nextLine();

				} catch (InputMismatchException e) {
					System.out.println("잘못된 값입니다. 다시 입력해주세요.");
					sc.nextLine();
					break;
				}

				switch (inp) {
				case 1:
					idChange();
					break;
				case 2:
					pwChange();
					break;
				case 3:
					ageChange();
					break;
				case 4:
					addressChange();
					break;
				case 5:
					emailChange();
					break;
				case 6:
					phoneChange();
					break;
				case 7 : printMem();//조회용 임시메뉴.
					break;
				case 0:
					System.out.println("이전메뉴로 이동합니다.");
					return;
				default:
					System.out.println("잘못된값입니다.\n다시입력하세요");
					break;
				}
			
		

		}
	}

	// *가 ~ 에서 ~ 로 성공적으로 변경되었습니다.
	// 성공시 1, 실패시 0.
	// 본인것만 변경할수 있도록 수정시에 mNo대신
	// 회원번호입력란 삭제후 고유번호 넘겨줄것.
	public void idChange() {
		System.out.print("변경할 회원의 회원번호를 입력해주세요 : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할  id를 입력해주세요 : ");
		String newinp = sc.nextLine();
		int result = cm.idChange(mNo, newinp);
		if (result == 0) {
			System.out.println("ID 변경에 실패하였습니다.");
		} else {
			System.out.println("ID 변경에 성공하였습니다.");
		}
	}

	public void pwChange() {
		System.out.print("변경할 회원의 회원번호를 입력해주세요 : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할  비밀번호를 입력해주세요 : ");
		String newinp = sc.nextLine();
		int result = cm.pwChange(mNo, newinp);
		if (result == 0) {
			System.out.println("비밀번호 변경에 실패하였습니다.");
		} else {
			System.out.println("비밀번호 변경에 성공하였습니다.");
		}
	}

	public void phoneChange() {
		System.out.print("변경할 회원의 회원번호를 입력해주세요 : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할  휴대폰번호를 입력해주세요 : ");
		String newinp = sc.nextLine();
		int result = cm.phoneChange(mNo, newinp);
		if (result == 0) {
			System.out.println("휴대폰번호 변경에 실패하였습니다.");
		} else {
			System.out.println("휴대폰번호 변경에 성공하였습니다.");
		}
	}

	public void addressChange() {
		System.out.print("변경할 회원의 회원번호를 입력해주세요 : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할  주소를 입력해주세요 : ");
		String newinp = sc.nextLine();
		int result = cm.addressChange(mNo, newinp);
		if (result == 0) {
			System.out.println("주소 변경에 실패하였습니다.");
		} else {
			System.out.println("주소 변경에 성공하였습니다.");
		}
	}

	public void emailChange() {
		System.out.print("변경할 회원의 회원번호를 입력해주세요 : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할  이메일을 입력해주세요 : ");
		String newinp = sc.nextLine();
		int result = cm.emailChange(mNo, newinp);
		if (result == 0) {
			System.out.println("이메일 변경에 실패하였습니다.");
		} else {
			System.out.println("이메일 변경에 성공하였습니다.");
		}
	}

	public void ageChange() {
		System.out.print("변경할 회원의 회원번호를 입력해주세요 : ");
		int mNo = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할  나이를 입력해주세요 : ");
		int newinp = sc.nextInt();
		sc.nextLine();
		int result = cm.ageChange(mNo, newinp);
		if (result == 0) {
			System.out.println("나이 변경에 실패하였습니다.");
		} else {
			System.out.println("나이 변경에 성공하였습니다.");
		}
	}
	/**
	 * 조회용 임시메뉴.
	 */
	public void printMem() {
		cm.printMem();
	}
}
