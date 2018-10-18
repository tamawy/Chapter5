/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingsales;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class CalculatingSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter product number and quantity sold (when finished enter 0 0)  :");
        Scanner input = new Scanner(System.in);
        int product=0;
        double quantity=0.0,retail=0.0;
        do{
            product = input.nextInt();
            quantity = input.nextInt();
            switch(product){
                case 1:retail += quantity*2.98; break;
                case 2:retail += quantity*4.5; break;
                case 3:retail += quantity*9.98; break;
                case 4:retail += quantity*4.49; break;
                case 5:retail += quantity*6.87; break;
                default : 
                    if(quantity !=0){
                        System.out.println("Wrong number!");
                        quantity = 0;
                        product = 0;
                    }
            }
        }while(!((product==0)&&(quantity==0)));
        System.out.println("Total Retail = $ "+retail);
        
    }
    
}
