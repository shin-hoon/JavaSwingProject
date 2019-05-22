package com.boram.model.vo;

public class Product {
	
	
	private int pNo;
	private int category;
	private String productName;
	private int price;
	private String size;
	private int stock;
	private int count; //Á¶È¸¼ö
	
	
	
	
	public Product() {
	}
	public Product(int pNo, int category, String productName, int price, String size, int stock, int count) {
		super();
		this.pNo = pNo;
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.size = size;
		this.stock = stock;
		this.count = count;
	}
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Product [pNo=" + pNo + ", category=" + category + ", productName=" + productName + ", price=" + price
				+ ", size=" + size + ", stock=" + stock + ", count=" + count + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + category;
		result = prime * result + count;
		result = prime * result + pNo;
		result = prime * result + price;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + stock;
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
		Product other = (Product) obj;
		if (category != other.category)
			return false;
		if (count != other.count)
			return false;
		if (pNo != other.pNo)
			return false;
		if (price != other.price)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}
	
	
	
	
	
}
