package org.project.pos.projectpos.category.controller;

import lombok.RequiredArgsConstructor;
import org.project.pos.projectpos.category.model.CategoryRequest;
import org.project.pos.projectpos.category.model.CategoryResponse;
import org.project.pos.projectpos.category.service.CategoryService;
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
         //langka 1
        List<CategoryResponse> responses = new ArrayList<>();
        responses.add(new CategoryResponse("1234","billa",111,3333));
        responses.add(new CategoryResponse("1234","billa",111,3333));
        responses.add(new CategoryResponse("1234","billa",111,3333));
        responses.add(new CategoryResponse("1234","billa",111,3333));


//      List<CategoryResponse> categoryResponses = categoryService.get();
        view.addObject("data", responses);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute CategoryRequest request){
        categoryService.save(request);
        return new ModelAndView ("redirect:/category");
    }

    @GetMapping("/data")
    public List<CategoryResponse> getData(){
        return this.categoryService.get();
    }
}
