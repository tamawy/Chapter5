package modifyinterest;

/**
 *
 * @author ibrahim
 */
public class ModifyInterest {

    public static void main(String[] args) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate
// display headers
        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for (double i = rate; i <= 0.1; i += 0.01) {
            // calculate amount on deposit for each of ten years
            System.out.printf("rate : %.0f%s%n",i*100," %");
            for (int year = 1; year <= 10; ++year) {
// calculate new amount for specified year
                amount = principal * Math.pow(1.0 + i, year);
// display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
} // end class Interest
