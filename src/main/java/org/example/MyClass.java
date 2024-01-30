package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyClass {

        public static void main(String[] args) {

            ArrayList<String> arrayList = new ArrayList<>();
            // Добавление элементов в конец списка
            arrayList.add("A");
            arrayList.add("B");
            arrayList.add("C");
            // Добавление элемента по индексу
            arrayList.add(1, "D");

            // Вывод элементов списка
            for (String element : arrayList) {
                System.out.println(element);
            }


            LinkedList<String> linkedList = new LinkedList<>();
            // Добавление элементов в конец списка
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            // Добавление элемента по индексу
            linkedList.add(1, "D");

            // Вывод элементов списка
            for (String element : linkedList) {
                System.out.println(element);
            }



        }
}


