/** Required package class namespace */
package recipebook;

import tools.HTMLFormatting;

/** 
* Recipe.java - A class of which contains a simple recipe. 
* It will contain a Name, an array of Ingredients, and an array of Directions.
*
* @author Marissa Rowles
* @teacher Mr. Wachs 
* @since 4-Nov-2021 
*/
public class Recipe {
    
    private String name;
    private String[] ingredients;
    private String[] directions;
    private String source;
    
    HTMLFormatting html;
    
    /**
     * Constructor method changes object properties
     * 
     * @param name        The title which will be used 
     * @param ingredients what ingredients will be listed, sorted into an array
     * @param directions  what directions will be listed, sorted into an array
     */
    public Recipe(String name, String[] ingredients, String[] directions){
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
        this.source = null;
    }
    
    /**
     * Constructor method changes object properties
     * 
     * @param name        The title which will be used 
     * @param ingredients what ingredients will be listed
     * @param directions  what directions will be listed
     */
    public Recipe(String name, String ingredients, String directions){
        this.name = name;
        this.ingredients = ingredients.split("[|]");
        this.directions  = directions.split("[|]");
        this.source = null;
    }
    
    /**
     * Constructor method changes object properties
     * 
     * @param name        The title which will be used 
     * @param ingredients what ingredients will be listed
     * @param directions  what directions will be listed
     * @param source      The source of this recipe, if needed.
     */
    public Recipe(String name, String ingredients, 
            String directions, String source){
        this.name = name;
        this.ingredients = ingredients.split("[|]");
        this.directions  = directions.split("[|]");
        setSource(source);
    }
    
    /**
     * Gets the Name of the recipe
     * @return the Name of the recipe
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets the Ingredients of the recipe
     * @return the Ingredients of the recipe
     */
    public String[] getIngredients (){
        return ingredients;
    }
    
    /**
     * Gets the Directions of the recipe
     * @return the Directions of the recipe
     */
    public String[] getDirections (){
        return directions;
    }
    
    /**
     * Gets the Ingredients of the recipe, turning them into a single string
     * @return the Ingredients of the recipe, as a single string
     */
    public String getIngredientsSingle (){
        String string = "";
        for (int i = 0; i < ingredients.length; i++) {
            string += ingredients[i] + "|";
        }
        return string;
    }
    
    /**
     * Gets the Directions of the recipe turning them into a single string
     * @return the Directions of the recipe, as a single string
     */
    public String getDirectionsSingle (){
        String string = "";
        for (int i = 0; i < directions.length; i++) {
            string += directions[i] + "|";
        }
        return string;
    }
    
    /**
     * Gets the source of the recipe
     * @return's the source
     */
    public String getSource (){
        return source;
    }
    
    /**
     * Sets the source to a new input
     * @param source 
     */
    public void setSource (String source){
        this.source = source;
    }
    
    /**
     * String representation of the recipe, 
     * formatted to work with HTML formatting
     *
     * @return The object represented as a String
     */
    public String toString() {
        getSource(); // SOURCE IF/ELSE CODE WILL NOT WORK WITHOUT THIS
        String output = "";
        int step = 1;
        
        output += "<h1 " + html.h1Style + "\">Recipe: <span style=\"font-size: 90%;\">" + name + "</span></h1>"; 
        output += "<h2 " + html.h2Style + "\"><b>Ingredients</b></h2>";
        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = ingredients[i].trim();
            output += "<p " + html.pStyle + "\"><b>|</b> " + ingredients[i] + "</p>";
        }
        output += "<h2 " + html.h2Style + "\"><b>Directions</b></h2>";
        for (int i = 0; i < directions.length; i++) {
            directions[i] = directions[i].trim();
            output += "<p " + html.pStyle + "\"><b>" + step + "|</b> " + directions[i] + "</p>";
            step++;
        }
        if (source == null || source.isEmpty()) {
            System.out.println("Source = null");
        } else {
            output += "<hr noshade>" + 
                    "<p><b>Source:</b> <u style=\"color:#0000FF;\">" + source + "</u></p>";
        }
        
        //output += "<p><b>THE RECIPE HAS ENDED</b></p>";
        return output;
    }
    
    /**
     * The recipe, outputted into the console to check for errors
     */
    public void toOutput() {
        String output = "";
        int step = 1;
        
        if (name != null) output += "Recipe: " + name + "\n";
        else              output += "Name Error";
        
        output += "Ingredients\n";
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i] != null) {
                output += "\tcheck\n";
            }
            else System.out.println("Ingredient Error");
        }
        output += "Directions\n";
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] != null){
                output += "\t" + step + " check\n";
                step++;
            }
            else System.out.println("Directions Error");
        }
        System.out.println(output);
    }
    
}
