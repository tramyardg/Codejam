/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class RAPmethods {
    public int reverseN(int initialN) {
        int remainder = 0;
        while(initialN != 0) {
            remainder = remainder % 10;
            System.out.println(remainder);
        }
        return 0;
    }
}
