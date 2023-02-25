package sn.springframework.recipes.services;

import org.springframework.stereotype.Service;
import sn.springframework.recipes.domain.Recipe;
import sn.springframework.recipes.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;


@Service
public class RecipeServiceImpl implements RecipesService {

   private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
     Set<Recipe> recipeSet = new HashSet<>();
     recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
