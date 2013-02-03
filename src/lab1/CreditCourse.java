package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class CreditCourse extends CollegeCourse {
    
    private double credits;
    private String prerequisites;
    
    public CreditCourse(String courseNumber, String courseName) {
        super(courseNumber, courseName);
        this.credits = 0.5;
        this.prerequisites = "None"; 
    }
    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            String errorMessage =
                    "Error: credits must be in the range 0.5 to 4.0";
            displayErrorMessage(errorMessage);
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            String errorMessage = 
                    "Error: prerequisites cannot be null of empty string \n"
                  + "       Pass \"None\" when no prerequisites";
            displayErrorMessage(errorMessage);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }
    
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage);
    }
    
    @Override
    public String toString() {
        String str = super.toString()
                + "\nCredits = " + credits
                + "\nPrerequisites = " + prerequisites;
        return str;
    }
    
}
