package com.codedifferently.collections.listTest;

import com.codedifferently.collections.list.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void nodeFrontTest(){
        LinkedList linkedList = new LinkedList(25, null);
        String expected = 25 + "";
        String actual = linkedList.nodeFront();

        Assert.assertEquals(expected, actual);
    }
}
