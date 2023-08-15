package ss16.bt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @GetMapping("/converter")
    public String showForm() {
        return "convert";
    }

    @PostMapping("/converter")
    public String update(
            @RequestParam("rate") float rate,
            @RequestParam("usd") float usd, Model model){
        float vnd=rate*usd;
        model.addAttribute("vnd",vnd);
        return "result";
    }


}
