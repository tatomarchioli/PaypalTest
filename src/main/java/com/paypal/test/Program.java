package com.paypal.test;

import java.util.*;

class Program {

  public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {

    List<Integer[]> result = new ArrayList<>();

    int n4 = 0;
    while (n4 < array.length) {
      int n3 = 0;
      while (n3 < array.length) {
        int n2 = 0;
        while (n2 < array.length) {
          int n1 = 0;
          while (n1 < array.length) {
            Set<Integer> set = new HashSet<>(List.of(n1, n2, n3, n4));

            if(set.size() == 4) {
              int v1 = array[n1];
              int v2 = array[n2];
              int v3 = array[n3];
              int v4 = array[n4];

              int sum = v1 + v2 + v3 + v4;

              if (sum == targetSum) {
                result.add(new Integer[]{v1, v2, v3, v4});
              }
            }

            n1++;
          }
          n2++;
        }
        n3++;
      }
      n4++;
    }

    return result;
  }
}