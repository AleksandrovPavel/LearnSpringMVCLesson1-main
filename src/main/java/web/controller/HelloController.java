package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "count", required = false) String count,
                        Model model) {

        int a;
        String line = "";
        if (count == null) {
            a = 1;
        } else {
            a = Integer.parseInt(count);
        }
        for (int i = 1; i <= a; i++) {
            line += " Hello world \n";
        }
        model.addAttribute("message", line);
        return "hello";
    }
}
