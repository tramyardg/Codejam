/*
 * Copyright (C) 2016 RAYMARTHINKPAD
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package codejam_class;

import java.util.ArrayList;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class GCD {

    public ArrayList gcd(int a, int b) {
        ArrayList al = new ArrayList();
        int l = this.returnLarger(a, b);
        int s = this.returnSmaller(a, b);
        for (int i = 1; i < s; i++) {
            int cdl = l % i;
            if (cdl == 0) {
                int cd2 = s % i;
                if (cd2 == 0) {
                    al.add(i);
                }
            }
        }
        System.out.println(al);
        return al;
    }

    public int returnGCD(ArrayList al) {
        Object obj = al.get(al.size() - 1);
        String gcdStr = String.valueOf(obj);
        int gcdInt = Integer.parseInt(gcdStr);
        return gcdInt;
    }
    
    public int run(int a, int b) {
        return this.returnGCD(this.gcd(a, b));
        
    }
    
    public int returnSmaller(int a, int b) {
        int s;
        if (a < b) {
            s = a;
        } else {
            s = b;
        }
        return s;
    }
    
    public int returnLarger(int a, int b) {
        int l;
        if (a > b) {
            l = a;
        } else {
            l = b;
        }
        return l;
    } 
    
    public int EuclideanAlgorithm(int a, int b) {
        // determine which one is smaller and larger
        // ex: l = 287, s = 91
        int l = this.returnLarger(a, b);
        int s = this.returnSmaller(a, b);
        
        // remainder : larger modulo smaller
        int r; 
        // divisor: if the remainder becomes zero, this means 
        // we have a divisor; we can divide
        int d = 0;
        
        // do the looping until the remainder is not zero
        do {
            // ex: 287 % 91 = 14
            //     l   %  s = r
            // r = 14
            r = l % s;
            // if r is not zero then continue
            // l = 91
            // s = 14
            /*
            Position of this is important;
            check r before assignning value
            */
            if(r==0) {
                d = l/s;
            }
            l = s;
            s = r;
            
            // r is not zero then loop again
            // now l = 91
            //     s = 14
            
            // second iteration = 91%14=7
            // again r is not zero so continue
            // now l = 14, s = 7
            
            // third iteration = 14%7=0
        }while(r!=0);
        return d;
    }
}
