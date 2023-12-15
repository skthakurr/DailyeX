package com.Dailyex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dailyex.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
	List<Store> findByName(String storeName);
}
