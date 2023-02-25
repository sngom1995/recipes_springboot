package sn.springframework.recipes.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.springframework.recipes.services.RecipesService;

@Controller
public class IndexController {
    private final RecipesService recipeService;

    public IndexController( RecipesService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
