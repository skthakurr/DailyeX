package com.Dailyex.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.Dailyex.model.Store;

@DataJpaTest
public class StoreRepositoryTest {

	@Autowired
	private StoreRepository storeRepository;
	
	Store store;
	
	//used to initialize the test data
	@BeforeEach
	void setUp() {
		store = new Store(1005, "Hinjewadi","Hinjewadi Phase 1","9000067425","Sumit");
		storeRepository.save(store);
	}
	
	
	//used to clear test data and database
	@AfterEach
	void tearDown() {
		store=null;
		storeRepository.deleteAll();
	}
	
	//Test Case passed
	@Test
	void testFindByStoreName_Found() {
		List<Store> storeList = storeRepository.findByName("Hinjewadi");
		assertThat(storeList.get(0).getStoreId()).isEqualTo(store.getStoreId());
		assertThat(storeList.get(0).getAddress()).isEqualTo(store.getAddress());
		
	}
	
	//test case failure
	@Test
	void testFindByStoreName_NotFound() {
		List<Store> storeList = storeRepository.findByName("Kothrud");
		assertThat(storeList.isEmpty()).isTrue();
		
	}
	
	
}
