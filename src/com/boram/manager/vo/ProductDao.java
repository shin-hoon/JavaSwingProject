package com.boram.manager.vo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductDao {

	private ArrayList<Product> productList = new ArrayList<Product>();

	public void fileSave(ArrayList<Product> list) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productList.txt"));) {

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

	public ArrayList<Product> fileRead() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productList.txt"));) {
			while (true) {
				try {
					productList.add((Product) ois.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			File f = new File("productList.txt");
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

		return productList;
	}

}
