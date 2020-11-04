package com.company;

public class Main {

    public static void main(String[] args) {
        for (int j = 6; j < 1000; j+=2) {
            int sum = 0;
            for (int i = 1; i <= j/2; i++) {
                if (j % i == 0)
                    sum = sum + i;
            }

            if (sum == j)
                System.out.println(j + " este perfect");
        }
    }
}

