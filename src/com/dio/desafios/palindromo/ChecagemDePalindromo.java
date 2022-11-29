package com.dio.desafios.palindromo;

import java.util.Scanner;

public class ChecagemDePalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.

        System.out.println(isPalindrome(palavra));
    }

    public static String isPalindrome(String palavra) {
        String palindrome = new StringBuilder(palavra).reverse().toString();
        if (palindrome.equals(palavra))
            return "TRUE";
        else
            return "FALSE";
    }

}
