package com.example;

import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
public class Stock {
	
	@Id
	private int stockid;
	private String companyname;
	private String symbol;
	private double price;
	public int getId() {
		return stockid;
	}
	public void setId(int id) {
		this.stockid = id;
	}
	public String getCompanyName() {
		return companyname;
	}
	public void setCompanyName(String companyName) {
		this.companyname = companyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
