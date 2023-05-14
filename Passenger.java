/*
 * **********************************************
 *    **   FANTABULOUS FOUR GROUP Members: **   *
 * **********************************************                                             
 *              KARIM KHOJA                     *
 *              THOMSON PHILIP                  *
 *              YAMUNA BAJGAI                   *
 *              DOL RAJ SIGDEL                  *
 *          **********************              *
 * **********************************************
 */
package pkg2130_f13a2_riwaz;
public class Passenger extends Person {
    
    private int noOfPersons;
    private double fare;
    
    public Passenger()
    {
        
    } 
    public Passenger(String firstName, String lastName, int ageOfPerson)//, int noOfPersons)
    {
        super(firstName, lastName, ageOfPerson);
    }
    
    public int getNoOfPersons()
    {
        return noOfPersons;
    }
    public void setNoOfPersons(int numberOfPersons)
    {
        this.noOfPersons = numberOfPersons;
    }
    
//    @Override
//    public String toString()
//    {
//        return super.toString() + "\nNumber of Passengers going for this trip is: " + noOfPersons
//                + "\nAnd the Total Fare would be: " + getTotalFare();
//    }
}
