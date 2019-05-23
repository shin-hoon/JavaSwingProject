package com.boram.myPage.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.boram.manager.vo.Product;

public class MyCart extends Product {
	ArrayList<Product> PList = new ArrayList<>();
	// product ���� ��� �̾Ƽ� ��ٱ��ϸ���Ʈ ��������.
	// -> �׳ɴ� �߰��ؼ� �������.
	// ��ٱ��ϸ���Ʈ�� �߰��ϴ°� ��ǰ�ʿ���.

	public MyCart() {
	}

	/**
	 * @param product ��ٱ��� �߰��� product��ü����Ʈ.
	 */
	public void addCart(Product product) {
		PList.add(product);
	}

	/**
	 * ��ü��ȸ
	 * @return ��ü����Ʈ ���� �� View���� ���.
	 */
	public ArrayList<Product> cartPrint() {
		return PList;
	}

	/**
	 * ����ǰ���ȣ �޾Ƽ� ����..
	 * 
	 * @param delete ������ ǰ���ȣ
	 * @return ��������1/����0
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
	 * ��ٱ��� ��ü����.
	 */
	public void cartDeleteAll() {
		PList.clear();
	}

	/**
	 * �ӽú����� Ȯ���Ұ�!
	 * �ֹ����txt���� �׸��ű�� �ֹ��Ϸ���� ���������쿣 ��ٱ��� ����ִٰ� ���. if PList == null return 0.
	 * �ֹ� �Ϸ�� ��ٱ��� �ʱ�ȭ.
	 * �ֹ����� �������� 0
	 * �ֹ����� �����Ϸ� �Ǿ����� ��ٱ��� ���� �Ǵ� ����Ʈ ������������ 1
	 * �ֹ����ϻ����Ϸ��� ��ٱ������� �� ����Ʈ �����Ϸ� 2
	 */
	public int cartOrder() {
		int result = 0;
		if (PList.isEmpty()) {
			result = 0;
		} else {//�ӽú���!
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
			PList.clear();//�ӽú���!!
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
	 * �ӽú��� Ȯ���Ұ�!!!!!!!!!
	 * ����� ȸ����ȣ + MyCart.txt���� PList����.
	 * �ε���� �����ʰ� save�� �������� �߰��Ұ����� ������ �պ���.
	 * ��ٱ��� ����ְų� ���ϻ������н� 0
	 * ������ 1
	 */
	public int saveCart() {
		int result = 0;
		if (PList.isEmpty()) {
			result = 0;
		} else {//�ӽú���Ȯ��!!!!!!
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
