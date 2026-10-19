package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class productService {
    private List<product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<product> getAllproducts(){
        return products;
    }
    public productService(){
        DigitalProduct digitalProduct = new DigitalProduct(nextId++ , "Tharusha", 39.00 ,"Adobe-Photoshop", 6700);
        PhysicalProduct physicalProduct = new PhysicalProduct(nextId++ ,"joeshep" , 40.99 ,30 ,"493hbf" );
        products.add(digitalProduct);
        products.add(physicalProduct);
    }

    public product addProduct(product product){
        product.setId(nextId++);
        products.add(product);
        return product;

    }
    public Optional<product> getProductById(Long id){
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
    public List<product> findByName (String name){
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }


    public Optional<product> findById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteById(Long id){
        products.removeIf(p -> p.getId().equals(id));

    }



}
