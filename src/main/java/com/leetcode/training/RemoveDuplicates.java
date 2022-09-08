package com.leetcode.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

    private int removeDuplicates(int[] nums) {
        int newIndex = 0;
        int duplicates = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                newIndex++;
            } else {
                if (nums[i] != nums[i - 1]) {
                    nums[newIndex] = nums[i];
//                    if (nums[newIndex] > nums[newIndex + 1]) {
//                        break;
//                    }
                    newIndex++;
                } else {
                    duplicates++;
                }

            }
            if (i == (nums.length - 1)) {
                break;
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 2, 3, 3, 4, 4, 5, 5};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int duplicates = removeDuplicates.removeDuplicates(nums);

        System.out.println(String.format("Duplicates: " + duplicates));
        System.out.println("nums: " + Arrays.stream(nums).toArray().toString());

    }
}
