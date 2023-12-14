package com.Dailyex.service;

import java.util.List;

import com.Dailyex.model.Stores;

public interface StoreService {
	public int createStore(Stores store);
	public int updateStore(Stores store);
	public Stores getStores(int storeId);
	public List<Stores> listAllStores();
	public void deleteStores(int storeId);
}
