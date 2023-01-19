/*4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168           (Используем метод StringBuilder.append().)
5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.*/
package HW_2;

public class Task2 {

    public static String buildString(int a, int b){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d + %d = %d\n", a, b, a + b));
        sb.append(String.format("%d - %d = %d\n", a, b, a - b));
        sb.append(String.format("%d * %d = %d\n", a, b, a * b));
        return sb.toString();
    }
    public static String replaceSing1(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = sb.indexOf("=");
        while(i != -1) {
            sb.deleteCharAt(i).insert(i, "равно");
            i = sb.indexOf("=");
        }
        return sb.toString();
    }

    public static String replaceSing2(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = sb.indexOf("=");
        while(i != -1) {
            sb.replace(i,i+1,"равно");
            i = sb.indexOf("=");
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String str = buildString(3, 56);
        System.out.println(str);
        System.out.println("Замена знака 'равно' 1-й способ: ");
        System.out.println(replaceSing1(str));
        System.out.println("Замена знака 'равно' 2-й способ: ");
        System.out.println(replaceSing2(str));

        //Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder:
        String comparison = "=".repeat(10000);
        System.out.printf("Строка: ");
        System.out.println(comparison);
        System.out.println("Замена с помощью String:");
        long startTime = System.currentTimeMillis();
        System.out.println(comparison.replaceAll("=","равно"));
        long endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения: %d millis\n", (endTime-startTime));

        System.out.println("Замена с помощью Stringbuilder (deleteCharAt, insert):");
        startTime = System.currentTimeMillis();
        System.out.println(replaceSing1(comparison));
        endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения: %d millis\n", (endTime-startTime));

        System.out.println("Замена с помощью Stringbuilder (replace):");
        startTime = System.currentTimeMillis();
        System.out.println(replaceSing2(comparison));
        endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения: %d millis\n", (endTime-startTime));

    }
}
