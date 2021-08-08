package com.faraz.frzpetclinic.controllers;

import com.faraz.frzpetclinic.services.OwnerService;
import com.faraz.frzpetclinic.services.map.OwnerServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnersController {
    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","","/index","/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
