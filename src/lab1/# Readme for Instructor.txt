Lab1 - Student Notes (Stuart Caddell)

I left the original classes in the package.  However, I built my own classes to meet what I thought was a better design, and the class objectives.  Naming an object classes after a college course is the same as naming person classes after individual people.  

A college typically will offer two types of of courses, credit courses, and non-credit courses.  (I did not include a non-credit course class in Lab1.)  All 3 of the original classes are really just types of credit courses.  Therefore, I developed a superclass, CollegeCourse, a subclass, CreditCourse, and made the 3 original classes as instantiations of the credit class.

I chose in my design to give all courses the attribute of "prerequisities".  My logic for doing so is that all courses have a prerequisitie status, even if it is "none".  Futhermore, it allows any method or class with access to ask for the course prerequisite(s) without having to know whether or not the course has any.  Under the original design, only the courses that had a prerequisite had that attribute.  

I also created an interface ProcessErrorMessage to display the validation error messages.  This can be implemented as System.out.println, JOptionPane, or any other output message format desired. 