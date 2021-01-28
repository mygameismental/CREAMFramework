package com.codedifferently.collections.listTest;

import com.codedifferently.collections.list.LinkedList;
import com.codedifferently.collections.list.exception.EmptyLinkedListException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList linkedList;
@Before
public void setUp(){
    // creating a linked list
    // 18 --> 21 --> 24 --> 15 --> 12 --> null
   linkedList = new LinkedList();

    LinkedList.Node head = new LinkedList.Node(18);
    LinkedList.Node second = new LinkedList.Node(21);
    LinkedList.Node third = new LinkedList.Node(24);

    //attach them together to form a list

    head.next = second; // 18 --> 21
    second.next = third; // 18 --> 21 --> 24 --> null
}
    @Test
    public void addHead() {
        linkedList.addHead(10);
        boolean expected = true;
        boolean actual = linkedList.contains();

        Assert.assertEquals(expected,actual);
    }
    @Test (expected = EmptyLinkedListException.class)
    public void addTail() throws EmptyLinkedListException {
        linkedList.addTail(5);



        Assert.assertTrue(false);
    }


    @Test
    public void contains() {
    linkedList.contains();
    }

    @Test
    public void printNodeContents() {
    linkedList.printNodeContents();
    }


    @Test
    public void deleteHead() {
    }

    @Test
    public void deleteTail() {
    }

    @Test
    public void main() {
        LinkedList linkedList = new LinkedList();
    }
}