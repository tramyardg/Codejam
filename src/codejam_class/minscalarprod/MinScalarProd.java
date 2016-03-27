package codejam_class.minscalarprod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MinScalarProd {

    private int numCase;
    private ArrayList<Integer> combinedArr;
    private ArrayList<Integer> output;

    private final Scanner scan = new Scanner(System.in);

    public void setResultList(ArrayList res) {
        this.output = res;
    }
    
    public ArrayList gerResultList() {
        return this.output;
    }
    
    public void setNumCase(int nc) {
        this.numCase = nc;
    }

    public int getNumCase() {
        return this.numCase;
    }

    public void userInput(int nc) {
        nc = this.getNumCase();

        int aj;
        int ajA;

        int[] arr1 = null;
        ArrayList<Integer> resArrayList = new ArrayList();
        for (int i = 0; i < nc; i++) {
            int c = i + 1;
            System.out.println("\n" + "Input case #" + c + ": ");

            System.out.print("Enter number of ints: ");
            aj = scan.nextInt();

            int realAj = aj * 2;
            arr1 = new int[realAj];
            int mp = (arr1.length / 2);

            for (int j = 0; j < realAj; j++) {
                ajA = scan.nextInt();
                arr1[j] += ajA;

            }
            int[] fh = this.firstHalf(arr1, mp);
            int[] lh = this.lastHalf(arr1, mp);
            ArrayList sortedFH = this.sortArr(fh);
            ArrayList sortedLH = this.sortArrRev(lh);

            this.combinedArr = this.mergeArr(sortedFH, sortedLH);
            int[] mergedSortedArray = this.convertCombineAl(this.combinedArr);

            int[] product = this.processArray(mergedSortedArray);
            int res = this.sumArrElem(product);
            resArrayList.add(res);

        }
        this.setResultList(resArrayList);
        System.out.println(resArrayList);

    }
    
    public void displayOutput() {
        ArrayList o = this.gerResultList();
        for(int i = 0; i < o.size(); i++) {
            Object obj = o.get(i);
            String objStr = String.valueOf(obj);
            int intObj = Integer.parseInt(objStr);
            int c = i + 1;
            System.out.println("Case #"+c+": " + intObj);
        }
    }

    public int[] convertCombineAl(ArrayList cbAl) {
        int[] converted = new int[cbAl.size()];
        for (int i = 0; i < converted.length; i++) {
            Object obj = cbAl.get(i);
            String strObj = String.valueOf(obj);
            converted[i] = Integer.parseInt(strObj);
        }
        return converted;
    }

    public int[] processArray(int[] arr) {

        int midPoint = (arr.length / 2);
        int[] prod = new int[midPoint];
        for (int i = 0; i < arr.length - midPoint; i++) {
            prod[i] += arr[i] * arr[i + midPoint];
        }
        return prod;

    }

    public int sumArrElem(int[] s) {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
        }
        return sum;
    }

    public ArrayList sortArrRev(int[] arr) {
        ArrayList alR = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            alR.add(arr[i]);
        }
        Collections.sort(alR, Collections.reverseOrder());
        return alR;
    }

    public ArrayList sortArr(int[] arr) {
        ArrayList al = new ArrayList();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        return al;
    }

    public int[] firstHalf(int[] arr, int mp) {
        int[] fh = new int[mp];
        for (int i = 0; i < mp; i++) {
            fh[i] = arr[i];
        }
        return fh;
    }

    public int[] lastHalf(int[] arr, int mp) {
        int[] lh = new int[mp];
        for (int i = 0; i < arr.length - mp; i++) {
            lh[i] = arr[i + mp];
        }
        return lh;
    }

    public ArrayList<Integer> mergeArr(ArrayList a, ArrayList b) {
        ArrayList both = new ArrayList();
        both.addAll(a);
        both.addAll(b);
        return both;
    }

}
