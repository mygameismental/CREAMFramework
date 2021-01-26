package com.codedifferently.collections.listTest;

import com.codedifferently.collections.list.LinkedList;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedListTest {

    @Test
    public void contains() {
        LinkedList linkedList = new LinkedList(null);
        linkedList.contains(linkedList);
    }

    @Test
    public void add() {
        LinkedList linkedList = new LinkedList(null);
        linkedList.add(null);

    }

   // @Test
  //  public void remove(){
   //     LinkedList linkedList = new LinkedList(null);
    //    linkedList.remove(0);
  //  }
}