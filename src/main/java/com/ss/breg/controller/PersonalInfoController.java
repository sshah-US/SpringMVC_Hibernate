package com.ss.breg.controller;

import com.ss.breg.model.AllInfo;
import com.ss.breg.service.AllInfoService;
import com.ss.breg.validation.InputValidator;
import com.ss.breg.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("allInfo")  // tell Spring to keep this in session
public class PersonalInfoController {

    @Autowired
    private AllInfoService service;

    // this creates the session-scoped object the first time
    @ModelAttribute("allInfo")
    public AllInfo createAllInfo() {
        return new AllInfo();
    }

    // Root mapping → loads PersonalInfo.jsp
    @GetMapping("/")
    public String home() {
        return "PersonalInfo";
    }

    @PostMapping("/pInfo")
    public String submit(@ModelAttribute("allInfo") AllInfo aInfo, Model model) {
        if (InputValidator.isEmpty(aInfo.getFname()) ||
            InputValidator.isEmpty(aInfo.getMname()) ||
            InputValidator.isEmpty(aInfo.getLname()) ||
            InputValidator.isEmpty(aInfo.getGender())) {

            model.addAttribute("error", "All fields are required!");
            return "PersonalInfo";
        }

        // no need to manually save into session — Spring keeps it
        return "ContactInfo";
    }
}
