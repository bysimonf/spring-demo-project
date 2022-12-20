package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class BiergartenController {

    ArrayList<Biergarten> biergartenListe = new ArrayList();

    @GetMapping("/")
    public String index(Model model) {


        Biergarten lindeBiergarten = new Biergarten();

        lindeBiergarten.setName("Die Linde");
        lindeBiergarten.setBierPreis(4);
        lindeBiergarten.setBild("https://images.unsplash.com/photo-1569744026312-d75f5ceb4a03?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1700&q=80");

        biergartenListe.add(lindeBiergarten);

        Biergarten kastanieBiergarten = new Biergarten(7, "Die Kastanie", "https://images.unsplash.com/photo-1615044088186-a2342db7b272?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=3302&q=80");

        biergartenListe.add(kastanieBiergarten);

        model.addAttribute("biergartenliste", biergartenListe);

        return "index";
    }

    @GetMapping("/biergartenformular")
    public String biergartenformular(Model model) {

        Biergarten biergarten = new Biergarten();

        model.addAttribute("biergarten", biergarten);

        return "biergartenformular";
    }

    @PostMapping("/biergartenformular")
    public String biergartenformularSubmit(@ModelAttribute("biergarten") Biergarten biergarten, Model model) {

        biergartenListe.add(biergarten);
        model.addAttribute("biergarten", biergarten);

        return "submitsuccess";
    }
}




