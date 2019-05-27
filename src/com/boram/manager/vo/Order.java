package com.boram.manager.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7469402397626174143L;
	
	private int orderNo;
	private String orderId;
	private String address;
	private ArrayList<Integer> pNo = new ArrayList<Integer>();
	private ArrayList<Integer> amount = new ArrayList<Integer>(); 	//수량
	private int state; 		// 진행상태, 0이면 결재완료, 1이면 배송중, 2면 배송완료
	private int payment;	// 결재금액
	private Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private int orderDate =Integer.parseInt(sdf.format(date));
	
	
	public Order(int orderNo, String orderId, String address, ArrayList<Integer> pNo, ArrayList<Integer> amount, int state, int payment) {
		this.orderNo = orderNo;
		this.orderId = orderId;
		this.address = address;
		this.pNo = pNo;
		this.amount = amount;
		this.state = state;
		this.payment = payment;
		
	}
	public Order() {
		super();
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public ArrayList<Integer> getpNo() {
		return pNo;
	}
	public void setpNo(ArrayList<Integer> pNo) {
		this.pNo = pNo;
	}
	public ArrayList<Integer> getAmount() {
		return amount;
	}
	public void setAmount(ArrayList<Integer> amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	public int getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + orderDate;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + orderNo;
		result = prime * result + ((pNo == null) ? 0 : pNo.hashCode());
		result = prime * result + payment;
		result = prime * result + ((sdf == null) ? 0 : sdf.hashCode());
		result = prime * result + state;
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
		Order other = (Order) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (orderDate != other.orderDate)
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderNo != other.orderNo)
			return false;
		if (pNo == null) {
			if (other.pNo != null)
				return false;
		} else if (!pNo.equals(other.pNo))
			return false;
		if (payment != other.payment)
			return false;
		if (sdf == null) {
			if (other.sdf != null)
				return false;
		} else if (!sdf.equals(other.sdf))
			return false;
		if (state != other.state)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderId=" + orderId + ", address=" + address + ", pNo=" + pNo
				+ ", amount=" + amount + ", state=" + state + ", payment=" + payment + ", date=" + date + ", sdf=" + sdf
				+ ", orderDate=" + orderDate + "]";
	}
	
	
	
	
}
