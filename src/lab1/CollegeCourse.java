/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stuart Caddell
 */

// started/written before reading the DIP article

/*
 * Advantages are (over concrete) it forces required functionality.  It also
 * forces initial validation requirements on all future subclasses of the class.
 * By doiing so though, it does build in a certain amount of rigidity into the 
 * class.
 */
public abstract class CollegeCourse implements ProcessErrorMessage {
    
    private String courseName;
    private String courseNumber;
    
    //public CollegeCourse() {      // not needed, left in for future reference
    //    this.courseName = "";
    //    this.courseNumber = "";
    //}
    
    public CollegeCourse(String courseNumber, String courseName) {
        this.setCourseNumber(courseNumber);
        this.setCourseName(courseName);
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            String errorMessage = 
                    "Error: course name cannot be null or empty string";
            displayErrorMessage(errorMessage);
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            String errorMessage = 
                    "Error: course number cannot be null or empty string";
            displayErrorMessage(errorMessage);
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public String toString() {
        String str = "Course number = " + courseNumber
                + "\nCourse name = " + courseName;
        return str;
    }
}
