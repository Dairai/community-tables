package com.community.controller;

import com.community.utils.MessageManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ResourceBundle;

@Controller
public class IndexController {
 
    @RequestMapping("/index")
    public String hello(Model model) {

        ResourceBundle resources = MessageManager.getInstance().getMessages();

        // header
        model.addAttribute("brand", resources.getString("brand"));

        //nav
        model.addAttribute("first_nav_title", resources.getString("first_nav_title"));
        model.addAttribute("second_nav_title", resources.getString("second_nav_title"));
        model.addAttribute("third_nav_title", resources.getString("third_nav_title"));

        // index
        model.addAttribute("first_title", resources.getString("index.first_title"));
        model.addAttribute("first_body", resources.getString("index.first_body"));
        model.addAttribute("second_title", resources.getString("index.second_title"));
        model.addAttribute("second_body", resources.getString("index.second_body"));

        // email
        model.addAttribute("submit_label", resources.getString("email.submit.label"));
        model.addAttribute("success_message", resources.getString("email.subscribe.success_message"));
        model.addAttribute("fail_message", resources.getString("email.subscribe.fail_message"));
        
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        ResourceBundle resources = MessageManager.getInstance().getMessages();
        model.addAttribute("username_label", resources.getString("username_label"));
        model.addAttribute("password_label", resources.getString("password_label"));
        model.addAttribute("username_input_text", resources.getString("username_input_text"));
        model.addAttribute("password_input_text", resources.getString("password_input_text"));
        model.addAttribute("login_error", resources.getString("login_error"));
        model.addAttribute("logout_success", resources.getString("logout_success"));
        model.addAttribute("login_button", resources.getString("login_button"));

        // Load login.jsp
        return "login";
    }

    @RequestMapping("/about")
    public String about(Model model) {

        ResourceBundle resources = MessageManager.getInstance().getMessages();

        // header
        model.addAttribute("brand", resources.getString("brand"));

        // nav
        model.addAttribute("first_nav_title", resources.getString("first_nav_title"));
        model.addAttribute("second_nav_title", resources.getString("second_nav_title"));
        model.addAttribute("third_nav_title", resources.getString("third_nav_title"));

        // index
        model.addAttribute("first_title", resources.getString("about.first_title"));
        model.addAttribute("first_body", resources.getString("about.first_body"));
        model.addAttribute("second_title", resources.getString("about.second_title"));
        model.addAttribute("second_body", resources.getString("about.second_body"));

        // Load about.jsp
        return "about";
    }

    @RequestMapping("/vision")
    public String vision(Model model) {

        ResourceBundle resources = MessageManager.getInstance().getMessages();

        // header
        model.addAttribute("brand", resources.getString("brand"));

        // nav
        model.addAttribute("first_nav_title", resources.getString("first_nav_title"));
        model.addAttribute("second_nav_title", resources.getString("second_nav_title"));
        model.addAttribute("third_nav_title", resources.getString("third_nav_title"));

        // index
        model.addAttribute("first_title", resources.getString("vision.first_title"));
        model.addAttribute("first_body", resources.getString("vision.first_body"));
        model.addAttribute("second_title", resources.getString("vision.second_title"));
        model.addAttribute("second_body", resources.getString("vision.second_body"));

        // Load vision.jsp
        return "vision";
    }

}
	


