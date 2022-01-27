/** Required package class namespace */
package tools;

 
/**
 * HTMLFormatting.java - A class simply full of quick HTML styles for use 
 *
 * -----------------------
 * @author Marissa Rowles
 * @since 25-Jan-2022
 */
public class HTMLFormatting {
    
    private static final String MARGIN  = "margin-top: 2px; margin-bottom: 2px;";
    private static final String STYLE   = "style=\"";
    
    public static String h1Style = STYLE + MARGIN;
    public static String h2Style = STYLE + MARGIN + " color:#2e2e2e;";
    public static String pStyle  = STYLE + "margin-top: 3px;";
}