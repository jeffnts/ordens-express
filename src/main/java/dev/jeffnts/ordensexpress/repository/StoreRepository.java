package dev.jeffnts.ordensexpress.repository;

import org.springframework.data.repository.CrudRepository;

import dev.jeffnts.ordensexpress.model.Store;

public interface StoreRepository extends CrudRepository<Store, String> {
    
}
