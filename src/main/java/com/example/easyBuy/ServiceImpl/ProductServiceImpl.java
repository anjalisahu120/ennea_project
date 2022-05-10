package com.example.easyBuy.ServiceImpl;

import com.example.easyBuy.Model.Product;
import com.example.easyBuy.Repository.ProductRepository;
import com.example.easyBuy.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public void saveAll(List<Product> read) {
        repo.saveAll(read);
    }
    @Override
    public List<Product> findProductsBySupplierId(String id) {
        List<Product> products = repo.findProductsBySupplierId(id);
        return products;
    }

    @Override
    public List<Product> findProductsByName(String name) {
        List<Product> products = repo.findProductsByName(name);
        return products;
    }

    @Override
    public List<Product> getProductsByExpiryDate(Date exp) {
        List<Product> products = repo.getProductsByExpiryDate(exp);
        return products;
    }

}
