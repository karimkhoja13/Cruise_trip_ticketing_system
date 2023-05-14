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

public class FrequentPassenger extends Passenger {
    private String travelNumber;
    public String[] travelnumber;
    private int milesCollected;
    private double fare;
    String[] frequentTravelNumber = {"10","11", "12","13","14","15"};
    
    public FrequentPassenger()
    {
        
    }
    public FrequentPassenger(String firstName, String lastName, int ageOfPerson,double fare) //int noOfPersons, double fare, String travelNumber, int milesCollected)
    {
        super(firstName, lastName, ageOfPerson); // noOfPersons, fare);
//        this.travelNumber = travelNumber;
//        this.milesCollected = milesCollected;
        this.fare = fare;
    }
    
    public void setTravelNumber(String travelNumber)
    {
        this.travelNumber = travelNumber;
    }
    
    public int getMilesCollected()
    {
        return milesCollected;
    }
    public void setMilesCollected(int milesCollected)
    {
        this.milesCollected = milesCollected;
    }
    
//    public String getTravelNumber()
//    {
//        return travelNumber;
//    }
    
//    public void setTravelNumber()
//    {   
//        this.travelNumber= Integer.toString((int)Math.random() * 100);
//    }
    
    public boolean confirmTravelNumber(String i) 
    {
        boolean approval = true;
        for(int j=0; j<frequentTravelNumber.length; j++)
        {
            if(frequentTravelNumber[j].equals(i))
            {
                approval = true;
                travelNumber = frequentTravelNumber[j];
            }
            else
            {
                approval = false;
            }
        }
        return approval;
    }
    
    public double getFare()
    {
        
            return fare;
    }
    public void setFare(double fare)
    {
        int age = getAge();
        if (age < 5)
           this.fare =fare* 25/100;
        else if (age >= 5 && age < 10)
            this.fare =fare* 75/100;
        else
            this.fare=fare;
    }
    
    
    @Override
    public String toString()
    {
        return super.toString() + "\nTravel Number is: " + travelNumber + "\nAnd Miles Collected will be: " + milesCollected;
    }
}
