package de.cegeka.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {


    //    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    @RequestMapping({"/vets"})
    public String listVets() {
        return "vets/index";
    }
}
