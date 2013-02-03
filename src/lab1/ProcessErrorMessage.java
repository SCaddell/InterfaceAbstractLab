package lab1;

/**
 *
 * Stuart Caddelll
 */
public interface ProcessErrorMessage {
    
    /**
     * interface to display error message text
     * Upon implementation, developer can decide if using System.out, or 
     * JOptionPane
     * @param displayText 
     */
    public void displayErrorMessage(String displayText);
      
}
