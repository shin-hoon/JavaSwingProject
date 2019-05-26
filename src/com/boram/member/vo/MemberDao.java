package com.boram.member.vo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class MemberDao {
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	{
		//관리자 계정 생성자  맨마지막 권한 1이면 관리자 ;
		memberList.add(new Member(0, "관리자", "admin01", "pass01", 1));
		
	}
	
	
	
	public void fileSave(ArrayList<Member> list) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("memberList.txt"));) {

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

	public ArrayList<Member> fileRead() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("memberList.txt"));) {
			while (true) {
				try {
					memberList.add((Member) ois.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("memberList.txt"));) {
				oos.writeObject(memberList.get(0));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (EOFException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memberList;
	}

}
