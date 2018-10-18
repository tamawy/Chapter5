//in the name of Allah, the Gracious, the Merciful
package diamondprintingprogram;

/**
 *
 * @author ibrahim
 */
public class DiamondPrintingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int l=1;l<=5;l++){
            for(int s=5;s>l;s--){
                System.out.print(" ");   
            }
            for(int a=1;a<=2*l-1;a++)
                System.out.print("*");
            System.out.println("");
        }
        for(int l=4;l>=1;l--){
            for(int s=5;s>l;s--)
                System.out.print(" ");
            for(int a=1;a<=2*l-1;a++)
                System.out.print("*");
            System.out.println("");
        }
    }
    
}
