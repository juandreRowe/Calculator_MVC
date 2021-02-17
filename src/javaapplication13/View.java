/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author juandre
 */
public class View extends JFrame {
    private final JTextField numberOne = new JTextField(10);
    private final JLabel additionLabel = new JLabel("+");
    private final JTextField numberTwo = new JTextField(10);
    private final JButton addButton = new JButton("Add");
    private final JTextField total = new JTextField(10);
    
    public View(){
        JPanel panel = new JPanel();
        panel.add(numberOne);
        panel.add(additionLabel);
        panel.add(numberTwo);
        panel.add(addButton);
        panel.add(total);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        this.add(panel);
        this.setTitle("Juandre - MVC");
    }
    
    public int getNumberOne(){
        return Integer.parseInt(numberOne.getText());
    }
    
    public int getNumberTwo(){
        return Integer.parseInt(numberTwo.getText());
    }
    
    public void setTotal(int total){
        this.total.setText(Integer.toString(total));
    }
    
    public void actionListener(ActionListener listener){
        addButton.addActionListener(listener);
    }
    
    public void displayError(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
