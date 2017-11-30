/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.crafting.components;

import org.terasology.crafting.recipe.Recipe;

/**
 * The interface to represent a base component type
 */
public interface RecipeComponent {
    /**
     * Get all the recipes stored in this component
     * @return The array of recipes
     */
    Recipe[] getRecipes();

    /**
     * Get the category to place these recipes into
     * @return The category id
     */
    String getCategory();
}
