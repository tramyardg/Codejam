/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class.fortesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * s
 *
 * @author RAYMARTHINKPAD
 */
public class fortesting {

    public static void main(String[] args) {
//        System.out.println(isPalindrome(121));
//        
//        int[] arr = {1, 4, 3, 5, 2, 6, 3, 1, 0};
//        int max = arr[0];
//        int init;
//        int next;
//        for(int i =0; i < arr.length-1; i++) {
//            if(arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//                System.out.println((gcd(24,36)));
//        System.out.println(primeFactor());

//        System.out.println(returnGCD(gcd(24,36)));
        int[] arr = {2, 1, 9, 6, 4};
        sortArr(arr);
        sortArrRev(arr);
        adding2Arr();
    }

    /**
     * Compare the given number and the reverse of that number if n = 121
     * reverse it -> 121; r = 121 if n=r return true
     *
     * @param n
     * @return
     */
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return n == reverse;
    }

    public static ArrayList gcd(int a, int b) {
        //determine which one is less
        int l;
        int s;
        ArrayList al = new ArrayList();
        if (a > b) {
            l = a;
            s = b;
        } else {
            l = b;
            s = a;
        }
        for (int i = 1; i < l; i++) {
            int cdl = l % i;

            if (cdl == 0) {
                int cd2 = s % i;
                if (cd2 == 0) {
                    al.add(i);
                }
            }
        }
        return al;
    }

    public static int returnGCD(ArrayList al) {
        Object obj = al.get(al.size() - 1);
        String gcdStr = String.valueOf(obj);
        int gcdInt = Integer.parseInt(gcdStr);
        return gcdInt;
    }

    /*
    Sort by ascending.
    */
    public static void sortArr(int[] arr) {
        ArrayList al = new ArrayList();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        System.out.println(al);
    }

    /*
    Sort by descending.
    */
    public static void sortArrRev(int[] arr) {
        List al = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }
    
    public static void adding2Arr() {
        int[] a = {-5,1,3};
        int[] b = {-2,1,4};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i]*b[i];
        }
        System.out.println(sum);
    }
    
    

}
