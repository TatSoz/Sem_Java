/*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

package HW_1;

        import java.util.Arrays;
        import java.util.Random;

public class Sem1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        int n = Integer.toBinaryString(i).length();

        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if(j%n == 0) count++;
        }
        int[] m1 = new int[count];
        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if(j%n == 0) m1[count++] = j;
        }

        int c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if(j%n != 0) c++;
        }
        int[] m2 = new int[c];
        c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if(j%n != 0) m2[c++] = j;
        }

        System.out.println(i);
        System.out.println(n);
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));

    }
}