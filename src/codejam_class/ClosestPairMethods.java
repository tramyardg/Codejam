/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ClosestPairMethods {
    private static String[] arrN;
    private static int numP = 0;
    
    public String[] scanner(int n) {
        Scanner scan = new Scanner(System.in);
        arrN = new String[n];
        numP = n;
        for(int i = 0; i < n; i++) {
            arrN[i] = scan.nextLine();
        }
        
        return arrN;
    }
   
    public String reformatStr() {
        return Arrays.toString(arrN);
    }
    
    
    
    public String stripStr() {
        String res = this.reformatStr();
        String strArr[] = res.split("\\D");
        String str = "";
        for(String t: strArr) {
            str += t;
        }
                
        return str;
        
    }
    
    public int[] arrayIntForm() {
        int[] intF = new int[this.stripStr().length()];
        for(int i = 0; i < this.stripStr().length(); i++) {
            char ch = this.stripStr().charAt(i);
            intF[i] = Integer.parseInt(String.valueOf(this.stripStr().charAt(i)));
        }
        return intF;
    }
    
    
}
