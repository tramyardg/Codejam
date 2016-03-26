package codejam_class.minscalarprod;

import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MinScalarProd {

    private int numCase;
    private int numInts;
    private final Scanner scan = new Scanner(System.in);

    public void setNumCase(int nc) {
        this.numCase = nc;
    }

    public void setNumInts(int ni) {
        this.numInts = ni;
    }

    public int getNumInts() {
        return this.numInts;
    }

    public int getNumCase() {
        return this.numCase;
    }

    public void userInput(int nc) {
        int ints;

        nc = this.getNumCase();
        for (int i = 0; i < nc; i++) {
            int c = i + 1;
            System.out.print("Case #"+c+": ");

            ints = scan.nextInt();
        }

    }

}
