/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueofpi;

/**
 *
 * @author ibrahim
 */
public class ValueOfPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double PI = 4.0;
        for (int i=1,j=0;i<=400000;i+=2,j++){
            if(j%2!=0)
                PI += 4/i;
            else
                PI -= 4/i;
        }
        System.out.println("PI = "+PI);
    }
    
}
