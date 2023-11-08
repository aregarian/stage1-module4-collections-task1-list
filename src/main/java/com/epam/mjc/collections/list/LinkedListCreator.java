package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList hehe = new LinkedList<>();
        for (int i = 0; i < sourceList.size()  ; i++) {
            if (sourceList.get(i) % 2 == 0) {
                hehe.addLast(sourceList.get(i));
            } else {
                hehe.addFirst(sourceList.get(i));
            }
        }
        return hehe;
    }
}
