package com.Dailyex.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Dailyex.exception.StoreNotFoundException;
import com.Dailyex.model.Store;
import com.Dailyex.repository.StoreRepository;
import com.Dailyex.service.StoreService;

import javax.swing.text.html.Option;

@Service
public class StoreServiceImpl implements StoreService{

	StoreRepository storeRepo;
	
	public StoreServiceImpl(StoreRepository storeRepo) {
		this.storeRepo = storeRepo;
	}

	@Override
	public Store createStore(Store store) {
		return storeRepo.save(store);
	}

	@Override
	public Store updateStore(Store updatedStore) {

		int storeId = updatedStore.getStoreId();
		Optional<Store> optionalStore = storeRepo.findById(storeId);
		if(optionalStore.isPresent()){
			Store existingStore = optionalStore.get();
			existingStore.setName(updatedStore.getName());
			existingStore.setAddress(updatedStore.getAddress());
			existingStore.setPhoneNumber(updatedStore.getPhoneNumber());
			existingStore.setStoreManager(updatedStore.getStoreManager());

			return  storeRepo.save(existingStore);
		}

		else {
			throw new StoreNotFoundException("Store does not exist for "+storeId+".");
		}
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
