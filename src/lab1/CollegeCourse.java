/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stuart - HP AMD 10
 */
public abstract class CollegeCourse implements ProcessErrorMessage {
    
    private String courseName;
    private String courseNumber;
    
    public CollegeCourse() {
        this.courseName = "";
        this.courseNumber = "";
    }
    
    public CollegeCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
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
}
