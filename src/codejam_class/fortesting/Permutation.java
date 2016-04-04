package codejam_class.fortesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Permutation {

    private int numberCase;
    private int factorialN;
    private final Scanner scan = new Scanner(System.in);

    public void setNumCase(int nc) {
        this.numberCase = nc;
    }

    public int getNumCase() {
        return this.numberCase;
    }

    public void setFactorialN(int n) {
        this.factorialN = n;
    }
    public int getFactorialN() {
        return this.factorialN;
    }
    /**
     * @return
     */
    public void userInputStr() {
        String uis;
        ArrayList<String> alStr = new ArrayList();
        for (int i = 0; i < this.getNumCase(); i++) {

            uis = scan.next();

            // pass the user inputs to be sorted
            // return sorted input
            this.sortedString(uis);
            this.permutate(sortedString(uis));

            // process the string and set string length for the factorial
            this.factorialN(uis);

            alStr.add(this.sortedString(uis));
        }
        System.out.println(alStr);


    }

    /**
     * @param str
     * @return
     */
    public String sortedString(String str) {
        /**
         * Sort the string using Arrays sort.
         * 1. Convert the string chars
         * 2. Sort the char array using arrays sort
         * 3. Get the string value of char.
         */
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String sorted = String.valueOf(ch);

        return sorted;
    }

    /**
     * 
     * @param str 
     */
    public void factorialN(String str) {
        /**
         * Base on the length of the string 
         * we can get the factorial of that 
         * string.
         * Example
         *  string = abc
         *  length = 3
         *  factorial = 3x2x1 = 6
         */
        int strLen = str.length();

        /**
         * Make an ArrayList to store the elements of the
         * string we are about to factor.
         * Example
         *  string = abc
         *  length = 3
         *  ArrayList myArrayList = new ArrayList();
         *  my arrayList contains {3,2,1}
         */
        ArrayList<Integer> storeI = new ArrayList();
        for (int i = 1; i <= strLen; i++) {
            storeI.add(i);
        }
        this.processArrayListInt(storeI);
    }

    public void processArrayListInt(ArrayList<Integer> al) {
        /**
         * This is where the actual factorial
         * happens. Given the arrayList we can
         * get the result by multiplying the 
         * elements starting at index 0 to 
         * the arrayList length.
         * Example
         *  string = abc
         *  myArrayList = {3,2,1}
         *  return 3*2*1 
         */
        // Start by 1 since multiplying by zero returns 0.
        int sum = 1;
        for (int i = 0; i <= (al.size() - 1); i++) {
            sum *= al.get(i);
        }
        this.setFactorialN(sum);
        
//        System.out.println(al.size() + "!=" + this.getFactorialN());

    }
    
    public void permutate(String str) {
        ArrayList<String> al = new ArrayList();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String strCh = String.valueOf(ch);
            al.add(strCh);
        }
        System.out.println(al);
    }


}
