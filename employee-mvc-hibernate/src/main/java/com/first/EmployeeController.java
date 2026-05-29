package com.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDb db;

    @RequestMapping("/insert")
    public String saveEmployee(@ModelAttribute Employee emp) {
        db.saveEmployee(emp);
        return "success";   // cleaner
    }
}