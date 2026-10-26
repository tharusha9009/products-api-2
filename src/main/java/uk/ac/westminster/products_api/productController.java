package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class productController {

    @Autowired
    private productService productService;
    @GetMapping
    public List<product> getAllProducts(){
        return productService.getAllproducts();
    }
    @GetMapping("/{id}")
    public product getById(@PathVariable Long id) {
        return new product(id, "Laptop", 999.99) {
            @Override
            public String getSummary() {
                return "";
            }
        };
    }

    @GetMapping("/products/{id}")
    public product getProductById(@PathVariable Long id) { return productService.getProductById(id).orElse(null); }

    @PostMapping
    public product addProduct( @RequestBody product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleProductById(@PathVariable Long id){
        productService.deleteById(id);
    }

    @GetMapping("/products/search")
    public List<product> search(@RequestParam String name){
        return productService.findByName(name);
    }


}
