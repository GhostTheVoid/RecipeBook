/** Required package class namespace */
package recipebook;

import collections.LinkedList;
import java.awt.Dialog;
import java.io.File;
import recipebook.Recipe;
import tools.FileHandler;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import tools.Dialogs;

 
/**
 * ReadCustoms.java - Reads all of the files it finds inside of the 
 * customrecipes package
 *
 * @author Marissa Rowles
 * @since 22-Nov-2021
 */
public class ReadCustoms {

    // File Name ////////
    private static final String FILE_FIRST_NAME = "C:\\Users\\m.rowles\\Desktop\\Work Files\\0 Final Project\\RecipeBook\\src\\customrecipes\\";
    private static final String FILE_NUM_NAME   = "C:\\Users\\m.rowles\\Desktop\\Work Files\\0 Final Project\\RecipeBook\\src\\media\\recipeNum.txt";
    
    private static int recipeNum;
    
    // Other ////////
    static LinkedList<String> recipeString;
    
    /**
     * Default constructor, set class properties
     */
    public ReadCustoms(){
        recipeNum    = 0;
        recipeString = new LinkedList<>();
        System.out.println("++READ CUSTOMS++");
    }
    
    /**
     * Counts how many files there are in "customrecipes"
     * 
     * @return the amount of files, accounting for ReadCustoms.java 
     * and taking away one
     */
    public static int getPackCount (){
        int readFiles = new File("C:\\Users\\m.rowles\\Desktop\\Work Files\\0 Final Project\\RecipeBook\\src\\customrecipes").list().length;
        System.out.println("Counting files...........");
        return readFiles;
    }
    
    /**
     * Gets the names of the files in customrecipes, minus this java file. 
     * 
     * @return a String array which contains all the file names, minus this file.
     */
    public static String[] getPackNames() {
        String[] readFiles = new File("C:\\Users\\m.rowles\\Desktop\\Work Files\\0 Final Project\\RecipeBook\\src\\customrecipes").list();
        System.out.println("Reading file names.......\n");
        //System.out.println(getPackCount());
        for (int i = 0; i < readFiles.length; i++) {
            readFiles[i] = FILE_FIRST_NAME + readFiles[i];
            //System.out.println(filenames[i]);
        }
        return readFiles;
    }
    
    /**
     * Writes a file which contains Meals
     * 
     * @param fileName Gives the file a name
     * @param recipe The recipeString of which is being written
     */
    public static void writeRecipe (String fileName, Recipe recipe){
        System.out.println("Writing file.............");
        // Write File ////////
        String fullFileName  = FILE_FIRST_NAME 
                + "cr_" + recipeNum + " (" + getDate() + ").txt";
        
        FileHandler fileHandler = new FileHandler(fullFileName);
        
        // Get all of the Strings making up the recipeString
        String name        = recipe.getName();
        String ingredients = recipe.getIngredientsSingle();
        String directions  = recipe.getDirectionsSingle();
        
        // Add the 'name', 'ingredients' and 'directions' into a linked list
        recipeString.add(name);
        recipeString.add(ingredients);
        recipeString.add(directions);
        
        fileHandler.write(recipeString);
    }
    
    /**
     * Reads a file which contains the recipe. It then separates it into
     * the parameters for the class Recipe by reading the lines.
     * 
     * @param fileName the given name of the file
     * @return 
     */
    public static String[] readRecipe (String fileName){
        LinkedList<String> recipeStr = new LinkedList<>();
        recipeStr.clear();
        
        FileHandler fileHandler = new FileHandler(fileName);
        recipeStr = fileHandler.read();

        //Read Name
        String name = recipeStr.get(0);
        //Read Ingredients
        String ingredients = recipeStr.get(1);
        //Read Directions
        String directions = recipeStr.get(2);
        
        System.out.println("Reading file: " + "\"" + name + "\"" );
        //System.out.println("directions = " + directions);
        
        if (name == null || ingredients == null || directions == null) {
            System.out.println("++++++ NULL IN ARRAY ++++++");
            fileHandler.deleteFile(fileName, "File has Null Content.");
            //Reread all of the Recipes if this happens
            return null;
        }

        String[] recipe = {name, ingredients, directions};
        return recipe;
    }
    
    /**
     * Reads "recipeNum.txt" which contains the number of Custom recipes made
     * 
     * @return returns the number of Custom recipes made
     */
    private static int readNum (){
        LinkedList<String> string = new LinkedList<>();
        FileHandler fileHandler = new FileHandler(FILE_NUM_NAME);
        string = fileHandler.read();
        
        String getNum = string.get(0);
        recipeNum = Integer.parseInt(getNum);
        System.out.println(recipeNum);
        
        //Update the number for the next time a custom recipe is made
        updateNum(); 
        
        return recipeNum;   
    }

    /**
     * Update the number inside of "recipeNum.txt" to increase by one.
     */
    private static void updateNum (){
        recipeNum++;
        FileHandler fileHandler = new FileHandler(FILE_NUM_NAME);
        LinkedList<String> list = new LinkedList<>();
        
        String num = Integer.toString(recipeNum);
        System.out.println(num);
        list.add(num);
        
        fileHandler.write(list);
    }
    
    /**
     * Gets the date from the system, and formats it into a "dd/MM/yyyy" format
     * @return the date in the form of a String
     */
    private static String getDate() {
        LocalDate myObj = LocalDate.now(); // Create a date object
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        String date = myFormatObj.format(myObj);
        return date;
    }

    public static void restartReading() {
        
    }
}
