package codejam_class.minscalarprod;

import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MinScalarProdMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of case: ");
        int numCase = scan.nextInt();
        
        MinScalarProd msp = new MinScalarProd();
        msp.setNumCase(numCase); 
        msp.userInput(msp.getNumCase());
        msp.displayOutput();
    }
}
