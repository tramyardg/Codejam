/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_class.rap;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class RAPmethods {
    public int reverseN(int n) {
        int palindrome = n;
        int reverse = 0;
        while(palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = (int) Math.floor(palindrome/10);
        }
        return reverse;
    }
    
    public boolean isPalindrome(int n) {
        return (n==this.reverseN(n));
    }
    
    public String rapRun(int n) {
        int count = 0;
        int init = n;
        int sum;
        int revInit;
        do {
            revInit = this.reverseN(init);
            sum = init + revInit;
            init = sum;
            count++;
        }while(!this.isPalindrome(sum));
        return count + " " + sum;
    }
    

    
    
    
}
