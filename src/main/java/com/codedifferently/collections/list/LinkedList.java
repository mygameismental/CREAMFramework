package com.codedifferently.collections.list;

import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedList<E>  {

    private static int data;
    private static LinkedList next;

    public LinkedList(int data, LinkedList next) {
        this.data = data;
        this.next = next;
    }

    public String nodeFront(){
        return data + "";
    }
}
