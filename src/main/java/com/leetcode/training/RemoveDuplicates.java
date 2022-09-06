package com.leetcode.training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

    private int removeDuplicates(int[] nums) {
        String[] newList = new String[nums.length];
        int[] newNums = new int[nums.length];
        int currentValue;
        int aheadValue = 0;
        Set dups = new HashSet();
        int numToSkip=0;
        Set newSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);

            currentValue = nums[i];

            if (i == 0) {
                newNums[i] = nums[i];
                newSet.add(nums[i]);
            } else {
                if (nums[i] == nums[i - 1]) {
                    numToSkip = nums[i];
                } else {
                    newNums[i] = nums[i];
                    newSet.add(nums[i]);
                }
            }

            if (i == (nums.length - 1)) {
                break;
            }
            aheadValue = nums[i + 1];

            if (currentValue == aheadValue) {
                // duplicate
                dups.add(Integer.toString(nums[i]));
            } else {

            }
        }
        System.out.println(dups);
        Iterator it = dups.iterator();
        int newIdx = 0;
        while (it.hasNext()) {
            String dupValue = (String) it.next();
            newList[newIdx] = dupValue;
            newIdx++;
        }
//        while (newIdx < newList.length) {
//            newList[newIdx] = "_";
//        }
        System.out.println(newList);
        return dups.size();
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 3, 4, 4, 4, 5, 5};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int duplicates = removeDuplicates.removeDuplicates(nums);

        System.out.println(String.format("Duplicates: " + duplicates));

    }
}
