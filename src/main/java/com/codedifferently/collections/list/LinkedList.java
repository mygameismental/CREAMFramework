package com.codedifferently.collections.list;

import com.codedifferently.collections.interfaces.List;
import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedList<E> implements List {
    //Make a Node
    //CRUD

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    @Override
    public void add(Element e) {
        Node newNode = null;
        if(head == null){
            head = newNode;
        }else {
            Node currentNode = head;
            while(currentNode.getNextSibling() != null){ // getNextSibling() gets The node immediately following this node.
                // If there is no such node, this returns null.
                currentNode = currentNode.getNextSibling();
            }
            currentNode.appendChild(newNode);
        }

    }

    @Override
    public void contains(Object o) {
        Node attributes = null;
        if(head == null){
            head = attributes;
        }else {
            head.hasAttributes();
        }
    }

    @Override
    public void remove(int o) {
        Node node = head;
        for(int i=0; i < o - 1; i++){
            node = node.getNextSibling();
        }
        node.appendChild(node.getNextSibling().getNextSibling());
    }
}
