package com.travis;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[][] aRayOfSunshine = new int[5][5];
        int counter = 0;

        for(int i = 0; i < 5; ++i) {
            aRayOfSunshine[i][counter] = counter;
            System.out.println(aRayOfSunshine[i][counter]);

            for(int p = 0; p < aRayOfSunshine.length; ++p) {
                aRayOfSunshine[counter][p] = 5 + counter;
                System.out.println(aRayOfSunshine[counter][p]);
            }

            ++counter;
        }

    }
}
