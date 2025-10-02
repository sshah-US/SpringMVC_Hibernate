package com.ss.breg.controller;

import com.ss.breg.model.AllInfo;
import com.ss.breg.validation.InputValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("allInfo")  // use the same session attribute
public class ContactInfoController {

    @PostMapping("/cInfo")
    public String submit(@ModelAttribute("allInfo") AllInfo aInfo, Model model) {
        if (InputValidator.isEmpty(aInfo.getAddress()) ||
            InputValidator.isEmpty(aInfo.getCity()) ||
            InputValidator.isEmpty(aInfo.getState()) ||
            InputValidator.isEmpty(aInfo.getCountry()) ||
            InputValidator.isEmpty(aInfo.getPhno())) {

            model.addAttribute("error", "All fields are required!");
            return "ContactInfo";
        }

        return "BankInfo";
    }
}
