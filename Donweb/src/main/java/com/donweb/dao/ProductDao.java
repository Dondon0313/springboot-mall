package com.donweb.dao;

import com.donweb.dto.ProductRequest;
import com.donweb.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
