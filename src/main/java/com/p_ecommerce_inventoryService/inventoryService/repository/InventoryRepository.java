package com.p_ecommerce_inventoryService.inventoryService.repository;

import com.p_ecommerce_inventoryService.inventoryService.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}
