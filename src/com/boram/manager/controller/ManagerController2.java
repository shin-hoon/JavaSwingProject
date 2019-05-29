package com.boram.manager.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.boram.manager.vo.Order;
import com.boram.manager.vo.OrderDao;
import com.boram.manager.vo.Product;
import com.boram.manager.vo.ProductDao;
import com.boram.member.vo.Member;
import com.boram.member.vo.MemberDao;

public class ManagerController2 {

	private OrderDao od = new OrderDao();
	private ProductDao pd = new ProductDao();
	private MemberDao md = new MemberDao();

	private ArrayList<Order> oArr = od.fileRead();
	private ArrayList<Product> pArr = pd.fileRead();
	private ArrayList<Member> mArr = md.fileRead();

	public int checkLogin(String id, String pwd) {

		int result = 0;

		for (int i = 0; i < mArr.size(); i++) {
			if (mArr.get(i).getId().equals(id) && mArr.get(i).getPwd().equals(pwd)) {

				result = 1;

				if (mArr.get(i).getGrant() == 1) {
					result = 2;
				}

				break;
			}
		}
		return result;
	}

	public ArrayList<Member> searchMember() {
		return mArr;
	}
	
	public ArrayList<Product> searchProduct(){
		return pArr;
	}
	
	
	public void insertProduct(int category, String productName, int price, String size, String explain, int stock) {

		int pNo = 1;
		try {
			if (pArr != null) {
				pNo = pArr.get(pArr.size() - 1).getpNo() + 1;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			pNo = 1;
		}
		

		pArr.add(new Product(pNo, category, productName, price, size, stock, 0));
	}

	public int searchpNo(int pNo) {
		// pNo일치하는 인덱스 반환
		for (int i = 0; i < pArr.size(); i++) {
			if (pArr.get(i).getpNo() == pNo) {
				return i;
			}
		}
		return -1;

	}

	public void updateProduct(int index, int menu, String update) {
		
		int result = Integer.parseInt(update);
		
		switch (menu) {
		case 1:
			
			pArr.get(index).setCategory(result);
			break;
		case 2:
			pArr.get(index).setProductName(update);
			break;
		case 3:
			pArr.get(index).setPrice(result);
			break;
		case 4:
			pArr.get(index).setSize(update);
			break;
		case 5:
			pArr.get(index).setExplain(update);
			break;

		default:
			break;
		}

	}

	public void deleteProduct(int result) {
		pArr.remove(result);
	}
	
	public void updateProduct(int result, int stock) {
		pArr.get(result).setStock(stock);
	}
	
	public HashMap<Integer, Double> analysis(){
		HashMap<Integer, Double> anl = new HashMap<Integer, Double>();
		int sales;
		
		for (int i = 0; i < pArr.size(); i++) {
			sales=0;
			ArrayList<Integer> pNo = oArr.get(i).getpNo();
			for (int j = 0; j < oArr.size(); j++) {
				for (int j2 = 0; j2 < pNo.size(); j2++) {
					if(pArr.get(i).getpNo() == oArr.get(j).getpNo().get(j2)) {
						sales += oArr.get(j).getAmount().get(j2);
					}
				}
				
			}
			double result = sales/(double)pArr.get(i).getCount();
			anl.put(pArr.get(i).getpNo(), result);
		}
		ArrayList<Integer> keyValue = new ArrayList<Integer>();
		ArrayList<Double> result = new ArrayList<Double>();
		Set<Integer> key = anl.keySet();
		Iterator<Integer> itKey = key.iterator();
		while(itKey.hasNext()) {
			int value = itKey.next();
			keyValue.add(value);
			result.add(anl.get(value));
		}
		int temp1 =0;
		double temp2=0.0;
		
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < i; j++) {
				if(result.get(i)> result.get(j)) {
					temp2 = result.get(i);
					result.set(i, result.get(j));
					result.set(j, temp2);
					temp1 = keyValue.get(i);
					keyValue.set(i, keyValue.get(j));
					keyValue.set(j, temp1);
					
				}
			}
		}
		for (int i = 0; i < result.size(); i++) {
			anl.put(keyValue.get(i), result.get(i));
		}
		return anl;
		
		
	}
	
	
	public ArrayList<Integer> salesState(int month, int term) {
		
		ArrayList<Integer> sumArr = new ArrayList<Integer>();
		int count;
		for (int i = term; i > 0; i--) {
			count=0;
			for (int j = 0; j < oArr.size(); j++) {
				if((month/100-i)==oArr.get(j).getOrderDate()/100) {
					count += oArr.get(j).getPayment();
				}
			}
			sumArr.add(count);
			
		}
		
		return sumArr;
		
	}
	
	
	
}
