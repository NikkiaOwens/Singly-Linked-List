package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(1);
        sList.add(2);
        sList.add(13);
        sList.add(14);
        sList.remove(2);
        System.out.println("Contains 14:" + sList.contains(14));
        System.out.println("Contains 13:" + sList.contains(13));
        sList.display();

    }
}
