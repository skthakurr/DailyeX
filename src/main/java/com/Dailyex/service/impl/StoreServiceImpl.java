package com.Dailyex.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Dailyex.exception.StoreNotFoundException;
import com.Dailyex.model.Stores;
import com.Dailyex.repository.StoresRepository;
import com.Dailyex.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	StoresRepository storeRepo;
	
	public StoreServiceImpl(StoresRepository storeRepo) {
		this.storeRepo = storeRepo;
	}

	@Override
	public int createStore(Stores store) {
		Stores isSucess = storeRepo.save(store);
		if(isSucess==null)
			return 0;
		else 
			return 1;
	}

	@Override
	public int updateStore(Stores store) {
		Stores isSucess = storeRepo.save(store);
		if(isSucess==null)
			return 0;
		else 
			return 1;
	}

	@Override
	public Stores getStores(int storeId) {
		if(storeRepo.findById(storeId).isEmpty())
			throw new StoreNotFoundException("Requested store does not exist!!!");
		return storeRepo.findById(storeId).get();
	}

	@Override
	public List<Stores> listAllStores() {
		return storeRepo.findAll();
		 
	}

	@Override
	public void deleteStores(int storeId) {
		storeRepo.deleteById(storeId);
	}
	
}
