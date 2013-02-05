/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Stuart Caddell
 */
public class Startup {
    
    /*
     * While I liked the interface, I did not like that each class was set up
     * as its own class.  I would redesign it to be like Lab1, with college 
     * courses as a superclass, and credit and non-credit as subclasses.
     */
    
    public static void main(String[] args) {
        
        CreditCourse introToProgramming = new 
                IntroToProgrammingCourse("105-005",
                "Intro to Programming");
        introToProgramming.setCredits(4.0);
        
        System.out.println(introToProgramming.toString() + "\n");
    }
    
}
