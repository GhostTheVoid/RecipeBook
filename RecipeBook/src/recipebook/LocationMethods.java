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
        
        System.out.println(type);

        // from the choice made, selects what type of food to list
        switch (type) {
            case 0:  listRecipe(WriteRecipes.american, "American"); break;
            case 1:  listRecipe(WriteRecipes.mexican,  "Mexican");  break;
            case 2:  listRecipe(WriteRecipes.british,  "British");  break;
            case 3:  listRecipe(WriteRecipes.french,   "French");   break;
            case 4:  listRecipe(WriteRecipes.italian,  "Italian");  break;
            case 5:  listRecipe(WriteRecipes.japanese, "Japanese"); break;
            case 6:  recipeOriginal();                              break;
            case 7:  System.exit(0);                                break;
            case 8:  System.exit(0);                                break;
        }
    }
    
    /**
     * Lists recipes and lets the user choose a food type from a list
     * 
     * @param <T>   Recipe objects, stored into an array
     * @param array An array of Recipes from a specific origin
     * @param type  The name of a Recipes origin location
     */
    private static <T extends Recipe> void listRecipe (T[] array, String type){
        // user chooses which recipe to make 
        int choice = Dialogs.chooseArray(
                "What " + type + " recipe would you like to make?", 
                getRecipeNames(array), 
                false, Globals.defaultIcon);
        
        if (choice >= array.length) {
            makeWhat();
        } else {
            // Puts the given recipe into a String
            String recipe = array[choice].toString();
            outputRecipe(recipe, false);
        }
    }
    
    /**
     * Either creates a new recipe or goes to list new recipes
     */
    private static void recipeOriginal() {
        boolean bool = Dialogs.yesNo("Are you making a new recipe?", 
                Globals.defaultIcon);
        if (bool) newRecipe();
        else checkRecipeFolder();
    }
    
    /**
     * Prevents a null error, by checking if the original recipe folder is
     * empty. If it is, the 
     */
    private static void checkRecipeFolder() {
        System.out.println("GOD HELP ME");
        int recipeCount = Globals.createFood.getCustomRecipeCount();
        
        if (recipeCount <= 0) {
            Dialogs.output("Your recipes folder is empty!", 
                            Globals.defaultIcon);
            recipeOriginal();
        } 
        else listRecipe(WriteRecipes.custom, "Custom");
    }

    /**
     * Makes a new custom recipe
     */
    private static void newRecipe() {
        // Asks the title of the recipe
        String q1 = Dialogs.inputRecipe("What is the name of the new recipe?", 
                Globals.defaultIcon, 25, true);
        // Check Q1 for Null
        if (q1 == null || q1.equals("")){ 
            JOptionPane.showMessageDialog(null, "Title Empty!", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            q1 = Dialogs.inputRecipe("What is the name of the new recipe?", 
                Globals.defaultIcon, 25, true);
        } else if (q1.equals("Cancel")) {
            makeWhat();
            return;
        }
        
        // Asks what ingredients are in the recipe, in which the user will use
        // "|" character to split them
        String q2 = Dialogs.inputRecipe(
                "What ingredients are in the "
                + "recipe? (include measurements and "
                + "seperate with the | character)", 
                Globals.defaultIcon, 112, false);
        // Check Q2 for Null
        if (q2 == null || q2.equals("")){ 
            JOptionPane.showMessageDialog(null, "Ingredients Empty!", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            q2 = Dialogs.inputRecipe(
                "What ingredients are in the "
                + "recipe?(include measurements and "
                + "seperate with the | character)", 
                Globals.defaultIcon, 112, false);
        } else if (q2.equals("Cancel")) {
            makeWhat();
            return;
        }
        
        String q3 = Dialogs.inputRecipe( 
                "What are the directions for the "
                + "recipe? <br>(seperate with the | character)", 
                Globals.defaultIcon, 112, false);
        // Check Q3 for Null
        if (q3 == null || q3.equals("")){ 
            JOptionPane.showMessageDialog(null, "Directions Empty!", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            q3 = Dialogs.inputRecipe( 
                "What are the directions for the "
                + "recipe? <br>(seperate with the | character)", 
                Globals.defaultIcon, 112, false);
        }
        else if (q3.equals("Cancel")) {
            makeWhat();
            return;
        }

        if (q1.isEmpty() || q2.isEmpty() || q3.isEmpty() ) {
            throw new NullPointerException("One of the questions is empty. "
                    + "Please try again");
        }
        
        NewRecipe nr = new NewRecipe(q1, q2, q3);
        
        outputRecipe(nr.toString(), true);
    }
    
    private static String customQuestions(String type, String text, int height){
        String input = Dialogs.inputRecipe(text, 
                Globals.defaultIcon, 25, true);
        // Check input for Null
        if (input == null || input.equals("")){ 
            JOptionPane.showMessageDialog(null, type + " Empty!", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            input = Dialogs.inputRecipe(text, 
                Globals.defaultIcon, 25, true);
        } else if (input.equals("Cancel")) {
            makeWhat();
            return "Cancel";
        }
        
        return input;
    } 
    
    /**
     * Shows a message dialog which shows how to make the recipe
     * 
     * @param recipe The contents of which recipe was chosen
     */
    private static void outputRecipe (String recipe, boolean original){
        // Calculate the size of the dialog via the length of the string
        // Base Height = 400 || Text Height = 12 
        int   math   = Dialogs.getFontSize() * recipe.length() / 400;
        float height = 11.25f * math;
        if (height < 400) height -= 75;
        else if (height > 2000) height /= 1.7f;
        
        // Output string into a formatted message dialog
        Dialogs.outputRecipe("<p style=\"color:#696969; font-size: 12; margin-top: 2px;\">"
                + "<i>(An ingredient with a *, means that it is optional)</i>"
                + "</p>" + recipe, Globals.foodIcon, 375, (int)height, original);
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
