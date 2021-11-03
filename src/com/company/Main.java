package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] iygf = {5.4, -7.8, 4.3, 8.9, -3.1, 56.7, 98.3, -7.3, 52.9, 32.8, 8.5, -10.6, 69.6, 4.9};
        int k = 0;
        double s = 0;
        boolean g = false;
        for (double hhk : iygf) {
            if (hhk < 0) {
                g = true;
            } else {
                if (g) {
                    k++;
                    s += hhk;

                }

            }

        }
        System.out.println(Arrays.toString(iygf));
        System.out.println(s/k);
    }
}


