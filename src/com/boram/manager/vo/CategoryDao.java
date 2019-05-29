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

public class CategoryDao {

	private ArrayList<Category> cArr = new ArrayList<Category>();
	public CategoryDao() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("category.txt", true));) {

			oos.writeObject(new Category(11, "��Ʈ"));
			oos.writeObject(new Category(12, "����"));
			oos.writeObject(new Category(13, "������"));
			oos.writeObject(new Category(14, "�����"));
			oos.writeObject(new Category(21, "����"));
			oos.writeObject(new Category(22, "����/����"));
			oos.writeObject(new Category(23, "������/�ĵ�Ƽ"));
			oos.writeObject(new Category(24, "��Ʈ"));
			oos.writeObject(new Category(25, "������"));
			oos.writeObject(new Category(31, "�⺻ ����"));
			oos.writeObject(new Category(32, "���ϼ���"));
			oos.writeObject(new Category(33, "���� ����"));
			oos.writeObject(new Category(41, "������"));
			oos.writeObject(new Category(42, "������"));
			oos.writeObject(new Category(43, "û����"));
			oos.writeObject(new Category(44, "�ݹ���"));
			oos.writeObject(new Category(45, "Ʈ���̴�"));
			oos.writeObject(new Category(46, "UP��������"));
			oos.writeObject(new Category(51, "����Ŀ��"));
			oos.writeObject(new Category(52, "����/��Ŀ"));
			oos.writeObject(new Category(53, "������/����"));
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<Category> fileRead() {
		int count=0;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("category.txt"));) {
			while (true) {
				try {
					cArr.add((Category) ois.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			File f = new File("category.txt");
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

		return cArr;
	}

	

}
