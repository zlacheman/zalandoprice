package com.zlacheman.zalandoprice.web.controller;
import com.zlacheman.zalandoprice.scrapp.ZalandoItem;
import org.springframework.web.bind.annotation.*;
import com.zlacheman.zalandoprice.model.Product;

import java.util.List;
import java.util.Vector;

@RestController
public class ProductController {

    /**
     * Get all Products
     * @return
     */
    @RequestMapping(value="/Products", method=RequestMethod.GET)
    public List<Product> listProduct() {
        List<Product> list = new Vector<Product>();
        return list;
    }

    /**
     * Get a Product
     * @return
     */
    @GetMapping(value="/Product/{url}")
    public Product showProduct(@PathVariable String url) {
        ZalandoItem item = new ZalandoItem(url);
        item.showAll();
        Product product=new Product(item.findId(), item.getUrl(),item.findPrice(),item.findName());
        return product;
    }
}
