/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FahrenheitToCelsius;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Steve
 */
public class FahrenheitToCelsius extends JFrame{
        public JLabel title;
        public JLabel celsiusLabel;
        public JLabel fahrenheitLabel;
        public JTextField fahrenheitInput;
        public JButton convertButton;
        public BorderLayout border;
        
    /**
     * @param args the command line arguments
     */
    public FahrenheitToCelsius(){
    //JFrame window = new JFrame("Fahrenheit to Celsius Temperature Converter");
    title = new JLabel("Fahrenheit to Celsius Temperature Converter");
    celsiusLabel = new JLabel("Celsius Temperature");
    fahrenheitLabel = new JLabel("Fahrenheit Temperature");
    fahrenheitInput = new JTextField(8);
    convertButton = new JButton("Convert");
    border = new BorderLayout();
    }
    
    public class ButtonHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == convertButton) {
         
            double far = Double.parseDouble(fahrenheitInput.getText());
            double celsius = ((far-32.0)*(5.0/9.0));
            celsiusLabel.setText(String.format("%.1f",celsius) + " degrees Celcius");
         }
     }
    }
    
    
    void Converter(){
        convertButton.addActionListener(new ButtonHandler());
       /* window.add(title, BorderLayout.NORTH);
        window.setLayout(border);
        window.setVisible(true);
        window.add(celsiusLabel, BorderLayout.EAST);
        window.add(convertButton, BorderLayout.SOUTH);
        window.add(fahrenheitInput, BorderLayout.CENTER);
        window.add(fahrenheitLabel, BorderLayout.WEST);
        */
        
        add(title, BorderLayout.NORTH);
        //setLayout(border);
        //setVisible(true);
        add(celsiusLabel, BorderLayout.EAST);
        add(convertButton, BorderLayout.SOUTH);
        add(fahrenheitInput, BorderLayout.CENTER);
        add(fahrenheitLabel, BorderLayout.WEST);
        title.setForeground(Color.red);
        //title.setForeground(Color.red); 
    }
  
     
    public static void main(String[] args) {
        // TODO code application logic here, set visible, window size, create object 
        FahrenheitToCelsius frame = new FahrenheitToCelsius();
        frame.Converter();
        frame.setSize(new Dimension(350,110)); 
        //frame.setResizable(false);
       // frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Fahrenheit To Celcius Temperature Converter");
    }
        
        
        
    
    
    
    
    
    
    
    }
    
