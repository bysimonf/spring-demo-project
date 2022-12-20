package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class FAQController {

    @GetMapping("/FAQ")
    public String faq(Model model) {

        ArrayList<FAQ> faqList = new ArrayList<FAQ>();

        FAQ ersteFrage = new FAQ();

        ersteFrage.setFrage("Was ist der durchschnittl. Bierpreis?");
        ersteFrage.setAntwort("Entspannte 6€/Liter");

        faqList.add(ersteFrage);

        model.addAttribute("faqlist", faqList);

        return "FAQ";
    }

}
