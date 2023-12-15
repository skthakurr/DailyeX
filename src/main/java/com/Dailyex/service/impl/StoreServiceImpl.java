package com.Dailyex.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Dailyex.exception.StoreNotFoundException;
import com.Dailyex.model.Store;
import com.Dailyex.repository.StoreRepository;
import com.Dailyex.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	StoreRepository storeRepo;
	
	public StoreServiceImpl(StoreRepository storeRepo) {
		this.storeRepo = storeRepo;
	}

	@Override
	public int createStore(Store store) {
		Store isSucess = storeRepo.save(store);
		if(isSucess==null)
			return 0;
		else 
			return 1;
	}

	@Override
	public int updateStore(Store store) {
		Store isSucess = storeRepo.save(store);
		if(isSucess==null)
			return 0;
		else 
			return 1;
	}

	@Override
	public Store getStores(int storeId) {
		if(storeRepo.findById(storeId).isEmpty())
			throw new StoreNotFoundException("Requested store does not exist!!!");
		return storeRepo.findById(storeId).get();
	}

	@Override
	public List<Store> listAllStores() {
		return storeRepo.findAll();
		 
	}

	@Override
	public void deleteStores(int storeId) {
		storeRepo.deleteById(storeId);
	}
	
}
