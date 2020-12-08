package com.mnb.shoppingapp.product.repository;

import com.mnb.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
