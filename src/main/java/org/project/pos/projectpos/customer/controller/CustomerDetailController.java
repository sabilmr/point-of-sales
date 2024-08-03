package org.project.pos.projectpos.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customerDetail")
public class CustomerDetailController {

    @GetMapping
    public String customerDetail() {
        return "pages/master/customer-detail/detail";
    }
}
