class Solution {
    public int minEatingSpeed(int[] piles, int h) {
  int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int min = 1;

        while (min <= max) {

            int m = min + (max - min) / 2;

            if (check(piles, m, h)) {
                max = m - 1;
            } else {
                min = m + 1;
            }
        }

        return min;
    }

    private boolean check(int[] piles, int m, int h) {

        int h2 = 0;

        for (int i = 0; i < piles.length; i++) {
            h2 += (piles[i] + m - 1) / m;

            if (h2 > h) {
                return false;
            }
        }

        return true;
      }
    }
