
package triangle;

/**
 *
 * @author ibrahim
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a
        for(int i=0;i<10;i++){//number of lines 
            for(int j=0;j<=i;j++){//number of astrisks in each line
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");
        //b
       for(int i=10;i>0;i--){
           for(int j=i;j>0;j--)
               System.out.print("*");
           System.out.println("");
       }
        System.out.println("----------");
       //c
       
       for(int i=0;i<10;i++){//number of lines 
            for(int j=0;j<i;j++){//number of astrisks in each line
                System.out.print(" ");
            }
            for(int j=10;j>i;j--)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("----------");
       //d
       for(int i=0;i<10;i++){
           for(int j=9;j>i;j--){
               System.out.print(" ");
           }
           for(int j=0;j<=i;j++)
               System.out.print("*");
           System.out.println();
       }
       
    }
    
}
