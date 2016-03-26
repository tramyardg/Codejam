package codejam_class.closestpair;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ClosestPairMethods {

    private final DecimalFormat twoDForm = new DecimalFormat("#.####");
    private ArrayList finalArl;

    public void storeUserInput(int numP) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arl = new ArrayList<>();
        for (int i = 0; i < numP; i++) {
            int j = i + 1;
            System.out.print("Enter x" + j + ": ");
            int x = scan.nextInt();
            System.out.print("Enter y" + j + ": ");
            int y = scan.nextInt();
            arl.add(x);
            arl.add(y);
        }
        this.storeArrayList(arl);
        System.out.println(this.returnMinVal(this.finalArl));

    }

    public void storeArrayList(ArrayList<Integer> al) {
        ArrayList list = new ArrayList();
        double res;
        for (int i = 0; i < (al.size() - 3); i += 2) {
            int x1 = al.get(i);
            int x2 = al.get(i + 2);
            int y1 = al.get(i + 1);
            int y2 = al.get(i + 3);

            res = this.computeD(x1, x2, y1, y2);
            list.add(twoDForm.format(res));

        }
        this.finalArl = list;
    }

    public double computeD(int x1, int x2, int y1, int y2) {
        return Math.sqrt((Math.pow((Math.abs(x2 - x1)), 2))
                + (Math.pow((Math.abs(y2 - y1)), 2)));
    }

    public double returnMinVal(ArrayList arl) {
        Object minObj = arl.get(0);
        String minS = String.valueOf(minObj);
        double minDouble = 0.0;
        for(int i = 0; i < arl.size()-1; i++) {
            Object next = arl.get(i);
            String nextS = String.valueOf(next);
            double nextDouble = Double.parseDouble(nextS);
            minDouble = Double.parseDouble(minS);
            if(nextDouble<minDouble) {
                minDouble = nextDouble;
            }
            
        }
        return minDouble;
    }

}
