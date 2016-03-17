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
        
        cp.scanner(numPoints);
//        System.out.println(Arrays.toString(cp.arrayIntForm(cp.getStringRes())));
        System.out.println(cp.intRes(cp.arrayIntForm(cp.getStringRes())));
        cp.determineMin();
        //3-1->2^2->4
        //3-2->1^2->1
        //=5
        
        //6-3->3^2->9
        //4-3->1^2->1
        //10


    }
    
    
}
