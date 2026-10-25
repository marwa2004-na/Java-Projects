/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial_project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marwajameel04
 */
public class Polynomial_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        //Marwa_16J2337445
        
       Scanner input = new Scanner(System.in);
       
        // Polynomials
        ArrayList<Calculations> Ppolynomial = new ArrayList<>();
        ArrayList<Calculations> Qpolynomial = new ArrayList<>();

        // Input for Polynomial P(X)
        System.out.println("Enter the number of terms for Polynomial P(X): ");
        Ppolynomial = readPolynomial(input);

        // Input for Polynomial Q(X)
        System.out.println("Enter the number of terms for Polynomial Q(X): ");
        Qpolynomial = readPolynomial(input);

        // Display Polynomials
        System.out.println("P(X): ");
        Calculations.displayPolynomial(Ppolynomial);
        System.out.println("Q(X): ");
        Calculations.displayPolynomial(Qpolynomial);

        // Sum and Product of Polynomials
        ArrayList<Calculations> sum = performAddition(Ppolynomial, Qpolynomial);
        ArrayList<Calculations> product = performMultiplication(Ppolynomial, 
                Qpolynomial);

        // Menu for viewing results
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View Sum (P(X) + Q(X))");
            System.out.println("2. View Product (P(X) * Q(X))");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nSum (P(X) + Q(X)): ");
                    Calculations.displayPolynomial(sum);
                    break;
                case 2:
                    System.out.println("\nProduct (P(X) * Q(X)): ");
                    Calculations.displayPolynomial(product);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        // Scalar Multiplication
        System.out.print("\nEnter a scalar to multiply with P(X): ");
        int scalar = input.nextInt();
        System.out.println("Scalar Multiplication (Scalar * P(X)): ");
        ArrayList<Calculations> scalarResult = performScalarMultiplication
        (Ppolynomial, scalar);
        Calculations.displayPolynomial(scalarResult);

        // Insert a new term
        System.out.println("\nInsert a new term into Polynomial P(X):");
        System.out.print("Enter coefficient: ");
        int newCoefficient = input.nextInt();
        System.out.print("Enter exponent: ");
        int newExponent = input.nextInt();
        Ppolynomial.add(new Calculations(newCoefficient, "x", newExponent));
        System.out.println("P(X) after inserting new term: ");
        Calculations.displayPolynomial(Ppolynomial);

        // Check if a term exists
        System.out.print("\nEnter an exponent to check if it exists in P(X): ");
        int checkExponent = input.nextInt();
        boolean exists = checkTermExists(Ppolynomial, checkExponent);
        System.out.println("Term with exponent " + checkExponent + 
                (exists ? " exists." : " does not exist."));

        // Check if P(X) and Q(X) are the same
        boolean areSame = checkPolynomialsEquality(Ppolynomial, Qpolynomial);
        System.out.println("\nAre P(X) and Q(X) the same? " + 
                (areSame ? "Yes" : "No"));

        //Advanced function---------------
        
        // Inverse of P(X)
        System.out.println("\nInverse of P(X): ");
        ArrayList<Calculations> inverse = Calculations.performInverse
        (Ppolynomial);
        Calculations.displayPolynomial(inverse);
    }
    //end here -----------------

    // function to read polynomial from user input
    public static ArrayList<Calculations> readPolynomial(Scanner input) {
        ArrayList<Calculations> polynomial = new ArrayList<>();
        int terms = input.nextInt();
        for (int i = 0; i < terms; i++) {
            System.out.println("Enter details for term " + (i + 1) + ":");
            System.out.print("Coefficient: ");
            int coefficient = input.nextInt();
            System.out.print("Exponent: ");
            int exponent = input.nextInt();
            polynomial.add(new Calculations(coefficient, "x", exponent));
        }
        return polynomial;
    }

    // Addition of Polynomials
    public static ArrayList<Calculations> performAddition(
            ArrayList<Calculations> poly1, ArrayList<Calculations> poly2) {
        ArrayList<Calculations> result = new ArrayList<>(poly1);
        
        for (Calculations term2 : poly2) {
            boolean added = false;
            for (Calculations term1 : result) {
                if (term1.getExponent() == term2.getExponent()) {
                    term1.setCoefficient(term1.getCoefficient() + 
                            term2.getCoefficient());
                    added = true;
                    break;
                }
            }
            if (!added) {
                result.add(term2);
            }
        }
        return result;
    }

    // Multiplication of Polynomials
    public static ArrayList<Calculations> performMultiplication(
            ArrayList<Calculations> poly1, ArrayList<Calculations> poly2) {
        ArrayList<Calculations> result = new ArrayList<>();
        
        for (Calculations term1 : poly1) {
            for (Calculations term2 : poly2) {
                int newCoefficient = term1.getCoefficient() *
                        term2.getCoefficient();
                int newExponent = term1.getExponent() + term2.getExponent();

                // Check if term already exists with the same exponent
                boolean termExists = false;
                for (Calculations term : result) {
                    if (term.getExponent() == newExponent) {
                        term.setCoefficient(term.getCoefficient() + 
                                newCoefficient);
                        termExists = true;
                        break;
                    }
                }
                
                // If the term doesn't exist in the result, add it
                if (!termExists) {
                    result.add(new Calculations(newCoefficient, "x", 
                            newExponent));
                }
            }
        }
        return result;
    }

    // Perform scalar multiplication
    public static ArrayList<Calculations> performScalarMultiplication(
            ArrayList<Calculations> poly, int scalar) {
        ArrayList<Calculations> result = new ArrayList<>();
        for (Calculations term : poly) {
            result.add(new Calculations(term.getCoefficient() * scalar,
                    term.getVariable(), term.getExponent()));
        }
        return result;
    }

    // Check if a term with a specific exponent exists
    public static boolean checkTermExists(ArrayList<Calculations> polynomial, 
            int exponent) {
        for (Calculations term : polynomial) {
            if (term.getExponent() == exponent) {
                return true;
            }
        }
        return false;
    }

    // Check if two polynomials are the same
    public static boolean checkPolynomialsEquality(ArrayList<Calculations> 
            poly1,
           ArrayList<Calculations> poly2) {
        if (poly1.size() != poly2.size()) return false;

        for (Calculations term1 : poly1) {
            boolean found = false;
            for (Calculations term2 : poly2) {
                if (term1.getExponent() == term2.getExponent() && 
                        term1.getCoefficient() == term2.getCoefficient()) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }

        return true;
    }
}




        
        

       
     
    
    

