package com.boram.myPage.controller;

import java.io.*;
import java.util.*;

import com.boram.manager.vo.Product;

public class MyCart extends Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4623389045564207219L;
	ArrayList<Product> PList = new ArrayList<>();
	// product ���� ��� �̾Ƽ� ��ٱ��ϸ���Ʈ ��������.
	// -> �׳ɴ� �߰��ؼ� �������.
	// ��ٱ��ϸ���Ʈ�� �߰��ϴ°� ��ǰ�ʿ���.
	
	{
		//1,1,"hat",35000,one,1,1.
		PList.add(new Product(1,1,"hat",35001,"one1",1,1));
		PList.add(new Product(2,2,"hat",35002,"one2",1,1));
		PList.add(new Product(3,3,"hat",35003,"one3",1,1));
		PList.add(new Product(4,1,"hat",35004,"one4",1,1));
		PList.add(new Product(5,2,"hat",35005,"one5",1,1));
		PList.add(new Product(6,3,"hat",35006,"one6",1,1));
		PList.add(new Product(7,4,"hat",35007,"one7",1,1));
		
		
		
		
		
		
	}

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
				//System.out.println(i);
				PList.remove(i);
				result = 1;
				return result;
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
			//System.out.println("Empty");
			result = 1;
		} else {//�ӽú���Ȯ��!!!!!!
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(result + "MyCart.txt"))) {
				for (Product i : PList) {
					oos.writeObject(i);
					result=1;
					return result;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				result=0;
				//e.printStackTrace();
			}
		}
		return result;
	}
	@SuppressWarnings("unchecked")
	public void loadCart() {//�� �۵��ϴ��� Ȯ���Ұ�.
		int result=0;//�ӽú���Ȯ��!!
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(result+"MyCart.txt"))) {
			while(true) {
				PList=(ArrayList<Product>)ois.readObject();
				result =1;
		}
			
		}catch (EOFException e){
			//e.printStackTrace();
			System.out.println("�ҷ����� �Ϸ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}

}
