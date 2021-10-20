/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_testing;

/**
 *
 * @author s one
 */
public class Calculator_testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static double addition(double first_number, double second_number){
        return first_number + second_number;
    }
    public static double substraction(double first_number, double second_number){
        return first_number - second_number;
    }
    public static double multiplication(double first_number, double second_number){
        return first_number * second_number;
    }
    public static double division(double first_number, double second_number){
        if(second_number == 0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return first_number / second_number;
    }
}
