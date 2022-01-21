/** Required package class namespace */
package tools;

 
/**
 * Text.java - description
 *
 * -----------------------
 * @author Marissa Rowles
 * @since 21-Jan-2022
 */
public class Text {

    /**
     * Default constructor, set class properties
     */
    public Text() {
        
    }
    
    // put the marble in the bag
    public static String insert(String text, String insert, int index) {
        String textBegin = text.substring(0,index);
        String textEnd = text.substring(index);
        return textBegin + insert + textEnd;
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Text: " + super.toString();
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
    public Text clone() {
        return this;
    }
}
