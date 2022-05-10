package com.example.easyBuy.Repository;

import com.example.easyBuy.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    void saveAll(List<Product> read);

    List<Product> findProductsBySupplierId(String id);

    Product save(Product product);


    List<Product> findProductsByName(String name);

    List<Product> getProductsByExpiryDate(Date exp);
}
