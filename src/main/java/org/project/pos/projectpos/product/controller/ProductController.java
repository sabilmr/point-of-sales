package org.project.pos.projectpos.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public String getProduct() {
        return "pages/master/product/index";
    }

    @GetMapping("/add")
    public String addProduct() {
        return "pages/master/product/add";
    }
}