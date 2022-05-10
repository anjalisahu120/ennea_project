package com.example.easyBuy.Controller;

import com.example.easyBuy.Model.CsvUtils;
import com.example.easyBuy.Model.Product;
import com.example.easyBuy.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService service;


    //API to accept a CSV file and ingest the data into a db. You can take it that a new csv added will be of the same format.
    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public void uploadMultipart(@RequestParam("file") MultipartFile file) throws IOException {
        service.saveAll(CsvUtils.read(Product.class, file.getInputStream()));
    }

    @GetMapping("/products/{supplierId}")
    public ResponseEntity<List<Product>> get(@PathVariable String id) {
        try {
            List<Product> products = service.findProductsBySupplierId(id);
            return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/products/{name}")
    public ResponseEntity<List<Product>> getProductsByName(@PathVariable String name) {
        try {
            List<Product> products = service.findProductsByName(name);
            return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/products/{exp}")
    public ResponseEntity<List<Product>> getProductsByExpiryDate(@PathVariable Date exp) {
        try {
            List<Product> products = service.getProductsByExpiryDate(exp);
            return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
        }
    }



}
