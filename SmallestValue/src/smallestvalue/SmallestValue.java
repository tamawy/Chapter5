
package smallestvalue;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class SmallestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int x = input.nextInt();
        int number,smallest = input.nextInt();
        for(int i=1;i<x;i++){
           number = input.nextInt();
           if(number < smallest)
               smallest = number;
        }
        System.out.printf("smallest number is : %d%n",smallest);
    }
    
}
