/** Required package class namespace */
package recipebook;

/** 
* NewRecipe.java - For making Custom Recipes
*
* @author Marissa Rowles
* @teacher Mr. Wachs 
* @since 4-Nov-2021 
*/
public class NewRecipe extends Recipe{

    /**
     * Constructor method changes object properties
     * 
     * @param name        The title which will be used 
     * @param ingredients what ingredients will be listed, sorted into an array
     * @param directions  what directions will be listed, sorted into an array
     */
    public NewRecipe(String name, 
            String[] ingredients, 
            String[] directions){
        super(name, ingredients, directions);
        ReadCustoms.writeRecipe(name, this);
    }
    
    /**
     * Constructor method changes object properties
     * 
     * @param name        The title which will be used 
     * @param ingredients what ingredients will be listed
     * @param directions  what directions will be listed
     */
    public NewRecipe(String name, 
            String ingredients, 
            String directions){
        
        super(name, ingredients, directions);
        
        ReadCustoms.writeRecipe(name, this);
    }
}
