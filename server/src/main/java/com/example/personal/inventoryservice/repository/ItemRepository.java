package com.example.personal.inventoryservice.repository;

import com.example.personal.inventoryservice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByCategoryNameIgnoreCase(String name);
}

