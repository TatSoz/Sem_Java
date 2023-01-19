/*1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии. */

package HW_2;

import java.util.Scanner;

public class Task1 {

    private static String inputData(Scanner scan) {
        String str = scan.nextLine();
        return str;
    }
    private static void strInSting(String str1, String str2) {
        if (str1.contains(str2))
            System.out.println("Да, сторока входит в другую");
        else System.out.println("Нет, вхождений не найдено");
    }

    private static boolean checkRotation(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s2).contains(s2));
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    private static String reverseRecursion(String str) {
        if (str.length() <=1) {
            return str;
        }
        return reverseRecursion(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1-ю сторку: ");
        String str1 = inputData(input);
        System.out.println("Введите 2-ю строку: ");
        String str2 = inputData(input);
        strInSting(str1, str2);
        if (checkRotation(str1, str2))
            System.out.println("Да, стороки являются вращением друг друга");
        else System.out.println("Нет, стороки не являются вращением друг друга");
//        System.out.println("Перевёрнутая строка: ");
        System.out.println("Перевёрнутая строка: "+reverseString(str1));
        System.out.println("Перевёрнутая строка с помощью рекурсии: "+reverseRecursion(str1));


    }
}
