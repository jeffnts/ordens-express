package dev.jeffnts.ordensexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jeffnts.ordensexpress.dto.store.CreateStoreDTO;
import dev.jeffnts.ordensexpress.service.StoreService;


@RestController
@RequestMapping("stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody CreateStoreDTO store){      
        storeService.create(store);
        return ResponseEntity.ok("Store created with success!");
    }
}
