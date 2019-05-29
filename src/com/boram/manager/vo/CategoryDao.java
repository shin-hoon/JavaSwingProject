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

			oos.writeObject(new Category(11, "ÄÚÆ®"));
			oos.writeObject(new Category(12, "ÀÚÄÏ"));
			oos.writeObject(new Category(13, "ºí·¹ÀÌÀú"));
			oos.writeObject(new Category(14, "°¡µð°Ç"));
			oos.writeObject(new Category(21, "±äÆÈ"));
			oos.writeObject(new Category(22, "¹ÝÆÈ/Á¶³¢"));
			oos.writeObject(new Category(23, "¸ÇÅõ¸Ç/ÈÄµåÆ¼"));
			oos.writeObject(new Category(24, "´ÏÆ®"));
			oos.writeObject(new Category(25, "¿À¹öÇÍ"));
			oos.writeObject(new Category(31, "±âº» ¼ÅÃ÷"));
			oos.writeObject(new Category(32, "ÆÐÅÏ¼ÅÃ÷"));
			oos.writeObject(new Category(33, "¹ÝÆÈ ¼ÅÃ÷"));
			oos.writeObject(new Category(41, "½½·¢½º"));
			oos.writeObject(new Category(42, "¸éÆÒÃ÷"));
			oos.writeObject(new Category(43, "Ã»¹ÙÁö"));
			oos.writeObject(new Category(44, "¹Ý¹ÙÁö"));
			oos.writeObject(new Category(45, "Æ®·¡ÀÌ´×"));
			oos.writeObject(new Category(46, "UPµ¥´ÔÆÒÃ÷"));
			oos.writeObject(new Category(51, "½º´ÏÄ¿Áî"));
			oos.writeObject(new Category(52, "±¸µÎ/¿öÄ¿"));
			oos.writeObject(new Category(53, "½½¸®ÆÛ/»÷µé"));
			

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
