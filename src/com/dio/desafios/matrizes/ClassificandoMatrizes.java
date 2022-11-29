package com.dio.desafios.matrizes;

import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];
        for (i = 0; i < N; i++)
        {
            nums[i] = input.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
                j++;
            }
        }

        for (var entry : nums) {
            System.out.println(entry);
        }
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
