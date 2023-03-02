package sn.springframework.recipes.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sn.springframework.recipes.domain.Recipe;
import sn.springframework.recipes.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;



@Slf4j
@Service
public class RecipeServiceImpl implements RecipesService {

   private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {log.debug("I'm in the service");
     Set<Recipe> recipeSet = new HashSet<>();
     recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
