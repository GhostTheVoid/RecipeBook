package tools;

/** required imports */
import javax.swing.ImageIcon;

/** 
* Image.java - represents a box to display an image in a container for
 a user interface and useful methods
*
* @author Marissa Rowles
* @teacher Mr. Wachs 
* @since 20-Oct-2021 
*/
public class Image {
    
    /**
     * Change the image inside a label to a new image an possibly resize the 
     * image to fit the label size
     * 
     * @param imageFile the new image file to change the label to
     * @return returns the imageFile as a usable image
     */
    public ImageIcon setImage(String imageFile) {
        ImageIcon icon;
        // set icon
        return icon = new ImageIcon(getClass().getResource(imageFile));  
    }
}
