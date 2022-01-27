/** Required package class namespace */
package recipebook;

import javax.swing.ImageIcon;
import tools.Dialogs;
import tools.Image;

 
/**
 * Globals.java - This Class acts as a site to store variables 
 * and methods that will be used across this program
 *
 * @author Marissa Rowles
 * @since 5-Nov-2021
 */
public class Globals {

    public static WriteRecipes createFood;
    
    
    private String defaultImage = "/media/foodIco.png";
    private String foodImage    = "/media/tray.png";
    public static ImageIcon defaultIcon;
    public static ImageIcon foodIcon;
    
    /**
     * Default constructor, set class properties
     */
    public Globals() {
        // Sets up the two icons
        createFood  = new WriteRecipes();
        defaultIcon = setImage(defaultImage);
        foodIcon    = setImage(foodImage);
    }
    
    /**
     * Sets an image of an object
     * 
     * @param imageFile the location of the image
     * @return an icon made from the imageFile
     */
    public static ImageIcon setImage(String imageFile){
        Image image = new Image();
        return image.setImage(imageFile);
    }
    
    /**
     * Starts the application via <code>StartMenu()</code> 
     * and welcomes user with a dialog
     */
    public static void start() {
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
    }
    
    /**
     * If there is no forms opened/opening, asks the user if they would like to
     * restart the program,
     * which will either re-instantiates 
     * <code>WriteRecipes()</code>, or ends the application with 
     * <code>System.exit(0)</code>.
     */
    public static void restartProgram(){
        boolean yesNo = Dialogs.playAgain(foodIcon);
        
        if (yesNo) createFood = new WriteRecipes();
        else System.exit(0);
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Globals: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Globals clone() {
        return this;
    }
}
