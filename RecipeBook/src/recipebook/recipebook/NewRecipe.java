/** Required package class namespace */
package recipebook;

/** 
* NewRecipe.java - 
*
* @author Marissa Rowles
* @teacher Mr. Wachs 
* @since 4-Nov-2021 
*/
public class NewRecipe extends Recipe{

    public NewRecipe(String name, 
            String[] ingredients, 
            String[] directions){
        super(name, ingredients, directions);
        ReadCustoms.writeRecipe(name, this);
    }
    
    public NewRecipe(String name, 
            String ingredients, 
            String directions){
        
        super(name, ingredients, directions);
        
        ReadCustoms.writeRecipe(name, this);
    }
}
