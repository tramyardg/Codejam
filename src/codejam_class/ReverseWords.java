/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//import java.util.Scanner;
/**
 *
 * @author RAYMARTHINKPAD
 */
public class ReverseWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter something: ");
        String input = scan.nextLine();
        System.out.println(reverseIt(storeStrArry(input)));
    }

    public static String[] storeStrArry(String words) {
        String[] str = words.split(" ");
        return str;
    }

    public static String reverseIt(String[] str) {
        List<String> list = Arrays.asList(str);
        Collections.reverse(list);

        str = (String[]) list.toArray();

        String joined = String.join(" ", str);
        return joined;
    }

}
