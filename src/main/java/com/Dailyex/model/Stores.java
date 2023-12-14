package com.Dailyex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Stores {
	@Id
	private int  storeId;
	private String name;
	private String address;
	private String phoneNumber;
	private String storeManager;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStoreManager() {
		return storeManager;
	}
	public void setStoreManager(String storeManager) {
		this.storeManager = storeManager;
	}
	public Stores() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stores(int storeId, String name, String address, String phoneNumber, String storeManager) {
		super();
		this.storeId = storeId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.storeManager = storeManager;
	}
	@Override
	public String toString() {
		return "Stores [storeId=" + storeId + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", storeManager=" + storeManager + "]";
	}
}
