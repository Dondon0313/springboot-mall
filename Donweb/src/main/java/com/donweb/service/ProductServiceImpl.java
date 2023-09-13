package com.donweb.service;

import com.donweb.dao.ProductDao;
import com.donweb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);
    }

}
