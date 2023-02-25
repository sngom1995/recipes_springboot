package sn.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import sn.springframework.recipes.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
