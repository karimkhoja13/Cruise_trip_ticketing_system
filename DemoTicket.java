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

import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DemoTicket {
    public static void main(String[] args) {
            
            String firstName = "";
            String lastName = "";
            String ageString = "";
            int age = 0;
            String noOfPassengersString;
            int noOfPassengers = 0;
//            String confirmationString;
//            String travelNumber;
            int confirmation;
            int milesCollected;
            boolean allow=true;
            double fare=0;
            String list="";
            String[] cruiseDetails = new String[8];
            
            JOptionPane.showMessageDialog(null, "\nWelcome to Four Hoursemen Cruise Services\n"
                                                      + " Prices so low, u will smile everytime\n  "
                                                      + "you Travel with us. \n");
            JOptionPane.showMessageDialog(null, "We Provide highly inexpensive cost for cruise services \n"+
                                                  "to a variety of different destinations. ");
            Cruise[] one = new Cruise[8];
            for(int i=0; i<one.length; i++)
            {
                one[i] = new Cruise(i);
                list += (i+1) + ". " + //"Cruise ID: " + one[i].getVesselID()
                     "Cruise Detail: " + one[i].getCruiseDetail()
                    + "\nPrice: " + one[i].getPrice()
                    + "    " + "You will get these number of Miles: " + one[i].getMilesCollected() + "\n\n";
                cruiseDetails[i] = one[i].getCruiseDetail();
            }
            
            
            int reply = JOptionPane.showConfirmDialog(null, "Do you want to make a Cruise Reservation?");
            if (reply == JOptionPane.YES_OPTION)
            {
//                JOptionPane.showMessageDialog(null, "Please select the Cruise in which you want to travel: (Press OK to continue with the selection)");
//                JComboBox info = new JComboBox(cruiseDetails);
//                info.setSelectedIndex(2);
//                info.addActionListener(this);
                String selection = JOptionPane.showInputDialog(null, "Please select a cruise on which you would like to travel from the list below: \n\n"
                    + list);
                while((selection.isEmpty())||(Integer.valueOf(selection)<=0)||(Integer.valueOf(selection)>=9))
                        
                {
                     selection = JOptionPane.showInputDialog(null, "You have not selected cruise !!!\nPlease select a cruise on which"
                                                                    + " you would like to travel from the list below: \n\n"+list);
                }
                String userSelection;
                for(int a = 0; a < cruiseDetails.length; a++)
                {
                    if(Integer.valueOf(selection) == (a+1))
                    {
                        userSelection = "Cruise Name: " + one[a].getCruiseDetail() + "\nThe number of MilePoints you can collect is: " + one[a].getMilesCollected();
                        fare = one[a].getPrice();
                        JOptionPane.showConfirmDialog(null, "You have selected the Cruise shown below: \n"
                                                            + userSelection + "Please confirm by clicking YES, or click NO to select again");
                    }
                }
                try
                {
                    noOfPassengersString = JOptionPane.showInputDialog("How many people will be travelling including you?");
                    noOfPassengers = Integer.valueOf(noOfPassengersString);
                }
                catch (HeadlessException | NumberFormatException e)
                {
                    allow=false;
                    JOptionPane.showConfirmDialog(null, "Please enter numbers only", "Error", JOptionPane.CANCEL_OPTION);
                }
                while(allow==false)
                {
                    try
                    {
                        noOfPassengersString = JOptionPane.showInputDialog("How many people will be travelling including you?");
                        noOfPassengers = Integer.valueOf(noOfPassengersString);
                        allow=true;
                    }
                    catch (HeadlessException | NumberFormatException e)
                    {
                        allow=false;
                        JOptionPane.showConfirmDialog(null, "Please enter numbers only", "Error", JOptionPane.CANCEL_OPTION);
                    }
                }
//                
//                FrequentPassenger[] passengerArray = new FrequentPassenger[noOfPassengers];
//               
                double currentFare=0;
                FrequentPassenger[] frequentPassengerArray = new FrequentPassenger[noOfPassengers];
                String all = "";
                for(int b=0; b<frequentPassengerArray.length; b++)
                {
                    
                    firstName = JOptionPane.showInputDialog("Enter First Name for Passenger " + (b+1));
                    while(firstName.isEmpty())
                    {
                        firstName = JOptionPane.showInputDialog("You have not entered the First Name\nPlease Enter First Name for Passenger " + (b+1));
                    }
                    lastName = JOptionPane.showInputDialog("Enter Last Name for " + firstName);
                    while(lastName.isEmpty())
                    {
                        lastName = JOptionPane.showInputDialog("You have not entered the Last Name\nPlease Enter Last Name for " + firstName);
                    }
                    try
                    {
                        ageString = JOptionPane.showInputDialog("Enter Age for " + firstName);
                    }
                    catch(HeadlessException | NumberFormatException e)
                    {
                        allow=false;
                        JOptionPane.showConfirmDialog(null, "Please enter numbers only", "Error", JOptionPane.CANCEL_OPTION);
                    }
                    while(allow==false)
                    {
                        try
                        {
                            ageString = JOptionPane.showInputDialog("Please Enter Age for " + firstName);
                            allow=true;
                        }
                        catch(HeadlessException | NumberFormatException e)
                        {
                            allow=false;
                            JOptionPane.showConfirmDialog(null, "Please enter numbers only", "Error", JOptionPane.CANCEL_OPTION);
                        }
                    }
                    age = Integer.valueOf(ageString);
                    frequentPassengerArray[b]=new FrequentPassenger(firstName, lastName, age, fare);
                    frequentPassengerArray[b].setFare(fare);
                    currentFare+=frequentPassengerArray[b].getFare();
                    all += "Name: " + frequentPassengerArray[b].getFirstName() + " " + frequentPassengerArray[b].getLastName() 
                        + "\nAge: " + frequentPassengerArray[b].getAge() 
                        + "\nFare for " + frequentPassengerArray[b].getFirstName() + " is " + frequentPassengerArray[b].getFare() + "\n\n";
                    
                                  }
                JOptionPane.showMessageDialog(null, all);
                JOptionPane.showMessageDialog(null, currentFare);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "GOODBYE");
                System.exit(0);
            }
    }
}