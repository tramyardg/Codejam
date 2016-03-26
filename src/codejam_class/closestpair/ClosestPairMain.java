/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class.closestpair;

import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ClosestPairMain {

    public static void main(String[] args) {
        ClosestPairMethods cp = new ClosestPairMethods();
        int numPoints = 0;
        do {
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number of points >=3: ");
            numPoints = scan.nextInt();
            
        } while (numPoints < 3);
        
        cp.storeUserInput(numPoints);
    }
}
