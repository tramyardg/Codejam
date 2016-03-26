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
package codejam_class.gcd;

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
        for (int i = 1; i < l; i++) {
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
        int l = this.returnLarger(a, b);
        int s = this.returnSmaller(a, b);
        int r; 
        do {
            // if l % s = 0, then return
            // l = s, 
            // s = 0
            // return l
            
            /*
            Example:
                6%3 ---- 0
                l ---- 3
                s ---- 0
                3
            */
                  
            r = l % s;
            
            System.out.println("l -- " + l);
            System.out.println("s -- " + s);
            System.out.println("r -- " + r);
            l = s;
            s = r;
        }while(r!=0);
        return l;
    }
}
