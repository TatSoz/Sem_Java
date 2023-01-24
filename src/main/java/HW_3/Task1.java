/* 1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
-Удалить из первого списка элементы отсутствующие во втором списке.
-Отсортировать первый список методом sort класса Collections.
2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.*/

package HW_3;

import java.util.*;

public class Task1 {

    private static ArrayList<Integer> createArray(ArrayList<Integer> list, int size){
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
           list.add(rnd.nextInt(10, 50));
        }
        return list;
    }
    private static ArrayList<Integer> copyList(ArrayList<Integer> list) {
        ArrayList<Integer> copylist = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            copylist.add(list.get(i)) ;
        }
        return copylist;
    }

    private static ArrayList<Integer> deleteElements(ArrayList<Integer> lst1, ArrayList<Integer> lst2)
    {
        ArrayList<Integer> deletelist = new ArrayList<>(lst1);
        deletelist.retainAll(lst2);
        return deletelist;
    }

    private static ArrayList<Integer> sortComparator(ArrayList<Integer> lst) {
        lst.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1){
                return t1-t0;
            }
        });
        return lst;
    }

    private static ArrayList<Integer> sortBubble(ArrayList<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            for (int j = 1; j < lst.size()-i; j++) {
                if (lst.get(j-1) > lst.get(j)) {
                    int temp = lst.get(j-1);
                    lst.set((j-1), lst.get(j));
                    lst.set((j), temp);
                }
            }
        }
        return lst;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Первый список: "+createArray(list1, 20));
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Второй список: "+createArray(list2, 20));


        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1 = copyList(list1);
        Collections.sort(lst1);
        System.out.println("Отсортированный первый список методом sort класса Collections: "+lst1);

        System.out.println("Элементы первого списка, которые также присутствуют во втором списке: "+deleteElements(list1, list2));

        System.out.println("Второй список отсортированный методом sort и компаратором по уменьшению: "+sortComparator(list2));

        System.out.println("Первый список отсортированный пузырьковой сортировкой: "+sortBubble(list1));

    }
}
