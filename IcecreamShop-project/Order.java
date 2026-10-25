/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamshop;

/**
 *
 * @author marwajameel04
 */
public class Order {
    
    //order details variables
    String iceCreamType;
    String iceCreamTop;
    int numberOfScoops;
    String deliveryTime;

    //default constructor 
    public Order() {
        System.out.println("One Scoop is 0.7 OMR and One Top is 0.3 OMR.");
    }

    
    // Method to print thanks message
    public void print() {
        System.out.println("Thank you for your order!");
    }
    
// Method to calculate price based on scoops and topping
   
    public double calculatePrice(int numberOfScoops,int numberoftoopings) 
    {
     //scoop price 0.7 and top price 0.3
    double scoopprice=0.7;
    double topprice=0.3;
    // Price calculation as per specifications
    double price = (scoopprice*numberOfScoops)+(topprice*numberoftoopings);
     return price;
    }
   
}
