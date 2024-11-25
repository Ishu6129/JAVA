package gfg;

import java.util.*;

public class Day6_MazorityElement {
    public static void main(String[] args) {
        int[] arr={2,1,5,5,5,5,6,6,6,6,6};
        System.out.println(findMajority(arr));

    }
    public static List<Integer> findMajority(int[] nums) {
        int v1 = -1;
        int v2 = -1;
        int e1 = 0;
        int e2 = 0;

        for (int elec : nums) {
            if (elec == v1) {
                e1++;
            } else if (elec == v2) {
                e2++;
            } else if (e1 == 0) {
                v1 = elec;
                e1 = 1;
            } else if (e2 == 0) {
                v2 = elec;
                e2 = 1;
            } else {
                e1--;
                e2--;
            }
        }

        int c1 = 0;
        int c2 = 0;
        for (int elec : nums) {
            if (elec == v1) {
                c1++;
            }
            if (elec == v2) {
                c2++;
            }
        }

        List<Integer> list = new ArrayList<>();

        if (c1 > (nums.length / 3)) {
            list.add(v1);
        }
        if (c2 > (nums.length / 3) && v1 != v2) {
            list.add(v2);
        }
        if(list.size()==2 && list.get(0)>list.get(1)){
            int temp=list.get(0);
            list.set(0,list.get(1));
            list.set(1,temp);
        }

        return list;
    }
}
