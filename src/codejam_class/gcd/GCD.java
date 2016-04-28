package codejam_class.gcd;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class GCD {    
    /**
     * Returns the larger or smaller number
     * between the a or b
     * @param a
     * @param b
     * @return 
     */
    public int[] sortSmallLarge(int a, int b) {
        int[] sortArr = new int[2];
        sortArr[0] = a;
        sortArr[1] = b;
        Arrays.sort(sortArr);
        return sortArr;
        
    }
    
    public int EuclideanAlgorithm(int a, int b) {
        // will return larger number
        int l = this.sortSmallLarge(a, b)[1]; 
        
        // will return smaller number
        int s = this.sortSmallLarge(a, b)[0];
        
        // remainder 
        int r; 
        do {
            
            /*
            Example:
            93 % 36 = 21
            36 % 21 = 15
            21 % 15 = 6
            15 % 6 = 3
            6 % 3 = 0
            3 is the answer after reaching 0
            
            r = l % s
            iteration [1]
                r = 93 % 36
                r = 21
                l = s : l = 36
                s = r : s = 21
                is r not equal 0 : true, then continue
                r = l % s : r = 36 % 21
            
            iteration [2]
                r = 36 % 21
                r = 15
                l = s : l = 21
                s = r : s = 15
                is r not equal 0 : true, then continue
                r = l % s : r = 21 % 15
            and so on..
            
            when you reach a point where the remainder is 0
            then return the smaller number
            which is [l] in this case
            
            Example:
                6 % 3 = 0
                return l since r = l % s
                where l = s and s is 3.
              
            */
                  
            r = l % s;
            
            l = s;
            s = r;
        }while(r!=0);
        return l;
    }
}
