package sn.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import sn.springframework.recipes.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
