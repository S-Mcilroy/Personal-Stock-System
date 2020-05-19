package com.example.personal.inventoryservice.components;

import com.example.personal.inventoryservice.models.Category;
import com.example.personal.inventoryservice.repository.CategoryRepository;
import com.example.personal.inventoryservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ItemRepository ItemRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        Category tools = new Category("Tools");
        categoryRepository.save(tools);




    }

}
