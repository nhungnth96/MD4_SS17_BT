package ss16.bt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Translate {
    Map<String, String> dictionary;

    public Translate() {
        this.dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

    }
    @GetMapping("/translate")
    public String showForm() {
        return "dictionary";
    }
    @GetMapping("/result")
    public String search( @RequestParam ("search") String search,Model model){
        String result = dictionary.get(search);
        model.addAttribute("result",result);
        if(result==null){
            model.addAttribute("result","Not Found!");
        }
        return "dictionary";
    }


}