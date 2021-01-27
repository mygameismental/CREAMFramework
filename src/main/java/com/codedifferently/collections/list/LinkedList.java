package com.codedifferently.collections.list;

import com.codedifferently.collections.list.exception.EmptyLinkedListException;
import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedList<E>  { //singly linked list
    private Node head; //head node to hold the list

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean contains(){ //checking to see if node contains a value or not
        Node content = head;
        if(content == null){ //if head is null, then it means linked list is empty
            return false;
        }
        return true;
    }

    public void printNodeContents(){ //prints node content
        Node print = head;
        while(print != null){
            System.out.println(print.data + " --> ");
            print = print.next;
        }
        System.out.println("null value");
    }

    public void addHead(int value){ //adds value to head node
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addTail(int value) throws EmptyLinkedListException { //adds value to tail node
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            throw new EmptyLinkedListException(); // throws an EmptyLinkedListException if fuction is called
            // can't add to the tail of an empty Linkedlist :-P!
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public Node deleteHead()throws EmptyLinkedListException{
        if(head ==null){
            throw new EmptyLinkedListException(); //throws an EmptyLinkedListException if fuction is called
            // can't contents if there's nothing in there :-P!
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public Node deleteTail()throws EmptyLinkedListException {
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null; // replaces the last value with previous value
        return current;
    }

        public static void main(String[] args) {
        //creating a linked list (Hard coding the linked list)
        // 18 --> 21 --> 24 --> 15 --> 12 --> null
        LinkedList.Node head = new LinkedList.Node(18);
        LinkedList.Node second = new LinkedList.Node(21);
        LinkedList.Node third = new LinkedList.Node(24);
        LinkedList.Node fourth = new LinkedList.Node(15);
        LinkedList.Node fifth = new LinkedList.Node(12);

        //attach them together to form a list
        head.next = second; // 18 --> 21
        second.next = third; // 18 --> 21 --> 24
        third.next = fourth; // 18 --> 21 --> 24 --> 15
        fourth.next = fifth; // 18 --> 21 --> 24 --> 15 --> 12 --> null


    }
}
