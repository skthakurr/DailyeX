package com.Dailyex.service;

import java.util.List;

import com.Dailyex.model.Store;

public interface StoreService {
	public Store createStore(Store store);
	public Store updateStore(Store store);
	public Store getStores(int storeId);
	public List<Store> listAllStores();
	public void deleteStores(int storeId);
}
