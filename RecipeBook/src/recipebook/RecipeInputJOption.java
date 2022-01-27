package recipebook;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.UNINITIALIZED_VALUE;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


/**
 * Through a visual dialog box, lets the user enter the data for their recipe
 * 
 * -----------
 * @author m.rowles
 * @teacher Mr. Wachs 
 * @since 14-Jan-2022
 */
public class RecipeInputJOption extends javax.swing.JDialog {
    
    /**
     * Creates new form RecipeInputJOption
     * 
     * @param parent       the parent of this Jdialog
     * @param modal         
     * @param questionType What type of question is being asked 
     *                     (name, ingredients, directions)
     * @param textAreaHeight the height that ContextTextArea will be
     */
    public RecipeInputJOption(Frame parent, boolean modal, String questionType,
                                int textAreaHeight, boolean naming) {
        super(parent, modal);
        this.questionType   = questionType;
        this.textAreaHeight = textAreaHeight;
        this.naming         = naming;
        initComponents();
        setSize(new Dimension(396, 300));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        contentScrollPane = new javax.swing.JScrollPane();
        contentTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        contextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recipe Dialog");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(javax.swing.UIManager.getDefaults().getColor("window"));
        setMaximumSize(new java.awt.Dimension(396, 396));
        setMinimumSize(new java.awt.Dimension(396, 0));
        setModal(true);
        setName("recipeDialog"); // NOI18N
        setPreferredSize(new java.awt.Dimension(396, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(396, 300));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        bgPanel.setPreferredSize(new java.awt.Dimension(396, 300));
        bgPanel.setLayout(null);

        contentScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        contentTextArea.setColumns(20);
        contentTextArea.setLineWrap(true);
        contentTextArea.setRows(5);
        contentTextArea.setWrapStyleWord(true);
        contentTextArea.setMinimumSize(new java.awt.Dimension(112, 20));
        contentScrollPane.setViewportView(contentTextArea);

        bgPanel.add(contentScrollPane);
        contentScrollPane.setBounds(91, 51, 268, 140);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        bgPanel.add(okButton);
        okButton.setBounds(114, 215, 94, 22);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        bgPanel.add(cancelButton);
        cancelButton.setBounds(242, 215, 94, 22);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/foodIco.png"))); // NOI18N
        bgPanel.add(iconLabel);
        iconLabel.setBounds(23, 14, 50, 50);

        contextLabel.setText(questionType);
        contextLabel.setMaximumSize(new java.awt.Dimension(268, 48));
        contextLabel.setMinimumSize(new java.awt.Dimension(80, 25));
        contextLabel.setPreferredSize(new java.awt.Dimension(268, 25));
        bgPanel.add(contextLabel);
        contextLabel.setBounds(91, 14, 268, 25);

        getContentPane().add(bgPanel);
        bgPanel.setBounds(-1, -1, 396, 300);
        initializeContainer();

        pack();
    }// </editor-fold>                        

    /**
     * Ask User if they want to return to the choice menu
     * If yes, open LocationMethods.makeWhat();.
     * If no, return to JDialog
     * 
     * @param evt 
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        input = "Cancel";
        this.dispose();
    }                                            

    /**
     * Checks the answer and sets the value in the TextArea to be the input
     * 
     * @param evt 
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        setInput();
    }                                        

    

    // Variables declaration - do not modify                     
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane contentScrollPane;
    private javax.swing.JTextArea contentTextArea;
    private javax.swing.JLabel contextLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton okButton;
    // End of variables declaration                   
    
    // Global variables (properties of the class) below........................
    final private String HTML_TAG     = "<html><body style='width: %1spx'>%1s";
    final private String ERROR_NULL   = "<p style=\"color:#8B0000;\">"
                    + "ERROR: The field is empty, "
                    + "please add some text.</p>";
    final private String ERROR_LENGTH = "<p style=\"color:#8B0000;\">"
                    + "ERROR: The field is too long, please create a<br>"
                    + "title less than 40 characters.</p><p>";
    
    final private int DEFAULT_WIDTH = 268;
    
    private String questionType;
    private int textAreaHeight;
    private Dimension dialogDimension;
    private boolean naming;
    
    public String input;
    
    //JTextArea displayArea;
    
    // Custom Methods (that I wrote) below.....................................
    
    /**
     * Sets the properties of this form 
     * that was unable to be added to initComponents()
     */
    private void initializeContainer() {
        dialogDimension = this.getSize();
        
        // System.out.println("Dimension: " + dialogDimension);
        // System.out.println("Content y: \t"    + getContentY());
        // System.out.println("Content Height: " + getContentHeight());
        // System.out.println("OK y: \t\t"       + getButtonY());
        // System.out.println("OK Height: \t"  + okButton.getHeight());
        
        setLabelTxt(questionType);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    /**
     * Checks the text in contentTextArea to see if it is null
     * Matches the input property to the text in contentTextArea.
     */
    private void setInput (){
        String text = contentTextArea.getText();

        if (text == null || text.equals("")) {
            setLabelTxt(ERROR_NULL + questionType 
                                + "</p></body></html>");
        }
        else if (naming && text.length() > 40){
            setLabelTxt(ERROR_LENGTH + questionType 
                                    + "</p></body></html>");
        }
        else {
            System.out.println("Dispose Recipe input");
            input = text;
            this.dispose();
        }
    }
    
    /**
     * Accessor method (or "getter") that gives you the current input
     * 
     * @return the input from the TextArea, as a global variable
     */
    public String getInput (){
        return input;
    }
    
    /**
     * Accessor method (or "getter") that gives you the current 
     * size of contentScrollPane
     * 
     * @return the height of the ScrollPane
     */
    public int getContentHeight(){
        return contentScrollPane.getHeight();
    }
    
    /**
     * Accessor method (or "getter") that gives you the current 
     * y index of contentScrollPane
     * 
     * @return the y index of the ScrollPane
     */
    public int getContentY(){
        return contentScrollPane.getLocation().y;
    }
    
    /**
     * Accessor method (or "getter") that gives you the current 
     * height of okButton (which matches with cancelButton)
     * 
     * @return the height of the okButton
     */
    public int getButtonHeight(){
        return okButton.getHeight();
    }
    
    /**
     * Accessor method (or "getter") that gives you the current 
     * y index of okButton (which matches with cancelButton)
     * 
     * @return the y index of the okButton
     */
    public int getButtonY(){
        return okButton.getLocation().y;
    }
    
    /**
     * Accessor method (or "getter") that gives you the text inside 
     * of contextLabel
     * 
     * @return the text in contextLabel
     */
    public String getLabelTxt (){
        return contextLabel.getText();
    }
    
    /**
     * Accessor method (or "getter") that gives you the length 
     * of contextLabel
     * 
     * @return the length of the text in contextLabel
     */
    public int getLabelTxtLegnth (){
        return contextLabel.getText().length();
    }
    
    /**
     * Accessor method (or "getter") that gives you the height 
     * of contextLabel
     * 
     * @return the height of contextLabel
     */
    public int getLabelHeight (){
        return contextLabel.getHeight();
    }
    
    private void setLabelTxt(String text){
        System.out.println("setLabelText");
        contextLabel.setText(String.format(HTML_TAG, 200, text));
        System.out.println(text.length());
        
        int lblHeight = (int) text.length() / 40;
        //For every 40 Characters, the panel will grow another 20 px, max of 80?
        
        //25 + (lblHeight * 25)
        setLabelHeight(20 + (lblHeight * 15));
    }
    
    /**
     * To fit the text of the label, we will reset its height 
     * so that it fits the text
     */
    private void setLabelHeight (int height){
        System.out.println("setLabelHeight");
        contextLabel.setSize(DEFAULT_WIDTH, height); //Fit in Error
        System.out.println(getLabelHeight());
        
        //Because we have reset the height of the label, 
        //we need to adjust the textArea location to fit everything
        setTextAreaY();
    }
    
    /**
     * Based on the Y location and height of contextLabel, through 
     * simple addition we find the new location for contentScrollPane
     */
    private void setTextAreaY(){
        System.out.println("setTextAreaY");
        int labelH = getLabelHeight();
        int labelY = 14;
        
        //textArea is 12 pixels away from the bottom of contextLabel.
        int newLocation = labelH + labelY + 12;
        
        contentScrollPane.setLocation(contentScrollPane.getLocation().x, 
                                      newLocation);
        
        //Because we have reset the location of the textArea, 
        //we need to adjust the buttons location to fit everything
        setButtonLocation();
    }
    
    /**
     * Based on the Y location and height of contentScrollPane, through 
     * simple addition we find the new location for a button
     */
    private void setButtonLocation (){
        System.out.println("setButtonLocation");
        int contentY = getContentY();
        int contentH = getContentHeight();
        
        //Buttons are 12 pixes away from the bottom of contentScrollPane.
        int newLocation = contentH + contentY + 12;
        
        okButton.setLocation(okButton.getLocation().x, newLocation);
        cancelButton.setLocation(cancelButton.getLocation().x, newLocation);
        
        //Because we have reset the location of the buttons, 
        //we need to adjust the dialog height to fit everything
        setDialogHeight();
    }
    
    /**
     * Based on the Y location and height of okButton, through 
     * simple addition we find the new size for this JDialog
     */
    private void setDialogHeight (){
        System.out.println("setDialogHeight");
        int buttonY = getButtonY();
        int buttonH = getButtonHeight();
        
        // Bottom of JDialog is 63 pixels away from the bottom of okButton
        int newSize = buttonY + buttonH + 63;
        
        this.setSize(396, newSize); //323
    }
}
