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
 * @author Eber
 * @author Fernando
 * @author Siddhi
 */
public class Cancel 
{
    // creates scanner method to obtain input from the command window - display
    public static Scanner kbd = new Scanner(System.in);
    
    public int userID;
    public int amount;
    public int num;
    
    public int displayUserId()
    {
        System.out.println("Please enter a number for a User ID: ");
        
        userID = kbd.nextInt(); // retrieve and stores user's input 
        
        return userID; // returns int value of variable userID when method is called
    }
    
    public int displayPurchase()
    {
        System.out.println("Please enter an amount: ");
        
        amount = kbd.nextInt(); // retrieve and stores user's input 
        
        return amount; // returns int value of variable userID when method is called
    }

    public int checkAmount(int x, int y, int z) // retrieve and store passed values from another class
    {
        if (x == 1)
        {
            if (y == 1)
            {
                if (z >= 546)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else if (y == 2)
            {
                if (z >= 532)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 3)
            {
                if (z >= 457)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 4)
            {
                if (z >= 634)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else
            {
                System.out.println("\nError!");
            }
        }
        else if (x == 2)
        {
            if (y == 1)
            {
                if (z >= 546)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else if (y == 2)
            {
                if (z >= 532)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 3)
            {
                if (z >= 457)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 4)
            {
                if (z >= 634)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else
            {
                System.out.println("\nError!");
            }
        }
        else if (x == 3)
        {
            if (y == 1)
            {
                if (z >= 546)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else if (y == 2)
            {
                if (z >= 532)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 3)
            {
                if (z >= 457)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 4)
            {
                if (z >= 634)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else
            {
                System.out.println("\nError!");
            }
        }
        else if (x == 4)
        {
            if (y == 1)
            {
                if (z >= 546)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else if (y == 2)
            {
                if (z >= 532)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 3)
            {
                if (z >= 457)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 4)
            {
                if (z >= 634)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else
            {
                System.out.println("\nError!");
            }
        }
        else if (x == 5)
        {
            if (y == 1)
            {
                if (z >= 546)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else if (y == 2)
            {
                if (z >= 532)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 3)
            {
                if (z >= 457)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else  if (y == 4)
            {
                if (z >= 634)
                {
                    System.out.println("\nThank you for your Purchase!");
                    num = 1;
                }
                else
                {
                    System.out.println("\nError! You do not have sufficient amount!");
                }
            }
            else
            {
                System.out.println("\nError!");
            }
        }
        else
        {
            System.out.println("\nError!");
        }
        return num; // return integer value when method is called
    }
}



