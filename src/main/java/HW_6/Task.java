/*Разработать программу, имитирующую поведение коллекции HashSet.
В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль.
Формат данных Integer. */

package HW_6;

import java.util.HashMap;
import java.util.Iterator;

public class Task {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addTohMap(3);
        addTohMap(1);
        addTohMap(5);
        addTohMap(2);
        addTohMap(7);
        addTohMap(3);
        addTohMap(8);
        System.out.println(hMap.keySet());

        printSet(hMap);

    }
    private static void addTohMap(Integer number) {
       // hMap.putIfAbsent(number, OBJ);
        hMap.put(number, OBJ);
    }
    private static void printSet(HashMap<Integer, Object> hashMap) {
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
