/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ClosestPairMain {
    public static  void main(String[] args) {
        ClosestPairMethods cp = new ClosestPairMethods();
        Scanner scan = new Scanner(System.in);
        int numPoints = scan.nextInt();
        
        cp.storeUserInput(numPoints);
        
    }
}
