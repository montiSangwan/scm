package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.forms.UserForm;

@Controller
public class PageController {
    
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "monti");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/services")
    public String services() {
        return "services";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model) {

        // to fill the form data in userForm object
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        return "register";
    }

    /*ModelAttribute is used for ->  */
    @PostMapping("/do-register")
    public String processRegister(@ModelAttribute UserForm userForm) {
        // fetch form data

        // validate form data

        // save to database

        // message = "Registeration successful"

        // redirect to register page
        return "redirect:/register";
    }
}
