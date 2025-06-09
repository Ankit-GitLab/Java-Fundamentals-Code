package ControlStatement_Math_String.Problem;

import java.util.*;

public class ExitOnExit {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to repeatedly take user input
        while(true){
            // Prompting the user to enter a command
            System.out.print("Enter your command : ");

            // Reading the command from the user
            String command = sc.next();

            // If the user types 'exit', break the loop
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }

        // Message after exiting the loop
        System.out.println("You have successfully exited");
    }
}
