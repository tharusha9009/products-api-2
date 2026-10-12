package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {
    private List<product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<product> getAllproducts(){
        return products;
    }

    public product addProduct(product product){
        product.setId(nextId++);
        products.add(product);
        return product;

    }



}
