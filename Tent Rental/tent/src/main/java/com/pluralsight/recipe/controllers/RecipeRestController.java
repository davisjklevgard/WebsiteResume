package com.pluralsight.recipe.controllers;

import com.pluralsight.recipe.models.Tent;
import com.pluralsight.recipe.repositories.RecipeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeRestController {
    @Autowired
    private RecipeJpaRepository jpaRepository;

    @GetMapping("")
    public List<Tent> listRecipes(){
        return jpaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tent getRecipe(@PathVariable Long id) {
        return jpaRepository.getById(id);
    }

    @PostMapping("")
    public Tent createRecipe(@RequestBody Tent tent) {
        return jpaRepository.save(tent);
    }

    @PutMapping("/{id}")
    public Tent updateRecipe(@RequestBody Tent tent, @PathVariable Long id) {
        Tent r = jpaRepository.getById(id);
        r.setName(tent.getName());
        r.setDescription(tent.getDescription());
        return jpaRepository.save(r);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id){
        jpaRepository.deleteById(id);
    }
}
