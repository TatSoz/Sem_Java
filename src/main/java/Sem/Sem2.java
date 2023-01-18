/* 1.Напишите программу на Java, чтобы проверить,
 являются ли две данные строки вращением друг друга.*/

public class Sem2 {
    public static void main(String[] args) {
////        StringBuilder sb = new StringBuilder("Hello World!");
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello World!");
//        sb.append(")");
//
////        sb.reverse();
////        sb.delete(2, sb.length()-2);
//        sb.insert(sb.length()/2, "to the ");
//        sb.deleteCharAt(12)
//        String s;
//
//        System.out.println(sb); // вывод sb
//        System.out.println(sb.indexOf("Wo")); // поиск индекса символа "Wo "с начала строки
//        System.out.println(sb.lastIndexOf("Wo")); // поиск индекса с конца сторки
//        double begin = System.currentTimeMillis();
//        String str ="";
//        for (int i = 0; i < 2000; i++) {
//            str +=Character.getName(i);
//        }
//        System.out.println(System.currentTimeMillis()- begin);
//
//        begin = System.currentTimeMillis();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 2000; i++) {
//            stringBuilder.append(Character.getName(i));
//        }
//        System.out.println(System.currentTimeMillis() - begin);

        String s1 = "Hello world";
        String s2 = "ldHell";
        System.out.printf("\"%s\", \"%s\" -> %s вращением друг друга\n", s1,s2,
                checkRotation(s1,s2)? "являются": "не являются");
    }
    public static boolean checkRotation(String s1, String s2) {
        return (s1 + s1).contains(s2);
    }

    //Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
        System.stringReverse("hello world"));
    public static String stringReverse(String st){
        if(st.length()==1){
            return st;
        }
        return st.substring(st.length()-1) + stringReverse(st.substring(0,st.length()-1));
    }

}
