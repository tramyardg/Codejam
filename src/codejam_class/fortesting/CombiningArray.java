package codejam_class.fortesting;

import java.util.ArrayList;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class CombiningArray {

    public ArrayList<Integer> combineArray(int[] a, int[] b) {
        ArrayList<Integer> al1 = this.convertIntArrArrayList(a);
        ArrayList<Integer> al2 = this.convertIntArrArrayList(b);
        ArrayList<Integer> both = new ArrayList();
        both.addAll(al1);
        both.addAll(al2);
        return both;
    }

    public ArrayList<Integer> convertIntArrArrayList(int[] a) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }
        return al;

    }
}
