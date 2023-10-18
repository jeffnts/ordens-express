package dev.jeffnts.ordensexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.jeffnts.ordensexpress.dto.store.CreateStoreDTO;
import dev.jeffnts.ordensexpress.model.Store;
import dev.jeffnts.ordensexpress.repository.StoreRepository;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public void create(CreateStoreDTO store){
        storeRepository.save(new Store(store.getName()));
    }
}
