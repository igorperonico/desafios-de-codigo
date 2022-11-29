package com.dio.desafios.quadrados;

import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println(solution(n));

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

    }

    public static int solution(int n) {
        int[] d = new int[n + 1];
        d[0] = 0;
        d[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int remaining = i - j * j;
                if(d[remaining] < min) {
                    min = d[remaining];
                }
            }
            d[i] = min + 1;
        }

        return d[n];

    }
}
