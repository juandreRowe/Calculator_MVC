/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author juandre
 */
public class Model {
    private int total;
    
    public int getTotal(){
        return total;
    }
    
    public void addNumbers(int numberOne, int numberTwo){
        total = numberOne + numberTwo;
    }
}
