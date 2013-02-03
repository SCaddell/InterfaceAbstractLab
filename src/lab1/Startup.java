/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class Startup {
    
    public static void main(String[] args) {
        
        CreditCourse introToProgramming = new CreditCourse("105-005",
                "Intro to Programming");
        introToProgramming.setCredits(4.0);
        introToProgramming.setPrerequisites("None");
        
        CreditCourse introToJava = new CreditCourse("105-010",
                "Intro to Java Programming");
        introToJava.setCredits(4.0);
        introToJava.setPrerequisites("105-005");
        
        CreditCourse advancedJava = new CreditCourse("105-015",
                "Advanced Java Programming");
        advancedJava.setCredits(4.0);
        advancedJava.setPrerequisites("105-010");
        
        System.out.println(introToProgramming.toString() + "\n");
        System.out.println(introToJava.toString() + "\n");
        System.out.println(advancedJava.toString() + "\n");
    }
    
}
