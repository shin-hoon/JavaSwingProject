package com.boram.member.vo;

import java.io.Serializable;

public class Member implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2921538305338431959L;
	
	private int mNo; // 회원번호
	private String name;
	private int birth;
	private String id;
	private String pwd;
	private String phone;
	private String address;
	private String email;
	
	private int grant = 0; // 권한

	public Member() {
		super();
	}
	
	
	public Member(int mNo, String name, String id, String pwd, int grant) {
		super();
		this.mNo = mNo;
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.grant = grant;
	}


	public Member(String name, int birth, String id, String pwd, String phone, String address, String email) {
		super();
		this.name = name;
		this.birth = birth;
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return birth;
	}

	public void setAge(int birth) {
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGrant() {
		return grant;
	}

	public void setGrant(int grant) {
		this.grant = grant;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", name=" + name + ", birth=" + birth + ", id=" + id + ", pwd=" + pwd + ", phone="
				+ phone + ", address=" + address + ", email=" + email + ", grant=" + grant + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + birth;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + grant;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + mNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birth != other.birth)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (grant != other.grant)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mNo != other.mNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		return true;
	}

	
}