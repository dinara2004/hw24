package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
     /**   0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
       *       Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.
       */
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(2));
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(2));
        }

        System.out.println("Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println();
        System.out.println("Arraylist: " + arrayList);
        sort(arrayList);
        System.out.println();
        System.out.println("Linkedlist: " + linkedList);
        sort(linkedList);
    }

    public static void sort (int[] array){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList1.add(array[i]);
            Collections.sort(arrayList1);
        }
        System.out.println("Sort to array: " + arrayList1);
    }

    public static void sort (ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(arrayList.get(i));
            Collections.sort(arrayList2);
        }
        System.out.println("Sort to arraylist: " + arrayList2);;
    }

    public static void sort (LinkedList<Integer> linkedList){
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList2.add(linkedList.get(i));
            Collections.sort(linkedList2);
        }
        System.out.println("Sort to linkedlist: " + linkedList2);
    }
}
