package com.pluralsight.recipe.repositories;

import com.pluralsight.recipe.models.Tent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeJpaRepository extends JpaRepository<Tent, Long> {
}
