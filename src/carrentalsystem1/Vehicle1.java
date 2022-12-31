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
public class Vehicle1 {
    
    Scanner sc =new Scanner(System.in);
    CarRentalSystem1 main = new CarRentalSystem1(); 
    Calculate1 callcal = new Calculate1();
    int k = 1;


    
    public void vehicle_book(){
    String date[] = new String[10];
    int fam_type[] = new int[10]; 
    int mpv_type[] = new int[10];
    int off_type[] = new int[10];
    int type[] = new int[10];
    int time[] = new int[10];
    double price[] = new double[10];
    int m = 0;
    int queue;
    System.out.println("Enter the  number of Reservation you like to make:");
    queue = sc.nextInt();
    sc.nextLine(); 
     //start array
    for (int i=0;i<queue;i++){
    do{     
    System.out.println("Enter the starting date for renting the vehicle(dd/mm/yyyy): ");
    date[i] = sc.nextLine();
    System.out.println("How long do you plan on renting the car?(day): ");
    time[i] = sc.nextInt();
    System.out.println("Select Type of Vehicle:");
    System.out.println("Vehicle Types: Family car = 1, MPV = 2, OFF-ROAD vehicle = 3");
    type[i] = sc.nextInt(); 
    
    if (type[i] == 1){
          System.out.println("Select which car to rent:");
          System.out.println("=========================");
          System.out.println("1 Choice");
          System.out.println("Car Name: Toyota Prius");
          System.out.println("Number of seats: 5");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 20");
          System.out.println("=========================");         
          System.out.println("2 Choice");
          System.out.println("Car Name: Mazda CX-9");
          System.out.println("Number of seats: 7");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 30");
          System.out.println("========================="); 
          System.out.println("Select choice (1 or 2): ");
          fam_type[i] = sc.nextInt();

          
    }
    else if (type[i] == 2){
          System.out.println("Select which MPV to rent:");
          System.out.println("=========================");
          System.out.println("1 Choice");
          System.out.println("Car Name: Honda Odyssey");
          System.out.println("Number of seats: 8");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 50");
          System.out.println("=========================");         
          System.out.println("2 Choice");
          System.out.println("Car Name: Proton Exora");
          System.out.println("Number of seats: 7");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 40");
          System.out.println("========================="); 
          System.out.println("Select choice (1 or 2): ");    
          mpv_type[i] = sc.nextInt();
    }
    else
    {  
          System.out.println("Select which OFF-ROADSIDE to rent:");
          System.out.println("=========================");
          System.out.println("1 Choice");
          System.out.println("Car Name: Toyota Hilux");
          System.out.println("Number of seats: 5");
          System.out.println("Gear: Manual");
          System.out.println("Extra Feature : Can keep a lot of stuff");
          System.out.println("Price of rent per day: RM 100");
          System.out.println("========================="); 
          System.out.println("2 Choice");
          System.out.println("Car Name: Mitsubishi Pajero");
          System.out.println("Number of seats: 6");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 120");
          System.out.println("=========================");           
          System.out.println("Select choice (1 or 2): ");            
          off_type[i] = sc.nextInt();            
    }
     
    

    System.out.println("Do you want to change the selected vehicle?(YES = 1, NO = 2)");
    k = sc.nextInt();
    sc.nextLine();  
    


    }while(k == 1);



    } 

    
    for (int j=0;j<queue;j++){
    main.display_vehicle(type[j],fam_type[j],mpv_type[j],off_type[j],date[j],time[j]);    
    callcal.calculation(time[j],type[j],fam_type[j],mpv_type[j],off_type[j]);    
    }
    }





}
