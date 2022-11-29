package com.dio.desafios.fatorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int tmp = 0;

        List<Integer> numeros = new ArrayList<>();

        while (n >= 3) {
            //TODO: Calcule o valor do fatorial de "n", atribuindo o retorno a "res".
            tmp = n * (n - 1) / (n - 2);
            n -= 3;

            if (numeros.isEmpty()) {
                numeros.add(tmp);
            } else {
                numeros.add(tmp * (-1));
            }

            numeros.add(n);
            n--;
        }

        if (n == 2) {
            tmp = n * (n - 1);
            numeros.add(tmp * (-1));
        } else if (n == 1) {
            numeros.add(n * (-1));
        }

        for (int numero : numeros)
            res += numero;

        System.out.println(res);
    }
}
