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
    private static String intString ="";
    
    public void scanner(int n) {
        String res = "";
        Scanner scan = new Scanner(System.in);
        arrN = new String[n];
        numP = n;
        for(int i = 0; i < n; i++) {
            arrN[i] = scan.nextLine();
        }
        intString = stripStr(this.reformatStr(arrN));
    }
    
    public String getStringRes(){
        return intString;
    }
   
    public String reformatStr(String[] strArr) {
        return Arrays.toString(strArr);
    }
    
    public String stripStr(String res) {
        String strArr[] = res.split("\\D");
        String str = "";
        for(String t: strArr) {
            str += t;
        }
        return str;
    }
    
    public int[] arrayIntForm(String strRes) {
        int[] intF = new int[strRes.length()];
        for(int i = 0; i < strRes.length(); i++) {
            char ch = strRes.charAt(i);
            intF[i] = Integer.parseInt(String.valueOf(ch));
        }
        return intF;
    }
    
//    public int[] intRes(int[] intF) {
//        System.out.println(intF.length);
//        int[] intres = {};
//       
//        return intres;
//    }
    
}
