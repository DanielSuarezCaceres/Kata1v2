/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Kata1v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996,6,3);
        
        Person myPerson = new Person("Daniel", date);
        System.out.println(myPerson.getName() + " tiene " + myPerson.getAge() + " años.");
        
    }
}
