package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.service.UserService;

@Controller
public class PageController {

    private final UserService userService;
    
    public PageController(UserService userService) {
        this.userService = userService;
    }

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
        // model is used to use userForm object in html file
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        return "register";
    }

    /*ModelAttribute -> populate the userForm model attribute with data from a form submitted to the processRegister endpoint */
    @PostMapping("/do-register")
    public String processRegister(@ModelAttribute UserForm userForm) {
        // fetch form data

        // validate form data

        // save to database
        User user = User.builder()
                        .name(userForm.getName())
                        .email(userForm.getEmail())
                        .password(userForm.getPassword())
                        .about(userForm.getAbout())
                        .phoneNumber(userForm.getPhoneNumber())
                        .build();
        
        User savedUser = userService.saveUser(user);

        // message = "Registeration successful"

        // redirect to register page
        return "redirect:/register";
    }
}
