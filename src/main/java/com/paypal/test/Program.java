package com.paypal.test;

import java.util.*;

class Program {

  public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {

    List<Integer[]> result = new ArrayList<>();

    int i1 = 0;
    while (i1 < array.length) {
      int i2 = i1 + 1;
      while (i2 < array.length) {
        int i3 = i2 + 1;
        while (i3 < array.length) {
          int i4 = i3 + 1;
          while (i4 < array.length) {

            int v1 = array[i1];
            int v2 = array[i2];
            int v3 = array[i3];
            int v4 = array[i4];

            int sum = v1 + v2 + v3 + v4;

            if (sum == targetSum) {
              result.add(new Integer[]{v1, v2, v3, v4});
            }

            i4++;
          }
          i3++;
        }
        i2++;
      }
      i1++;
    }

    return result;
  }
}