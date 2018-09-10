package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fName = null;
        String lName = null;
        System.out.println("Enter your first name");
        try
        {
            fName = scan.nextLine();
        }
        catch (Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("Enter your last name");
        try
        {
            lName = scan.nextLine();
        }
        catch (Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("Your full name is " + fName + " " + lName + ".");
    }
}
