package com.kahkeshan.ui.springmvc;

import com.kahkeshan.biz.StudentService;
import com.kahkeshan.ui.models.StudentDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")

public class HomeController {

    private static Logger logger = LogManager.getLogger(com.kahkeshan.ui.controllers.HomeController.class);



    @Autowired
    StudentService service;
    @RequestMapping("/")
    public String home(){
        return "index";
    }



    @RequestMapping("/login.mvc")
    public ModelAndView login( @RequestParam String name, @RequestParam String role, ModelAndView model,HttpServletRequest request){


        request.getSession().setAttribute("name",name);
        model.addObject("name",name);
        model.addObject("role",role);
        model.setViewName("welcome");


        return model;
    }
    @GetMapping("/register.mvc")
    public String register(){
        return "register";
    }

    @PostMapping("/save-student.mvc")
    public String saveStudent(@RequestParam String name,@RequestParam String family, @RequestParam String college){
        StudentDTO student = new StudentDTO(name,family,college, null);
        try {
            service.save(student);
            return "redirect:/";
        }catch (Exception e){
            logger.error("in Home Controller",e.getMessage());
            return  "redirect:/error.mvc";
        }
    }


}
