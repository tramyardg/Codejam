package codejam_class.fortesting;

import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class PermutationMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ui = scan.nextInt();
        Permutation pm = new Permutation();
        pm.setNumCase(ui);
        pm.userInputStr();
    }
}
