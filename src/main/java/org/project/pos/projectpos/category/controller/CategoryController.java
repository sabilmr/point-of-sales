package org.project.pos.projectpos.category.controller;

import lombok.RequiredArgsConstructor;
import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;
import org.project.pos.projectpos.category.service.CategoryService;
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
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("")
    public ModelAndView category() {
        ModelAndView view = new ModelAndView("pages/master/category/index");
//      List<CategoryResponse> categoryResponses = categoryService.get();
//        view.addObject("data", responses);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute CategoryRequest request){
        categoryService.save(request);
        return new ModelAndView ("redirect:/category");
    }

    @GetMapping("/data")
    public ResponseEntity<Response> getData(){
        List<CategoryResponse> data = new ArrayList<>();
        data.add(new CategoryResponse("1", "product-1.png", "Smart Phone", "Choose from wide range of smartphones from popular brands", "$99129", 1947));
        data.add(new CategoryResponse("2", "product-2.png", "Electronics", "Choose from wide range of electronics from popular brands", "$2512.50", 7283));
        return ResponseEntity.ok(new Response(data));
    }
}
