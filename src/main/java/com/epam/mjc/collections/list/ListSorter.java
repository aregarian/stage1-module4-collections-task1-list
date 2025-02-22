package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);


        int funcA = 5 * intA * intA + 3;
        int funcB = 5 * intB * intB + 3;


        if (funcA == funcB) {
            return Integer.compare(intA, intB);
        } else {
            return Integer.compare(funcA, funcB);
        }

    }
}
