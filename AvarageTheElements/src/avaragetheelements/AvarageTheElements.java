/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaragetheelements;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class AvarageTheElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        Random r = new Random();
        LinkedList<Double> object = new LinkedList<Double>(); 
        double input ;
       // int count = 0 ; 
        double sum = 0 ;
        float avg =0; 
        for (int i = 0; i < 30; i++) {
            input = r.nextInt(50);
            object.add(input);
           // count++;
            sum = sum + object.get(i);
            avg = (float) (sum / 30) ; 
            
        }
        System.out.println("The sum of The Elements : "+ sum);
        System.out.println("The Avareage of the Elements "+ avg);
        
        
    }
    
}
