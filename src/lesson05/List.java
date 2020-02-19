package lesson05;

/*
1.1. Формируется коллекция из строк типа ArrayList (5-6 строк)
1.2. Из коллекции удаляется одно из значений
1.3. Выполняется проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
1.4. Выполняется сортировка объектов коллекции (Collections class в помощь)
1.5. Выполняется поочередный вывод строк в консоль до сортировки и после (Iterator class в помощь)*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList <String> arrList =  new ArrayList<String>();
        arrList.add("one");
        arrList.add("two");
        arrList.add("three");
        arrList.add("four");
        arrList.add("five");
        arrList.add("six");
        System.out.println("The first array is: " + arrList);

        arrList.remove(4);

        System.out.println("After removing, the array is: " + arrList);
ArrayList arrayList1 = new ArrayList(arrList);

        Collections.sort(arrList);
        System.out.println("Sorted array is: " + arrList);


        System.out.println("Each string from the new line in NOT sorted array is: ");
        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        System.out.println("Each string from the new line in Sorted array is: ");
        Iterator<String> iterator = arrList.iterator();
                while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        }
    }

