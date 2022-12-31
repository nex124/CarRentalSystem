/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem1;


import java.util.Scanner;


public class CarRentalSystem1 {
     
   
    double new_price=0;
    int age1;


    public static void main(String[] args) {
        
      Insurance2 ins = new Insurance2(); 
      Insurance3 dms = new Insurance3();
      booking_details x = new booking_details();
      Scanner sc = new Scanner(System.in); 
      identity obj;
      obj = new identity3();
      obj.cust_name();
      obj.cust_age();
      obj.cust_number();
      obj.cust_email();
      obj.cust_add();
      obj.display();
      Vehicle1 callVehicle = new Vehicle1();
      Calculate1 callCalculate = new Calculate1();
      Insurance callInsurance = new Insurance();
      

      callVehicle.vehicle_book(); 
      x.details();
      System.out.println("Do you want to include insurance during rent period(YES = 1, NO = 2):");
      int insurance = sc.nextInt();
      int k=1;
      if (insurance == 1){
         do{          
         System.out.println("====================================");          
         System.out.println("1.Insurance Type A");
         System.out.println("2.Insurance Type B");
         System.out.println("====================================");    

         System.out.println("Select the type of insurance=");
         int type1= sc.nextInt();
         if (type1 == 1){
         Insurance2.detail1();
         Insurance2.detail2();
         Insurance2.type_a();
         Insurance2.cost1();
         System.out.println("Do you want to reselect insurance(yes=1 and no=2):");
         k = sc.nextInt();
         System.out.println("====================================");         
         }
         else {
         Insurance3.detail1();
         Insurance3.detail2();
         Insurance3.type_b();
         Insurance3.cost2();
         System.out.println("Do you want to reselect insurance(yes=1 and no=2):");
         k = sc.nextInt();
         System.out.println("====================================");         
         }
         }while(k == 1);
         System.out.println("====================================");
         System.out.println("THANK YOU FOR USING OUR RENTAL CAR SYSTEM");    
         System.out.println("===================================="); 
      }
      else {
         System.out.println("====================================");
         System.out.println("THANK YOU FOR USING OUR RENTAL CAR SYSTEM");    
         System.out.println("====================================");    
      }
     
 
    }

    

        
    /**
     *
     * @param type
     * @param age
     * @param gen
     * @param fam_type
     * @param number
     * @param mpv_type
     * @param off_type
     * @param date
     * @param email
     * @param time
     */
    public  void display_vehicle(int type,int fam_type,int mpv_type,int off_type,String date,int time){
        
    

        System.out.println("------------------------------------");        
        System.out.println("Car Rent Information"); 
        System.out.println("------------------------------------"); 
        
          if (type == 1 && fam_type == 1){
          System.out.println("Car Name: Toyota Prius");
          System.out.println("Number of seats: 5");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 20");
          System.out.println("Start of the Rent Date: "+date);
          System.out.println("Number of Days Renting: "+time);            
       }
          else if (type == 1 && fam_type == 2){
          System.out.println("Car Name: Mazda CX-9");
          System.out.println("Number of seats: 7");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 30");
          System.out.println("Start of the Rent Date: "+date);
          System.out.println("Number of Days Renting: "+time);            
       }
          else if (type == 2 && mpv_type == 1){
          System.out.println("Car Name: Honda Odyssey");
          System.out.println("Number of seats: 8");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 50");  
          System.out.println("Start of the Rent Date: "+date);
          System.out.println("Number of Days Renting: "+time);         
           
       }
          else if (type == 2 && mpv_type == 2){
          System.out.println("Car Name: Proton Exora");
          System.out.println("Number of seats: 7");
          System.out.println("Gear: Automatik");
          System.out.println("Price of rent per day: RM 40");
          System.out.println("Start of the Rent Date: "+date);
          System.out.println("Number of Days Renting: "+time);       
           
       }
          else if (type == 3 && off_type == 1){
          System.out.println("Car Name: Toyota Hilux");
          System.out.println("Number of seats: 5");
          System.out.println("Gear: Manual");
          System.out.println("Extra Feature : Can keep a lot of stuff");
          System.out.println("Price of rent per day: RM 100");
          System.out.println("Start of the Rent Date: "+date);
          System.out.println("Number of Days Renting: "+time);            
       }
    }

    public void display_invoice(double total){
     
        System.out.println("The total : "+total); 
     } 
     
     public void display_final(double fulltotal){

     
        System.out.println("The Total Needed to Pay: RM "+fulltotal);  
        System.out.println("=======================================");     
     }
     
}


abstract class identity {                                     //abstract
    Scanner sc = new Scanner(System.in);
    String name,address,email,number;
    int age;

    public void cust_name(){
        System.out.println("Enter your name : ");
        name = sc.nextLine();
    }
    abstract void cust_age();
    abstract void cust_email();
    
    abstract void cust_number();
    abstract void cust_add();
    abstract void display();


}

abstract class identity2 extends identity{
    

    @Override
    public void cust_age(){
        System.out.println("Enter your age : ");
        age = sc.nextInt();
    }
    @Override
    public void cust_add(){
        System.out.println("Enter your House Address: ");
        address = sc.nextLine(); 

    }  
}

class identity3 extends identity2{                               //concrete

    public void cust_number(){
        System.out.println("Enter your Phone Number: ");
        sc.nextLine();        
        number= sc.nextLine();
    }
    @Override
    public void cust_email(){
        System.out.println("Enter your Email: ");
        email= sc.nextLine();  
    }
    public void display(){
        System.out.println("=================================");
        System.out.println("CUSTOMER INFORMATION");
        System.out.println("=================================");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+number);
        System.out.println("Email : "+email);
        System.out.println("Address : "+address);
        System.out.println("=================================");        
    }


}
