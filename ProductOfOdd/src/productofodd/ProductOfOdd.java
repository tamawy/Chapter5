package productofodd;

/**
 *
 * @author ibrahim
 */
public class ProductOfOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int product = 1;
        /*for (int i=1;i<16;i++){
            if(i%2 == 0)
                continue;
            product *=i;
        }*/
        for(int i=1;i<=15;i+=2)
            product *= i;
        System.out.printf("product = %d%n",product);
    }
    
}
