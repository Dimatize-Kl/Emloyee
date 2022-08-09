package com.kda;

public class Rim {

    public static void main(String[] args) {
        String chislo = "MCMXCIX";
        getNumber(chislo);

    }

    public static void getNumber(String chislo) {
        int number = 0;
        for (int i = 0; i < chislo.length(); i++) {
            switch (chislo.charAt(i)) {
                case 'I':
                    if (i == chislo.length() - 1) {
                        number += 1;
                    } else if (chislo.charAt(i + 1) == 'V' || chislo.charAt(i + 1) == 'X' || chislo.charAt(i + 1) == 'L' || chislo.charAt(i + 1) == 'C' || chislo.charAt(i + 1) == 'D' || chislo.charAt(i + 1) == 'M') {
                        number -= 1;
                    } else {
                        number += 1;
                    }
                    break;
                case 'V':
                    if (i == chislo.length() - 1) {
                        number += 5;
                    } else if (chislo.charAt(i + 1) == 'X' || chislo.charAt(i + 1) == 'L' || chislo.charAt(i + 1) == 'C' || chislo.charAt(i + 1) == 'D' || chislo.charAt(i + 1) == 'M') {
                        number -= 5;
                    } else {
                        number += 5;
                    }
                    break;
                case 'X':
                    if (i == chislo.length() - 1) {
                        number += 10;
                    } else if (chislo.charAt(i + 1) == 'L' || chislo.charAt(i + 1) == 'C' || chislo.charAt(i + 1) == 'D' || chislo.charAt(i + 1) == 'M') {
                        number -= 10;
                    } else {
                        number += 10;
                    }
                    break;
                case 'L':
                    if (i == chislo.length() - 1) {
                        number += 50;
                    } else if (chislo.charAt(i + 1) == 'C' || chislo.charAt(i + 1) == 'D' || chislo.charAt(i + 1) == 'M') {
                        number -= 50;
                    } else {
                        number += 50;
                    }
                    break;
                case 'C':
                    if (i == chislo.length() - 1) {
                        number += 100;
                    } else if (chislo.charAt(i + 1) == 'D' || chislo.charAt(i + 1) == 'M') {
                        number -= 100;
                    } else {
                        number += 100;
                    }
                    break;
                case 'D':
                    if (i == chislo.length() - 1) {
                        number += 500;
                    } else if (chislo.charAt(i + 1) == 'M') {
                        number -= 500;
                    } else {
                        number += 500;
                    }
                    break;
                case 'M':
                    number += 1000;
                    break;
            }
        }
        if (number <= 3999 || number > 1) {
            System.out.println(number);
        } else {
            System.out.println("Число слишком большое или слишком маленькое");
        }
    }
}
