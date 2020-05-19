package com.example.personal.inventoryservice.controller;

import com.example.personal.inventoryservice.models.Item;
import com.example.personal.inventoryservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/foodItems")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;


    @GetMapping(value = "/{id}")
    public ResponseEntity getItem(@PathVariable Long id){
        return new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Item> postItem(@RequestBody Item item){
        itemRepository.save(item);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
    @PatchMapping(value = "/{id}")
    public ResponseEntity<Item> updateItem(@RequestBody Item item){
        itemRepository.save(item);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Item> deleteItem(@PathVariable Long id) {
        Item found = itemRepository.getOne(id);
        itemRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity findItemsByCategory(@RequestParam(name = "category", required = false) String category){
        if (category != null){
            return new ResponseEntity(itemRepository.findByCategoryNameIgnoreCase(category), HttpStatus.OK);
        }
        return new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
    }
}