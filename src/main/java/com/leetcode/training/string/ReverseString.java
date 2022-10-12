package com.leetcode.training.string;

import java.util.Arrays;

public class ReverseString {

  public void reverseString(char[] s) {
    if (s.length == 1) {
      return;
    }
    //switch position algorithm
    int count = 0;
    int limitSwitch = Math.floorMod(s.length, 2) == 0 ? s.length / 2 : (s.length - 1) / 2;
    for (int i = 0; i <= s.length; i++) {
      char leftPos = s[count];
      char rightPos = s[s.length - 1 - count];
      s[count] = rightPos;
      s[s.length - 1 - count] = leftPos;
      count++;
      if (count == limitSwitch) {
        break;
      }
    }

  }

  public static void main(String[] args) {
    ReverseString reverseString = new ReverseString();
    char[] stringToReverse = {'a', 'b', 'c', 'd'};
    System.out.println(Arrays.toString(stringToReverse));
    reverseString.reverseString(stringToReverse);
    System.out.println(Arrays.toString(stringToReverse));
    stringToReverse = new char[]{'a', 'b'};
    System.out.println(Arrays.toString(stringToReverse));
    reverseString.reverseString(stringToReverse);
    System.out.println(Arrays.toString(stringToReverse));
    stringToReverse = new char[]{'a', 'b', 'c'};
    System.out.println(Arrays.toString(stringToReverse));
    reverseString.reverseString(stringToReverse);
    System.out.println(Arrays.toString(stringToReverse));

    stringToReverse = new char[]{'a'};
    System.out.println(Arrays.toString(stringToReverse));
    reverseString.reverseString(stringToReverse);
    System.out.println(Arrays.toString(stringToReverse));
  }
}
