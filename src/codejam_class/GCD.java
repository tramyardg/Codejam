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
        int l;
        int s;
        ArrayList al = new ArrayList();
        if (a > b) {
            l = a;
            s = b;
        } else {
            l = b;
            s = a;
        }
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
}
