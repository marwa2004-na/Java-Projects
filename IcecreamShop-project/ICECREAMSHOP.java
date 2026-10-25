/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamshop;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ICECREAMSHOP {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    
    //call jframe(GUI)
    EventQueue.invokeLater(()->{
         new GUI().setVisible(true);
         });

     
     //scanner class for user input
        Scanner scanner = new Scanner(System.in);
        
        //object to use customer and order class attributes and methods
        Customer c = new Customer();
        
        Order order = new Order();
        
        //array lists to save the ice cream types and tops 
        ArrayList<String> iceCreamTypes = new ArrayList<>();
        
        ArrayList<String> iceCreamTops = new ArrayList<>();
 
    //  ice cream types and toppings
        iceCreamTypes.add("Vanilla");
        iceCreamTypes.add("Chocolate");
        iceCreamTypes.add("Strawberry");
        iceCreamTypes.add("Mango");
        iceCreamTypes.add("Matcha");
        
        iceCreamTops.add("Strawberries");
        iceCreamTops.add("Chocolate Chips");
        iceCreamTops.add("Sprinkles");
        iceCreamTops.add("Caramel Sauce");
        iceCreamTops.add("None");
 
    // enter customer details by user
        System.out.println("\nEnter your details to proceed");
 
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Phone: ");
        int phone = scanner.nextInt();
        System.out.print("Enter Location: ");
        String location = scanner.next();
        System.out.print("Enter Allergies (if any): ");
        String allergies = scanner.next();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        scanner.nextLine();
        
        //intilaize customer attributes
        Customer customer = new Customer(name, phone, location, allergies, email);
      
        //print customer detials
        customer.PrintAll();
        

        //ask for number of scoops 
        System.out.println("\nHow Many Scoops Do You Want?");
        int scoops = scanner.nextInt();
        int l =0;
        int totaltops=0;
        //loop for customer to choose flavours and tops per scoop
        do{
               // loop for ice cream types
             System.out.println("Choose Ice Cream Type:");
        for (int i = 0; i < iceCreamTypes.size(); i++) {
            System.out.println((i + 1) + ". " + iceCreamTypes.get(i));
            
        }
        
        // ice cream type choice 
        int iceCreamChoice = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        
        // loop for ice cream tops 
        System.out.println("Choose Ice Cream Topping:");
        for (int i = 0; i < iceCreamTops.size(); i++) {
            System.out.println((i + 1) + ". " + iceCreamTops.get(i));
           
        }
        
        // choice of tops 
        int toppingChoice = scanner.nextInt();
        
        //get total number of tops to calculate price
        if(toppingChoice >=1 && toppingChoice<=4){
           Math.ceil(totaltops++) ;
        }
        
        l++;
        }while (l != scoops);
 
        //ask for delivery time prefernce
        System.out.print("\nEnter Preferred Delivery Time: ");
        String deliveryTime =  scanner.next();
 

   
    // Calculate and display price
  
    System.out.println("Price of your order: " + order.calculatePrice(scoops,totaltops)+" OMR");
  
    // Payment ways (cash/card)
        System.out.println("\nDo you want to pay by Cash or Card?");
        String payment =  scanner.next();
        
     //conditional statment for user to choose payment method
        if (payment.equalsIgnoreCase("Cash")) {
            System.out.println("Thank you for your payment. Enjoy your ice cream!");
        } else if (payment.equalsIgnoreCase("Card")) {
            System.out.print("Enter Card Number: ");
            int cardNumber =  Math.abs(scanner.nextInt());
            System.out.print("Enter Password: ");
            int password =Math.abs(scanner.nextInt());
            System.out.println("Payment successful.");
        } else {
            System.out.println("Invalid payment method. Please choose Cash or Card.");
        }
         
        //Print Receipt for customer
     System.out.println("\nRECIEPT-\n"+"Customer "+name+" have "+allergies+" allergies "
               +" and have ordered "+scoops+" Scoops and " +totaltops+" tops "
                       +"\nto "+location+" at "+deliveryTime+" with Total Price- "
     +order.calculatePrice(scoops,totaltops)+" OMR");
     
      order.print();
     
    }

    }
    
    

