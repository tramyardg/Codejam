/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class fortesting {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        
        int[] arr = {1, 4, 3, 5, 2, 6, 3, 1, 0};
        int max = arr[0];
        int init;
        int next;
        for(int i =0; i < arr.length-1; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
                
        
    }
    /**
     * Compare the given number and the reverse of that number
     * if n = 121
     *  reverse it -> 121; r = 121
     * if n=r return true
     * @param n
     * @return 
     */
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;
        
        while(palindrome != 0) {
            int remainder = palindrome % 10; 
            reverse = reverse * 10 + remainder; 
            palindrome = palindrome / 10;
        }
        
        return n==reverse;
    }
    
}
