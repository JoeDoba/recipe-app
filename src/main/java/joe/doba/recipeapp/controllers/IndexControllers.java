package joe.doba.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllers {
    @RequestMapping({"", "/index"})
    public String getIndexPage() {
        System.out.println("Some message to say....ssssssssss");
        return "index";
    }
}
