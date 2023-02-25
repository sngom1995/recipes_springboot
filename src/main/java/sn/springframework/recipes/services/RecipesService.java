package sn.springframework.recipes.services;

import org.springframework.stereotype.Service;
import sn.springframework.recipes.domain.Recipe;

import java.util.Set;

@Service
public interface RecipesService {
    Set<Recipe> getRecipes();
}
