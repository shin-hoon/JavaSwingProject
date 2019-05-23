package com.boram.model.vo;

public class Member implements Comparable<Member>{
	
	private int mNo;
	private String id;
	private String pwd;
	private String phone;
	private String address;
	private String email;
	private int age;
	
	private int grant; //±ÇÇÑ

	
	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public Member() {
		super();
	}

	public Member(String id, String pwd, String phone, String address, String email, int age) {
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrant() {
		return grant;
	}

	public void setGrant(int grant) {
		this.grant = grant;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", id=" + id + ", pwd=" + pwd + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", age=" + age + ", grant=" + grant + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + grant;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + mNo;
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
		if (age != other.age)
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

	@Override
	public int compareTo(Member o) {
		
		int result = -1;
		
		if(this.mNo > o.mNo) {
			result = 1;
		}
				
		
		return result;
	}
	
	
	
	
	
}
