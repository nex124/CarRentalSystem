/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem1;



public class Calculate1 {
    
 double rent_price=0,fulltotal=0;
 double total=0;
 CarRentalSystem1 main = new CarRentalSystem1();
 CarRentalSystem1 next = new CarRentalSystem1();
  int k=1; 
 

    
     public void calculation(int time,int type,int fam_type,int mpv_type, int off_type){
     
       if (type == 1 && fam_type == 1){
          
           rent_price = 20;
       }
       else if (type == 1 && fam_type == 2){
       
           rent_price = 30;
       }
       else if (type == 2 && mpv_type == 1){
       
           rent_price = 50;
       }
       else if (type == 2 && mpv_type == 2){
       
            rent_price = 40;      
       }
       else if (type == 3 && off_type == 1){
       
            rent_price = 100;
       }
       else if (type == 3 && off_type == 2){
       
            rent_price = 120;
       }       
       
       

      System.out.println("Order Number: "+k);
      k++;
      total = rent_price*time;  
      fulltotal = fulltotal + total;
      main.display_invoice(total);
      next.display_final(fulltotal);
    }
     

  
     


     }






