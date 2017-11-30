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
package org.terasology.crafting.recipe;


import org.terasology.crafting.listCrafting.components.ListRecipesComponent;

import java.util.Map;

/**
 * Represents a List Recipe.
 * Simply a list of inputs and a single output.
 */
public class ListRecipe implements Recipe {
    public String[] inputItems;
    public int[] inputCounts;
    public int outputCount;
    public String output = "";

    public ListRecipe(ListRecipesComponent.ListRecipeContainer copy, String result) {
        if (copy.inputs != null) {
            inputItems = new String[copy.inputs.size()];
            inputCounts = new int[copy.inputs.size()];
            int i = 0;
            for (Map.Entry<String, Integer> entry : copy.inputs.entrySet()) {
                inputItems[i] = entry.getKey();
                inputCounts[i] = entry.getValue();
                i++;
            }
        }
        output = result;
        outputCount = copy.outputCount;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputItems.length; i++) {
            result.append(i > 0 ? " + " : "");
            result.append(inputCounts[i]).append("x").append(inputItems[i]);
        }
        return result + " = " + outputCount + "x" + output;
    }
}
