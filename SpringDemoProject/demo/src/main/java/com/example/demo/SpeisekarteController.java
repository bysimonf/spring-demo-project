package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class SpeisekarteController {

   @GetMapping("/speisekarte")
    public String speisekarte(Model model) {

       Speisekarte sommerKarte = new Speisekarte();

       Speise Schweinebraten = new Speise("Scheinebraten", 7);
       Speise Leberkas = new Speise("Leberkas", 5);

       sommerKarte.addSpeise(Schweinebraten);
       sommerKarte.addSpeise(Leberkas);

       Getraenk Bier = new Getraenk("Bier", 6);
       Getraenk Goasmaß = new Getraenk("Goasmaß", 8);

       sommerKarte.addGetraenk(Bier);
       sommerKarte.addGetraenk(Goasmaß);

       Dessert Bierkuchen = new Dessert("Bierkuchen", 3);
       Dessert Eis = new Dessert("Eis", 3);

       sommerKarte.addDessert(Bierkuchen);
       sommerKarte.addDessert(Eis);

       model.addAttribute("speisekarte", sommerKarte);

       return "speisekarte";
    }


}
