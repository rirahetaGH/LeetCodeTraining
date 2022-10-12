package com.leetcode.training.design;

public class ShuffleSolution {

  int nums[];
  int aux[];

  public void shuffle(int nums[]) {
    this.nums = nums;
    this.aux = nums;
  }

  public ShuffleSolution(int nums[]) {
    this.nums = nums;
    this.aux = nums;
  }

  public void shuffle() {

  }

  public static void main(String[] args) {
    ShuffleSolution shuffleSolution = new ShuffleSolution(new int[]{1, 2, 3, 4});
  }
}
