/** Required package class namespace */
package tools;

import java.awt.Graphics2D;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.text.Document;
 
/**
 * Print.java - description
 *
 * -----------------------
 * @author Marissa Rowles
 * @since 17-Dec-2021
 */
public class Print {

    /**
     * Default constructor, set class properties
     */
    public Print(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
    
    /**
     * Default constructor, set class properties
     */
    public Print() {
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Print: " + super.toString();
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
    public Print clone() {
        return this;
    }
}
