package com.dio.desafios.parenteses;

import java.util.Scanner;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        String [] splitted = s.split("");
        if (splitted[0].equals("(") && splitted[splitted.length -1 ].equals(")"))
            return true;
        else if (splitted[0].equals("{") && splitted[splitted.length -1 ].equals("}"))
            return true;
        else if (splitted[0].equals("[") && splitted[splitted.length -1 ].equals("]"))
            return true;
        else
            return false;
    }
}
