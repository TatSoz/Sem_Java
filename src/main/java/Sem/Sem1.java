package Sem;

import java.util.Random;
import java.util.Scanner;
    public class Sem1 {
        public static void main(String[] args) {
            print("Hello!");
            int i = 0; // 32бита целочисленный
            long l = 0; // 64 бита целочисленный
            byte b = 0;
            short s = 0;
            float f = 0.0f; //32 бита дробрый
            double d = 0.0; //64 бита дробный
            char c = 'f'; // 16 бит без знаковый индекс буквы
            String str = "Привет! Hello! Ola!";
            boolean b1 = true;

            int[] aI = new int[10];

            int[] tmp = new int[aI.length+5];
            aI = tmp;


            print(str);
            print(str.toLowerCase());
            print(String.valueOf(str.contains("el")));
            print(str.substring(1, str.length()/2));
            print(str.replace("Привет", "Пока"));
            String[] strA = str.split(" ");

            for (String is: strA) {
                print(is);
            }
//        for (int j = 0; j < strA.length; j++) {
//            print(strA[j]);
//        }

//        int[] aI = new int[10];
//
            Random rnd = new Random();
//
//        for (int j = 0; j < aI.length; j++) {
//            aI[j] = rnd.nextInt();
//        }
//
//        for (int j = 0; j < aI.length; j++) {
//            print(String.valueOf(aI[j]));
//        }
//        print(Character.getName(str.charAt(str.length()-4)));
//        String s1 = "Привет! Hello! Ola!";
//        if (str.equals(s1)) {
//            print("Good!");
//        }
//        print(String.valueOf(Integer.toBinaryString(rnd.nextInt(128)).length()));
            print(("Hello!".repeat(12)));

            Scanner scanner = new Scanner(System.in);

            String newString = scanner.nextLine();
            i = scanner.nextInt();
            newString = scanner.nextLine();
            print(newString);

        }

        private static void print(String str){
            System.out.println(str);
        }

}
