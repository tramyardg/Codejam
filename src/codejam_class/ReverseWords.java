/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * The the sentence or words split them by pieces. Store them in an array.
 * Reverse the array and output the result as sentence or words.
 * @author RAYMARTHINKPAD
 */
 public class ReverseWords {
     /**
      * 
      * @param args 
      * Get the number of case(s) and iterate n times
      */
//    public static  void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int numberOfCase = scan.nextInt();
//        System.out.println(result(numberOfCase));
//    }
    
    /**
     * Output the result
     * @param n
     * @return 
     */
    public String result(int n){
        String input;
        Scanner scan = new Scanner(System.in);
        String res = "";
        for(int i = 0; i < n; i++) {
            int j = i+1;
            input = scan.nextLine();   
            res += "\n" + "Case #" + j + ": " + reverseIt(storeStrArry(input));
        }
        return res;
    }
    
    /**
     * Take the input as sentence alike and splits them if possible removing
     * spaces and storing elements in an array
     * @param words
     * @return 
     */
    public String[] storeStrArry(String words) {
        String[] str = words.split(" ");
        return str;
    }

    /**
     * Get the input and reverse it joining them as sentence for output
     * @param str
     * @return 
     */
    public String reverseIt(String[] str) {
        List<String> list = Arrays.asList(str);
        Collections.reverse(list);
        
        str = (String[]) list.toArray(); 
        String joined = String.join(" ", str);
        return joined;
    }

}
