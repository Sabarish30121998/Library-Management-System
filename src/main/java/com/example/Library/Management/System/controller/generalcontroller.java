package com.example.Library.Management.System.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller



@RequestMapping("/general")
public class generalcontroller {

    @RequestMapping("/viewhtml")
    public String display(@RequestParam String name, Model model)
    {
        //String name = "Sabarish";
        model.addAttribute("n",name);
        return "welcomepage";
    }
    @RequestMapping("/home")
    public String home()
    {
        return "input";
    }



    @RequestMapping("/appproperty")
    public String run()
    {
      return "hello i am ";
    }



}
