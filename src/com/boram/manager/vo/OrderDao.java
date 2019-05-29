package com.boram.manager.vo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class OrderDao {

	private ArrayList<Order> orderList = new ArrayList<Order>();

	public void fileSave(ArrayList<Order> list) {
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("orderList.txt",true));){
			
			for (int i = 0; i < list.size(); i++) {
						oos.writeObject(list.get(i));
			}	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Order> fileRead() {
		int count=0;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("orderList.txt"));) {
			while (true) {
				try {
					orderList.add((Order) ois.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			File f = new File("orderList.txt");
			try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (EOFException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orderList;
	}

}
