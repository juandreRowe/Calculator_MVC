/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author juandre
 */
public class Controller {
    private final View view;
    private final Model model;
    
    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
        this.view.actionListener(new CalcListener());
    }
    
    private class CalcListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try{
                int numberOne, numberTwo = 0;
                numberOne = view.getNumberOne();
                numberTwo = view.getNumberTwo();
                model.addNumbers(numberOne, numberTwo);
                view.setTotal(model.getTotal());
                
            }catch(NumberFormatException ex){
                view.displayError("Only integers allowed");
            }
        }
    
    }
}
