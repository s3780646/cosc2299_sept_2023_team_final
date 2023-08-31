package au.edu.rmit.sept.app.superPrice.controllers;



import java.util.Collection;
import java.util.List;

import au.edu.rmit.sept.app.superPrice.models.Product;
import au.edu.rmit.sept.app.superPrice.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "v1/Products")
public class ProductController {

    private ProductService service;
    
    @Autowired
    public ProductController(ProductService serv)
    {
        this.service = serv;
    }

    @GetMapping
    public Collection<Product> all(){
        return service.getProducts();
    }

    // @GetMapping
    // public String getName() {
    //     return service.getName();
    // }
}