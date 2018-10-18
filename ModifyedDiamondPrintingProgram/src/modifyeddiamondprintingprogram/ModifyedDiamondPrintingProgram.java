//in the name of Allah, the Gracious, the Merciful
package modifyeddiamondprintingprogram;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class ModifyedDiamondPrintingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        n = input.nextInt();
        for(int l=1;l<=n;l++){
            for(int s=n;s>l;s--){
                System.out.print(" ");   
            }
            for(int a=1;a<=2*l-1;a++)
                System.out.print("*");
            System.out.println("");
        }
        for(int l=n-1;l>=1;l--){
            for(int s=n;s>l;s--)
                System.out.print(" ");
            for(int a=1;a<=2*l-1;a++)
                System.out.print("*");
            System.out.println("");
        }
    }
    
}
