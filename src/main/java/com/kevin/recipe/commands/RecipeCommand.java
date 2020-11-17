package com.kevin.recipe.commands;

import com.kevin.recipe.domain.Category;
import com.kevin.recipe.domain.Difficulty;
import com.kevin.recipe.domain.Ingredient;
import com.kevin.recipe.domain.Notes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Byte[] image;
    private NotesCommand notes = new NotesCommand();
    private Set<CategoryCommand> categories = new HashSet<>();
}
