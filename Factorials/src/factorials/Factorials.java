package factorials;

/**
 *
 * @author ibrahim
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%-3s%s%n","n","!n");
        //first for-loop calculates number from 1 to 20 
        //second for-loop calculates the factorial of every number(i)
        for(int i=1;i<=20;i++){
            long fact = 1;
            for(int j=1;j<=i;j++){
                fact *= j;
            }
        System.out.printf("%-3d%d%n",i,fact);
        }
    }
    
}
