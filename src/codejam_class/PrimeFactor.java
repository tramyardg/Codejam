package codejam_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class PrimeFactor {

    private int user_input;
    private final int[] pArr = {
        2, 3, 5, 7, 11,
        13, 17, 19, 23, 29,
        31, 37, 41, 43, 47,
        53, 59, 61, 67, 71,
        73, 79, 83, 89, 97};

    public void prompUserInput() {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the prime factorization of ");
        input = sc.nextInt();
        this.user_input = input;

        System.out.println(this.retDivisibleP(user_input));
        int[] arrInt = this.convertAltoArr(this.retDivisibleP(user_input));
        System.out.println(this.result(arrInt, input));
//        System.out.println(Arrays.toString(this.convertAltoArr(this.retDivisibleP(user_input))));
        
    }

    /**
     * Returns the list of prime number that divides the user input
     *
     * @param ui
     * @return
     */
    public ArrayList retDivisibleP(int ui) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < pArr.length; i++) {
            int remainder = ui % pArr[i];
            if (remainder < 1) {
                al.add(pArr[i]);
            }
        }
       return al;
    }

    public int[] convertAltoArr(ArrayList al) {
        int[] arr = new int[al.size()];
        for(int i = 0; i < al.size(); i++) {
            Object obj = al.get(i);
            String str = String.valueOf(obj);
            int intArr = Integer.parseInt(str);
            arr[i]=intArr;
        }
        return arr;
    }
    
    public String result(int[] arr, int input) {
        input = this.user_input;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int q = input / arr[i];
            int r=0;
            if(q>1) {
                r = q % arr[i];
                count++;
            }
            if(r==0){
                this.user_input = q;
            }
            
            
        }
        // [ 7 11 13 ]
        // 7007
        System.out.println(count);
        
        return "-";
    }
 
}
