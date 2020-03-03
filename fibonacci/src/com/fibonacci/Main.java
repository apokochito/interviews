package com.fibonacci;

public class Main {

    public static void main(String[] args) {

        // A number is the sum of the two previous ones
        // n0 = 0, n1 = 1
        // 2..n
        // nr = n0 + n1
        // n0 = n1, n1 = nr

        int n0 = 0, n1 = 1, nr=0;

        for (int counter = 2; counter <= 10; ++counter) {
            nr = n0 + n1;
            System.out.println(nr);
            n0 = n1;
            n1 = nr;
        }

    }
}
