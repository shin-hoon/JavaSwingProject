package com.boram.myPage.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.boram.manager.vo.Product;

public class MyCart extends Product {
	ArrayList<Product> PList = new ArrayList<>();
	// product 에서 몇개만 뽑아서 장바구니리스트 만들어야함.
	// -> 그냥다 추가해서 몇개만뽑음.
	// 장바구니리스트에 추가하는건 상품쪽에서.

	public MyCart() {
	}

	/**
	 * @param product 장바구니 추가될 product객체리스트.
	 */
	public void addCart(Product product) {
		PList.add(product);
	}

	/**
	 * 전체조회
	 * @return 전체리스트 리턴 후 View에서 출력.
	 */
	public ArrayList<Product> cartPrint() {
		return PList;
	}

	/**
	 * 삭제품목번호 받아서 삭제..
	 * 
	 * @param delete 삭제할 품목번호
	 * @return 삭제성공1/실패0
	 */
	public int cartDelete(int delete) {
		int result = 0;
		for (Product i : PList) {
			if (i.getpNo() == delete) {
				PList.remove(i);
				result = 1;
			} else {
				result = 0;
			}
		}
		return result;
	}

	/**
	 * 장바구니 전체삭제.
	 */
	public void cartDeleteAll() {
		PList.clear();
	}

	/**
	 * 임시변수들 확인할것!
	 * 주문목록txt만들어서 그리옮기고 주문완료출력 비어있을경우엔 장바구니 비어있다고 출력. if PList == null return 0.
	 * 주문 완료시 장바구니 초기화.
	 * 주문파일 생성실패 0
	 * 주문파일 생성완료 되었으나 장바구니 파일 또는 리스트 삭제되지않음 1
	 * 주문파일생성완료후 장바구니파일 및 리스트 삭제완료 2
	 */
	public int cartOrder() {
		int result = 0;
		if (PList.isEmpty()) {
			result = 0;
		} else {//임시변수!
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(result + "MyOrder.txt"))) {
				for (Product i : PList) {
					oos.writeObject(i);
					result=1;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(result==1) {
			PList.clear();//임시변수!!
			File file=new File(result+"MyCart.txt");
			if(file.exists()) {
				if(file.delete()) {
					result=2;
				}else {
					result=1;
				}
			}
		}
		return result;
	}

	/**
	 * 임시변수 확인할것!!!!!!!!!
	 * 실행시 회원번호 + MyCart.txt만들어서 PList저장.
	 * 로드먼저 하지않고 save시 덮을껀지 추가할것인지 결정후 손볼것.
	 * 장바구니 비어있거나 파일생성실패시 0
	 * 성공시 1
	 */
	public int saveCart() {
		int result = 0;
		if (PList.isEmpty()) {
			result = 0;
		} else {//임시변수확인!!!!!!
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(result + "MyCart.txt"))) {
				for (Product i : PList) {
					oos.writeObject(i);
					result=1;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				result=0;
			}
		}
		return result;
	}

}
