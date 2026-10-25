/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial_project;

import java.util.ArrayList;

/**
 *
 * @author marwajameel04
 */
public class Calculations {
    
    //Marwa_16J2337445
    
    private int coefficient;
    private String variable;
    private int exponent;

    // Default constructor
    public Calculations() {
    }

    // Constructor to initialize a term
    public Calculations(int coefficient, String variable, int exponent) {
        this.coefficient = coefficient;
        this.variable = variable;
        this.exponent = exponent;
    }

    // Getters and setters
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getVariable() {
        return variable;
    }

    public int getExponent() {
        return exponent;
    }

    // Display a polynomial
    public static void displayPolynomial(ArrayList<Calculations> polynomial) {
        for (int i = 0; i < polynomial.size(); i++) {
            Calculations term = polynomial.get(i);
            System.out.print(term.getCoefficient() + term.getVariable() + "^" 
                    + term.getExponent());
            if (i < polynomial.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    
    //Advanced funtion -----------------

    // Perform inverse of a polynomial
public static ArrayList<Calculations> performInverse(ArrayList<Calculations> poly) {
        ArrayList<Calculations> result = new ArrayList<>();
        for (Calculations term : poly) {
            result.add(new Calculations(-term.getCoefficient(), term.getVariable()
                    , term.getExponent()));
        }
        return result;
    }
    
    
    
}