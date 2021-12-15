/** Required package class namespace */
package recipebook;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tools.Dialogs;

/**
 * LocationMethods.java - The methods which the user will use to select or
 * create their recipe. 
 *
 * @author Marissa Rowles
 * @teacher Mr. Wachs
 * @since 2-Nov-2021
 */
public class LocationMethods {
    
    /**
     * What food type of food will be made
     */
    public static void makeWhat() {
        // user chooses which type of food to make
        int type = Dialogs.chooseArray(
                "What type of food do you want to make?", 
                WriteRecipes.INTERNATIONAL, true, Globals.defaultIcon);
        
        // from the choice made, selects what type of food to list
        switch (type) {
            case 0:  listRecipeAmerican();   break;
            case 1:  listRecipeMexican();    break;
            case 2:  listRecipeBritish();    break;
            case 3:  listRecipeFrench();     break;
            case 4:  listRecipeItalian();    break;
            case 5:  listRecipeJapanese();   break;
            case 6:  recipeOriginal();       break; 
        }
    }
    
    /**
     * lists american recipes and lets a choice be made
     */
    private static void listRecipeAmerican() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What American recipe would you like to make?", 
                getRecipeNames(WriteRecipes.american), 
                false, Globals.defaultIcon);
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.american[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * lists Mexican recipes and lets a choice be made
     */
    private static void listRecipeMexican() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What Mexican recipe would you like to make?", 
                getRecipeNames(WriteRecipes.mexican), 
                false, Globals.defaultIcon);
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.mexican[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * lists British recipes and lets a choice be made
     */
    private static void listRecipeBritish() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What British recipe would you like to make?", 
                getRecipeNames(WriteRecipes.british), 
                false, Globals.defaultIcon);
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.british[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * lists French recipes and lets a choice be made
     */
    private static void listRecipeFrench() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What French recipe would you like to make?", 
                getRecipeNames(WriteRecipes.french), 
                false, Globals.defaultIcon );
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.french[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * lists Italian recipes and lets a choice be made
     */
    private static void listRecipeItalian() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What Italian recipe would you like to make?", 
                getRecipeNames(WriteRecipes.italian), 
                false, Globals.defaultIcon);
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.italian[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * lists Japanese recipes and lets a choice be made
     */
    private static void listRecipeJapanese() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What Japanese recipe would you like to make?", 
                getRecipeNames(WriteRecipes.japanese), 
                false, Globals.defaultIcon);
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.japanese[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * lists custom recipes from a .txt file and lets a choice be made
     */
    private static void listRecipeOriginal() {
        // user chooses which recipe to make 
        int type = Dialogs.chooseArray(
                "What Custom recipe would you like to make?", 
                getRecipeNames(WriteRecipes.custom), 
                false, Globals.defaultIcon);
        
        // Puts the given recipe into a String
        String recipe = Globals.createFood.custom[type].toString();
        outputRecipe(recipe);
    }
    
    /**
     * Shows a message dialog which shows how to make the recipe
     * 
     * @param recipe The contents of which recipe was chosen
     */
    private static void outputRecipe (String recipe){
        // Calculate the size of the dialog via the length of the string
        // Base Height = 400 || Text Height = 12 
        int   math   = Dialogs.getFontSize() * recipe.length() / 400;
        float height = 11.25f * math;
        if (height < 400) height -= 75;
        else if (height > 2000) height /= 1.7f;
        
        // Output string into a formatted message dialog
        Dialogs.output("<p style=\"color:#696969;\"><i>"
                + "(An ingredient with a *, means that it is optional)</i></p>" 
                + recipe, Globals.foodIcon, 375, (int)height);
    }
    
    /**
     * Either creates a new recipe or goes to list new recipes
     */
    private static void recipeOriginal() {
        boolean bool = Dialogs.yesNo("Are you making a new recipe?", 
                Globals.defaultIcon);
        if (bool) newRecipe();     // Makes a new custom recipe
        else listRecipeOriginal(); // Gets custom recipes from a file
    }

    /**
     * Makes a new custom recipe
     */
    private static void newRecipe() {
//        // Asks the title of the recipe
        String q1 = Dialogs.input("What is the name of the new recipe?", 
                Globals.defaultIcon);
//        // Asks what ingredients are in the recipe, in which the user will use
//        // "|" character to split them
//        String q2 = Dialogs.input(
//                "What ingredients are in the "
//                        + "recipe (include measurements and "
//                        + "seperate with the | character)", 
//                Globals.defaultIcon);
//        String q3 = Dialogs.input( 
//                "What are the directions for the "
//                        + "recipe (seperate with the | character)", 
//                Globals.defaultIcon);
        
        // TEMPORARY!!!
        //String q1 = "Garlic Bread (CUSTOM)";
        String q2 = "4 cloves garlic, minced| ½ cup (1 stick) butter, softened|"
                + "1 baguette or French bread, cut lengthwise|"
                + "½ tsp. kosher salt| 2 tbsp. freshly chopped parsley|"
                + "¼ cup grated Parmesan";
        String q3 = "Preheat oven to 425° and line a large baking sheet with "
                + "foil. Make garlic compound butter: In a small bowl, "
                + "mix softened butter with garlic, salt, and parsley until "
                + "well combined.| Spread cut sides of bread liberally with "
                + "garlic butter. Sprinkle with Parmesan.| "
                + "Bake until bread is toasty and golden at the edges, "
                + "about 10 minutes.";
        
        // /////////////
        
//        String[] ingredients = q2.split("[|]");
//        String[] directions  = q3.split("[|]");

        if (q1.isEmpty() || q2.isEmpty() || q3.isEmpty() ) {
            throw new NullPointerException("One of the questions is empty");
        }
        
        NewRecipe nr = new NewRecipe(q1, q2, q3);
        
        outputRecipe(nr.toString());
    }
    
    /**
     * Gets recipe names from an array
     * @param origins which array is used
     * @return a string array containing each name
     */
    private static String[] getRecipeNames (Recipe[] origins){
        String[] names = new String[origins.length];
        for (int i = 0; i < origins.length; i++) {
            names[i] = origins[i].getName();
        }
        return names;
    }
}
