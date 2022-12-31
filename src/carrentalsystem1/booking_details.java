/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem1;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class booking_details implements booking {
  Scanner sc = new Scanner(System.in);
  int x;
    @Override
    public void details() {
        System.out.println("Do you want the car to be delivered or pickup(Select 1 for delievered or Select 2 for pickup): ");
        x=sc.nextInt();
        if (x == 1){
        System.out.println("The Car will be sent to your house by a person in charge");
        System.out.println("What time will be the optimal time to send the vehicle(24 hour system) :");
        sc.nextLine();        
        String time = sc.nextLine();
        }
       else {
        System.out.println("You can pickup the car at the location we will be sending to you through your email");
        System.out.println("When can expect the time of your arrival (24 hour system) :");
        sc.nextLine();
        String time = sc.nextLine();    
         }
    }   
}
