/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

/**
 *
 * @author K63-10969-2024 : Alex Maina
 * 
 */
import java.util.Scanner;
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the item No:");
            String itemNo = input.nextLine();
            System.out.println("Enter the price of the item");
            double price = input.nextDouble();
            float discount = (float) (price*0.065);
            double amount = price-discount;
            
            System.out.println("\n\n"+ itemNo +": 3_set Kitchenware ");
            System.out.println("Price: Kshs "+ price);
            System.out.println("Discount allocated: Kshs "+ discount);
            System.out.println("Amount payed: Kshs "+ amount);
        }      
    }
    
}
