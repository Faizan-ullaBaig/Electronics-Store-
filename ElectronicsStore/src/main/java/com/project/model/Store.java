package com.project.model;

public class Store {

	private int productId;
	private String productName;
	private String productCategory;
	private String productManufacturer;
	private double price;
	
	
	
	public Store(int productId, String productName, String productCategory, String productManufacturer,
			double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productManufacturer = productManufacturer;
		this.price = price;
	}



	public Store() {
		super();
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductCategory() {
		return productCategory;
	}



	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}



	public String getProductManufacturer() {
		return productManufacturer;
	}



	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Store [productId=" + productId + ", productName=" + productName + ", productCategory=" + productCategory
				+ ", productManufacturer=" + productManufacturer + ", price=" + price + "]";
	}
	
	
	
	
}
