package de.cegeka.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pets")
@Controller
public class PetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets() {
        return "pets/index";
    }
}
