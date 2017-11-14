package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MmcrController {

    @GetMapping("/mmcr")
    public String mmcrForm(Model model) {
        model.addAttribute("mmcr", new Mmcr());
        return "mmcr";
    }

    @PostMapping("/mmcr")
    public String mmcrSubmit(@ModelAttribute Mmcr mmcr) {
        return "result";
    }

}