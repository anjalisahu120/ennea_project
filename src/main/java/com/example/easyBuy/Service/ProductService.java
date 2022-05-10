package com.example.easyBuy.Service;

import com.example.easyBuy.Model.Product;
import com.example.easyBuy.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;


public interface ProductService {
    void saveAll(List<Product> read) ;


    List<Product> findProductsBySupplierId(String id);

    List<Product> findProductsByName(String name);

    List<Product> getProductsByExpiryDate(Date exp);
}
