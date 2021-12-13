package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Demo {
    @GetMapping("/")
    public String greeting() {
        return "index";
    }

    @GetMapping("/sum")
    public String greeting1(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "a";
    }

    @PostMapping("/sum1")
    public String sum(@RequestParam Integer a,  Model model) {
        model.addAttribute("sum", a * 22000);
        return "index";
    }
}
