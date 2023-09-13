package com.donweb.service;

import com.donweb.dto.ProductRequest;
import com.donweb.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);


}
