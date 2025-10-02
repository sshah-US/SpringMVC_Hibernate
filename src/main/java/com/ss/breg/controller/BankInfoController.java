package com.ss.breg.controller;

import com.ss.breg.exception.ApplicationException;
import com.ss.breg.model.AllInfo;
import com.ss.breg.service.AllInfoService;
import com.ss.breg.validation.InputValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("allInfo")
public class BankInfoController {

    @Autowired
    private AllInfoService service;

    @PostMapping("/bInfo")
    public String submit(@ModelAttribute("allInfo") AllInfo aInfo, Model model) {
        if (InputValidator.isEmpty(aInfo.getBname()) ||
            InputValidator.isEmpty(aInfo.getAcnum()) ||
            InputValidator.isEmpty(aInfo.getSsn())) {

            model.addAttribute("error", "All fields are required!");
            return "BankInfo";
        }

        try {
            boolean saved = service.registerUser(aInfo);
            model.addAttribute("message", saved ? "Registration Successful!" : "Registration Failed!");
        } catch (ApplicationException e) {
            model.addAttribute("message", "Error: " + e.getMessage());
        }

        return "Success";
    }
}
