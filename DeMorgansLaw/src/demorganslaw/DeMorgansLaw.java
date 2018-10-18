//In the name of Allah, the Gracious, the merciful
package demorganslaw;

/**
 *
 * @author ibrahim
 */
public class DeMorgansLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=1,y=2,i=0,j=-1,a=5,b=6,g=7;
        System.out.printf("a=%d, b=%d, x=%d, y=%d, g=%d, i=%d, j=%d%n",a,b,x,y,g,i,j);
        System.out.println("!(x<5) && !(y>=7)  =>" + (!(x<5) && !(y>=7)) );
        System.out.println("!(a==b) || !(g!=5) =>" + (!(a==b) || !(g!=5)));
        System.out.println("!((x<=8) && (y>4)) =>"+(!((x<=8) && (y>4))));
        System.out.println("!((i>4) || (j<=6)) =>"+(!((i>4) || (j<=6))));
        
        System.out.println("-------------------------------------------");
        
        System.out.println("!((x<5) || (y>=7))  =>" + (!((x<5) || (y>=7))) );
        System.out.println("!((a==b) && (g!=5)) =>" + (!((a==b) && (g!=5))));
        System.out.println("!(x<=8) || !(y>4)   =>"+(!(x<=8) || !(y>4)));
        System.out.println("!(i>4) && !(j<=6))  =>"+(!(i>4) && !(j<=6)));
        
    }
    
}
