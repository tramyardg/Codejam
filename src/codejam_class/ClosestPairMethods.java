/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

import java.util.ArrayList;
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
    
    public ArrayList intRes(int[] intF) {
        double elem;
        ArrayList al = new ArrayList();
        for(int i = 0; i < (intF.length-numP); i+=2) {
            int x2 = intF[i+2];
            int x1 = intF[i];
            int y2 = intF[i+3];
            int y1 = intF[i+1];
            elem = Math.pow(Math.abs(x2 - x1), 2) + 
                    Math.pow(Math.abs(y2 - y1), 2);
            al.add(Math.sqrt(elem));
        }
        return al;
    }
    
    public void determineMin() {
        ArrayList resAl = this.intRes(this.arrayIntForm(this.getStringRes()));
        for(int i = 0; i < resAl.size(); i++) {
            System.out.println("-->"+resAl.get(i));
            resAl.toArray();
//            if(resAl.get(i) > resAl.get(i+1)) {
//                
//            }
        }        
    }
    
    
    

    
}
