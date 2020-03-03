package com.fibonacci;

public class Main {

    public static void main(String[] args) {

        // A number is the sum of the two previous ones
        int n1 = 0, n2 = 1, aux;

        for (int i = 2; i <= 10; ++i) {
            aux = n1 + n2;
            System.out.print(" " + aux);
            n1 = n2;
            n2 = aux;
        }

    }
}
