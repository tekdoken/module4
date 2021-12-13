package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Demo {
    @GetMapping("/")
    public String greeting() {
        return "index";
    }

    @GetMapping("/dicForm")
    public String greeting1() {
        return "dictionary";
    }

    @GetMapping("/dictionary")
    public String greeting1(@RequestParam String name, Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "xin chào");
        map.put("good bye", "tạm biệt");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                model.addAttribute("name", entry.getValue());
                return "dictionary";
            }
        }
        model.addAttribute("name", "not found");
        return "dictionary";
    }

    @GetMapping("/sum")
    public String sum(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "a";
    }

    @PostMapping("/sum1")
    public String sum1(@RequestParam Integer a, Model model) {
        model.addAttribute("sum", a * 22000);
        return "index";
    }
}
