package com.gla;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class CollectionFrameworkPractice {
    public static void main(String[] args) {

        List l = new ArrayList();
        List l2 = new LinkedList();
        List l3 = new Vector();
        List l4 = new Stack();

        l.add(10);
        l.add(20);
        l.add("Namrata");
        l.add(5.55);

        System.out.println(l);
        for(int i=0; i<l.size(); i++){ 
System.out.println(l.get(i));
}

    }
}