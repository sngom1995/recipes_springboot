package sn.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import sn.springframework.recipes.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
