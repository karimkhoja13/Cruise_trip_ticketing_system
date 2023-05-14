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
public class Cruise {
    
    private final String vesselID;
    private final String cruiseDetail;
    private final int price;
    private final int milesCollected;
    private String dateString;
    
    public Cruise(int i)
    {
            this.vesselID = cruise[i][0];
            this.cruiseDetail = cruise[i][1];
            this.price = Integer.valueOf(cruise[i][2]);
            this.milesCollected = Integer.valueOf(cruise[i][3]);
    }
    
    public Cruise(String vesselID, String cruiseDetail, int price, int milesCollected)
    {
        this.vesselID = vesselID;
        this.cruiseDetail = cruiseDetail;
        this.price = price;
        this.milesCollected = milesCollected;
    }
    
    public String getVesselID()
    {
        return vesselID;
    }
    public String getCruiseDetail()
    {
        return cruiseDetail;
    }
    public int getPrice()
    {
        return price;
    }
    public int getMilesCollected()
    {
        return milesCollected;
    }
    
    String[][] cruise =  {{"HP100", "Hawaian Cruise: From Honduras To Hawaii", "150", "150"},
                          {"HP101", "Autralian Cruise: From Honduras To Australia", "250", "250"},
                          {"HP102", "Greenland Cruise: From Honduras To Greenland", "350", "350"},
                          {"HP103", "Antartica Cruise: From Honduras To Antarctica", "450", "450"},
                          {"CA100", "Canada-Hawaian Cruise: From Canada To Hawaii", "100", "100"},
                          {"CA101", "Canada-Australian Cruise: From Canada To Australia", "200", "200"},
                          {"CA102", "Canada-Greenland Cruise: From Canada To Greenland", "300", "300"},
                          {"CA103", "Canada-Antarctica Cruise: From Canada To Antarctica", "400", "400"}
                         };

    String[][] dates = {{"November 26, 2013","December 10, 2013"},
                        {"December 11, 2013","December 25, 2013"},
                        {"December 26, 2013","January 05, 2013"}
                       };
    
    
    public String getDates() 
    {
        for (String[] date : dates) {
            for (String date1 : date) {
                dateString += date1;
            }
        }
        return dateString;
    }
}