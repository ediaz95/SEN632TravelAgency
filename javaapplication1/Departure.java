/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author APhan91
 */
public class Departure {
    public static Scanner kbd = new Scanner(System.in);
    
    public int depChoice;

    public int displayDeparture(int x)
    {
        do
        {
            if (x == 1)
            {
                    System.out.println("\nDestination: London, England");
                    System.out.println("Departure Options: ");
                    System.out.println("Date			 Time		 Price");
                    System.out.println("1. 2/2/17		9:00 am		$546.00");
                    System.out.println("2. 2/18/17		11:30 am	$532.00");
                    System.out.println("3. 3/15/17		2:00 pm		$457.00");
                    System.out.println("4. 3/28/17		8:30 am 	$634.00\n");

                    System.out.println("Select option: ");

                    depChoice = kbd.nextInt();					
            }
            else if (x == 2)
            {
                    System.out.println("\nDestination: Rome, Italy");
                    System.out.println("Departure Options: ");
                    System.out.println("Date			 Time		 Price");
                    System.out.println("1. 2/2/17		9:00 am		$546.00");
                    System.out.println("2. 2/18/17		11:30 am	$532.00");
                    System.out.println("3. 3/15/17		2:00 pm		$457.00");
                    System.out.println("4. 3/28/17		8:30 am 	$634.00\n");

                    System.out.println("Select option: ");

                    depChoice = kbd.nextInt();

                    if (depChoice < 1 || depChoice > 4){
                            System.out.println("\nError!");
                    }
            }
            else if (x == 3)
            {
                    System.out.println("\nDestination: Tokyo, Japan");
                    System.out.println("Departure Options: ");
                    System.out.println("Date			 Time		 Price");
                    System.out.println("1. 2/2/17		9:00 am		$546.00");
                    System.out.println("2. 2/18/17		11:30 am	$532.00");
                    System.out.println("3. 3/15/17		2:00 pm		$457.00");
                    System.out.println("4. 3/28/17		8:30 am 	$634.00\n");

                    System.out.println("Select option: ");

                    depChoice = kbd.nextInt();

                    if (depChoice < 1 || depChoice > 4){
                            System.out.println("\nError!");
                    }
            }
            else if (x == 4)
            {
                    System.out.println("\nDestination: Rio de Janeiro, Brazil");
                    System.out.println("Departure Options: ");
                    System.out.println("Date			 Time		 Price");
                    System.out.println("1. 2/2/17		9:00 am		$546.00");
                    System.out.println("2. 2/18/17		11:30 am	$532.00");
                    System.out.println("3. 3/15/17		2:00 pm		$457.00");
                    System.out.println("4. 3/28/17		8:30 am 	$634.00\n");

                    System.out.println("Select option: ");

                    depChoice = kbd.nextInt();

                    if (depChoice < 1 || depChoice > 4){
                            System.out.println("\nError!");
                    }
            }	
            else if (x == 5)
            {
                    System.out.println("\nDestination: Sydney, Australia");
                    System.out.println("Departure Options: ");
                    System.out.println("Date			 Time		 Price");
                    System.out.println("1. 2/2/17		9:00 am		$546.00");
                    System.out.println("2. 2/18/17		11:30 am	$532.00");
                    System.out.println("3. 3/15/17		2:00 pm		$457.00");
                    System.out.println("4. 3/28/17		8:30 am 	$634.00\n");

                    System.out.println("Select option: ");

                    depChoice = kbd.nextInt();

                    if (depChoice < 1 || depChoice > 4)
                    {
                            System.out.println("\nError!");
                    }
            }	
            else
            {
                    System.out.println("\nError!");
            }
        } while (depChoice < 1 || depChoice > 5);
        return depChoice;
    }
}


