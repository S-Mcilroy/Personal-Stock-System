package com.example.personal.inventoryservice.components;

import com.example.personal.inventoryservice.models.Category;
import com.example.personal.inventoryservice.models.CategoryType;
import com.example.personal.inventoryservice.models.Item;
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
    ItemRepository itemRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        Category drills = new Category("Drills", CategoryType.PowerTools);
        categoryRepository.save(drills);
        Category saws = new Category("Saws", CategoryType.PowerTools);
        categoryRepository.save(saws);
        Category kitsTwinPacks = new Category("Kits & Twinpacks", CategoryType.PowerTools);
        categoryRepository.save(kitsTwinPacks);
        Category workshopMachinery = new Category("Workshop Machinery", CategoryType.PowerTools);
        categoryRepository.save(workshopMachinery);
        Category sanders = new Category("Sanders", CategoryType.PowerTools);
        categoryRepository.save(sanders);

        Category drilling = new Category("Drilling", CategoryType.PowerToolAccessories);
        categoryRepository.save(drilling);
        Category cuttingBlades = new Category("Cutting & Blades", CategoryType.PowerToolAccessories);
        categoryRepository.save(cuttingBlades);
        Category sanding = new Category("Sanding", CategoryType.PowerToolAccessories);
        categoryRepository.save(sanding);
        Category screwDriverBits = new Category("Screwdriver Bits", CategoryType.PowerToolAccessories);
        categoryRepository.save(screwDriverBits);

        Category handToolKits = new Category("Hand Tool Kits", CategoryType.HandTools);
        categoryRepository.save(handToolKits);
        Category socketsSpanners = new Category("Sockets & Spanners", CategoryType.HandTools);
        categoryRepository.save(socketsSpanners);
        Category screwdriversHexKeys = new Category("Screwdrivers & Hex Keys", CategoryType.HandTools);
        categoryRepository.save(screwdriversHexKeys);
        Category pliersCutters = new Category("Pliers & Cutters", CategoryType.HandTools);
        categoryRepository.save(pliersCutters);
        Category sawingCutters = new Category("Sawing & Cutting", CategoryType.HandTools);
        categoryRepository.save(sawingCutters);

        Category toolBoxes = new Category("Toolboxes", CategoryType.ToolStorage);
        categoryRepository.save(toolBoxes);
        Category toolBags = new Category("Tool Bags", CategoryType.ToolStorage);
        categoryRepository.save(toolBags);
        Category toolTotes = new Category("Tool Totes", CategoryType.ToolStorage);
        categoryRepository.save(toolTotes);
        Category organisers = new Category("Organisers", CategoryType.ToolStorage);
        categoryRepository.save(organisers);
        Category toolBeltsHolders = new Category("Tool Belts & Holders", CategoryType.ToolStorage);
        categoryRepository.save(toolBeltsHolders);

        Category laserLevels = new Category("Laser Levels", CategoryType.LevelsMeasuring);
        categoryRepository.save(laserLevels);
        Category spiritLevels = new Category("Spirit Levels", CategoryType.LevelsMeasuring);
        categoryRepository.save(spiritLevels);
        Category tapeMeasures = new Category("Tape Measures", CategoryType.LevelsMeasuring);
        categoryRepository.save(tapeMeasures);
        Category distanceMeasures = new Category("Distance Measures", CategoryType.LevelsMeasuring);
        categoryRepository.save(distanceMeasures);
        Category angleMeasures = new Category("Angle Measures", CategoryType.LevelsMeasuring);
        categoryRepository.save(angleMeasures);

        Category thermometers = new Category("Thermometers", CategoryType.TestingEquipment);
        categoryRepository.save(thermometers);
        Category electricalTesters = new Category("Electrical Testers", CategoryType.TestingEquipment);
        categoryRepository.save(electricalTesters);
        Category detectors = new Category("Detectors", CategoryType.TestingEquipment);
        categoryRepository.save(detectors);
        Category meters = new Category("Cameras", CategoryType.TestingEquipment);
        categoryRepository.save(meters);
        Category scanners = new Category("Scanners", CategoryType.TestingEquipment);
        categoryRepository.save(scanners);

        Item drill1 = new Item("DeWalt DCD778D2T-GB 18V Cordless Combi Drill", 5, drills);
        itemRepository.save(drill1);
        Item drill2 = new Item("DeWalt DCH033 3kg 18V Cordless SDS Plus Drill", 3, drills);
        itemRepository.save(drill2);
        Item drill3 = new Item("Titan TTB631 SDS 6.3kg 240V Electric SDS Plus Drill", 6, drills);
        itemRepository.save(drill3);
        Item drill4 = new Item("Makita DHR202SMW 3.5kg 18V Cordless SDS Plus Drill", 8, drills);
        itemRepository.save(drill4);
        Item drill5 = new Item("Erbauer EBCD18Li-2 18V Cordless Combi Drill", 10, drills);
        itemRepository.save(drill5);



    }

}
