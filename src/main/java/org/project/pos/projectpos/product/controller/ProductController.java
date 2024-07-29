package org.project.pos.projectpos.product.controller;

import lombok.RequiredArgsConstructor;
import org.project.pos.projectpos.product.model.ProductRequest;
import org.project.pos.projectpos.product.model.ProductResponse;
import org.project.pos.projectpos.product.repository.ProductRepo;
import org.project.pos.projectpos.product.service.ProductService;
import org.project.pos.projectpos.util.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;


    @GetMapping
    public ModelAndView getProduct() {
        ModelAndView mav = new ModelAndView("pages/master/product/index");
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView addProduct() {
        ModelAndView mav = new ModelAndView("pages/master/product/add");
        mav.addObject("product", new ProductRequest());
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView addProduct(@ModelAttribute ProductRequest productRequest) {
        ModelAndView mav = new ModelAndView("pages/master/product/add");
        mav.addObject("product", productRequest);

        productService.save(productRequest);
        return new ModelAndView("redirect:/product");
    }

    @GetMapping("/data")
    public ResponseEntity<Response> getData() {
        List<ProductResponse> data = productService.get();
//        data.add(new ProductResponse("1", "iPhone 14 Pro", 2, 1, 19472, "$999", 665, 3, "product-1.png", "Super Retina XDR display footnote Pro Motion technology"));

        Response response = new Response(data);
        return ResponseEntity.ok(response);
    }
}
