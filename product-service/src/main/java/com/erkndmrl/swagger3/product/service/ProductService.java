package com.erkndmrl.swagger3.product.service;

import com.erkndmrl.swagger3.product.model.entity.Product;
import com.erkndmrl.swagger3.product.model.request.ProductDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {



    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        Product product1 = new Product("1", "name1");
        Product product2 = new Product("2", "name2");
        list.add(product1);
        list.add(product2);
        return list;
    }

    public Product getProductById(String id) {
        return new Product("+", "name1");
    }


    public void deleteProduct(String id) {

    }


}
