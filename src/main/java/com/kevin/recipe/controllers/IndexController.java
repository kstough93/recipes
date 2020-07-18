package com.kevin.recipe.controllers;

import com.kevin.recipe.domain.Category;
import com.kevin.recipe.domain.UnitOfMeasure;
import com.kevin.recipe.repositories.CategoryRepository;
import com.kevin.recipe.repositories.RecipeRepository;
import com.kevin.recipe.repositories.UnitOfMeasureRepository;
import com.kevin.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Enter getIndexPage of IndexController.");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
