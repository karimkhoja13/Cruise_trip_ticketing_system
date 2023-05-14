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
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person()
    {
        firstName = "Guest";
    }
    public Person(String firstName, String lastName, int ageOfPerson)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = ageOfPerson;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String fName)
    {
        this.firstName = fName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lName)
    {
        this.lastName = lName;
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int ageOfPerson)
    {
        this.age = ageOfPerson;
    }
    
    public int calculateFareForAll(int noOfPassengers, int fareForOne)
    {
        return fareForOne * noOfPassengers;
    }
    
    @Override
    public String toString()
    {
        return "First Name: " + firstName + "\nLast Name: ";
    }
}
