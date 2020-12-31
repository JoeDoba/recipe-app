package joe.doba.recipeapp.controllers;


import joe.doba.recipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.Optional;

@Controller
public class IndexControllers {

    private final RecipeService recipeService;

    public IndexControllers(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
