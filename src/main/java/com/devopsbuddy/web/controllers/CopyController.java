package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Deni86 on 11.11.2016..
 */
@Controller
public class CopyController {//Zovemo ga Copy... zato sto se u njemu nalaze informacije o kompaniji a tj i copyrights pa zato.

    @RequestMapping("/about")
    public String about(){
        return "copy/about";
    }
}
