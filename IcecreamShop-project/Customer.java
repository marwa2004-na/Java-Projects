/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamshop;

/**
 *
 * @author user
 */
public class Customer {
    
    // Attributes are private to demonstrate encapsulation
    private String name;
    private int phone;
    private String location;
    private String allergies;
    private String email;
    
 
// Constructor Welcome message for online shop (default)
    public Customer() {
        System.out.println("Welcome to our online Ice Cream Shop!");
    }
    
// Constructor Overloading Parameterized constructor to initialize customer details
    public Customer(String name, int phone, String location, String allergies, String email){
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.allergies = allergies;
        this.email = email;
    }

 
// Getter and Setter methods for encapsulation
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPhone() {
        return phone;
    }
 
    public void setPhone(int phone) {
        this.phone = phone;
    }
 
    public String getLocation() {
        return location;
    }
 
    public void setLocation(String location) {
        this.location = location;
    }
 
    public String getAllergies() {
        return allergies;
    }
 
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    
    //Method to print Customer Details

     public void PrintAll(){
         System.out.println("\nName : "+name);
         System.out.println("Phone : "+phone);
         System.out.println("Allergies : "+allergies);
         System.out.println("Location : "+location);
        
     }
         


}
    
    

