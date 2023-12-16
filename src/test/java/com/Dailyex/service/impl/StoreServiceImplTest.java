package com.Dailyex.service.impl;

import com.Dailyex.model.Store;
import com.Dailyex.repository.StoreRepository;
import com.Dailyex.service.StoreService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.InstanceOfAssertFactories.OPTIONAL;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StoreServiceImplTest {

    @Mock
    private StoreRepository storeRepository;
    private StoreService storeService;
    private Store store;
    AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        storeService = new StoreServiceImpl(storeRepository);
        store = new Store(110,"Bhopal", "Bhopal, bhopal","xxxxx","RRRR");
    }

    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    @Test
    void testCreateStore() {
        mock(Store.class);
        mock(StoreRepository.class);
        when(storeRepository.save(store)).thenReturn(store);
        assertThat(storeService.createStore(store)).isEqualTo(store);
    }

    @Test
    void testUpdateStore(){
    }

    @Test
    void testGetStores() {
    }

    @Test
    void testListAllStores() {
    }

    @Test
    void testDeleteStores() {
    }
}