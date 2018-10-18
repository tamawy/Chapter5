/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantriples;

/**
 *
 * @author ibrahim
 */
public class PythagoreanTriples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Side1 Side2 Hypotenus");
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    if(((i*i)+(j*j))==(k*k))
                        System.out.printf("%-6d%-6d%d%n",i,j,k);
                }
            }
        }
    }

}
