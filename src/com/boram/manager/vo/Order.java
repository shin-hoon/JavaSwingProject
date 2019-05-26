package com.boram.manager.vo;

import java.io.Serializable;

public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7469402397626174143L;
	
	private int orderNo;
	private String orderId;
	private String address;
	private int productNo;
	private int amount; 	//수량
	private int state; 		// 진행상태, 0이면 결재완료, 1이면 배송중, 2면 배송완료
	private int payment;	// 결재금액
	public Order(int orderNo, String orderId, String address, int productNo, int amount, int state, int payment) {
		this.orderNo = orderNo;
		this.orderId = orderId;
		this.address = address;
		this.productNo = productNo;
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
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderId=" + orderId + ", address=" + address + ", productNo="
				+ productNo + ", amount=" + amount + ", state=" + state + ", payment=" + payment + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + amount;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + orderNo;
		result = prime * result + payment;
		result = prime * result + productNo;
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
		if (amount != other.amount)
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderNo != other.orderNo)
			return false;
		if (payment != other.payment)
			return false;
		if (productNo != other.productNo)
			return false;
		if (state != other.state)
			return false;
		return true;
	}
	
	
	
	
}
