package com.JFSTask1;

public class T6Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(Math.max(j, n - i) + " ");
            }
            System.out.println();
        }
    }
}
