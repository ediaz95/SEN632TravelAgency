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
public class JavaApplication1 {

    public static Scanner kbd = new Scanner(System.in);
    
    public static int menu()
    {
        int menuChoice;
        do
        { 
            System.out.print("\nPlease Choose From the Following Options:"
                    + "\n 1. Search/Purchase Ticket \n 2. Cancel Existing Ticket"
                    + "\n 3. Exit\n\n");

	    System.out.println("Select Option: ");

            menuChoice = kbd.nextInt();

            if (menuChoice < 1 || menuChoice > 3){
                System.out.println("Error!");
            }

        }while (menuChoice < 1 || menuChoice > 3);

        return menuChoice;
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
					+ "\n 5. Sydney, Australia\n\n");
					
			System.out.println("Select Option: ");		
			
			destinationChoice = kbd.nextInt();
			
			if (destinationChoice < 1 || destinationChoice > 5){
				System.out.println("Error!");
			}
		} while (destinationChoice < 1 || destinationChoice > 5);
		
		return destinationChoice;
    }
  
    public static void main(String[] args) {

        int menuChoice = 0, destinationChoice, departureChoice, id;
        int amount, num, test;
        char check; 
        
        LinkedList List = new LinkedList();
        
        Departure Dep = new Departure();
        DepartureChoice depChoice = new DepartureChoice();
        Cancel can = new Cancel();
        while (menuOption != 3)
        { 	
            menuOption=menu();
	
            switch (menuOption)
            {
                case 1:
                    destinationChoice=displayDestination();   
                    departureChoice = Dep.displayDeparture(destinationChoice);
                    depChoice.displayInfo(destinationChoice,departureChoice);
                    System.out.println("Do you wish to Purchse ticket? (y/n) ");
                    check = kbd.next().charAt(0);
                    if (check == 'Y' || check == 'y')
                    {
                        id = can.displayUserId();
                        amount = can.displayPurchase();
                        test = can.checkAmount(destinationChoice,departureChoice,amount);   
                        if (test == 1)  
                        {
                             List.add(id);
                        }
                    }
                    else if (check == 'N' || check == 'n')
                    {
                         System.out.println("\nThank you for Using The Travel Agency Automation System. Have a Nice Day!");
                         System.exit(0);
                    }
                    else
                    {
                         System.out.println("Error!");
                    }                        
                    break;
                case 2:
                    id = can.displayUserId(); 
                    System.out.println("\nUserID exist in Database: "+List.contains(id)); 
                    if (List.contains(id) == false)
                    {
                        System.out.println("\nThe UserID doesn't exist in our Database.");
                    }    
                    else
                    {
                        System.out.println("Do you wish to cancel ticket? (y/n) ");
                        check = kbd.next().charAt(0);
                        if (check == 'Y' || check == 'y')
                        {
                            List.remove(List.indexOf(id)); 
                            if (List.indexOf(id) == -1)
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
                    System.exit(0);
                    break;
            }
        }
    }
}
