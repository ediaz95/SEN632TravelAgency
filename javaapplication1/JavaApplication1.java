/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.LinkedList;
import java.util.*;
/**
 *
 * @author APhan91
 * @author Eber
 * @author Fernando
 * @author Siddhi
 */
public class JavaApplication1 { //class declaration
     // creates scanner method to obtain input from the command window - display
    public static Scanner kbd = new Scanner(System.in);
    
    public static int menu() // public static method declared
    {
        int menuChoice; 
        do
        { 
            System.out.print("\nPlease Choose From the Following Options:"
                    + "\n 1. Search/Purchase Ticket \n 2. Cancel Existing Ticket"
                    + "\n 3. Exit\n\n");  

	    System.out.println("Select Option: "); // asks user for input

            menuChoice = kbd.nextInt(); // gets user's input and store into integer variable menuChoice

            if (menuChoice < 1 || menuChoice > 3){
                System.out.println("Error!"); // message displayed to user 
            }

        }while (menuChoice < 1 || menuChoice > 3);

        return menuChoice; //returns value of menuChoice when called
    }
    
    public static int displayDestination()
    {
		int destinationChoice;
		do
		{
			System.out.printf("\nDestination Options:");
			System.out.print("\nPlease Choose From the Following Options:"
					+ "\n 1. London, England  \n 2. Rome, Italy"
					+ "\n 3. Tokyo, Japan \n 4. Rio de Janeiro, Brazil"
					+ "\n 5. Sydney, Australia\n\n"); //Users have options of different cities on can travel to
					
			System.out.println("Select Option: ");	
			
			destinationChoice = kbd.nextInt(); // get user's input and store in integer value destinationChoice	
			
			if (destinationChoice < 1 || destinationChoice > 5){
				System.out.println("Error!"); // displays error message
			}
		} while (destinationChoice < 1 || destinationChoice > 5);
		
		return destinationChoice; //returns value of menuChoice when called
    }
  
    public static void main(String[] args) {

        int menuChoice = 0, destinationChoice, departureChoice, id;
        int amount, num, test;
        char check; 
        
        LinkedList List = new LinkedList(); // declaring a class 
        Departure Dep = new Departure(); // declaring a class
        DepartureChoice depChoice = new DepartureChoice(); // declaring a class
        Cancel can = new Cancel(); // declaring a class
	    
        while (menuOption != 3)
        { 	
            menuOption=menu();
	
            switch (menuOption)
            {
                case 1:
                    destinationChoice=displayDestination();   
                    departureChoice = Dep.displayDeparture(destinationChoice);
                    depChoice.displayInfo(destinationChoice,departureChoice);
                    System.out.println("Do you wish to Purchse ticket? (y/n) "); // user asked if they want a ticket
                    check = kbd.next().charAt(0); // get user's input and store the character into a char variable check
                    if (check == 'Y' || check == 'y') // select yes
                    {
                        id = can.displayUserId(); // call, retrieve, and store the value from method displayUserId in class Cancel
                        amount = can.displayPurchase(); // call, retrieve, and store the value from method displayUserId in class Cancel
                        test = can.checkAmount(destinationChoice,departureChoice,amount); // call, pass values to method checkAmount; then retrieve and store value into integer variable test   
                        if (test == 1)  
                        {
                             List.add(id); // add value of integer id to linked list
                        }
                    }
                    else if (check == 'N' || check == 'n') // select no
                    {
                         System.out.println("\nThank you for Using The Travel Agency Automation System. Have a Nice Day!");
                         System.exit(0); // exits program after message displayed
                    }
                    else
                    {
                         System.out.println("Error!"); // display message to user
                    }                        
                    break;
                case 2:
                    id = can.displayUserId(); // call, retrieve, and store the value from method displayUserId in class Cancel
                    System.out.println("\nUserID exist in Database: "+List.contains(id)); // checks if variable id is in linked list then print message and boolean value true/false
                    if (List.contains(id) == false)
                    {
                        System.out.println("\nThe UserID doesn't exist in our Database.");
                    }    
                    else
                    {
                        System.out.println("Do you wish to cancel ticket? (y/n) "); // user asked if they want to cancel
                        check = kbd.next().charAt(0); // get user's input and store the character into a char variable check
                        if (check == 'Y' || check == 'y')
                        {
                            List.remove(List.indexOf(id)); // locates and return position of the id value in the linked list; then removes that value/position from linked list
                            if (List.indexOf(id) == -1) // check if the id value exist in the linked list; if the return is -1 then does not exist
                            {
                               System.out.println("\nWe have cancelled your ticket. You will receive a full refund.");
                            } 
                        }
                        else if (check == 'N' || check == 'n')
                        {
                            System.out.println("\nWe will not cancel your ticket.");
                        }
                        else
                        {
                            System.out.println("Error!");
                        }
                    }
                    System.out.println("\nThank you for Using The Travel Agency Automation System. Have a Nice Day!");
                    break;
                case 3:
                    System.out.print("\nThank For Using The Travel Agency Automation System. Have a Nice Day. Good-Bye!");
                    System.exit(0); // exits program after message displayed
                    break;
            }
        }
    }
}
