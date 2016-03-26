/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class.reversewords;

import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ReverseWordsMain {
    public static  void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        Scanner scan = new Scanner(System.in);
        int numberOfCase = scan.nextInt();
        System.out.println(rw.result(numberOfCase));
    }
}
